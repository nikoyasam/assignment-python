public abstract class DeliveryOrder extends PastryShopOrder{
    public String deliveryAddress;

    DeliveryOrder(String orderId, int noOfItems, String status, double total, String deliveryAddress) {
        super(orderId, noOfItems, status, total);
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public void updateStatus(String newStatus){
        this.status = newStatus;
    }

    @Override
    public double calculateTotalOrder(double pricePerItem, int noOfItems){
        this.total = pricePerItem + noOfItems;
        return pricePerItem;
    }
}
