package Assignment9;
public class employeeDetail {
	private int userid;
	private String username;
	private int usersalary;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getUsersalary() {
		return usersalary;
	}
	public void setUsersalary(int usersalary) {
		this.usersalary = usersalary;
	}
	public employeeDetail(int userid, String username, int usersalary) {
		super();
		this.userid = userid;
		this.username = username;
		this.usersalary = usersalary;
	}
	
	


}
