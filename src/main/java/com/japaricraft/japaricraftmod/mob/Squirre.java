package com.japaricraft.japaricraftmod.mob;

import com.google.common.collect.Sets;
import com.japaricraft.japaricraftmod.JapariCraftMod;
import com.japaricraft.japaricraftmod.hander.JapariItems;
import com.japaricraft.japaricraftmod.mob.ai.EntityFriend;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Set;

public class Squirre extends EntityFriend {
    private static final Set<Item> TAME_ITEMS = Sets.newHashSet(Items.APPLE, JapariItems.japariman, JapariItems.japarimanapple, JapariItems.japarimancocoa, JapariItems.japarimanfruit);

    public Squirre(World worldIn) {
        super(worldIn);
        this.setSize(0.6F, 1.5F);
        this.setTamed(false);
    }


    public EntityAgeable createChild(EntityAgeable ageable) {
        return null;
    }


    protected void initEntityAI() {
        super.initEntityAI();
        this.aiSit = new EntityAISit(this);

        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(2, this.aiSit);
        this.tasks.addTask(4, new EntityAIAttackMelee(this, 1.05D, true));
        this.tasks.addTask(4, new EntityAIFollowOwner(this, 1.05D, 10.0F, 2.0F));
        this.tasks.addTask(5, new EntityAIMate(this, 1.0D));
        this.tasks.addTask(5, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(6, new EntityAIWatchClosest2(this, EntityPlayer.class, 6.0F, 1.0F));
        this.tasks.addTask(6, new EntityAILookIdle(this));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityCreature.class, 8.0F));

        this.targetTasks.addTask(1, new EntityAIOwnerHurtByTarget(this));
        this.targetTasks.addTask(2, new EntityAIOwnerHurtTarget(this) {
            public boolean apply(@Nullable EntityLiving p_apply_1_) {
                return p_apply_1_ != null && IMob.VISIBLE_MOB_SELECTOR.apply(p_apply_1_) && !(p_apply_1_ instanceof EntityFriend);
            }
        });
        this.targetTasks.addTask(3, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(4, new EntityAINearestAttackableTarget<>(this, Cerulean.class, false));
        this.targetTasks.addTask(4, new EntityAINearestAttackableTarget<>(this, PoisonCerulean.class, false));

    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(22D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(22D);

        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3.0D);
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_PLAYER_DEATH;
    }


    public EnumCreatureAttribute getCreatureAttribute() {
        return EnumCreatureAttribute.UNDEFINED;
    }

    public Item getDropItem() {

        return null;//なにも落とさない
    }


    @Override
    public boolean processInteract(EntityPlayer player, EnumHand hand) {
        ItemStack stack = player.getHeldItem(hand);

        if (this.isTamed()) {
            if (player.isSneaking() && !this.isSitting()) {
                player.openGui(JapariCraftMod.instance, JapariCraftMod.ID_JAPARI_INVENTORY, this.getEntityWorld(), this.getEntityId(), 0, 0);
            }
            if (!stack.isEmpty()) {
                if (this.isOwner(player) && TAME_ITEMS.contains(stack.getItem())) {
                    ItemFood itemfood = (ItemFood) stack.getItem();
                    if (this.getHealth() < this.getMaxHealth()) {
                        if (!player.capabilities.isCreativeMode) {
                            stack.shrink(1);
                        }

                        this.heal((float) itemfood.getHealAmount(stack));
                        for (int i = 0; i < 7; ++i) {
                            double d0 = this.rand.nextGaussian() * 0.02D;
                            double d1 = this.rand.nextGaussian() * 0.02D;
                            double d2 = this.rand.nextGaussian() * 0.02D;
                            this.world.spawnParticle(EnumParticleTypes.VILLAGER_HAPPY, this.posX + (double) (this.rand.nextFloat() * this.width * 2.0F) - (double) this.width, this.posY + 0.5D + (double) (this.rand.nextFloat() * this.height), this.posZ + (double) (this.rand.nextFloat() * this.width * 2.0F) - (double) this.width, d0, d1, d2);
                        }
                        return true;
                    }
                }
            }
            if (this.isOwner(player) && !this.world.isRemote && !this.isBreedingItem(stack)) {
                this.aiSit.setSitting(!this.isSitting());
                return true;
            }
        } else if (!this.isTamed() && TAME_ITEMS.contains(stack.getItem())) {
            if (!player.capabilities.isCreativeMode) {
                stack.setCount(stack.getCount() - 1);
            }

            if (!this.world.isRemote) {
                if (this.rand.nextInt(3) == 0) {
                    this.setTamed(true);
                    this.setOwnerId(player.getUniqueID());
                    this.playTameEffect(true);
                    this.world.setEntityState(this, (byte) 7);
                } else {
                    this.playTameEffect(false);
                    this.world.setEntityState(this, (byte) 6);
                }


            }

            return true;
        }

        return super.processInteract(player, hand);
    }

    @Override
    public boolean attackEntityAsMob(Entity entityIn) {
        boolean flag = entityIn.attackEntityFrom(DamageSource.causeMobDamage(this), (float) ((int) this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue()));

        if (flag) {
            this.applyEnchantments(this, entityIn);
        }

        return flag;
    }


    protected void updateAITasks() {
        if (this.ticksExisted % 5 == 0) {
            this.heal(0.06F);
        }
    }


    @Override
    public boolean canDespawn() {
        return false;
    }


}
