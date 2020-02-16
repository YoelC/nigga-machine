package com.yoelc.firstmod.entity.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * NiggaMachine - YoelC
 * Created using Tabula 6.0.0
 */
public class ModelNiggaMachine extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer TorsoTop;
    public ModelRenderer TorsoMid;
    public ModelRenderer LeftArm;
    public ModelRenderer RightArm;
    public ModelRenderer LeftKnee;
    public ModelRenderer LeftForearm;
    public ModelRenderer LeftFoot;
    public ModelRenderer Finger1;
    public ModelRenderer Finger3;
    public ModelRenderer Finger2;
    public ModelRenderer RightKnee;
    public ModelRenderer RightForearm;
    public ModelRenderer RightFoot;
    public ModelRenderer Finger1_1;
    public ModelRenderer Finger3_1;
    public ModelRenderer Finger2_1;

    public ModelNiggaMachine() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.Finger1 = new ModelRenderer(this, 0, 0);
        this.Finger1.setRotationPoint(-1.5F, 0.0F, -3.8F);
        this.Finger1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(Finger1, 0.0F, 0.2617993877991494F, 0.0F);
        this.TorsoMid = new ModelRenderer(this, 61, 0);
        this.TorsoMid.setRotationPoint(-2.0F, 0.0F, 6.0F);
        this.TorsoMid.addBox(0.0F, 0.0F, 0.0F, 12, 7, 10, 0.0F);
        this.LeftKnee = new ModelRenderer(this, 55, 0);
        this.LeftKnee.setRotationPoint(-0.5F, -0.0F, -0.5F);
        this.LeftKnee.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        this.LeftForearm = new ModelRenderer(this, 121, 0);
        this.LeftForearm.setRotationPoint(-26.0F, 28.0F, 1.0F);
        this.LeftForearm.addBox(0.0F, 0.0F, 0.0F, 1, 38, 1, 0.0F);
        this.setRotateAngle(LeftForearm, 0.0F, 0.0F, -2.356194490192345F);
        this.Finger1_1 = new ModelRenderer(this, 95, 5);
        this.Finger1_1.setRotationPoint(-1.5F, 0.0F, -3.8F);
        this.Finger1_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(Finger1_1, 0.0F, 0.2617993877991494F, 0.0F);
        this.Finger2_1 = new ModelRenderer(this, 40, 20);
        this.Finger2_1.setRotationPoint(1.6F, 0.0F, -3.8F);
        this.Finger2_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
        this.Finger3 = new ModelRenderer(this, 95, 0);
        this.Finger3.setRotationPoint(4.5F, 0.0F, -3.8F);
        this.Finger3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(Finger3, 0.0F, -0.2617993877991494F, 0.0F);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(-5.5F, -3.4F, -22.0F);
        this.Head.addBox(0.0F, 0.0F, 0.0F, 11, 11, 11, 0.0F);
        this.Finger3_1 = new ModelRenderer(this, 97, 17);
        this.Finger3_1.setRotationPoint(4.5F, 0.0F, -3.8F);
        this.Finger3_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(Finger3_1, 0.0F, -0.2617993877991494F, 0.0F);
        this.TorsoTop = new ModelRenderer(this, 33, 0);
        this.TorsoTop.setRotationPoint(1.5F, 3.0F, 11.0F);
        this.TorsoTop.addBox(0.0F, 0.0F, 0.0F, 8, 5, 6, 0.0F);
        this.RightArm = new ModelRenderer(this, 113, 0);
        this.RightArm.setRotationPoint(21.5F, -14.0F, 5.5F);
        this.RightArm.addBox(0.0F, 0.0F, 0.0F, 2, 19, 2, 0.0F);
        this.setRotateAngle(RightArm, 0.0F, -3.141592653589793F, 0.5235987755982988F);
        this.RightKnee = new ModelRenderer(this, 65, 17);
        this.RightKnee.setRotationPoint(-0.5F, -0.0F, -0.5F);
        this.RightKnee.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        this.Finger2 = new ModelRenderer(this, 0, 5);
        this.Finger2.setRotationPoint(1.6F, 0.0F, -3.8F);
        this.Finger2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
        this.LeftFoot = new ModelRenderer(this, 44, 11);
        this.LeftFoot.setRotationPoint(-1.5F, 0.0F, -5.0F);
        this.LeftFoot.addBox(0.0F, 0.0F, 0.0F, 4, 1, 8, 0.0F);
        this.setRotateAngle(LeftFoot, 0.0F, 0.0F, -0.28361600344907856F);
        this.RightFoot = new ModelRenderer(this, 81, 17);
        this.RightFoot.setRotationPoint(2.2F, -1.0F, 6.0F);
        this.RightFoot.addBox(0.0F, 0.0F, 0.0F, 4, 1, 8, 0.0F);
        this.setRotateAngle(RightFoot, 0.0F, 3.141592653589793F, -0.28361600344907856F);
        this.RightForearm = new ModelRenderer(this, 77, 17);
        this.RightForearm.setRotationPoint(-26.0F, 28.0F, 1.0F);
        this.RightForearm.addBox(0.0F, 0.0F, 0.0F, 1, 38, 1, 0.0F);
        this.setRotateAngle(RightForearm, 0.0F, 0.0F, -2.356194490192345F);
        this.LeftArm = new ModelRenderer(this, 105, 0);
        this.LeftArm.setRotationPoint(-9.5F, -14.0F, 3.5F);
        this.LeftArm.addBox(0.0F, 0.0F, 0.0F, 2, 19, 2, 0.0F);
        this.setRotateAngle(LeftArm, 0.0F, 0.0F, -0.5235987755982988F);
        this.LeftFoot.addChild(this.Finger1);
        this.TorsoTop.addChild(this.TorsoMid);
        this.LeftArm.addChild(this.LeftKnee);
        this.LeftKnee.addChild(this.LeftForearm);
        this.RightFoot.addChild(this.Finger1_1);
        this.RightFoot.addChild(this.Finger2_1);
        this.LeftFoot.addChild(this.Finger3);
        this.RightFoot.addChild(this.Finger3_1);
        this.Head.addChild(this.TorsoTop);
        this.TorsoMid.addChild(this.RightArm);
        this.RightArm.addChild(this.RightKnee);
        this.LeftFoot.addChild(this.Finger2);
        this.LeftForearm.addChild(this.LeftFoot);
        this.RightForearm.addChild(this.RightFoot);
        this.RightKnee.addChild(this.RightForearm);
        this.TorsoMid.addChild(this.LeftArm);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Head.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        this.LeftKnee.rotateAngleX = MathHelper.cos(limbSwing * 0.662f) * 1.4F * limbSwingAmount;
        this.RightKnee.rotateAngleX = MathHelper.cos(limbSwing * 0.662f) * 1.4F * limbSwingAmount;

        this.Head.rotateAngleY = netHeadYaw * 0.017453292F;
        this.Head.rotateAngleX = headPitch * 0.017453292F;

        this.TorsoTop.rotateAngleY = netHeadYaw * -0.017453292F;
        this.TorsoTop.rotateAngleX = headPitch * -0.017453292F;

    }
}