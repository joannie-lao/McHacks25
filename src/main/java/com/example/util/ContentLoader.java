package com.example.util;
import com.example.models.Area;
import com.example.models.Decoration;
import com.example.models.User;
import com.google.gson.Gson;
//import com.google.gson.reflect.TypeToken;
import java.io.InputStreamReader;
import java.util.List;

public class ContentLoader {
    
    public static List<Decoration> loadDecorations(){
        try(InputStreamReader reader = new InputStreamReader(ContentLoader.class.getResourceAsStream("/decorations.json"))){
            Gson gson = new Gson();
            List<Decoration> decorations = gson.fromJson(reader, List.class);
            return decorations;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public static List<Area> loadAreas(){
        try(InputStreamReader reader = new InputStreamReader(ContentLoader.class.getResourceAsStream("/decorations.json"))){
            Gson gson = new Gson();
            List<Area> areas = gson.fromJson(reader, List.class);
            return areas;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
}
