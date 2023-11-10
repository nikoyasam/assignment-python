public class DineInOrder extends PastryShopOrder {
    private String comments;


    DineInOrder(String orderId, int noOfItems, String status, double total, String comments) {
        super(orderId, noOfItems, status, total);
        this.comments = comments;
    }

    @Override
    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    @Override
    public double calculateTotalOrder(double pricePerItem, int noOfItems) {
        this.total = pricePerItem + noOfItems;
        return pricePerItem;
    }


}
