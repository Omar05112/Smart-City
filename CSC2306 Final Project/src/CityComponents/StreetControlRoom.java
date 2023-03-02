package CityComponents;

import java.util.Vector;

public class StreetControlRoom {
	
	private Vector<SmartBuilding> building = new Vector<SmartBuilding>();
	
	
	public StreetControlRoom(Vector<SmartBuilding> building) {
		super();
		this.building = building;
	}

	
	public Vector<SmartBuilding> getBuilding() {
		return building;
	}


	public void setBuilding(Vector<SmartBuilding> building) {
		this.building = building;
	}


	@Override
	public String toString() {
		return "StreetControlRoom [building=" + building + "]";
	}


	public void getstreetdata() {
		
	}
	
	public void getbuildingdata() {
		
	}
}

