package com.runescape.revised.logic.net.packets.write;

import com.runescape.revised.logic.net.packets.Packet;
import com.runescape.revised.logic.net.packets.VariableType;

public class UpdatePlayers extends Packet {

	@Override
	public void executePacket() {
		// c.updatePlayers(-1, null);
		// aBoolean1080 = false;
		// pktType = -1;
		// return true;
	}

	@Override
	public short getOpcode() {
		// TODO Auto-generated method stub
		return 81;
	}
	
	@Override
	public byte getSize() {
		return 0;
	}

	@Override
	public VariableType getVariableType() {
		// TODO Auto-generated method stub
		return null;
	}
}