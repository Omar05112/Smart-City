package CityComponents;

import java.util.Vector;

public class Floor {
	
	private Vector<Apartment> apartments = new Vector<Apartment>();
	
	public Floor(Vector<Apartment> apartments) {
		this.apartments = apartments;
	}

	public Vector<Apartment> getApartments() {
		return apartments;
	}

	public void setApartments(Vector<Apartment> apartments) {
		this.apartments = apartments;
	}

	@Override
	public String toString() {
		return "Floor [apartments=" + apartments + "]";
	}	
	
	
	
}