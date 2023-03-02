package Users;

import main.*;

public class GeneralAdmin extends User{
	
	private SmartCity smartcity;
	private Account account;
	private Account dif_account;
	
	
	
	public GeneralAdmin(SmartCity smartcity, Account account, Account dif_account, Profile profile) {
		super(account, profile);
	}
	
	
	
	
	public SmartCity getSmartcity() {
		return smartcity;
	}




	public void setSmartcity(SmartCity smartcity) {
		this.smartcity = smartcity;
	}




	public Account getAccount() {
		return account;
	}




	public void setAccount(Account account) {
		this.account = account;
	}




	public Account getDif_account() {
		return dif_account;
	}




	public void setDif_account(Account dif_account) {
		this.dif_account = dif_account;
	}




	@Override
	public String toString() {
		return "GeneralAdmin [smartcity=" + smartcity + ", account=" + account + ", dif_account=" + dif_account + "]";
	}


	public void addbuilding() {
	}
	public void addapartment() {
	}
	public void addstreet() {
	}
	public void viewdata() {
	}
	public void deleteaccount() {
	}
	public void createaccount() {
	}
	public void updateaccount() {
	}
	
}

