package com.runescape.revised.interfaces.impl.grandexchange;

import com.runescape.revised.Sprite;
import com.runescape.revised.interfaces.Button;
import com.runescape.revised.interfaces.Interface;
import com.runescape.revised.interfaces.Text;
import com.runescape.revised.media.threedworld.Location;

public class GrandExchange extends Interface {
	
	public Text getBuyText() {
		return new Text("Buy");
	}
	
	public Text getSellText() {
		return new Text("Sell");
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Sprite[] getSprites() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Location[] getLocations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Button[] getButtons() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Text[] getText() {
		// TODO Auto-generated method stub
		return null;
	}
}