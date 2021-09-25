package ma.emsi.myapp;

import static spark.Spark.*;
import com.google.gson.Gson;
import java.util.*;

public class RestServer 
{
    public static void main(String[] args)
    {
        Gson gson = new Gson();

        get("/hello",(req,resp)-> {
            Map<String,Object> data = new HashMap<>();
            data.put("hamza", "hammouti");
            data.put("aziz", "hansaoui");
            data.put("reda", "abounasr");
            data.put("imad", "elyazghy");
            resp.type("application/json");
            return gson.toJson(data);
        });    
    }
}
