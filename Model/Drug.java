package Model;

public class Drug {
    public int drugId;
    public String drugName;
    public String medicalName;
    public int price;
    public String description;
    public Company company; 
	public Inventory inventory;
	public int companyId;
    public Drug() {
    }

    public Drug(int drugId, String drugName, String medicalName, int price, String description) {
        this.drugId = drugId;
        this.drugName = drugName;
        this.medicalName = medicalName;
        this.price = price;
        this.description = description;
    }
	public Drug(int drugId, String drugName, String medicalName, int price, String description, int companyId) {
        this.drugId = drugId;
        this.drugName = drugName;
        this.medicalName = medicalName;
        this.price = price;
        this.description = description;
		this.companyId=companyId;
    }

    public Drug(int drugId, String drugName, String medicalName, int price) {
        this.drugId = drugId;
        this.drugName = drugName;
        this.medicalName = medicalName;
        this.price = price;
    }

	public void createCompany(int companyId, String companyName, String email, String contactNo, String branch, String Address)
	{
		company=new Company(companyId,companyName,email,contactNo,branch,Address);
	}
	
	public void createInventory(int inventoryId, int quantity) {
        inventory = new Inventory(inventoryId, quantity);
    }
	
    public void setDrugId(int drugId) {
        this.drugId = drugId;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public void setMedicalName(String medicalName) {
        this.medicalName = medicalName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDrugId() {
        return drugId;
    }

    public String getDrugName() {
        return drugName;
    }

    public String getMedicalName() {
        return medicalName;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
	
    @Override
    public String toString() {
        return "Drug{" + "drugId=" + drugId + ", drugName=" + drugName + ", medicalName=" + medicalName + ", price=" + price + ", description=" + description + '}';
    }

    public int getCompanyId() {
        return companyId;
	}
    
}
