package com.example.haniel.dance;

/**
 * Created by Haniel on 3/3/18.
 */

public class Tutorials {
    String name, videoURL, description;
    String[] imgURL, textBoxes;

    Tutorials(String name, String[] imgURL, String videoURL, String description, String[] textBoxes){
        this.name = name;
        this.imgURL = imgURL;
        this.videoURL = videoURL;
        this.description = description;
        this.textBoxes = textBoxes;
    }

    public String getName() {return name;}

    public String getDescription() {return description;}

    public String getVideoURL() {return videoURL;}

    public String[] getImgURL() {return imgURL;}

    public String[] getTextBoxes() {return textBoxes;}

    public String toString(){
        return name + "\n" + imgURL + "\n" + videoURL + "\n" + description + "\n" + textBoxes + "\n";
    }


}