package com.example.wrcomic_uxproject;

public class Comics {

    private String comicName;
    private String comicDesc;
    private Integer comicImage;

    public Comics(String comicName, String comicDesc, Integer comicImage) {
        this.comicName = comicName;
        this.comicDesc = comicDesc;
        this.comicImage = comicImage;
    }

    public String getComicName() {
        return comicName;
    }

    public void setComicName(String comicName) {
        this.comicName = comicName;
    }

    public String getComicDesc() {
        return comicDesc;
    }

    public void setComicDesc(String comicDesc) {
        this.comicDesc = comicDesc;
    }

    public Integer getComicImage() {
        return comicImage;
    }

    public void setComicImage(Integer comicImage) {
        this.comicImage = comicImage;
    }
}
