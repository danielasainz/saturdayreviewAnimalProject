package com.company;

public class Bird extends Animal {
    //loaded constructor
    public Bird(String eat, String sleep, String fly, String buildNest) {
        super(eat, sleep);
        this.fly = fly;
        this.buildNest = buildNest;
    }

    //default constructor
    public Bird () {
    }

    //variables unique to birds - generate getters and setters
    private String fly;
    private String buildNest;

    public String getFly() {
        return fly;
    }

    public void setFly(String fly) {
        this.fly = fly;
    }

    public String getBuildNest() {
        return buildNest;
    }

    public void setBuildNest(String buildNest) {
        this.buildNest = buildNest;
    }

    @Override
    public String toString() {
        return super.toString() + "Bird{" +
                "fly='" + fly + '\'' +
                ", buildNest='" + buildNest + '\'' +
                '}';
    }
}