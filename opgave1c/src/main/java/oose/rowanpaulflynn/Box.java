package oose.rowanpaulflynn;

public class Box {
    private String item;
    private int quantity;
    private int itemWeight;

    public Box(String item, int quantity, int itemWeight) {
        this.item = item;
        this.quantity = quantity;
        this.itemWeight = itemWeight;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getItemWeight() {
        return itemWeight;
    }

    public void setItemWeight(int itemWeight) {
        this.itemWeight = itemWeight;
    }

    public int getTotalWeight() {
        return quantity*itemWeight;
    }
}
