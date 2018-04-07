package com.company;

public class Animal {
    //loaded constructor
    public Animal(String eat, String sleep) {
        this.eat = eat;
        this.sleep = sleep;
    }
//default constructor
    public Animal() {

    }

    //these are variables that will be shared with other object classes through extension (generate getters and setters)
    private String eat;
    private String sleep;


    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public String getSleep() {
        return sleep;
    }

    public void setSleep(String sleep) {
        this.sleep = sleep;
    }

    //right click, generate, toString() - select all
    @Override
    public String toString() {
        return "Animal{" +
                "eat='" + eat + '\'' +
                ", sleep='" + sleep + '\'' +
                '}';
    }
}

