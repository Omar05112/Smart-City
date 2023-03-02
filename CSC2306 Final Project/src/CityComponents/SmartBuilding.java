package CityComponents;

import java.util.Vector;

public class SmartBuilding {

	private int ID;
	private BuildingType type;
	private SmartStreet street;
	private int number_of_residents;
	private EnergySource energy_source;
	private Vector<Floor> floorss = new Vector<Floor>();
	private BuildingControlRoom BCR;
	private int number_of_floors;
	
	public SmartBuilding(int iD, BuildingType type, SmartStreet street, int number_of_residents,
			EnergySource energy_source, Vector<Floor> floorss, BuildingControlRoom bCR, int number_of_floors) {
	
		ID = iD;
		this.type = type;
		this.street = street;
		this.number_of_residents = number_of_residents;
		this.energy_source = energy_source;
		this.floorss = floorss;
		BCR = bCR;
		this.number_of_floors = number_of_floors;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public BuildingType getType() {
		return type;
	}
	public void setType(BuildingType type) {
		this.type = type;
	}
	public SmartStreet getStreet() {
		return street;
	}
	public void setStreet(SmartStreet street) {
		this.street = street;
	}
	public int getNumber_of_residents() {
		return number_of_residents;
	}
	public void setNumber_of_residents(int number_of_residents) {
		this.number_of_residents = number_of_residents;
	}
	public EnergySource getEnergy_source() {
		return energy_source;
	}
	public void setEnergy_source(EnergySource energy_source) {
		this.energy_source = energy_source;
	}
	public Vector<Floor> getFloorss() {
		return floorss;
	}
	public void setFloorss(Vector<Floor> floorss) {
		this.floorss = floorss;
	}
	public BuildingControlRoom getBCR() {
		return BCR;
	}
	public void setBCR(BuildingControlRoom bCR) {
		BCR = bCR;
	}
	public int getNumber_of_floors() {
		return number_of_floors;
	}
	public void setNumber_of_floors(int number_of_floors) {
		this.number_of_floors = number_of_floors;
	}
	
	@Override
	public String toString() {
		return "SmartBuilding [ID=" + ID + ", type=" + type + ", street=" + street + ", number_of_residents="
				+ number_of_residents + ", energy_source=" + energy_source + ", floorss=" + floorss + ", BCR=" + BCR
				+ ", number_of_floors=" + number_of_floors + "]";
	}
	
	
}
