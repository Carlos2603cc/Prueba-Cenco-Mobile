package helpers;

import com.google.gson.JsonObject;
import com.google.gson.Gson;
import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;


import java.util.Random;

public class helpers {

    public static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;

    }

    public static JsonObject generaObjetoJson(String json){
        Gson gson = new Gson();
        JsonObject ObjetoJson = gson.fromJson(json, JsonObject.class);
        return ObjetoJson;
    }

    public static String generardorLoremIpsum(){
        int parrafos = 3;
        Lorem lorem = LoremIpsum.getInstance();
        String loremText = lorem.getParagraphs(1,1);
        return loremText;

    }


}
