package Model;

public class Inventory {
    private int inventoryId;
    private int quantity;
    private int drugIdd;
	public Drug drugId;
	
    public Inventory() {
    }

    public Inventory(int inventoryId, int quantity, Drug drugId) {
        this.inventoryId = inventoryId;
        this.quantity = quantity;
        this.drugId = drugId;
    }
	
	public Inventory(int inventoryId, int quantity, int drugIdd) {
        this.inventoryId = inventoryId;
        this.quantity = quantity;
        this.drugIdd = drugIdd;
    }
	
    public Inventory(int inventoryId, int quantity) {
        this.inventoryId = inventoryId;
        this.quantity = quantity;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    public Drug getDrugId() {
        return drugId;
    }

    public void setDrugId(Drug drugId) {
        this.drugId = drugId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getInventoryId() {
        return inventoryId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setDrugIdd(int drugIdd) {
        this.drugIdd = drugIdd;
    }

    public int getDrugIdd() {
        return drugIdd;
    }
    
     
    @Override
    public String toString() {
        return "Inventory{" + "inventoryId=" + inventoryId + ", quantity=" + quantity + '}';
    }
}
