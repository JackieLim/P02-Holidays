package com.example.a15056130.p02_holidays;

/**
 * Created by 15056130 on 4/27/2017.
 */

public class Holiday {
    private String hols;
    private String date;
    private int img;
    public Holiday(String hols, String date, int img){
        this.hols = hols;
        this.date = date;
        this.img = img;
    }
    public String getHols(){
        return hols;
    }
    public String getDate(){
        return date;
    }
    public int getImg() { return img; }
}
