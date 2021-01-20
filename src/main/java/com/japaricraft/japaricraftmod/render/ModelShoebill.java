package com.japaricraft.japaricraftmod.render;

import com.japaricraft.japaricraftmod.mob.Shoebill;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;

@SuppressWarnings("ALL")
public class ModelShoebill extends ModelBase {
    private ModelRenderer body;
    private ModelRenderer rightH;
    private ModelRenderer leftH;
    private ModelRenderer legR;
    private ModelRenderer legL;
    private ModelRenderer head;

    public ModelShoebill() {
        super();
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.body = new ModelRenderer(this, 0, 33);
        this.body.setRotationPoint(0.0F, 7.2F, 0.0F);
        this.body.addBox(-2.5F, 0.0F, -2.8F, 5, 8, 5, 0.0F);
        this.rightH = new ModelRenderer(this, 46, 0);
        this.rightH.setRotationPoint(-2.9F, 1.0F, -0.3F);
        this.rightH.addBox(-1.7F, -0.7F, -1.1F, 2, 10, 2, 0.0F);
        this.setRotateAngle(rightH, 1.2401310215141802E-16F, 0.0F, 0.20943951023931953F);
        ModelRenderer hairL = new ModelRenderer(this, 0, 5);
        hairL.setRotationPoint(3.1F, -8.0F, -0.6F);
        hairL.addBox(0.0F, 0.0F, -3.0F, 1, 10, 6, 0.0F);
        this.setRotateAngle(hairL, 0.0F, 0.0F, -0.31869712141416456F);
        ModelRenderer hairTop1 = new ModelRenderer(this, 0, 0);
        hairTop1.setRotationPoint(3.6F, 0.4F, 8.1F);
        hairTop1.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(hairTop1, 2.722015501410356F, 0.0F, 0.0F);
        ModelRenderer headextend4 = new ModelRenderer(this, 46, 21);
        headextend4.setRotationPoint(0.8F, 2.1F, -1.2F);
        headextend4.addBox(-2.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F);
        ModelRenderer hairextend1 = new ModelRenderer(this, 60, 5);
        hairextend1.setRotationPoint(2.9F, -6.4F, -4.2F);
        hairextend1.addBox(0.0F, 0.0F, -0.7F, 1, 4, 1, 0.0F);
        ModelRenderer hairTop3 = new ModelRenderer(this, 0, 0);
        hairTop3.setRotationPoint(4.4F, 0.4F, 8.1F);
        hairTop3.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(hairTop3, 2.722015501410356F, 0.0F, 0.18203784098300857F);
        this.legL = new ModelRenderer(this, 44, 43);
        this.legL.mirror = true;
        this.legL.setRotationPoint(1.6F, 8.3F, -0.2F);
        this.legL.addBox(-1.1F, 0.7F, -1.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(legL, 8.680917150599262E-16F, 0.0F, 0.0F);
        ModelRenderer hair2 = new ModelRenderer(this, 22, 24);
        hair2.setRotationPoint(3.0F, -8.11F, -3.2F);
        hair2.addBox(0.0F, 0.0F, -1.7F, 1, 5, 3, 0.0F);
        this.setRotateAngle(hair2, 0.0F, 0.0F, -0.1996656664281513F);
        ModelRenderer shape1 = new ModelRenderer(this, 60, 40);
        shape1.setRotationPoint(-0.4F, 1.8F, -2.1F);
        shape1.addBox(-2.1F, -0.9F, -1.8F, 5, 2, 2, 0.0F);
        this.setRotateAngle(shape1, 0.6981317007977318F, 0.0F, 0.0F);
        this.legR = new ModelRenderer(this, 44, 43);
        this.legR.setRotationPoint(-1.1F, 9.2F, -0.2F);
        this.legR.addBox(-1.5F, -0.3F, -1.0F, 2, 8, 2, 0.0F);
        this.leftH = new ModelRenderer(this, 46, 0);
        this.leftH.setRotationPoint(2.6F, 1.2F, -0.3F);
        this.leftH.addBox(0.0F, -0.7F, -1.1F, 2, 10, 2, 0.0F);
        this.setRotateAngle(leftH, -8.680917150599262E-16F, 0.0F, -0.15707963267948966F);
        ModelRenderer hair1 = new ModelRenderer(this, 14, 24);
        hair1.setRotationPoint(-3.22F, -7.6F, -1.8F);
        hair1.addBox(-1.0F, -0.5F, -3.1F, 1, 5, 3, 0.0F);
        this.setRotateAngle(hair1, 0.0F, 0.0F, 0.1996656664281513F);
        ModelRenderer neck = new ModelRenderer(this, 4, 0);
        neck.setRotationPoint(-0.4F, 1.2F, -0.3F);
        neck.addBox(-1.4F, -1.5F, -1.0F, 3, 2, 2, 0.0F);
        ModelRenderer pelvis = new ModelRenderer(this, 20, 36);
        pelvis.setRotationPoint(0.2F, 7.6F, -0.3F);
        pelvis.addBox(-3.2F, 0.0F, -3.0F, 6, 2, 6, 0.0F);
        this.setRotateAngle(pelvis, 0.09145525280450287F, 0.0F, 0.0F);
        ModelRenderer headextend3 = new ModelRenderer(this, 46, 19);
        headextend3.setRotationPoint(0.5F, 3.3F, -1.2F);
        headextend3.addBox(-2.8F, -1.9F, 0.0F, 6, 1, 1, 0.0F);
        ModelRenderer tailM = new ModelRenderer(this, 36, 47);
        tailM.setRotationPoint(-0.5F, 7.2F, 3.6F);
        tailM.addBox(-0.5F, -4.3F, -0.6F, 2, 6, 2, 0.0F);
        this.setRotateAngle(tailM, -1.9537215646824522F, 0.0F, 0.0F);
        ModelRenderer headextend5 = new ModelRenderer(this, 46, 23);
        headextend5.setRotationPoint(0.6F, 3.0F, -1.2F);
        headextend5.addBox(-0.8F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        ModelRenderer shirtextend1 = new ModelRenderer(this, 42, 54);
        shirtextend1.setRotationPoint(1.0F, 1.3F, 0.0F);
        shirtextend1.addBox(-1.6F, -2.1F, -1.5F, 3, 2, 3, 0.0F);
        ModelRenderer hairextend2 = new ModelRenderer(this, 60, 10);
        hairextend2.setRotationPoint(0.0F, 4.0F, 0.0F);
        hairextend2.addBox(0.0F, 0.0F, -0.7F, 1, 3, 1, 0.0F);
        ModelRenderer shirtextend2 = new ModelRenderer(this, 42, 54);
        shirtextend2.setRotationPoint(-0.6F, 1.3F, 0.0F);
        shirtextend2.addBox(-1.6F, -2.1F, -1.5F, 3, 2, 3, 0.0F);
        ModelRenderer rig1 = new ModelRenderer(this, 0, 0);
        rig1.setRotationPoint(-4.4F, -8.2F, -4.2F);
        rig1.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
        ModelRenderer rig2 = new ModelRenderer(this, 0, 0);
        rig2.setRotationPoint(-1.0F, -7.9F, -3.7F);
        rig2.addBox(-0.9F, -1.1F, -1.8F, 0, 0, 0, 0.0F);
        ModelRenderer hairR = new ModelRenderer(this, 0, 16);
        hairR.setRotationPoint(-4.1F, -8.3F, -0.2F);
        hairR.addBox(0.0F, 0.0F, -3.0F, 1, 10, 6, 0.0F);
        this.setRotateAngle(hairR, 0.0F, 0.0F, 0.31869712141416456F);
        ModelRenderer headextend2 = new ModelRenderer(this, 46, 17);
        headextend2.setRotationPoint(0.4F, 0.7F, -1.2F);
        headextend2.addBox(-3.5F, -0.2F, 0.0F, 8, 1, 1, 0.0F);
        this.head = new ModelRenderer(this, 14, 0);
        this.head.setRotationPoint(0.3F, -0.2F, -0.1F);
        this.head.addBox(-4.1F, -8.3F, -4.1F, 8, 8, 8, 0.0F);
        ModelRenderer hairTop2 = new ModelRenderer(this, 0, 0);
        hairTop2.setRotationPoint(2.8F, 0.7F, 8.07F);
        hairTop2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(hairTop2, 2.722015501410356F, 0.0F, -0.25324727446437717F);
        ModelRenderer headextend1 = new ModelRenderer(this, 46, 15);
        headextend1.setRotationPoint(0.4F, 0.0F, -0.4F);
        headextend1.addBox(-3.5F, -0.4F, -0.8F, 8, 1, 1, 0.0F);
        this.body.addChild(this.rightH);
        this.head.addChild(hairL);
        rig1.addChild(hairTop1);
        rig2.addChild(headextend4);
        this.head.addChild(hairextend1);
        rig1.addChild(hairTop3);
        this.body.addChild(this.legL);
        this.head.addChild(hair2);
        this.body.addChild(shape1);
        this.body.addChild(this.legR);
        this.body.addChild(this.leftH);
        this.head.addChild(hair1);
        this.head.addChild(neck);
        this.body.addChild(pelvis);
        rig2.addChild(headextend3);
        this.body.addChild(tailM);
        rig2.addChild(headextend5);
        this.leftH.addChild(shirtextend1);
        hairextend1.addChild(hairextend2);
        this.rightH.addChild(shirtextend2);
        this.head.addChild(rig1);
        this.head.addChild(rig2);
        this.head.addChild(hairR);
        rig2.addChild(headextend2);
        this.body.addChild(this.head);
        rig1.addChild(hairTop2);
        rig2.addChild(headextend1);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }


    //下は特殊なモデルを動かすのに必須
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
        if (!(entityIn instanceof Shoebill))
        {
            return;
        }

        Shoebill entityshoebill = (Shoebill) entityIn;
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

        this.rightH.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 2.0F * limbSwingAmount * 0.5F / f;
        this.leftH.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount * 0.5F / f;
        this.rightH.rotateAngleZ = 0.0F;
        this.leftH.rotateAngleZ = 0.0F;
        this.legR.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount / f;
        this.legL.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount / f;
        this.legR.rotateAngleY = 0.0F;
        this.legL.rotateAngleY = 0.0F;
        this.legR.rotateAngleZ = 0.0F;
        this.legL.rotateAngleZ = 0.0F;

        if (entityshoebill.isSitting()||this.isRiding)
        {
            this.legR.rotateAngleX = -1.4137167F;
            this.legR.rotateAngleY = ((float)Math.PI / 10F);
            this.legR.rotateAngleZ = 0.07853982F;
            this.legL.rotateAngleX = -1.4137167F;
            this.legL.rotateAngleY = -((float)Math.PI / 10F);
            this.legL.rotateAngleZ = -0.07853982F;
        }
        else
        {
            this.legR.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount / f;
            this.legL.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount / f;
            this.legR.rotateAngleY = 0.0F;
            this.legL.rotateAngleY = 0.0F;
            this.legR.rotateAngleZ = 0.0F;
            this.legL.rotateAngleZ = 0.0F;
        }

        this.rightH.rotateAngleY = 0.0F;
        this.rightH.rotateAngleZ = 0.0F;



        this.rightH.rotateAngleZ += MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
        this.leftH.rotateAngleZ -= MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
        this.rightH.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        this.leftH.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.05F;


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
