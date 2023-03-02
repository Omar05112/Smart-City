package CityComponents;

import java.util.Vector;

public class SmartStreet {

	private String name;
	private int ID;
    private Vector<SmartBuilding> building = new Vector<SmartBuilding>();
    private StreetSensorNode SSN;
    
	public SmartStreet(String name, int iD, Vector<SmartBuilding> building, StreetSensorNode sSN) {
		super();
		this.name = name;
		ID = iD;
		this.building = building;
		SSN = sSN;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Vector<SmartBuilding> getBuilding() {
		return building;
	}
	public void setBuilding(Vector<SmartBuilding> building) {
		this.building = building;
	}
	public StreetSensorNode getSSN() {
		return SSN;
	}
	public void setSSN(StreetSensorNode sSN) {
		SSN = sSN;
	}

	@Override
	public String toString() {
		return "SmartStreet [name=" + name + ", ID=" + ID + ", building=" + building + ", SSN=" + SSN + "]";
	}
    
    
	
}
