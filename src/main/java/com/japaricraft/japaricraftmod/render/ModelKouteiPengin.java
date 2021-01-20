package com.japaricraft.japaricraftmod.render;


import com.japaricraft.japaricraftmod.mob.KouteiPenguin;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class ModelKouteiPengin extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer hand_r;
    public ModelRenderer bre_r;
    public ModelRenderer ear_l;
    public ModelRenderer head_ex;
    public ModelRenderer hand_l;
    public ModelRenderer body_l;
    public ModelRenderer head;
    public ModelRenderer bre_l;
    public ModelRenderer hood_b;
    public ModelRenderer body_p;
    public ModelRenderer leg_r;
    public ModelRenderer leg_l;
    public ModelRenderer hair_l1;
    public ModelRenderer hair_m1;
    public ModelRenderer hair_r1;
    public ModelRenderer hairb_1;
    public ModelRenderer hairb_2;
    public ModelRenderer ear_r;
    public ModelRenderer ear_r2;
    public ModelRenderer earr_3;
    public ModelRenderer ear_l2;
    public ModelRenderer ear_l3;

    public ModelKouteiPengin() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.hairb_1 = new ModelRenderer(this, 67, 0);
        this.hairb_1.setRotationPoint(-0.5F, -5.0F, 3.1F);
        this.hairb_1.addBox(-4.0F, -3.0F, 0.0F, 9, 6, 2, 0.0F);
        this.ear_l2 = new ModelRenderer(this, 34, 7);
        this.ear_l2.setRotationPoint(0.5F, 0.5F, 0.5F);
        this.ear_l2.addBox(0.0F, -1.5F, -1.5F, 1, 2, 2, 0.0F);
        this.bre_l = new ModelRenderer(this, 33, 0);
        this.bre_l.setRotationPoint(1.3F, 1.26F, -0.73F);
        this.bre_l.addBox(-1.0F, -1.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(bre_l, 0.8726646259971648F, -0.08726646259971647F, 0.0F);
        this.hair_r1 = new ModelRenderer(this, 42, 0);
        this.hair_r1.setRotationPoint(-2.0F, -3.5F, -4.0F);
        this.hair_r1.addBox(-2.0F, -4.5F, -1.0F, 2, 5, 1, 0.0F);
        this.hood_b = new ModelRenderer(this, 10, 13);
        this.hood_b.setRotationPoint(0.0F, 1.5F, 1.5F);
        this.hood_b.addBox(-2.5F, -1.5F, 0.0F, 5, 3, 1, 0.0F);
        this.head_ex = new ModelRenderer(this, 96, 20);
        this.head_ex.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head_ex.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F);
        this.ear_l = new ModelRenderer(this, 24, 5);
        this.ear_l.setRotationPoint(4.0F, -4.0F, 0.0F);
        this.ear_l.addBox(0.0F, -1.5F, -1.5F, 1, 3, 3, 0.0F);
        this.head = new ModelRenderer(this, 96, 0);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.setRotateAngle(head, 0.05235987755982988F, 0.0F, 0.0F);
        this.bre_r = new ModelRenderer(this, 24, 0);
        this.bre_r.setRotationPoint(-1.2F, 1.2F, -0.7F);
        this.bre_r.addBox(-1.0F, -1.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(bre_r, 0.8726646259971648F, 0.08726646259971647F, 0.0F);
        this.ear_l3 = new ModelRenderer(this, 24, 12);
        this.ear_l3.setRotationPoint(-1.0F, -3.0F, 0.0F);
        this.ear_l3.addBox(0.0F, -1.5F, -1.0F, 2, 3, 2, 0.0F);
        this.body_l = new ModelRenderer(this, 50, 23);
        this.body_l.setRotationPoint(0.0F, 5.5F, 0.0F);
        this.body_l.addBox(-2.0F, 0.0F, -1.0F, 4, 3, 2, 0.0F);
        this.setRotateAngle(body_l, 0.05235987755982988F, 0.0F, 0.0F);
        this.hand_l = new ModelRenderer(this, 14, 20);
        this.hand_l.setRotationPoint(2.5F, 0.3F, 0.0F);
        this.hand_l.addBox(0.0F, 0.0F, -1.0F, 2, 10, 2, 0.0F);
        this.setRotateAngle(hand_l, 0.061086523819801536F, 0.0F, -0.08726646259971647F);
        this.hair_m1 = new ModelRenderer(this, 49, 0);
        this.hair_m1.setRotationPoint(0.0F, -3.5F, -4.0F);
        this.hair_m1.addBox(-2.0F, -4.5F, -1.0F, 2, 5, 1, 0.0F);
        this.ear_r = new ModelRenderer(this, 24, 19);
        this.ear_r.setRotationPoint(-4.0F, -4.0F, 0.0F);
        this.ear_r.addBox(-1.0F, -1.5F, -1.6F, 1, 3, 3, 0.0F);
        this.ear_r2 = new ModelRenderer(this, 34, 21);
        this.ear_r2.setRotationPoint(-0.5F, 0.5F, 0.5F);
        this.ear_r2.addBox(-1.0F, -1.5F, -1.5F, 1, 2, 2, 0.0F);
        this.hand_r = new ModelRenderer(this, 5, 20);
        this.hand_r.setRotationPoint(-4.5F, 0.3F, 0.0F);
        this.hand_r.addBox(0.0F, 0.0F, -1.0F, 2, 10, 2, 0.0F);
        this.setRotateAngle(hand_r, -0.061086523819801536F, 0.0F, 0.08726646259971647F);
        this.body_p = new ModelRenderer(this, 50, 30);
        this.body_p.setRotationPoint(0.0F, 2.0F, 0.2F);
        this.body_p.addBox(-2.5F, 0.0F, -1.5F, 5, 3, 3, 0.0F);
        this.setRotateAngle(body_p, 0.048869219055841226F, 0.0F, 0.0F);
        this.leg_r = new ModelRenderer(this, 67, 26);
        this.leg_r.setRotationPoint(-1.4F, 1.6F, 0.5F);
        this.leg_r.addBox(-1.5F, 0.0F, -1.5F, 2, 8, 2, 0.0F);
        this.setRotateAngle(leg_r, -0.048869219055841226F, 0.0F, -0.10471975511965977F);
        this.hair_l1 = new ModelRenderer(this, 56, 0);
        this.hair_l1.setRotationPoint(2.0F, -3.5F, -4.0F);
        this.hair_l1.addBox(-2.0F, -4.5F, -1.0F, 4, 9, 1, 0.0F);
        this.leg_l = new ModelRenderer(this, 76, 26);
        this.leg_l.setRotationPoint(2.4F, 1.7F, 0.5F);
        this.leg_l.addBox(-1.5F, 0.0F, -1.5F, 2, 8, 2, 0.0F);
        this.setRotateAngle(leg_l, -0.048869219055841226F, 0.0F, 0.10471975511965977F);
        this.body = new ModelRenderer(this, 50, 12);
        this.body.setRotationPoint(0.0F, 0.0F, 0.1F);
        this.body.addBox(-2.5F, 0.0F, -1.5F, 5, 6, 3, 0.0F);
        this.setRotateAngle(body, -0.05235987755982988F, 0.0F, 0.0F);
        this.earr_3 = new ModelRenderer(this, 24, 27);
        this.earr_3.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.earr_3.addBox(-1.0F, -1.5F, -1.0F, 2, 3, 2, 0.0F);
        this.hairb_2 = new ModelRenderer(this, 67, 10);
        this.hairb_2.setRotationPoint(-0.5F, 0.0F, 3.1F);
        this.hairb_2.addBox(-4.0F, -3.0F, 0.0F, 9, 8, 3, 0.0F);
        this.head.addChild(this.hairb_1);
        this.ear_l.addChild(this.ear_l2);
        this.body.addChild(this.bre_l);
        this.head.addChild(this.hair_r1);
        this.body.addChild(this.hood_b);
        this.body.addChild(this.head);
        this.ear_l.addChild(this.ear_l3);
        this.body.addChild(this.body_l);
        this.body.addChild(this.hand_l);
        this.head.addChild(this.hair_m1);
        this.head.addChild(this.ear_r);
        this.head.addChild(this.head_ex);
        this.head.addChild(this.ear_l);
        this.ear_r.addChild(this.ear_r2);
        this.body_l.addChild(this.body_p);
        this.body_p.addChild(this.leg_r);
        this.head.addChild(this.hair_l1);
        this.body_p.addChild(this.leg_l);
        this.ear_r.addChild(this.earr_3);
        this.head.addChild(this.hairb_2);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.bre_r.render(f5);
        this.hand_r.render(f5);
        this.body.render(f5);
    }

    //下は特殊なモデルを動かすのに必須
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
        if (!(entityIn instanceof KouteiPenguin))
        {
            return;
        }

        KouteiPenguin entity = (KouteiPenguin) entityIn;
        boolean flag = entityIn instanceof EntityLivingBase && ((EntityLivingBase)entityIn).getTicksElytraFlying() > 4;
        this.head.rotateAngleY = netHeadYaw * 0.017453292F;

        if (flag)
        {
            this.head.rotateAngleX = -((float)Math.PI / 4F);
        }
        else
        {
            this.head.rotateAngleX = headPitch * 0.017453292F;
        }

        this.body.rotateAngleY = 0.0F;
        float f = 1.0F;

        if (flag)
        {
            f = (float)(entityIn.motionX * entityIn.motionX + entityIn.motionY * entityIn.motionY + entityIn.motionZ * entityIn.motionZ);
            f = f / 0.2F;
            f = f * f * f;
        }

        if (f < 1.0F)
        {
            f = 1.0F;
        }

        this.hand_r.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 2.0F * limbSwingAmount * 0.5F / f;
        this.hand_l.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount * 0.5F / f;
        this.hand_r.rotateAngleZ = 0.0F;
        this.hand_l.rotateAngleZ = 0.0F;
        this.leg_r.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount / f;
        this.leg_l.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount / f;
        this.leg_r.rotateAngleY = 0.0F;
        this.leg_l.rotateAngleY = 0.0F;
        this.leg_r.rotateAngleZ = 0.0F;
        this.leg_l.rotateAngleZ = 0.0F;

        if (entity.isSitting()||this.isRiding)
        {
            this.leg_r.rotateAngleX = -1.4137167F;
            this.leg_r.rotateAngleY = ((float)Math.PI / 10F);
            this.leg_r.rotateAngleZ = 0.07853982F;
            this.leg_l.rotateAngleX = -1.4137167F;
            this.leg_l.rotateAngleY = -((float)Math.PI / 10F);
            this.leg_l.rotateAngleZ = -0.07853982F;
        }
        else
        {
            this.leg_r.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount / f;
            this.leg_l.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount / f;
            this.leg_r.rotateAngleY = 0.0F;
            this.leg_l.rotateAngleY = 0.0F;
            this.leg_r.rotateAngleZ = 0.0F;
            this.leg_l.rotateAngleZ = 0.0F;
        }

        this.hand_r.rotateAngleY = 0.0F;
        this.hand_r.rotateAngleZ = 0.0F;



        this.hand_r.rotateAngleZ += MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
        this.hand_l.rotateAngleZ -= MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
        this.hand_r.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        this.hand_l.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.05F;

        GL11.glTranslatef(0F, 0.4F, 0F);
    }
    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    private void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

