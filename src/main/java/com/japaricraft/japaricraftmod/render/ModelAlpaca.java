package com.japaricraft.japaricraftmod.render;

import com.japaricraft.japaricraftmod.mob.Alpaca;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelAlpaca extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer skirt_1;
    public ModelRenderer hair_fh_6_5_2;
    public ModelRenderer hair_fh_7_5_2;
    public ModelRenderer shape90;
    public ModelRenderer shape91;
    public ModelRenderer head;
    public ModelRenderer hand_l;
    public ModelRenderer hand_r;
    public ModelRenderer leg_l;
    public ModelRenderer leg_r;
    public ModelRenderer op_l;
    public ModelRenderer tail_1;
    public ModelRenderer main_hair_l2;
    public ModelRenderer knot1;
    public ModelRenderer knot2;
    public ModelRenderer neck;
    public ModelRenderer hair_fh;
    public ModelRenderer hair_fh_4;
    public ModelRenderer hair_fh_5;
    public ModelRenderer main_hair_l;
    public ModelRenderer main_hair_back;
    public ModelRenderer main_hair_r;
    public ModelRenderer ear1;
    public ModelRenderer ear2;
    public ModelRenderer main_hair_r2;
    public ModelRenderer hair_fh_4_5;
    public ModelRenderer p_tail;
    public ModelRenderer hair_fh_6;
    public ModelRenderer hair_fh_7;
    public ModelRenderer neck_a;
    public ModelRenderer neck_a2;
    public ModelRenderer neck_a3;
    public ModelRenderer ear1_n;
    public ModelRenderer ear2_n;
    public ModelRenderer hair_fh_6_5;
    public ModelRenderer hair_fh_7_5;
    public ModelRenderer skirt_2;

    public ModelAlpaca() {
        this.textureWidth = 256;
        this.textureHeight = 128;
        this.hair_fh_7_5_2 = new ModelRenderer(this, 120, 99);
        this.hair_fh_7_5_2.setRotationPoint(4.9F, 2.0F, -2.3F);
        this.hair_fh_7_5_2.addBox(-1.0F, -0.5F, -2.0F, 1, 1, 1, 0.5F);
        this.main_hair_l2 = new ModelRenderer(this, 0, 9);
        this.main_hair_l2.setRotationPoint(-4.75F, -3.95F, 0.0F);
        this.main_hair_l2.addBox(-4.0F, -4.0F, -1.0F, 8, 6, 1, 0.0F);
        this.setRotateAngle(main_hair_l2, 0.0F, 1.5707963267948966F, 0.3490658503988659F);
        this.tail_1 = new ModelRenderer(this, 139, 0);
        this.tail_1.setRotationPoint(-0.5F, -1.3F, 2.0F);
        this.tail_1.addBox(-1.0F, -1.0F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(tail_1, -0.08726646259971647F, 0.0F, 0.0F);
        this.skirt_2 = new ModelRenderer(this, 0, 90);
        this.skirt_2.setRotationPoint(0.0F, 1.8F, 0.0F);
        this.skirt_2.addBox(-3.5F, 1.0F, -3.5F, 7, 2, 7, 0.0F);
        this.hand_l = new ModelRenderer(this, 28, 20);
        this.hand_l.setRotationPoint(3.5F, -7.4F, -1.0F);
        this.hand_l.addBox(-1.0F, -0.5F, 0.0F, 2, 10, 2, 0.0F);
        this.setRotateAngle(hand_l, 0.0F, 0.0F, -0.08726646259971647F);
        this.shape91 = new ModelRenderer(this, 29, 8);
        this.shape91.setRotationPoint(-4.66F, 9.5F, -0.55F);
        this.shape91.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.5F);
        this.setRotateAngle(shape91, 0.0F, 0.0F, 0.08726646259971647F);
        this.hair_fh = new ModelRenderer(this, 0, 61);
        this.hair_fh.setRotationPoint(0.0F, -7.0F, -4.0F);
        this.hair_fh.addBox(-4.0F, -1.0F, -1.0F, 8, 2, 1, 0.0F);
        this.neck_a3 = new ModelRenderer(this, 120, 0);
        this.neck_a3.setRotationPoint(-0.5F, 0.4F, 3.0F);
        this.neck_a3.addBox(-0.5F, -0.5F, 0.0F, 2, 7, 1, 0.0F);
        this.setRotateAngle(neck_a3, 0.0F, 0.0F, 1.0821041362364843F);
        this.main_hair_r2 = new ModelRenderer(this, 0, 22);
        this.main_hair_r2.setRotationPoint(4.8F, -3.95F, 0.0F);
        this.main_hair_r2.addBox(-4.0F, -4.0F, -1.0F, 8, 6, 1, 0.0F);
        this.setRotateAngle(main_hair_r2, 0.0F, -1.5707963267948966F, -0.3490658503988659F);
        this.skirt_1 = new ModelRenderer(this, 0, 73);
        this.skirt_1.setRotationPoint(0.0F, 5.6F, 0.0F);
        this.skirt_1.addBox(-3.0F, 0.0F, -3.0F, 6, 6, 6, 0.0F);
        this.shape90 = new ModelRenderer(this, 42, 8);
        this.shape90.setRotationPoint(3.56F, 9.5F, -0.55F);
        this.shape90.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.5F);
        this.setRotateAngle(shape90, 0.0F, 0.0F, -0.08726646259971647F);
        this.hair_fh_6 = new ModelRenderer(this, 98, 75);
        this.hair_fh_6.setRotationPoint(-3.6F, -7.5F, -3.0F);
        this.hair_fh_6.addBox(-1.0F, -0.5F, -2.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(hair_fh_6, 0.0F, 0.0F, 0.17453292519943295F);
        this.head = new ModelRenderer(this, 96, 39);
        this.head.setRotationPoint(0.0F, -9.0F, 0.0F);
        this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.neck = new ModelRenderer(this, 96, 5);
        this.neck.setRotationPoint(-0.09F, 0.0F, 0.0F);
        this.neck.addBox(-1.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F);
        this.knot2 = new ModelRenderer(this, 58, 19);
        this.knot2.setRotationPoint(-0.5F, -8.1F, -2.2F);
        this.knot2.addBox(0.0F, 0.0F, 0.0F, 1, 3, 0, 0.0F);
        this.setRotateAngle(knot2, -0.6108652381980153F, 0.04415683007545653F, -0.4363323129985824F);
        this.ear2_n = new ModelRenderer(this, 27, 0);
        this.ear2_n.setRotationPoint(0.0F, -5.0F, 0.0F);
        this.ear2_n.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 1, 0.0F);
        this.hair_fh_5 = new ModelRenderer(this, 117, 64);
        this.hair_fh_5.setRotationPoint(3.0F, -5.9F, -3.0F);
        this.hair_fh_5.addBox(-1.0F, -0.5F, -2.0F, 2, 4, 1, 0.0F);
        this.setRotateAngle(hair_fh_5, 0.0F, 0.0F, 0.00942477796076938F);
        this.hair_fh_7_5 = new ModelRenderer(this, 120, 86);
        this.hair_fh_7_5.setRotationPoint(-0.2F, 4.5F, 0.0F);
        this.hair_fh_7_5.addBox(-1.0F, -0.5F, -2.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(hair_fh_7_5, 0.0F, 0.0F, 0.08726646259971647F);
        this.hair_fh_6_5_2 = new ModelRenderer(this, 98, 99);
        this.hair_fh_6_5_2.setRotationPoint(-3.9F, 2.0F, -2.3F);
        this.hair_fh_6_5_2.addBox(-1.0F, -0.5F, -2.0F, 1, 1, 1, 0.5F);
        this.ear1 = new ModelRenderer(this, 0, 121);
        this.ear1.setRotationPoint(-2.0F, -5.5F, 0.0F);
        this.ear1.addBox(-2.0F, -5.0F, -1.0F, 4, 3, 2, 0.0F);
        this.setRotateAngle(ear1, 0.0F, 0.6108652381980153F, -0.17453292519943295F);
        this.main_hair_back = new ModelRenderer(this, 28, 46);
        this.main_hair_back.setRotationPoint(0.0F, -4.0F, 4.0F);
        this.main_hair_back.addBox(-4.0F, -4.0F, 0.0F, 8, 8, 1, 0.0F);
        this.setRotateAngle(main_hair_back, 0.08726646259971647F, 0.0F, 0.0F);
        this.hand_r = new ModelRenderer(this, 38, 20);
        this.hand_r.setRotationPoint(-3.5F, -7.5F, 1.0F);
        this.hand_r.addBox(-1.0F, -0.5F, -2.0F, 2, 10, 2, 0.0F);
        this.setRotateAngle(hand_r, 0.0F, 0.0F, 0.08726646259971647F);
        this.leg_r = new ModelRenderer(this, 66, 0);
        this.leg_r.setRotationPoint(-1.5F, 1.0F, 0.0F);
        this.leg_r.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.hair_fh_4_5 = new ModelRenderer(this, 109, 64);
        this.hair_fh_4_5.setRotationPoint(1.0F, -5.7F, -3.0F);
        this.hair_fh_4_5.addBox(-1.0F, -0.5F, -2.0F, 2, 3, 1, 0.0F);
        this.main_hair_l = new ModelRenderer(this, 28, 55);
        this.main_hair_l.setRotationPoint(-4.0F, -3.95F, 0.0F);
        this.main_hair_l.addBox(-4.0F, -4.0F, -1.0F, 8, 8, 1, 0.0F);
        this.setRotateAngle(main_hair_l, 0.0F, 1.5707963267948966F, 0.17453292519943295F);
        this.p_tail = new ModelRenderer(this, 0, 0);
        this.p_tail.setRotationPoint(0.0F, -6.0F, 3.5F);
        this.p_tail.addBox(-2.0F, -4.0F, -2.0F, 4, 4, 4, 0.0F);
        this.setRotateAngle(p_tail, -0.5759586531581287F, 0.0F, 0.0F);
        this.neck_a = new ModelRenderer(this, 59, 47);
        this.neck_a.setRotationPoint(0.1F, -1.0F, 0.0F);
        this.neck_a.addBox(-3.0F, 1.0F, -3.0F, 6, 2, 6, 0.0F);
        this.hair_fh_4 = new ModelRenderer(this, 98, 64);
        this.hair_fh_4.setRotationPoint(-3.0F, -5.7F, -3.0F);
        this.hair_fh_4.addBox(-1.0F, -0.5F, -2.0F, 4, 5, 1, 0.0F);
        this.main_hair_r = new ModelRenderer(this, 0, 34);
        this.main_hair_r.setRotationPoint(4.0F, -3.95F, 0.0F);
        this.main_hair_r.addBox(-4.0F, -4.0F, -1.0F, 8, 8, 1, 0.0F);
        this.setRotateAngle(main_hair_r, 0.0F, -1.5707963267948966F, -0.17453292519943295F);
        this.body = new ModelRenderer(this, 108, 16);
        this.body.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.body.addBox(-2.5F, -8.0F, -2.5F, 5, 8, 5, 0.0F);
        this.neck_a2 = new ModelRenderer(this, 110, 0);
        this.neck_a2.setRotationPoint(-0.5F, 1.0F, 3.0F);
        this.neck_a2.addBox(-0.5F, -0.5F, 0.0F, 2, 7, 1, 0.0F);
        this.setRotateAngle(neck_a2, 0.0F, 0.0F, -1.0821041362364843F);
        this.op_l = new ModelRenderer(this, 60, 33);
        this.op_l.setRotationPoint(0.0F, -8.0F, 1.2F);
        this.op_l.addBox(-2.5F, -1.0F, -5.0F, 5, 3, 3, 0.0F);
        this.setRotateAngle(op_l, 0.5410520681182421F, 0.0F, 0.0F);
        this.hair_fh_6_5 = new ModelRenderer(this, 98, 87);
        this.hair_fh_6_5.setRotationPoint(0.2F, 4.5F, 0.0F);
        this.hair_fh_6_5.addBox(-1.0F, -0.5F, -2.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(hair_fh_6_5, 0.0F, 0.0F, -0.08726646259971647F);
        this.ear2 = new ModelRenderer(this, 0, 107);
        this.ear2.setRotationPoint(2.0F, -5.5F, -0.1F);
        this.ear2.addBox(-2.0F, -5.0F, -1.0F, 4, 3, 2, 0.0F);
        this.setRotateAngle(ear2, 0.0F, -0.6108652381980153F, 0.17453292519943295F);
        this.hair_fh_7 = new ModelRenderer(this, 120, 75);
        this.hair_fh_7.setRotationPoint(3.5F, -7.5F, -3.0F);
        this.hair_fh_7.addBox(-1.0F, -0.5F, -2.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(hair_fh_7, 0.0F, 0.0F, -0.17453292519943295F);
        this.leg_l = new ModelRenderer(this, 57, 0);
        this.leg_l.setRotationPoint(1.5F, 1.0F, 0.0F);
        this.leg_l.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.ear1_n = new ModelRenderer(this, 39, 0);
        this.ear1_n.setRotationPoint(0.0F, -5.0F, 0.0F);
        this.ear1_n.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 1, 0.0F);
        this.knot1 = new ModelRenderer(this, 67, 19);
        this.knot1.setRotationPoint(-0.4F, -8.6F, -2.2F);
        this.knot1.addBox(0.0F, 0.0F, 0.0F, 1, 3, 0, 0.0F);
        this.setRotateAngle(knot1, -0.6108652381980153F, 0.0F, 0.4363323129985824F);
        this.body.addChild(this.tail_1);
        this.skirt_1.addChild(this.skirt_2);
        this.body.addChild(this.hand_l);
        this.head.addChild(this.hair_fh);
        this.neck_a.addChild(this.neck_a3);
        this.head.addChild(this.main_hair_r2);
        this.head.addChild(this.hair_fh_6);
        this.body.addChild(this.head);
        this.head.addChild(this.neck);
        this.body.addChild(this.knot2);
        this.ear2.addChild(this.ear2_n);
        this.head.addChild(this.hair_fh_5);
        this.hair_fh_7.addChild(this.hair_fh_7_5);
        this.head.addChild(this.ear1);
        this.head.addChild(this.main_hair_back);
        this.body.addChild(this.hand_r);
        this.body.addChild(this.leg_r);
        this.head.addChild(this.hair_fh_4_5);
        this.head.addChild(this.main_hair_l);
        this.head.addChild(this.main_hair_l2);
        this.head.addChild(this.p_tail);
        this.neck.addChild(this.neck_a);
        this.head.addChild(this.hair_fh_4);
        this.head.addChild(this.main_hair_r);
        this.neck_a.addChild(this.neck_a2);
        this.body.addChild(this.op_l);
        this.hair_fh_6.addChild(this.hair_fh_6_5);
        this.head.addChild(this.ear2);
        this.head.addChild(this.hair_fh_7);
        this.body.addChild(this.leg_l);
        this.ear1.addChild(this.ear1_n);
        this.body.addChild(this.knot1);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.hair_fh_7_5_2.offsetX, this.hair_fh_7_5_2.offsetY, this.hair_fh_7_5_2.offsetZ);
        GlStateManager.translate(this.hair_fh_7_5_2.rotationPointX * f5, this.hair_fh_7_5_2.rotationPointY * f5, this.hair_fh_7_5_2.rotationPointZ * f5);
        GlStateManager.scale(1.1D, 1.1D, 1.1D);
        GlStateManager.translate(-this.hair_fh_7_5_2.offsetX, -this.hair_fh_7_5_2.offsetY, -this.hair_fh_7_5_2.offsetZ);
        GlStateManager.translate(-this.hair_fh_7_5_2.rotationPointX * f5, -this.hair_fh_7_5_2.rotationPointY * f5, -this.hair_fh_7_5_2.rotationPointZ * f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.shape91.offsetX, this.shape91.offsetY, this.shape91.offsetZ);
        GlStateManager.translate(this.shape91.rotationPointX * f5, this.shape91.rotationPointY * f5, this.shape91.rotationPointZ * f5);
        GlStateManager.scale(1.1D, 1.1D, 1.1D);
        GlStateManager.translate(-this.shape91.offsetX, -this.shape91.offsetY, -this.shape91.offsetZ);
        GlStateManager.translate(-this.shape91.rotationPointX * f5, -this.shape91.rotationPointY * f5, -this.shape91.rotationPointZ * f5);
        GlStateManager.popMatrix();
        this.skirt_1.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.shape90.offsetX, this.shape90.offsetY, this.shape90.offsetZ);
        GlStateManager.translate(this.shape90.rotationPointX * f5, this.shape90.rotationPointY * f5, this.shape90.rotationPointZ * f5);
        GlStateManager.scale(1.1D, 1.1D, 1.1D);
        GlStateManager.translate(-this.shape90.offsetX, -this.shape90.offsetY, -this.shape90.offsetZ);
        GlStateManager.translate(-this.shape90.rotationPointX * f5, -this.shape90.rotationPointY * f5, -this.shape90.rotationPointZ * f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.hair_fh_6_5_2.offsetX, this.hair_fh_6_5_2.offsetY, this.hair_fh_6_5_2.offsetZ);
        GlStateManager.translate(this.hair_fh_6_5_2.rotationPointX * f5, this.hair_fh_6_5_2.rotationPointY * f5, this.hair_fh_6_5_2.rotationPointZ * f5);
        GlStateManager.scale(1.1D, 1.1D, 1.1D);
        GlStateManager.translate(-this.hair_fh_6_5_2.offsetX, -this.hair_fh_6_5_2.offsetY, -this.hair_fh_6_5_2.offsetZ);
        GlStateManager.translate(-this.hair_fh_6_5_2.rotationPointX * f5, -this.hair_fh_6_5_2.rotationPointY * f5, -this.hair_fh_6_5_2.rotationPointZ * f5);
        GlStateManager.popMatrix();
        this.body.render(f5);
    }

    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        if (!(entityIn instanceof Alpaca)) {
            return;
        }

        Alpaca entityarai = (Alpaca) entityIn;
        boolean flag = ((EntityLivingBase) entityIn).getTicksElytraFlying() > 4;
        this.head.rotateAngleY = netHeadYaw * 0.017453292F;

        if (flag) {
            this.head.rotateAngleX = -((float) Math.PI / 4F);
        } else {
            this.head.rotateAngleX = headPitch * 0.017453292F;
        }

        this.body.rotateAngleY = 0.0F;
        float f = 1.0F;

        if (flag) {
            f = (float) (entityIn.motionX * entityIn.motionX + entityIn.motionY * entityIn.motionY + entityIn.motionZ * entityIn.motionZ);
            f = f / 0.2F;
            f = f * f * f;
        }

        if (f < 1.0F) {
            f = 1.0F;
        }

        this.hand_r.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 2.0F * limbSwingAmount * 0.5F / f;
        this.hand_l.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount * 0.5F / f;
        this.hand_r.rotateAngleZ = 0.0F;
        this.hand_l.rotateAngleZ = 0.0F;
        this.leg_r.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount / f;
        this.leg_l.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount / f;
        this.leg_r.rotateAngleY = 0.0F;
        this.leg_l.rotateAngleY = 0.0F;
        this.leg_r.rotateAngleZ = 0.0F;
        this.leg_l.rotateAngleZ = 0.0F;

        if (entityarai.isSitting() || this.isRiding) {
            this.leg_r.rotateAngleX = -1.4137167F;
            this.leg_r.rotateAngleY = ((float) Math.PI / 10F);
            this.leg_r.rotateAngleZ = 0.07853982F;
            this.leg_l.rotateAngleX = -1.4137167F;
            this.leg_l.rotateAngleY = -((float) Math.PI / 10F);
            this.leg_l.rotateAngleZ = -0.07853982F;
        } else {
            this.leg_r.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount / f;
            this.leg_l.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount / f;
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
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
