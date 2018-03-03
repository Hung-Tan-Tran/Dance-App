package com.example.haniel.dance;

/**
 * Created by Haniel on 3/3/18.
 */

public class Tutorials {
    String name, imgURL, videoURL, description;
    String[] textBoxes;

    Tutorials(String name, String imgURL, String videoURL, String description, String[] textBoxes){
        this.name = name;
        this.imgURL = imgURL;
        this.videoURL = videoURL;
        this.description = description;
        this.textBoxes = textBoxes;
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
        return name + "\n" + imgURL + "\n" + videoURL + "\n" + description + "\n" + textBoxes + "\n";
    }


}