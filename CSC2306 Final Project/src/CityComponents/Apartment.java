package CityComponents;

import java.util.*;
import Users.Resident;


public class Apartment {
	private int ID;
	private ApartmentSensorNode ASN;
	private Vector<SmartAppliance> SmartAppliances = new Vector<SmartAppliance>();
	
	public Apartment(int iD, ApartmentSensorNode aSN, Vector<SmartAppliance> smartAppliances) {		
		ID = iD;
		ASN = aSN;
		SmartAppliances = smartAppliances;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public ApartmentSensorNode getASN() {
		return ASN;
	}
	public void setASN(ApartmentSensorNode aSN) {
		ASN = aSN;
	}
	public Vector<SmartAppliance> getSmartAppliances() {
		return SmartAppliances;
	}
	public void setSmartAppliances(Vector<SmartAppliance> smartAppliances) {
		SmartAppliances = smartAppliances;
	}

	@Override
	public String toString() {
		return "Apartment [ID=" + ID + ", ASN=" + ASN + ", SmartAppliances=" + SmartAppliances + "]";
	}
	



}
	
