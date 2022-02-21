package com.company;

public class Animal {
    public String name;
    public String color;
    public int legs;
    public int age;


    public Animal(String name, String color, int legs, int age) {
        this.name = name;
        this.color = color;
        this.legs = legs;
        this.age = age;
    }

    public double calc() {
        return this.age/this.legs;
    }
    public double calc(double speed){
        return speed/(this.age*this.legs);

    }

}
