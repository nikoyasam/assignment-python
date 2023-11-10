public abstract class PastryShopOrder {
    protected String orderId;
    protected int noOfItems;
    protected String status;
    protected double total;


    PastryShopOrder(String orderId, int noOfItems, String status, double total){
        this.orderId = orderId;
        this.noOfItems = noOfItems;
        this.status = status;
        this.total = total;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getNoOfItems() {
        return noOfItems;
    }

    public void setNoOfItems(int noOfItems) {
        this.noOfItems = noOfItems;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }


    public abstract void updateStatus(String newStatus);

    public abstract double calculateTotalOrder(double pricePerItem, int noOfItems);

}
