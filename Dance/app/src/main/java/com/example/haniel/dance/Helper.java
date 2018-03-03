package com.example.haniel.dance;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONArray;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import android.content.Context;

/**
 * Created by Haniel on 3/3/18.
 */

public class Helper {

    static protected JSONObject parseJson(String filename, Context context){
        String json;
        try {
            InputStream in = context.getAssets().open(filename);
            int size = in.available();
            byte[] buffer = new byte[size];
            in.read(buffer);
            in.close();

            json = new String(buffer, "UTF-8");

            try {
                JSONObject reader = new JSONObject(json);

                return reader;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    static protected ArrayList<Link> getLinkArray(String type, JSONObject reader) {
        ArrayList<Link> data = new ArrayList<Link>();
        JSONArray jsonArray;
        JSONObject jsonObject;
        Object test;
        String Name, imgURL,videoURL, description;
        try {
            jsonArray = reader.getJSONArray(type);

            for(int i = 0; i < jsonArray.length();i++){
                jsonObject = jsonArray.getJSONObject(i);
                Name = jsonObject.getString("Name");
                imgURL = jsonObject.getString("imgURL");
                videoURL = jsonObject.getString("videoURL");
                description = jsonObject.getString("description");
                data.add(new Link(Name,imgURL,videoURL,description));
            }

            return data;

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    static protected ArrayList<Tutorials> getTutorialsArray(String type, JSONObject reader) {
        ArrayList<Tutorials> data = new ArrayList<Tutorials>();
        JSONArray jsonArray;
        JSONObject jsonObject;
        Object test;
        String Name, imgURL,videoURL, description;
        String[] textBoxes;
        try {
            jsonArray = reader.getJSONArray(type);

            for(int i = 0; i < jsonArray.length();i++){
                jsonObject = jsonArray.getJSONObject(i);
                Name = jsonObject.getString("Name");
                imgURL = jsonObject.getString("imgURL");
                videoURL = jsonObject.getString("videoURL");
                description = jsonObject.getString("description");
                textBoxes = new String[jsonArray.length()];
                for (int j=0; i<jsonArray.length(); i++) {
                    textBoxes[j] = jsonArray.getString(j);
                }
                data.add(new Tutorials(Name,imgURL,videoURL,description, textBoxes));
            }

            return data;

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }
}
