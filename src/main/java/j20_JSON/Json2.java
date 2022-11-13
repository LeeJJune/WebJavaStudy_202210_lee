package j20_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;


@AllArgsConstructor
@Data

class User{
    private String username;
    private String password;
    private String email;
    private String name;
}


public class Json2 {
    public static void main(String[] args) {

        // Gson으로 변환 할 수 있는 객체의 종류
        // JsonObject, Object, Map

        User user = new User("June", "1234", "123@123.com", "김준일");

        System.out.println(user);

        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        Gson gson = new Gson();

        String userJson = null;
        String studentJson = null;
        String productJson = null;

        System.out.println(gson.toJson(user));
        System.out.println(gsonBuilder.toJson(user));
        userJson = gsonBuilder.toJson(user);

        // JsonObject -> JSON
        JsonObject jsonObject = new JsonObject();

        jsonObject.addProperty("studentCode", "20220001");
        jsonObject.addProperty("studentName", "김준이");
        jsonObject.addProperty("studentYear", "2");

        System.out.println(gsonBuilder.toJson(jsonObject));
        studentJson = gsonBuilder.toJson(jsonObject);

        //Map -> JSON
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("productCode", "P-20220001");
        map.put("productName", "삼성노트북");

        System.out.println(gsonBuilder.toJson(map));
        productJson = gsonBuilder.toJson(map);


        // JSON -> Map
        Map<String, Object> jsonData = convertJsonMap(userJson);
        System.out.println(jsonData.get("name"));

        jsonData = convertJsonMap(studentJson);
        System.out.println(jsonData);

        jsonData = convertJsonMap(productJson);
        System.out.println(jsonData);

        // JSON -> JsonObject
        JsonObject jsonObj = convertJsonToJsonObject(productJson);
        System.out.println(jsonObj);

        jsonObj = convertJsonToJsonObject(studentJson);
        System.out.println(studentJson);

        jsonObj = convertJsonToJsonObject(studentJson);
        System.out.println(studentJson);

        //JSON -> User

        User userObj = convertJsonToUser(userJson);
        System.out.println(userJson);

    }
    public static Map convertJsonMap(String json){

        Gson gson = new Gson();
        return gson.fromJson(json, Map.class);

    }
    public static JsonObject convertJsonToJsonObject(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, JsonObject.class);
    }
    public static User convertJsonToUser(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, User.class);
    }
}
