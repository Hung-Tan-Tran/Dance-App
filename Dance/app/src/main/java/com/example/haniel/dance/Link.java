package com.example.haniel.dance;

/**
 * Created by Haniel on 3/3/18.
 */

public class Link {
    String name, imgURL, videoURL, description;

    Link(String name, String imgURL, String videoURL, String description){
        this.name = name;
        this.imgURL = imgURL;
        this.videoURL = videoURL;
        this.description = description;
    }

    public String getValue(String type){
        switch (type) {
            case "name":
                return name;
            case "imgURL":
                return imgURL;
            case "videoURL":
                return videoURL;
            case "description":
                return description;
        }
        return null;
    }

    public String toString(){
        return name + "\n" + imgURL + "\n" + videoURL + "\n" + description + "\n";
    }


}