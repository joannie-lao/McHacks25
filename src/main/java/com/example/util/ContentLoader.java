package com.example.util;
import com.example.models.Decoration;
import com.example.models.User;
import com.google.gson.Gson;
//import com.google.gson.reflect.TypeToken;
import java.io.InputStreamReader;
import java.util.List;

public class ContentLoader {
    String json = "";
    Gson gson = new Gson();
    Decoration decoration = gson.fromJson(json, Decoration.class);
    
}
