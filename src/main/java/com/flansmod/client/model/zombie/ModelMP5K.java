package com.flansmod.client.model.zombie;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelMP5K extends ModelGun 
{
	int textureX = 512;
	int textureY = 32;

	public ModelMP5K() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[50];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 7
		gunModel[7] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 9
		gunModel[8] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 24
		gunModel[9] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 25
		gunModel[10] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 29
		gunModel[11] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 56
		gunModel[12] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 51
		gunModel[13] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 28
		gunModel[14] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 29
		gunModel[15] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 30
		gunModel[16] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 31
		gunModel[17] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 32
		gunModel[18] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 34
		gunModel[19] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 35
		gunModel[20] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 41
		gunModel[21] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 43
		gunModel[22] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 44
		gunModel[23] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 47
		gunModel[24] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 48
		gunModel[25] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 49
		gunModel[26] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 50
		gunModel[27] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 51
		gunModel[28] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 52
		gunModel[29] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 55
		gunModel[30] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 56
		gunModel[31] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 74
		gunModel[32] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 77
		gunModel[33] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 78
		gunModel[34] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 79
		gunModel[35] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 80
		gunModel[36] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 81
		gunModel[37] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 82
		gunModel[38] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 83
		gunModel[39] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 84
		gunModel[40] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 67
		gunModel[41] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 68
		gunModel[42] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 69
		gunModel[43] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 70
		gunModel[44] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 71
		gunModel[45] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 72
		gunModel[46] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 73
		gunModel[47] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 74
		gunModel[48] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 75
		gunModel[49] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 76

		gunModel[0].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F); // Box 0
		gunModel[0].setRotationPoint(0F, -2.9F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.05F, -0.75F, 0F, -0.55F, -0.75F, 0F, -0.55F, -0.75F, 0F, -0.05F, -0.75F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[1].setRotationPoint(2F, 0.0999999999999996F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.5F, 0F, -0.9F, -0.5F, 0F, -0.9F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.05F, -0.25F, 0F, -0.55F, -0.25F, 0F, -0.55F, -0.25F, 0F, -0.05F, -0.25F, 0F); // Box 2
		gunModel[2].setRotationPoint(2F, 0.0999999999999996F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, 0F, 0F, -0.375F, -0.25F, -0.375F, -0.375F, -0.5F, -0.125F, -0.375F, -0.5F, -0.125F, -0.375F, -0.25F, -0.375F, -0.375F); // Box 3
		gunModel[3].setRotationPoint(3F, -2.9F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, -0.25F, 0.6F, 0F, -0.25F, 0.6F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -0.6F, -0.25F, 0.6F, -0.6F, -0.25F, 0.6F, -0.6F, -0.25F, 0.5F, -0.6F, -0.25F); // Box 4
		gunModel[4].setRotationPoint(3F, -1.9F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.6F, 0F, -0.25F, -0.6F, 0.4F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.6F, 0.4F, -0.25F); // Box 5
		gunModel[5].setRotationPoint(4F, -2.9F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F); // Box 7
		gunModel[6].setRotationPoint(0F, -3.9F, -0.5F);

		gunModel[7].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 9
		gunModel[7].setRotationPoint(1F, -4.9F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 24
		gunModel[8].setRotationPoint(6F, -3.9F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		gunModel[9].setRotationPoint(6F, -4.9F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 29
		gunModel[10].setRotationPoint(1F, -4.9F, -1.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, -0.2F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 56
		gunModel[11].setRotationPoint(0F, -5.9F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.25F, -0.5F, -0.875F, -0.25F, -0.5F, -0.875F, -0.25F, -0.5F, -0.875F, -0.25F, -0.5F, -0.875F, -0.75F, -0.125F, -0.875F, -0.25F, -0.125F, -0.875F, -0.25F, -0.125F, -0.875F, -0.75F, -0.125F, -0.875F); // Box 51
		gunModel[12].setRotationPoint(1F, -3.8F, -1.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		gunModel[13].setRotationPoint(7F, -4.9F, -1.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		gunModel[14].setRotationPoint(6F, -4.9F, -1.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		gunModel[15].setRotationPoint(1F, -4.9F, -1.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.7F, -0.75F, 0F, -0.7F, -0.75F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 31
		gunModel[16].setRotationPoint(1F, -4.9F, -1.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.7F, -0.75F, 0F, -0.7F, -0.75F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 32
		gunModel[17].setRotationPoint(1F, -4.9F, -1.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.125F, -0.125F, -0.1F, -0.125F, -0.125F, -0.1F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.1F, -0.125F, -0.125F, -0.1F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 34
		gunModel[18].setRotationPoint(8F, -4.9F, -0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		gunModel[19].setRotationPoint(7F, -5.9F, -0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		gunModel[20].setRotationPoint(1F, -5.9F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.3F, -0.75F, 0F, 0.3F, -0.75F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 43
		gunModel[21].setRotationPoint(6F, -4.9F, -0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 44
		gunModel[22].setRotationPoint(11F, -5F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, -0.8F, -0.05F, -4F, -0.8F, -0.05F, -4F, -0.8F, -0.05F, 0F, -0.8F, -0.05F, 0F, 0F, -0.05F, -4F, 0F, -0.05F, -4F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 47
		gunModel[23].setRotationPoint(5F, -6.5F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 48
		gunModel[24].setRotationPoint(9F, -5.9F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.8F, -0.5F, -0.4F, -0.8F, -0.5F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 49
		gunModel[25].setRotationPoint(5F, -5.9F, -0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, 0.1F, -0.5F, -0.4F, 0.1F, -0.5F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 50
		gunModel[26].setRotationPoint(5F, -5.9F, -0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, -0.8F, -0.5F, -0.4F, -0.8F, -0.5F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.8F, -0.5F, 0F, -0.8F); // Box 51
		gunModel[27].setRotationPoint(7F, -5.9F, -0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0.1F, -0.5F, -0.4F, 0.1F, -0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.1F, -0.5F, 0F, 0.1F); // Box 52
		gunModel[28].setRotationPoint(7F, -5.9F, -0.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F); // Box 55
		gunModel[29].setRotationPoint(5F, -2.9F, -0.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.8F, -0.125F, 0.5F, -0.8F, -0.125F, 0.5F, -0.8F, -0.125F, 0F, -0.8F, -0.125F, 0F, 0F, -0.125F, 0.5F, 0F, -0.125F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 56
		gunModel[30].setRotationPoint(1.5F, -6.5F, -0.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.5F, -0.875F, -0.25F, -0.5F, -0.875F, -0.25F, -0.5F, -0.875F, -0.25F, -0.5F, -0.875F); // Box 74
		gunModel[31].setRotationPoint(1F, -3.8F, -1.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.2F, 0.25F, 0F); // Box 77
		gunModel[32].setRotationPoint(0F, -4.9F, -0.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.8F, 0.25F, -0.25F, -0.8F, 0.25F, -0.25F, -0.8F, -0.5F, -0.25F, -0.8F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 78
		gunModel[33].setRotationPoint(10F, -6.2F, 0.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 79
		gunModel[34].setRotationPoint(1F, -4.9F, 0.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 80
		gunModel[35].setRotationPoint(7F, -5.9F, -0.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.75F, 0F, -0.7F, -0.75F); // Box 81
		gunModel[36].setRotationPoint(1F, -4.9F, 0.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.75F, 0F, -0.7F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 82
		gunModel[37].setRotationPoint(1F, -4.9F, 0.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 83
		gunModel[38].setRotationPoint(1F, -4.9F, 0.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 84
		gunModel[39].setRotationPoint(7F, -4.9F, 0.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 67
		gunModel[40].setRotationPoint(11F, -6F, -0.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 68
		gunModel[41].setRotationPoint(8F, -5F, -1.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 69
		gunModel[42].setRotationPoint(8F, -5F, 0.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 70
		gunModel[43].setRotationPoint(8F, -4F, -0.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 71
		gunModel[44].setRotationPoint(11F, -4F, -0.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 72
		gunModel[45].setRotationPoint(11F, -4F, -0.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 73
		gunModel[46].setRotationPoint(11F, -4F, -0.5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 74
		gunModel[47].setRotationPoint(9F, -4F, -0.5F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 75
		gunModel[48].setRotationPoint(0F, -4.9F, -1.5F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, -0.2F, -0.25F, -0.75F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, -0.2F, -0.25F, -0.75F); // Box 76
		gunModel[49].setRotationPoint(0F, -4.9F, 0.5F);


		defaultScopeModel = new ModelRendererTurbo[7];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 65
		defaultScopeModel[1] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 66
		defaultScopeModel[2] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 67
		defaultScopeModel[3] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 68
		defaultScopeModel[4] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 72
		defaultScopeModel[5] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 65
		defaultScopeModel[6] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 66

		defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.375F, -0.75F, -0.4F, -0.375F, -0.75F, -0.4F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.2F, -0.75F, -0.4F, -0.2F, -0.75F, -0.4F, -0.2F, -0.125F, 0F, -0.2F, -0.125F); // Box 65
		defaultScopeModel[0].setRotationPoint(1.5F, -6.5F, -0.5F);

		defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.625F, -0.45F, -0.5F, -0.625F, -0.45F, -0.5F, -0.625F, -0.45F, -0.25F, -0.625F, -0.45F, -0.25F, 0F, -0.45F, -0.5F, 0F, -0.45F, -0.5F, 0F, -0.45F, -0.25F, 0F, -0.45F); // Box 66
		defaultScopeModel[1].setRotationPoint(11F, -6.5F, -0.5F);

		defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, -0.1F, -0.25F, -0.9F, -0.1F, -0.25F, -0.9F, -0.1F, 0F, -0.9F, -0.1F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 67
		defaultScopeModel[2].setRotationPoint(11F, -6.5F, -0.5F);

		defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.1F, -0.2F, -0.25F, -0.1F, -0.2F, -0.25F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.8F, -0.1F, -0.25F, -0.8F, -0.1F, -0.25F, -0.8F, -0.1F, 0F, -0.8F, -0.1F); // Box 68
		defaultScopeModel[3].setRotationPoint(11F, -6.5F, -0.5F);

		defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.8F, -0.25F, -0.2F, -0.8F, -0.25F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.1F, -0.8F, -0.25F, -0.1F, -0.8F, -0.25F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 72
		defaultScopeModel[4].setRotationPoint(11F, -6.5F, -0.5F);

		defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.375F, -0.125F, -0.4F, -0.375F, -0.125F, -0.4F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.2F, -0.125F, -0.4F, -0.2F, -0.125F, -0.4F, -0.2F, -0.75F, 0F, -0.2F, -0.75F); // Box 65
		defaultScopeModel[5].setRotationPoint(1.5F, -6.5F, -0.5F);

		defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.1F, -0.25F, -0.2F, -0.1F, -0.25F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.8F, 0F, -0.1F, -0.8F); // Box 66
		defaultScopeModel[6].setRotationPoint(11F, -6.5F, -0.5F);


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 53
		ammoModel[1] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 54

		ammoModel[0].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.375F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.375F, 0F, -0.125F, -0.125F, 0F, -0.125F, 0.625F, 0F, -0.125F, 0.625F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 53
		ammoModel[0].setRotationPoint(6.5F, -3.9F, -0.5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0.375F, 0F, -0.125F, -0.875F, 0F, -0.125F, -0.875F, 0F, -0.125F, 0.375F, 0F, -0.125F, -2F, 0F, -0.125F, 1.125F, -0.625F, -0.125F, 1.125F, -0.625F, -0.125F, -2F, 0F, -0.125F); // Box 54
		ammoModel[1].setRotationPoint(7F, -1.9F, -0.5F);


		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 42

		slideModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 42
		slideModel[0].setRotationPoint(6F, -4.9F, -0.5F);



		barrelAttachPoint = new Vector3f(-4.1F /16F, -0.4F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(6F /16F, 0F /16F, 0F /16F);

		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}