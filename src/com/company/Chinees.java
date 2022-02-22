package com.company;

public class Chinees extends Man{
    public String country;
    public String language;

    public Chinees(String name, int age, String weight, String height, String country, String language){
        super("Ashen",24,55,156);
        this.country = country;
        this.language = language;

    }
    public void demo(){
        System.out.println("child/sub");

    }

}
