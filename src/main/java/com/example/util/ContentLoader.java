package com.example.util;
import com.example.models.Area;
import com.example.models.Decoration;
//import com.example.models.User;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.Reader;
import java.lang.reflect.Type;

import java.io.FileReader;
//import com.google.gson.reflect.TypeToken;
import java.io.InputStreamReader;
import java.util.List;

public class ContentLoader {
    private static final Gson gson = new Gson();

    public static List<Decoration> loadDecorations(String path){
        if (!path.endsWith("decorations.json")) {
            System.out.println("Invalid file path for decorations: " + path);
            return null;
        }
        try(Reader reader = new FileReader(path)){
            System.out.println("trying to read decorations.");
            //Type listType = new List<Decoration>();
            Type listType = new TypeToken<List<Decoration>>() {}.getType();
            List<Decoration> decor = gson.fromJson(reader, listType);
            System.out.println("read decorations.");
            return decor;
        } catch (Exception e) {
            System.out.println("Failed to read decorations from path: " + path);
            e.printStackTrace();
            return null; // Handle errors gracefully
        }
    }
        public static List<Area> loadAreas(String path){
            try(Reader reader = new FileReader(path)){
                Type listType = new TypeToken<List<Area>>() {}.getType();
                return gson.fromJson(reader, listType);
            } catch (Exception e) {
                e.printStackTrace();
                return null; // Handle errors gracefully
            }
            
        }
    }
    

    
    /*public static List<Decoration> loadDecorations(){
        try(InputStreamReader reader = new InputStreamReader(ContentLoader.class.getResourceAsStream("/data/decorations.json"))){
            Gson gson = new Gson();
            List<Decoration> decorations = gson.fromJson(reader, new com.google.gson.reflect.TypeToken<List<Decoration>>(){}.getType());
            return decorations;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public static final List<Decoration> loadDecorations(){
        Decoration[] decorations = new Gson().fromJson(jsonString, Decoration[].class);
    }
    
    public static List<Area> loadAreas(){
        try(InputStreamReader reader = new InputStreamReader(ContentLoader.class.getResourceAsStream("/areas.json"))){
            Gson gson = new Gson();
            List<Area> areas = gson.fromJson(reader, new com.google.gson.reflect.TypeToken<List<Area>>(){}.getType());
            return areas;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }*/

