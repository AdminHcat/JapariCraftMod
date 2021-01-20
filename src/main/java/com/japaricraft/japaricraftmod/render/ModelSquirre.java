package com.japaricraft.japaricraftmod.render;

import com.japaricraft.japaricraftmod.mob.Squirre;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelSquirre extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer head;
    public ModelRenderer handR;
    public ModelRenderer handL;
    public ModelRenderer legR;
    public ModelRenderer legL;
    public ModelRenderer tale;
    public ModelRenderer headitemR;
    public ModelRenderer headitemL;

    public ModelSquirre() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.body = new ModelRenderer(this, 32, 0);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addBox(-2.5F, 0.0F, -2.5F, 5, 8, 5, 0.0F);
        this.head = new ModelRenderer(this, 0, 0);
        this.head.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.head.addBox(-4.0F, -9.0F, -4.0F, 8, 8, 8, 0.0F);
        this.legR = new ModelRenderer(this, 16, 16);
        this.legR.setRotationPoint(-1.2F, 8.0F, 0.0F);
        this.legR.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
        this.headitemL = new ModelRenderer(this, 8, 16);
        this.headitemL.setRotationPoint(-2.0F, -8.3F, -2.0F);
        this.headitemL.addBox(-3.0F, -2.0F, 0.0F, 3, 2, 1, 0.0F);
        this.setRotateAngle(headitemL, 0.0F, 0.0F, 0.40980330836826856F);
        this.legL = new ModelRenderer(this, 24, 16);
        this.legL.setRotationPoint(1.2F, 8.0F, 0.0F);
        this.legL.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
        this.handR = new ModelRenderer(this, 0, 19);
        this.handR.setRotationPoint(-3.5F, 0.0F, 0.0F);
        this.handR.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(handR, 0.0F, 0.0F, 0.091106186954104F);
        this.handL = new ModelRenderer(this, 8, 19);
        this.handL.setRotationPoint(3.5F, 0.0F, 0.0F);
        this.handL.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(handL, 0.0F, 0.0F, -0.091106186954104F);
        this.headitemR = new ModelRenderer(this, 0, 16);
        this.headitemR.setRotationPoint(2.0F, -8.3F, -2.0F);
        this.headitemR.addBox(0.0F, -2.0F, 0.0F, 3, 2, 1, 0.0F);
        this.setRotateAngle(headitemR, 0.0F, 0.0F, -0.40980330836826856F);
        this.tale = new ModelRenderer(this, 52, 0);
        this.tale.setRotationPoint(-0.5F, 6.0F, 2.0F);
        this.tale.addBox(0.0F, 0.0F, 0.0F, 1, 4, 4, 0.0F);
        this.setRotateAngle(tale, 1.0927506446736497F, 0.0F, 0.0F);
        this.body.addChild(this.head);
        this.body.addChild(this.legR);
        this.head.addChild(this.headitemL);
        this.body.addChild(this.legL);
        this.body.addChild(this.handR);
        this.body.addChild(this.handL);
        this.head.addChild(this.headitemR);
        this.body.addChild(this.tale);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }

    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        if (!(entityIn instanceof Squirre)) {
            return;
        }

        Squirre entitysquirre = (Squirre) entityIn;
        boolean flag = entityIn instanceof EntityLivingBase && ((EntityLivingBase) entityIn).getTicksElytraFlying() > 4;
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

        this.handR.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 2.0F * limbSwingAmount * 0.5F / f;
        this.handL.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount * 0.5F / f;
        this.handR.rotateAngleZ = 0.0F;
        this.handL.rotateAngleZ = 0.0F;
        this.legR.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount / f;
        this.legL.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount / f;
        this.legR.rotateAngleY = 0.0F;
        this.legL.rotateAngleY = 0.0F;
        this.legR.rotateAngleZ = 0.0F;
        this.legL.rotateAngleZ = 0.0F;

        if (entitysquirre.isSitting() || this.isRiding) {
            this.legR.rotateAngleX = -1.4137167F;
            this.legR.rotateAngleY = ((float) Math.PI / 10F);
            this.legR.rotateAngleZ = 0.07853982F;
            this.legL.rotateAngleX = -1.4137167F;
            this.legL.rotateAngleY = -((float) Math.PI / 10F);
            this.legL.rotateAngleZ = -0.07853982F;
        } else {
            this.legR.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount / f;
            this.legL.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount / f;
            this.legR.rotateAngleY = 0.0F;
            this.legL.rotateAngleY = 0.0F;
            this.legR.rotateAngleZ = 0.0F;
            this.legL.rotateAngleZ = 0.0F;
        }

        this.handR.rotateAngleY = 0.0F;
        this.handR.rotateAngleZ = 0.0F;


        this.handR.rotateAngleZ += MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
        this.handL.rotateAngleZ -= MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
        this.handR.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        this.handL.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.05F;

        GL11.glTranslatef(0F, 0.5F, 0F);
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
