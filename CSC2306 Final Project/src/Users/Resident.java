package Users;

import CityComponents.*;

public class Resident extends User{
	
	private int age;
	private String profession;
	private SmartStreet smartstreet;
	private SmartBuilding smartbuilding;
	private Apartment apartment;

	
	public Resident(int age, String profession, SmartStreet smartstreet, SmartBuilding smartbuilding,
			Apartment apartment, Account account, Profile profile) {
		super(account, profile);
		this.age = age;
		this.profession = profession;
		this.smartstreet = smartstreet;
		this.smartbuilding = smartbuilding;
		this.apartment = apartment;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public SmartStreet getSmartstreet() {
		return smartstreet;
	}
	public void setSmartstreet(SmartStreet smartstreet) {
		this.smartstreet = smartstreet;
	}
	public SmartBuilding getSmartbuilding() {
		return smartbuilding;
	}
	public void setSmartbuilding(SmartBuilding smartbuilding) {
		this.smartbuilding = smartbuilding;
	}
	public Apartment getApartment() {
		return apartment;
	}
	public void setApartment(Apartment apartment) {
		this.apartment = apartment;
	}
	
	
	@Override
	public String toString() {
		return "Resident [age=" + age + ", profession=" + profession + ", smartstreet=" + smartstreet
				+ ", smartbuilding=" + smartbuilding + ", apartment=" + apartment + "]";
	}
	
	


}
