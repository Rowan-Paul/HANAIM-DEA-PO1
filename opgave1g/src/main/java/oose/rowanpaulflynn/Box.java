package oose.rowanpaulflynn;

import com.google.gson.Gson;
import oose.rowanpaulflynn.exceptions.BoxTooHeavyException;

public class Box {
    private String item;
    private int quantity;
    private int itemWeight;

    public Box(String item, int quantity, int itemWeight) throws BoxTooHeavyException {
        if(quantity*itemWeight > 1000) {
            throw new BoxTooHeavyException();
        } else {
            this.item = item;
            this.quantity = quantity;
            this.itemWeight = itemWeight;
        }
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

    public void setQuantity(int quantity) throws BoxTooHeavyException {
        if(quantity*itemWeight > 1000) {
            throw new BoxTooHeavyException();
        } else {
            this.quantity = quantity;
        }
    }

    public int getItemWeight() {
        return itemWeight;
    }

    public void setItemWeight(int itemWeight) throws BoxTooHeavyException {
        if(itemWeight*quantity > 1000) {
            throw new BoxTooHeavyException();
        } else {
            this.itemWeight = itemWeight;
        }
    }

    public int getTotalWeight() throws BoxTooHeavyException {
        int result = quantity*itemWeight;

        if(result > 1000) {
            throw new BoxTooHeavyException();
        } else {
            return result;
        }
    }

    /**
     * In de toets stond dat deze in CardBox moest maar
     * hij word in Main.java aangeroepen in Box
     * en krijgt ook geen box mee
     */
    public String toJSON() {
        Gson gson = new Gson();
        String[] values = {gson.toJson(item), gson.toJson(quantity), gson.toJson(itemWeight)};

        return gson.toJson(values);
    }
}
