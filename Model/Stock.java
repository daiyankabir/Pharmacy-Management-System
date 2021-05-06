package Model;

public class Stock {
    private int stockId;
    private String arrivalDate;
    private String expiredDate;
    private int quantity;
    private String shelfNo;
    Drug drugId;
    Company companyId;

    public Stock() {
    }

    public Stock(int stockId, String arrivalDate, String expiredDate, int quantity, String shelfNo, Drug drugId, Company companyId) {
        this.stockId = stockId;
        this.arrivalDate = arrivalDate;
        this.expiredDate = expiredDate;
        this.quantity = quantity;
        this.shelfNo = shelfNo;
        this.drugId = drugId;
        this.companyId = companyId;
    }

    public Stock(int stockId, String arrivalDate, String expiredDate, int quantity, String shelfNo) {
        this.stockId = stockId;
        this.arrivalDate = arrivalDate;
        this.expiredDate = expiredDate;
        this.quantity = quantity;
        this.shelfNo = shelfNo;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setShelfNo(String shelfNo) {
        this.shelfNo = shelfNo;
    }

    public int getStockId() {
        return stockId;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public String getExpiredDate() {
        return expiredDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getShelfNo() {
        return shelfNo;
    }

    public void setDrugId(Drug drugId) {
        this.drugId = drugId;
    }

    public void setCompanyId(Company companyId) {
        this.companyId = companyId;
    }

    public Drug getDrugId() {
        return drugId;
    }

    public Company getCompanyId() {
        return companyId;
    }

    @Override
    public String toString() {
        return "Stock{" + "stockId=" + stockId + ", arrivalDate=" + arrivalDate + ", expiredDate=" + expiredDate + ", quantity=" + quantity + ", shelfNo=" + shelfNo + '}';
    }
    
}
