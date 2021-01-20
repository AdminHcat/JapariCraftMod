package com.japaricraft.japaricraftmod.render;

import com.japaricraft.japaricraftmod.mob.Araisan;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.opengl.GL11;


public class ModelAraisan extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer tail_1;
    public ModelRenderer head;
    public ModelRenderer hand_l;
    public ModelRenderer hand_r;
    public ModelRenderer skirt_1;
    public ModelRenderer leg_l;
    public ModelRenderer leg_r;
    public ModelRenderer tie1;
    public ModelRenderer op_l;
    public ModelRenderer neck;
    public ModelRenderer ear_r;
    public ModelRenderer ear_l;
    public ModelRenderer hair_fh;
    public ModelRenderer hair_fh_2;
    public ModelRenderer hair_fh_3;
    public ModelRenderer hair_fh_4;
    public ModelRenderer hair_fh_5;
    public ModelRenderer hair_b_01;
    public ModelRenderer main_hair_l;
    public ModelRenderer main_hair_back;
    public ModelRenderer hair_b_02;
    public ModelRenderer main_hair_r;
    public ModelRenderer neck_a;
    public ModelRenderer ear_r_at;
    public ModelRenderer ear_l_at;
    public ModelRenderer cl_l;
    public ModelRenderer cl_r;
    public ModelRenderer skirt_2;
    public ModelRenderer tie2;
    public ModelRenderer tie3;
    public ModelRenderer tie1_l1;
    public ModelRenderer tie1_l2;

    public ModelAraisan() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.neck = new ModelRenderer(this, 96, 5);
        this.neck.setRotationPoint(-0.09F, 0.0F, 0.0F);
        this.neck.addBox(-1.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F);
        this.main_hair_r = new ModelRenderer(this, 0, 34);
        this.main_hair_r.setRotationPoint(4.0F, -3.95F, 0.0F);
        this.main_hair_r.addBox(-4.0F, -4.0F, -1.0F, 8, 8, 1, 0.0F);
        this.setRotateAngle(main_hair_r, 0.0F, -1.5707963267948966F, -0.17453292519943295F);
        this.hand_r = new ModelRenderer(this, 38, 20);
        this.hand_r.setRotationPoint(-4.0F, -7.5F, 1.0F);
        this.hand_r.addBox(-1.0F, -0.5F, -2.0F, 2, 10, 2, 0.0F);
        this.setRotateAngle(hand_r, 0.0F, 0.0F, 0.08726646259971647F);
        this.hair_fh_4 = new ModelRenderer(this, 0, 50);
        this.hair_fh_4.setRotationPoint(-3.0F, -5.9F, -3.0F);
        this.hair_fh_4.addBox(-1.0F, -0.5F, -2.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(hair_fh_4, 0.0F, 0.0F, 0.08726646259971647F);
        this.tail_1 = new ModelRenderer(this, 0, 0);
        this.tail_1.setRotationPoint(-0.2F, 11.5F, 1.1F);
        this.tail_1.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(tail_1, -0.6373942428283291F, 0.0F, 0.0F);
        this.cl_r = new ModelRenderer(this, 40, 0);
        this.cl_r.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.cl_r.addBox(-1.5F, -1.0F, -3.0F, 3, 2, 3, 0.0F);
        this.setRotateAngle(cl_r, -0.020943951023931952F, 0.0F, 0.0F);
        this.ear_r = new ModelRenderer(this, 120, 29);
        this.ear_r.setRotationPoint(3.1F, -7.2F, 0.0F);
        this.ear_r.addBox(-2.0F, -2.0F, 0.0F, 3, 2, 1, 0.0F);
        this.setRotateAngle(ear_r, 0.0F, 0.0F, 0.3490658503988659F);
        this.ear_l = new ModelRenderer(this, 120, 34);
        this.ear_l.setRotationPoint(-2.1F, -7.5F, 0.0F);
        this.ear_l.addBox(-2.0F, -2.0F, 0.0F, 3, 2, 1, 0.0F);
        this.setRotateAngle(ear_l, 0.0F, 0.0F, -0.3490658503988659F);
        this.hair_b_01 = new ModelRenderer(this, 38, 34);
        this.hair_b_01.setRotationPoint(-3.5F, -7.55F, -2.6F);
        this.hair_b_01.addBox(-1.0F, -0.5F, -2.0F, 2, 9, 2, 0.0F);
        this.setRotateAngle(hair_b_01, 0.0F, 0.3665191429188092F, 0.08726646259971647F);
        this.head = new ModelRenderer(this, 96, 39);
        this.head.setRotationPoint(0.0F, -9.0F, 0.0F);
        this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.tie1_l2 = new ModelRenderer(this, 60, 29);
        this.tie1_l2.setRotationPoint(-0.3F, -1.89F, -1.0F);
        this.tie1_l2.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(tie1_l2, -0.005235987755982988F, 0.45378560551852565F, -0.17453292519943295F);
        this.ear_r_at = new ModelRenderer(this, 114, 30);
        this.ear_r_at.setRotationPoint(-0.5F, -1.9F, 0.0F);
        this.ear_r_at.addBox(-1.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F);
        this.hair_fh_2 = new ModelRenderer(this, 0, 58);
        this.hair_fh_2.setRotationPoint(0.0F, -5.0F, -4.0F);
        this.hair_fh_2.addBox(-2.0F, -1.0F, -1.0F, 4, 1, 1, 0.0F);
        this.skirt_1 = new ModelRenderer(this, 0, 26);
        this.skirt_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.skirt_1.addBox(-3.0F, 0.0F, -3.0F, 6, 1, 6, 0.0F);
        this.main_hair_back = new ModelRenderer(this, 28, 46);
        this.main_hair_back.setRotationPoint(0.0F, -4.0F, 4.0F);
        this.main_hair_back.addBox(-4.0F, -4.0F, 0.0F, 8, 8, 1, 0.0F);
        this.setRotateAngle(main_hair_back, 0.08726646259971647F, 0.0F, 0.0F);
        this.hair_fh = new ModelRenderer(this, 0, 61);
        this.hair_fh.setRotationPoint(0.0F, -7.0F, -4.0F);
        this.hair_fh.addBox(-4.0F, -1.0F, -1.0F, 8, 2, 1, 0.0F);
        this.tie2 = new ModelRenderer(this, 65, 14);
        this.tie2.setRotationPoint(-0.5F, 1.0F, 0.0F);
        this.tie2.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(tie2, 0.0F, 0.0F, 1.5707963267948966F);
        this.main_hair_l = new ModelRenderer(this, 28, 55);
        this.main_hair_l.setRotationPoint(-4.0F, -3.95F, 0.0F);
        this.main_hair_l.addBox(-4.0F, -4.0F, -1.0F, 8, 8, 1, 0.0F);
        this.setRotateAngle(main_hair_l, 0.0F, 1.5707963267948966F, 0.17453292519943295F);
        this.hair_fh_5 = new ModelRenderer(this, 0, 45);
        this.hair_fh_5.setRotationPoint(3.0F, -5.9F, -3.0F);
        this.hair_fh_5.addBox(-1.0F, -0.5F, -2.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(hair_fh_5, 0.0F, 0.0F, -0.08726646259971647F);
        this.neck_a = new ModelRenderer(this, 74, 24);
        this.neck_a.setRotationPoint(0.1F, -1.0F, 0.0F);
        this.neck_a.addBox(-2.5F, 1.0F, -2.5F, 5, 2, 5, 0.0F);
        this.op_l = new ModelRenderer(this, 60, 33);
        this.op_l.setRotationPoint(0.0F, -8.0F, 1.2F);
        this.op_l.addBox(-2.5F, -1.0F, -5.0F, 5, 3, 3, 0.0F);
        this.setRotateAngle(op_l, 0.5410520681182421F, 0.0F, 0.0F);
        this.tie1_l1 = new ModelRenderer(this, 60, 24);
        this.tie1_l1.setRotationPoint(-0.1F, -0.1F, -1.0F);
        this.tie1_l1.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(tie1_l1, 0.0F, 0.45378560551852565F, 0.17453292519943295F);
        this.leg_l = new ModelRenderer(this, 57, 0);
        this.leg_l.setRotationPoint(1.5F, 2.0F, 0.0F);
        this.leg_l.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
        this.tie3 = new ModelRenderer(this, 60, 19);
        this.tie3.setRotationPoint(-0.5F, -2.0F, 0.0F);
        this.tie3.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(tie3, 0.0F, 0.0F, 1.5707963267948966F);
        this.hand_l = new ModelRenderer(this, 28, 20);
        this.hand_l.setRotationPoint(4.0F, -7.4F, -1.0F);
        this.hand_l.addBox(-1.0F, -0.5F, 0.0F, 2, 10, 2, 0.0F);
        this.setRotateAngle(hand_l, 0.0F, 0.0F, -0.08726646259971647F);
        this.ear_l_at = new ModelRenderer(this, 109, 35);
        this.ear_l_at.setRotationPoint(-0.5F, -1.9F, 0.0F);
        this.ear_l_at.addBox(-1.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F);
        this.hair_fh_3 = new ModelRenderer(this, 0, 55);
        this.hair_fh_3.setRotationPoint(0.0F, -4.0F, -4.0F);
        this.hair_fh_3.addBox(-1.0F, -1.0F, -1.0F, 2, 1, 1, 0.0F);
        this.body = new ModelRenderer(this, 108, 16);
        this.body.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.body.addBox(-2.5F, -8.0F, -2.5F, 5, 8, 5, 0.0F);
        this.hair_b_02 = new ModelRenderer(this, 28, 34);
        this.hair_b_02.setRotationPoint(3.5F, -7.55F, -2.6F);
        this.hair_b_02.addBox(-1.0F, -0.5F, -2.0F, 2, 9, 2, 0.0F);
        this.setRotateAngle(hair_b_02, 0.0F, -0.3665191429188092F, -0.08726646259971647F);
        this.leg_r = new ModelRenderer(this, 66, 0);
        this.leg_r.setRotationPoint(-1.5F, 2.0F, 0.0F);
        this.leg_r.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
        this.tie1 = new ModelRenderer(this, 59, 15);
        this.tie1.setRotationPoint(-0.5F, -7.0F, -2.3F);
        this.tie1.addBox(-1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(tie1, 0.0F, 0.0F, 1.5707963267948966F);
        this.cl_l = new ModelRenderer(this, 28, 0);
        this.cl_l.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.cl_l.addBox(-1.5F, -1.0F, 0.0F, 3, 2, 3, 0.0F);
        this.setRotateAngle(cl_l, -0.020943951023931952F, 0.0F, 0.0F);
        this.skirt_2 = new ModelRenderer(this, 0, 13);
        this.skirt_2.setRotationPoint(-0.5F, 1.0F, -0.5F);
        this.skirt_2.addBox(-3.0F, 0.0F, -3.0F, 7, 1, 7, 0.0F);
        this.head.addChild(this.neck);
        this.head.addChild(this.main_hair_r);
        this.body.addChild(this.hand_r);
        this.head.addChild(this.hair_fh_4);
        this.hand_r.addChild(this.cl_r);
        this.head.addChild(this.ear_r);
        this.head.addChild(this.ear_l);
        this.head.addChild(this.hair_b_01);
        this.body.addChild(this.head);
        this.tie1.addChild(this.tie1_l2);
        this.ear_r.addChild(this.ear_r_at);
        this.head.addChild(this.hair_fh_2);
        this.body.addChild(this.skirt_1);
        this.head.addChild(this.main_hair_back);
        this.head.addChild(this.hair_fh);
        this.tie1.addChild(this.tie2);
        this.head.addChild(this.main_hair_l);
        this.head.addChild(this.hair_fh_5);
        this.neck.addChild(this.neck_a);
        this.body.addChild(this.op_l);
        this.tie1.addChild(this.tie1_l1);
        this.body.addChild(this.leg_l);
        this.tie1.addChild(this.tie3);
        this.body.addChild(this.hand_l);
        this.ear_l.addChild(this.ear_l_at);
        this.head.addChild(this.hair_fh_3);
        this.head.addChild(this.hair_b_02);
        this.body.addChild(this.leg_r);
        this.body.addChild(this.tie1);
        this.hand_l.addChild(this.cl_l);
        this.skirt_1.addChild(this.skirt_2);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.tail_1.render(f5);
        this.body.render(f5);
    }


    //下は特殊なモデルを動かすのに必須
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
        if (!(entityIn instanceof Araisan))
        {
            return;
        }

        Araisan entityarai = (Araisan) entityIn;
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

        if (entityarai.isSitting()||this.isRiding)
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
