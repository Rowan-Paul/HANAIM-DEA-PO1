package oose.rowanpaulflynn;

import com.google.gson.Gson;

public class CardBox {
    public String toJSON(Box box) {
        Gson gson = new Gson();
        System.out.println(gson.toJson(box));
        return gson.toJson(box);
    }
}
