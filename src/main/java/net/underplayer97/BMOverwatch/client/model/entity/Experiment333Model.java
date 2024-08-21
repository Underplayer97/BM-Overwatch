package net.underplayer97.BMOverwatch.client.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;


@SuppressWarnings("rawtypes")
public class Experiment333Model extends ModelBase {
    private final ModelRenderer Experiment333Model;
    private final ModelRenderer Body;
    private final ModelRenderer UpperTorso_r1;
    private final ModelRenderer h_head;
    private final ModelRenderer Jaw;
    private final ModelRenderer Teeth_r1;
    private final ModelRenderer Right_Arm;
    private final ModelRenderer ArmR_r1;
    private final ModelRenderer ForearmR;
    private final ModelRenderer ForearmR_r1;
    private final ModelRenderer Left_Arm;
    private final ModelRenderer ArmL_r1;
    private final ModelRenderer ForearmL;
    private final ModelRenderer ForearmL_r1;
    private final ModelRenderer Right_Leg;
    private final ModelRenderer UpperLegR_r1;
    private final ModelRenderer LowerLegR;
    private final ModelRenderer Left_Leg;
    private final ModelRenderer UpperLegL_r1;
    private final ModelRenderer LowerLegL;

    public Experiment333Model() {
        textureWidth = 128;
        textureHeight = 128;

        Experiment333Model = new ModelRenderer(this);
        Experiment333Model.setRotationPoint(0.0F, 24.0F, 0.0F);


        Body = new ModelRenderer(this);
        Body.setRotationPoint(0.0F, -21.0F, -1.0F);
        Experiment333Model.addChild(Body);
        Body.cubeList.add(new ModelBox(Body, 32, 35, -5.0F, 2.75F, -0.1F, 10, 8, 6, 0.0F, false));
        Body.cubeList.add(new ModelBox(Body, 0, 16, -5.0F, 2.75F, -0.1F, 10, 9, 6, 0.1F, false));

        UpperTorso_r1 = new ModelRenderer(this);
        UpperTorso_r1.setRotationPoint(-1.0F, 1.0F, 0.0F);
        Body.addChild(UpperTorso_r1);
        setRotationAngle(UpperTorso_r1, 0.3927F, 0.0F, 0.0F);
        UpperTorso_r1.cubeList.add(new ModelBox(UpperTorso_r1, 0, 0, -5.0F, -3.366F, -2.9019F, 12, 8, 8, 0.0F, false));

        h_head = new ModelRenderer(this);
        h_head.setRotationPoint(0.0F, -3.0F, 0.0F);
        Body.addChild(h_head);
        h_head.cubeList.add(new ModelBox(h_head, 0, 35, -4.0F, -9.0F, -7.0F, 8, 7, 8, -0.002F, false));
        h_head.cubeList.add(new ModelBox(h_head, 0, 53, -4.0F, -5.0F, -7.0F, 8, 3, 8, -0.05F, false));
        h_head.cubeList.add(new ModelBox(h_head, 24, 49, -4.0F, -5.0F, -7.0F, 8, 4, 8, -0.09F, false));
        h_head.cubeList.add(new ModelBox(h_head, 60, 65, -3.975F, -3.0F, -5.0F, 1, 5, 5, -0.001F, false));
        h_head.cubeList.add(new ModelBox(h_head, 16, 64, 2.975F, -3.0F, -5.0F, 1, 5, 5, -0.001F, false));

        Jaw = new ModelRenderer(this);
        Jaw.setRotationPoint(0.0F, -1.0F, 0.75F);
        h_head.addChild(Jaw);


        Teeth_r1 = new ModelRenderer(this);
        Teeth_r1.setRotationPoint(-0.5F, 1.0F, -1.0F);
        Jaw.addChild(Teeth_r1);
        setRotationAngle(Teeth_r1, 0.3491F, 0.0F, 0.0F);
        Teeth_r1.cubeList.add(new ModelBox(Teeth_r1, 23, 22, -3.5F, -3.0F, -7.0F, 8, 4, 9, -0.1F, false));
        Teeth_r1.cubeList.add(new ModelBox(Teeth_r1, 31, 7, -3.5F, -2.35F, -7.0F, 8, 3, 9, -0.05F, false));
        Teeth_r1.cubeList.add(new ModelBox(Teeth_r1, 48, 19, -3.5F, -2.0F, -7.0F, 8, 3, 9, -0.001F, false));

        Right_Arm = new ModelRenderer(this);
        Right_Arm.setRotationPoint(-6.0F, -1.0F, 1.0F);
        Body.addChild(Right_Arm);


        ArmR_r1 = new ModelRenderer(this);
        ArmR_r1.setRotationPoint(-1.0F, 2.0F, 0.0F);
        Right_Arm.addChild(ArmR_r1);
        setRotationAngle(ArmR_r1, 0.1745F, 0.0F, 0.0F);
        ArmR_r1.cubeList.add(new ModelBox(ArmR_r1, 28, 61, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

        ForearmR = new ModelRenderer(this);
        ForearmR.setRotationPoint(-1.0F, 11.0F, 2.0F);
        Right_Arm.addChild(ForearmR);


        ForearmR_r1 = new ModelRenderer(this);
        ForearmR_r1.setRotationPoint(0.0F, 1.0F, 0.0F);
        ForearmR.addChild(ForearmR_r1);
        setRotationAngle(ForearmR_r1, -0.1745F, 0.0F, 0.0F);
        ForearmR_r1.cubeList.add(new ModelBox(ForearmR_r1, 56, 0, -3.55F, -1.1954F, -2.5831F, 5, 11, 5, 0.0F, false));

        Left_Arm = new ModelRenderer(this);
        Left_Arm.setRotationPoint(9.0F, 0.0F, 1.0F);
        Body.addChild(Left_Arm);


        ArmL_r1 = new ModelRenderer(this);
        ArmL_r1.setRotationPoint(-2.0F, 1.0F, 0.0F);
        Left_Arm.addChild(ArmL_r1);
        setRotationAngle(ArmL_r1, 0.1745F, 0.0F, 0.0F);
        ArmL_r1.cubeList.add(new ModelBox(ArmL_r1, 44, 61, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

        ForearmL = new ModelRenderer(this);
        ForearmL.setRotationPoint(-1.0F, 10.0F, 2.0F);
        Left_Arm.addChild(ForearmL);


        ForearmL_r1 = new ModelRenderer(this);
        ForearmL_r1.setRotationPoint(-1.0F, 1.0F, 0.0F);
        ForearmL.addChild(ForearmL_r1);
        setRotationAngle(ForearmL_r1, -0.1745F, 0.0F, 0.0F);
        ForearmL_r1.cubeList.add(new ModelBox(ForearmL_r1, 56, 49, -1.45F, -1.1954F, -2.5831F, 5, 11, 5, 0.0F, false));

        Right_Leg = new ModelRenderer(this);
        Right_Leg.setRotationPoint(-1.25F, -10.25F, 1.875F);
        Experiment333Model.addChild(Right_Leg);


        UpperLegR_r1 = new ModelRenderer(this);
        UpperLegR_r1.setRotationPoint(-1.0F, 0.0F, 0.0F);
        Right_Leg.addChild(UpperLegR_r1);
        setRotationAngle(UpperLegR_r1, -0.3054F, 0.0F, 0.0F);
        UpperLegR_r1.cubeList.add(new ModelBox(UpperLegR_r1, 71, 38, -1.5F, -0.75F, -1.575F, 3, 6, 3, 0.0F, false));

        LowerLegR = new ModelRenderer(this);
        LowerLegR.setRotationPoint(-1.0F, 4.0F, -1.0F);
        Right_Leg.addChild(LowerLegR);
        LowerLegR.cubeList.add(new ModelBox(LowerLegR, 58, 31, -2.0F, 0.25F, -2.45F, 4, 6, 4, 0.0F, false));

        Left_Leg = new ModelRenderer(this);
        Left_Leg.setRotationPoint(2.3F, -10.0F, 2.0F);
        Experiment333Model.addChild(Left_Leg);


        UpperLegL_r1 = new ModelRenderer(this);
        UpperLegL_r1.setRotationPoint(-0.025F, -0.25F, -0.125F);
        Left_Leg.addChild(UpperLegL_r1);
        setRotationAngle(UpperLegL_r1, -0.3054F, 0.0F, 0.0F);
        UpperLegL_r1.cubeList.add(new ModelBox(UpperLegL_r1, 72, 65, -1.5F, -0.75F, -1.575F, 3, 6, 3, 0.0F, false));

        LowerLegL = new ModelRenderer(this);
        LowerLegL.setRotationPoint(-0.025F, 4.0F, -1.75F);
        Left_Leg.addChild(LowerLegL);
        LowerLegL.cubeList.add(new ModelBox(LowerLegL, 0, 64, -2.0F, 0.0F, -1.825F, 4, 6, 4, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        Experiment333Model.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
