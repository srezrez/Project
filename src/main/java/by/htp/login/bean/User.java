package by.htp.login.bean;

public class User extends Entity{
	
	private String login;
	private String pass;
	private String role;
	
	public User() {
		super();
	}
	
	public User(int id) {
		super(id);
	}

	public User(String login, String pass) {
		super();
		this.login = login;
		this.pass = pass;
	}
	
	public User(String login, String pass, String role) {
		super();
		this.login = login;
		this.pass = pass;
		this.role = role;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}	
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return getId() +login + " " + pass + " " + role;
	}
}
