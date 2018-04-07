package com.company;

public class Cat extends Animal {
    //loaded constructor (right click - generate constructor)
    public Cat(String eat, String sleep, String meow, String claws) {
        super(eat, sleep);
        this.meow = meow;
        this.claws = claws;
    }

    //default constructor
    public Cat(){

    }

    //variables unique to cats - generate getters and setters for these first
    private String meow;
    private String claws;


    public String getMeow() {
        return meow;
    }

    public void setMeow(String meow) {
        this.meow = meow;
    }

    public String getClaws() {
        return claws;
    }

    public void setClaws(String claws) {
        this.claws = claws;
    }

    @Override
    public String toString() {
        // insert super.toString() + BEFORE "Cat{" to ensure that parent variables are included
        return super.toString() + "Cat{" +
                "meow='" + meow + '\'' +
                ", claws='" + claws + '\'' +
                '}';
    }
}
