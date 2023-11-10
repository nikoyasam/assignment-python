public class Inventory {
    private String itemName;
    private int itemId;
    private int quantityStock;

    public String getItemName() {
        return itemName;
    }

    public int getItemId() {
        return itemId;
    }

    public int getQuantityStock() {
        return quantityStock;
    }

    public Inventory(String itemName, int itemId, int quantityStock){
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantityStock = quantityStock;
    }

    public void addItem(int quantity){
        quantityStock+=quantity;
    }

    public void removeItem(int quantity){
        if(quantityStock>=quantity){
            quantityStock-=quantity;
        }
        else{
            System.out.println("Not enough items in stock");
        }
    }


}
