package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelDragunov extends ModelGun 
{
	int textureX = 512;
	int textureY = 32;

	public ModelDragunov() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[67];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 3
		gunModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 4
		gunModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 5
		gunModel[5] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 6
		gunModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 9
		gunModel[7] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 10
		gunModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 29
		gunModel[9] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 35
		gunModel[10] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 39
		gunModel[11] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 40
		gunModel[12] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 42
		gunModel[13] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 44
		gunModel[14] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 53
		gunModel[15] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 54
		gunModel[16] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 60
		gunModel[17] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 61
		gunModel[18] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 62
		gunModel[19] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 63
		gunModel[20] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 64
		gunModel[21] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 65
		gunModel[22] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 67
		gunModel[23] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 68
		gunModel[24] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 69
		gunModel[25] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 48
		gunModel[26] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 49
		gunModel[27] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 50
		gunModel[28] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 51
		gunModel[29] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 52
		gunModel[30] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 53
		gunModel[31] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 54
		gunModel[32] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 57
		gunModel[33] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 58
		gunModel[34] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 59
		gunModel[35] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 44
		gunModel[36] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 45
		gunModel[37] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 47
		gunModel[38] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 51
		gunModel[39] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 52
		gunModel[40] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 53
		gunModel[41] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 54
		gunModel[42] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 55
		gunModel[43] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 56
		gunModel[44] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 58
		gunModel[45] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 59
		gunModel[46] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 60
		gunModel[47] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 62
		gunModel[48] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 54
		gunModel[49] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 55
		gunModel[50] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 56
		gunModel[51] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 57
		gunModel[52] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 58
		gunModel[53] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 70
		gunModel[54] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 71
		gunModel[55] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 72
		gunModel[56] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 76
		gunModel[57] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 78
		gunModel[58] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 79
		gunModel[59] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 80
		gunModel[60] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 81
		gunModel[61] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 73
		gunModel[62] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 74
		gunModel[63] = new ModelRendererTurbo(this, 2, 17, textureX, textureY); // Box 75
		gunModel[64] = new ModelRendererTurbo(this, 2, 17, textureX, textureY); // Box 76
		gunModel[65] = new ModelRendererTurbo(this, 2, 17, textureX, textureY); // Box 77
		gunModel[66] = new ModelRendererTurbo(this, 2, 17, textureX, textureY); // Box 78

		gunModel[0].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[0].setRotationPoint(0F, -3.15F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0.5F, -0.15F, 0F, 0.5F, -0.15F, 0F, 0.5F, -0.15F, 0F, 0.5F, -0.15F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 2
		gunModel[1].setRotationPoint(1F, -5.15F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -1F, -0.25F); // Box 3
		gunModel[2].setRotationPoint(3F, -3.15F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 4
		gunModel[3].setRotationPoint(4F, -3.15F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 5
		gunModel[4].setRotationPoint(2F, -2.15F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.275F, -0.6F, 0F, -0.275F, -0.6F, 0F, -0.275F, 0F, 0F, -0.275F, 0F, -0.25F, -0.275F, -0.6F, -0.25F, -0.275F, -0.6F, -0.25F, -0.275F, 0F, -0.25F, -0.275F); // Box 6
		gunModel[5].setRotationPoint(6F, -2.65F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0.5F, -0.35F, -0.85F, 0.5F, -0.35F, -0.85F, 0.5F, -0.15F, 0F, 0.5F, -0.15F, 0F, 0.5F, 0F, -0.85F, 0.5F, 0F, -0.85F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 9
		gunModel[6].setRotationPoint(2F, -5.15F, -1.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, -0.75F, -0.125F, -0.5F, -0.75F, -0.125F, -0.5F, -0.75F, -0.125F, 0F, -0.75F, -0.125F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 10
		gunModel[7].setRotationPoint(1F, -6F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.875F, 0F, -0.5F, -0.875F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.875F, 0F, 0F, -0.875F); // Box 29
		gunModel[8].setRotationPoint(6.5F, -4.15F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.5F, 0.25F, -0.8F, 0F, 0.25F, -0.8F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 35
		gunModel[9].setRotationPoint(6F, -4.15F, -1.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 39
		gunModel[10].setRotationPoint(10F, -4.15F, -0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Box 40
		gunModel[11].setRotationPoint(11F, -4.15F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 42
		gunModel[12].setRotationPoint(20F, -4.65F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F); // Box 44
		gunModel[13].setRotationPoint(10F, -4.15F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 53
		gunModel[14].setRotationPoint(20F, -5.45F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 54
		gunModel[15].setRotationPoint(22F, -5.45F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.6F, -0.4F, -0.2F, -0.6F, -0.4F, -0.2F, -0.15F, 0F, -0.2F, -0.15F, 0F, -0.2F, -0.6F, -0.4F, -0.2F, -0.6F, -0.4F, -0.2F, -0.15F, 0F, -0.2F, -0.15F); // Box 60
		gunModel[16].setRotationPoint(3.5F, -4.4F, -1.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.4F, -0.6F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.15F, 0.4F, -0.6F, -0.15F, 0.4F, -0.2F, -0.6F, -0.4F, -0.4F, -0.6F, -0.4F, -0.4F, -0.15F, 0.4F, -0.2F, -0.15F); // Box 61
		gunModel[17].setRotationPoint(4.5F, -4.4F, -1.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0.4F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.15F, 0.4F, -0.8F, -0.15F); // Box 62
		gunModel[18].setRotationPoint(4.5F, -4.4F, -1.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.4F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, -0.2F, -0.15F, 0.4F, -0.2F, -0.15F, 0.4F, -0.4F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.15F, 0.4F, -0.4F, -0.15F); // Box 63
		gunModel[19].setRotationPoint(4.5F, -4.4F, -1.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.125F, -0.8F, -0.125F, -0.25F, -0.8F, -0.125F, -0.25F, -0.8F, -0.125F, 0.125F, -0.8F, -0.125F, 0F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 64
		gunModel[20].setRotationPoint(10F, -6.5F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.125F, -0.6F, -0.65F, -0.925F, -0.6F, -0.65F, -0.925F, -0.6F, -0.125F, 0.125F, -0.6F, -0.125F, 0.125F, -0.2F, -0.65F, -0.925F, -0.2F, -0.65F, -0.925F, -0.2F, -0.125F, 0.125F, -0.2F, -0.125F); // Box 65
		gunModel[21].setRotationPoint(10F, -6.5F, -0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.125F, -0.6F, -0.125F, -0.925F, -0.6F, -0.125F, -0.925F, -0.6F, -0.65F, 0.125F, -0.6F, -0.65F, 0.125F, -0.2F, -0.125F, -0.925F, -0.2F, -0.125F, -0.925F, -0.2F, -0.65F, 0.125F, -0.2F, -0.65F); // Box 67
		gunModel[22].setRotationPoint(10F, -6.5F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, -0.125F, -0.5F, -0.6F, -0.125F, -0.5F, -0.6F, -0.65F, 0F, -0.6F, -0.65F, 0F, -0.2F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.2F, -0.65F, 0F, -0.2F, -0.65F); // Box 68
		gunModel[23].setRotationPoint(29.5F, -6.4F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, -0.5F, -0.05F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F); // Box 69
		gunModel[24].setRotationPoint(29F, -5.65F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, -0.65F, -0.5F, -0.6F, -0.65F, -0.5F, -0.6F, -0.125F, 0F, -0.6F, -0.125F, 0F, -0.2F, -0.65F, -0.5F, -0.2F, -0.65F, -0.5F, -0.2F, -0.25F, 0F, -0.2F, -0.25F); // Box 48
		gunModel[25].setRotationPoint(29.5F, -6.4F, -0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.65F, -0.5F, -0.3F, -0.65F, -0.5F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.4F, -0.65F, -0.5F, -0.4F, -0.65F, -0.5F, -0.4F, -0.125F, 0F, -0.4F, -0.125F); // Box 49
		gunModel[26].setRotationPoint(29.5F, -6.4F, -0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, -0.3F, -0.65F, 0F, -0.3F, -0.65F, 0F, -0.4F, -0.125F, -0.5F, -0.4F, -0.125F, -0.5F, -0.4F, -0.65F, 0F, -0.4F, -0.65F); // Box 50
		gunModel[27].setRotationPoint(29.5F, -6.4F, -0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.6F, -0.45F, -0.6F, -0.6F, -0.45F, -0.6F, -0.6F, -0.45F, -0.25F, -0.6F, -0.45F, -0.25F, -0.1F, -0.45F, -0.6F, -0.1F, -0.45F, -0.6F, -0.1F, -0.45F, -0.25F, -0.1F, -0.45F); // Box 51
		gunModel[28].setRotationPoint(29.4F, -6.5F, -0.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 52
		gunModel[29].setRotationPoint(5.5F, -4.15F, -0.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		gunModel[30].setRotationPoint(9F, -4.15F, -0.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, -0.875F, -0.5F, -0.5F, -0.875F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.875F, -0.5F, 0F, -0.875F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 54
		gunModel[31].setRotationPoint(6.5F, -4.15F, -0.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, -1.5F, 0.25F, 0F, -1.5F, 0.25F, 0F, -1.5F, 0.25F, 0F, -1.5F, 0.25F); // Box 57
		gunModel[32].setRotationPoint(10F, -5.15F, -0.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 58
		gunModel[33].setRotationPoint(6F, -3.15F, -0.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 59
		gunModel[34].setRotationPoint(12F, -4.15F, -0.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0.5F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.35F, -0.85F, 0.5F, -0.35F, -0.85F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0.5F, 0F, -0.85F); // Box 44
		gunModel[35].setRotationPoint(2F, -5.15F, 0.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 45
		gunModel[36].setRotationPoint(10F, -4.65F, -0.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		gunModel[37].setRotationPoint(-10F, -4.15F, -0.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.4F, 0F); // Box 51
		gunModel[38].setRotationPoint(-5F, -4.15F, -0.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, 0F, 0F); // Box 52
		gunModel[39].setRotationPoint(-9F, -2.15F, -0.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 53
		gunModel[40].setRotationPoint(-7.5F, -4.15F, -0.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F); // Box 54
		gunModel[41].setRotationPoint(-5F, -5.15F, -0.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -0.75F, 0F, 0.05F, -0.75F); // Box 55
		gunModel[42].setRotationPoint(-5F, -5.15F, 0.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, -0.75F, 0F, 0.05F, -0.75F, 0F, 0.05F, 0F, 0F, 0.05F, 0F); // Box 56
		gunModel[43].setRotationPoint(-5F, -5.15F, -1.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, -0.8F, -0.125F, -6F, -0.8F, -0.125F, -6F, -0.8F, -0.125F, 0F, -0.8F, -0.125F, 0F, 0F, -0.125F, -6F, 0F, -0.125F, -6F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 58
		gunModel[44].setRotationPoint(3F, -6.5F, -0.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 59
		gunModel[45].setRotationPoint(3F, -4.15F, 0.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.8F, -0.125F, 0F, -0.8F, -0.125F, 0F, -0.8F, -0.125F, 0F, -0.8F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 60
		gunModel[46].setRotationPoint(3F, -6.3F, -0.5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.375F, -0.5F, 0F, 0.375F, -0.5F, 0F, -1.175F, 0F, 0F, -1.175F, 0F, 0.15F, 0F, -0.5F, 0.15F, 0F, -0.5F, 0.15F, -0.8F, 0F, 0.15F, -0.8F); // Box 62
		gunModel[47].setRotationPoint(3F, -5.3F, 0.7F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1.5F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, -1.175F, -1.5F, 0F, -1.175F, -0.5F, 0.15F, 0F, -1F, 0.15F, 0F, -1F, 0.15F, -0.8F, -0.5F, 0.15F, -0.8F); // Box 54
		gunModel[48].setRotationPoint(6F, -5.3F, 0.7F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.8F, 0.125F, -0.5F, -0.8F, 0.125F, -0.5F, -0.8F, -1.125F, 0F, -0.8F, -1.125F, 0F, 0F, 0.125F, -0.5F, 0F, 0.125F, -0.5F, 0F, -0.975F, 0F, 0F, -0.975F); // Box 55
		gunModel[49].setRotationPoint(3F, -6.3F, 0.5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.8F, 0.125F, 0F, -0.8F, 0.125F, 0F, -0.8F, -1.125F, -0.5F, -0.8F, -1.125F, -0.5F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.975F, -0.5F, 0F, -0.975F); // Box 56
		gunModel[50].setRotationPoint(7F, -6.3F, 0.5F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0.375F, -0.25F, 0F, 0.375F, -0.25F, 0F, -1.175F, -0.25F, 0F, -1.175F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, -0.8F, -0.25F, 0.15F, -0.8F); // Box 57
		gunModel[51].setRotationPoint(4.5F, -5.3F, 0.7F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.8F, 0.125F, -0.25F, -0.8F, 0.125F, -0.25F, -0.8F, -1.125F, -0.25F, -0.8F, -1.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, -0.975F, -0.25F, 0F, -0.975F); // Box 58
		gunModel[52].setRotationPoint(4.5F, -6.3F, 0.5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.8F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.8F, 0.25F, 0F, -0.8F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.8F, 0.5F, 0F); // Box 70
		gunModel[53].setRotationPoint(-11F, -4.15F, -0.5F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, -0.8F, -0.5F, -0.2F, -0.8F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.8F, -0.25F, 0F); // Box 71
		gunModel[54].setRotationPoint(-11F, -5.15F, -0.5F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.75F, -0.8F, 0F, -0.75F, -0.8F, 0F, -0.75F, -0.8F, 0F, -0.75F, -0.8F, 0F, 0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, -0.725F); // Box 72
		gunModel[55].setRotationPoint(18F, -5.65F, -1.5F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.75F, -0.7F, 0F, -0.75F, -0.7F, 0F, -0.75F, -0.7F, 0F, -0.75F, -0.7F, 0F, 0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, -0.725F); // Box 76
		gunModel[56].setRotationPoint(13F, -5.13F, -1.5F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.75F, -0.8F, 0F, -0.75F, -0.8F, 0F, -0.75F, -0.8F, 0F, -0.75F, -0.8F, 0F, 0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, -0.725F); // Box 78
		gunModel[57].setRotationPoint(16F, -5.65F, -1.5F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.75F, -0.8F, 0F, -0.75F, -0.8F, 0F, -0.75F, -0.8F, 0F, -0.75F, -0.8F, 0F, 0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, -0.725F); // Box 79
		gunModel[58].setRotationPoint(14F, -5.65F, -1.5F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.75F, -0.7F, 0F, -0.75F, -0.7F, 0F, -0.75F, -0.7F, 0F, -0.75F, -0.7F, 0F, 0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, -0.725F); // Box 80
		gunModel[59].setRotationPoint(15F, -5.13F, -1.5F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.75F, -0.7F, 0F, -0.75F, -0.7F, 0F, -0.75F, -0.7F, 0F, -0.75F, -0.7F, 0F, 0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, -0.725F); // Box 81
		gunModel[60].setRotationPoint(17F, -5.13F, -1.5F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, -0.35F, -0.85F, -0.5F, -0.35F, -0.85F, -0.5F, -0.15F, 0F, 0.5F, -0.15F, 0F, 0.5F, 0F, -0.85F, -0.5F, 0F, -0.85F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 73
		gunModel[61].setRotationPoint(1F, -5.15F, -1.5F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.5F, -0.35F, -0.85F, 0.5F, -0.35F, -0.85F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.85F, 0.5F, 0F, -0.85F); // Box 74
		gunModel[62].setRotationPoint(1F, -5.15F, 0.5F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		gunModel[63].setRotationPoint(0.5F, -4.15F, -1.5F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F); // Box 76
		gunModel[64].setRotationPoint(0.5F, -4.15F, 0.5F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 77
		gunModel[65].setRotationPoint(0.5F, -4.15F, 0.5F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F); // Box 78
		gunModel[66].setRotationPoint(-0.5F, -4.15F, -0.5F);


		defaultScopeModel = new ModelRendererTurbo[6];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 88
		defaultScopeModel[1] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 89
		defaultScopeModel[2] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 90
		defaultScopeModel[3] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 94
		defaultScopeModel[4] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 68
		defaultScopeModel[5] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 69

		defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.375F, -0.175F, 0F, -0.375F, -0.175F, 0F, -0.375F, -0.175F, 0F, -0.375F, -0.175F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		defaultScopeModel[0].setRotationPoint(4F, -6.5F, -0.5F);

		defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 89
		defaultScopeModel[1].setRotationPoint(4F, -7F, -0.5F);

		defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		defaultScopeModel[2].setRotationPoint(0F, -7F, -0.5F);

		defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, 0.125F, -0.125F, -0.125F, 0.125F, -0.125F, -0.125F, 0.125F, -0.125F, -0.125F, 0.125F, -0.125F); // Box 94
		defaultScopeModel[3].setRotationPoint(5F, -8F, -0.5F);

		defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.125F, -0.125F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.125F, -0.125F); // Box 68
		defaultScopeModel[4].setRotationPoint(3F, -7F, -0.5F);

		defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F); // Box 69
		defaultScopeModel[5].setRotationPoint(3F, -7F, -0.5F);


		defaultStockModel = new ModelRendererTurbo[2];
		defaultStockModel[0] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 46
		defaultStockModel[1] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 50

		defaultStockModel[0].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 46
		defaultStockModel[0].setRotationPoint(-10F, -4.65F, -0.5F);

		defaultStockModel[1].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0.75F, 1F, 0F, 0.75F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.6F, -1.5F, 0F, 0.6F, -1.5F, 0F, 0F, -0.5F, 0F); // Box 50
		defaultStockModel[1].setRotationPoint(-10F, -1.15F, -0.5F);


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 48
		ammoModel[1] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 49

		ammoModel[0].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, -0.125F, 0.5F, 0F, -0.125F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0.5F, 0F, -0.125F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 48
		ammoModel[0].setRotationPoint(6.5F, -4.15F, -0.5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.125F, 0.5F, 0F, -0.125F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0.75F, -0.25F, -0.125F, 0.75F, -0.25F, -0.125F, -0.5F, 0F, -0.125F); // Box 49
		ammoModel[1].setRotationPoint(6.5F, -1.15F, -0.5F);


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 30
		slideModel[1] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 36

		slideModel[0].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.8F, 0F, -0.25F, -0.8F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 30
		slideModel[0].setRotationPoint(6F, -5.15F, -1.3F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.225F, -0.25F, 0F, -0.225F, -0.25F, 0F, -0.225F, 0F, -0.75F, -0.225F, 0F, -0.75F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, 0F, -0.75F, -0.45F, 0F); // Box 36
		slideModel[1].setRotationPoint(9F, -5.1F, -1.5F);



		barrelAttachPoint = new Vector3f(16F /16F, -0.6F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(5F /16F, 0F /16F, 0F /16F);

		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}