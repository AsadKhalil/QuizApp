package com.example.quizapp;

public class CategoryModel
{
    private String imageurl,title;

    public CategoryModel(String imageurl, String title)
    {
        this.imageurl = imageurl;
        this.title = title;
    }

    public String getImageurl() {
        return imageurl;
    }

    public String getTitle() {
        return title;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
