package Model;

public class Company {
    public int companyId;
    private String companyName;
    private String email;
    private String contactNo;
    private String branch;
    private String Address;
    private String Description;

    public Company() {
    }

    public Company(int companyId, String companyName, String email, String contactNo, String branch, String Address, String Description) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.email = email;
        this.contactNo = contactNo;
        this.branch = branch;
        this.Address = Address;
        this.Description = Description;
    }
	
	public Company(int companyId, String companyName, String email, String contactNo, String branch, String Address) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.email = email;
        this.contactNo = contactNo;
        this.branch = branch;
        this.Address = Address;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public int getCompanyId() {
        return companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getEmail() {
        return email;
    }

    public String getContactNo() {
        return contactNo;
    }

    public String getBranch() {
        return branch;
    }

    public String getAddress() {
        return Address;
    }
	
	public String getDescription() {
        return Description;
    }

    @Override
    public String toString() {
        return "Company{" + "companyId=" + companyId + ", companyName=" + companyName + ", email=" + email + ", contactNo=" + contactNo + ", branch=" + branch + ", Address=" + Address + ", Description=" + Description + '}';
    }


    
    
}
