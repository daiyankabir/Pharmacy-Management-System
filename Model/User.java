package Model;

public class User {
    private String userName;
    private String password;
    private String email;
    private String contactNo;
    private String address;
	private String type;

    public User() {
    }

    public User(String userName, String password, String email, String contactNo, String address) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.contactNo = contactNo;
        this.address = address;
    }
	
	public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }
	
	public String getEmail() {
        return email;
    }
	
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

	public String getContactNo() {
        return contactNo;
    }
	
    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
	
	public String getType()
	{
		return type;
	}

    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    

}