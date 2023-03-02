package Users;

import Users.*;

public class Report {

	private Resident residents;
	private String description;
	
	public Report(Resident residents, String description) {
		super();
		this.residents = residents;
		this.description = description;
	}
	public Resident getResidents() {
		return residents;
	}
	public void setResidents(Resident residents) {
		this.residents = residents;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Report [residents=" + residents + ", description=" + description + "]";
	}
	
	
}
