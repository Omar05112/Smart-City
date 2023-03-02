package Users;

public abstract class User {
	
	private Account account;
	private Profile profile;
	
	public User(Account account, Profile profile) {
		super();
		this.account = account;
		this.profile = profile;
	}
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	
	
	
	

}
