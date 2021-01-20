package com.japaricraft.japaricraftmod.item;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySkeletonHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import javax.annotation.Nonnull;
import java.util.HashMap;
import java.util.Map;

import static com.japaricraft.japaricraftmod.JapariCraftMod.tabJapariCraft;


public class ItemSandStarFragment extends Item {
    private final Map<Class<? extends EntityLivingBase>, Class<? extends EntityLivingBase>> transformMap = new HashMap<>();
    public ItemSandStarFragment() {
        this.setCreativeTab(tabJapariCraft);
        this.setUnlocalizedName("SandStarFragment");
        addOnlyWayTransformation(EntitySkeletonHorse.class, EntityHorse.class);
        addOnlyWayTransformation(EntityPigZombie.class, EntityPig.class);
    }

    public boolean hasEffect(ItemStack stack) {
        return true;
    }
    public EnumRarity getRarity(ItemStack stack) {
        return EnumRarity.RARE;
    }

    private void addOnlyWayTransformation(Class<? extends EntityLivingBase> class1, Class<? extends EntityLivingBase> class2) {
        transformMap.put(class1, class2);
    }

    @Override
    public boolean itemInteractionForEntity(ItemStack stack, EntityPlayer player, EntityLivingBase target, EnumHand hand) {
        Class<?> transformClass = transformMap.get(target.getClass());

        if (transformClass != null) {
            if (target.world.isRemote) {
                if (target instanceof EntityLiving) {
                    ((EntityLiving) target).spawnExplosionParticle();
                    ((EntityLiving) target).spawnExplosionParticle();
                }

                target.playSound(SoundEvents.ENTITY_ZOMBIE_VILLAGER_CURE, 1.0F + itemRand.nextFloat(), itemRand.nextFloat() * 0.7F + 0.3F);
            } else {
                EntityLivingBase newMonster = null;
                try {
                    newMonster = (EntityLivingBase) transformClass.getConstructor(World.class).newInstance(target.world);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                if (newMonster == null) {
                    return false;
                } else {
                    newMonster.setPositionAndRotation(target.posX, target.posY, target.posZ, target.rotationYaw, target.rotationPitch);
                    target.world.spawnEntity(newMonster);
                    target.setDead();
                    stack.shrink(1);
                }
            }

            return true;
        } else {
            return false;
        }
    }

    @Nonnull
    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, @Nonnull EnumHand hand) {
        if (world.isRemote) {
            AxisAlignedBB fanBox = getEffectAABB(player);

            // particle effect
            for (int i = 0; i < 30; i++) {
                world.spawnParticle(EnumParticleTypes.SPELL_MOB_AMBIENT, fanBox.minX + world.rand.nextFloat() * (fanBox.maxX - fanBox.minX),
                        fanBox.minY + world.rand.nextFloat() * (fanBox.maxY - fanBox.minY),
                        fanBox.minZ + world.rand.nextFloat() * (fanBox.maxZ - fanBox.minZ),
                        0, 0, 0);
            }

        }

        return ActionResult.newResult(EnumActionResult.SUCCESS, player.getHeldItem(hand));
    }

    private AxisAlignedBB getEffectAABB(EntityPlayer player) {
        double range = 2.0D;
        double radius = 1.0D;
        Vec3d srcVec = new Vec3d(player.posX, player.posY + player.getEyeHeight(), player.posZ);
        Vec3d lookVec = player.getLookVec();
        Vec3d destVec = srcVec.addVector(lookVec.x * range, lookVec.y * range, lookVec.z * range);

        return new AxisAlignedBB(destVec.x - radius, destVec.y - radius, destVec.z - radius, destVec.x + radius, destVec.y + radius, destVec.z + radius);
    }
}

