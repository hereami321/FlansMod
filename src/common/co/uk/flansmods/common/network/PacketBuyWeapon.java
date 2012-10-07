package co.uk.flansmods.common.network;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Packet;
import net.minecraft.src.Packet250CustomPayload;
import net.minecraft.src.World;
import co.uk.flansmods.common.BlockGunBox;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.GunBoxType;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

public class PacketBuyWeapon extends FlanPacketCommon
{
	public static final byte packetID = 5;
	
	//type is 0 for gun, 1 for ammo, 2 for altAmmo
	public static Packet buildBuyWeaponPacket(GunBoxType box, int type, int weaponID)
	{
		Packet250CustomPayload packet = new Packet250CustomPayload();
		packet.channel = channelFlan;
		
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        DataOutputStream data = new DataOutputStream(bytes);
        try
        {
        	data.write(packetID); // this is the packet ID. identifies it as a BreakSoundPacket
        	data.writeUTF(box.shortName);
        	data.write(type);
        	data.write(weaponID);

        	packet.data = bytes.toByteArray();
        	packet.length = packet.data.length;

        	data.close();
        	bytes.close();
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }

        return packet;
	}

	/**
	 * ExtraData : [0] = World, [1] = Player
	 */
	@Override
	public void interpret(DataInputStream stream, Object[] extradata, Side side)
	{
		if(side.equals(Side.SERVER)) 
			interpretClient(stream, extradata);
		else FlansMod.logLoudly("Recieved Weapon packet on Client. Skipped interpretation");
		
		//TODO : Route this to the block, but first combine the boxes into one ID with a tileEntity
	}
	
	@SideOnly(Side.CLIENT)
	public void interpretClient(DataInputStream stream, Object[] extradata) {
		try {
			int id = stream.readInt();
			String shortName = stream.readUTF();
			int type = stream.readInt();
			int weaponID = stream.readInt();
			
			GunBoxType box = GunBoxType.getBox(shortName);
			
			EntityPlayer player = (EntityPlayer) extradata[1];
			FlansMod.gunBoxBlock.purchaseItem(type, weaponID, player.inventory, box);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public byte getPacketID()
	{
		return packetID;
	}
}
