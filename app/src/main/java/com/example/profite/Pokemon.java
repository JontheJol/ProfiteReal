package com.example.profite;

public class Pokemon {
    private String name;
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String geturl() {
        return url;
    }

    public void seturl(String value) {
        this.url = value;
    }

    public String getNumber(){
        String[] urlParts = url.split("/");
        return urlParts[urlParts.length - 1];
    }
    public String getImagenUrl(){
        return "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/" + getNumber() + ".png";
    }
}
