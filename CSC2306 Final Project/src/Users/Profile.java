package Users;

public class Profile {
	
	private int ID;
	private String name;
	private String email;
	private String phonenumber;
	
	public Profile(int iD, String name, String email, String phonenumber) {
		super();
		ID = iD;
		this.name = name;
		this.email = email;
		this.phonenumber = phonenumber;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	@Override
	public String toString() {
		return "Profile [ID=" + ID + ", name=" + name + ", email=" + email + ", phonenumber=" + phonenumber + "]";
	}
	
	

}
