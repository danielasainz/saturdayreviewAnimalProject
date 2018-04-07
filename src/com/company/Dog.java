package com.company;

public class Dog extends Animal {
    //loaded constructor
    public Dog(String eat, String sleep, String bark, String sniff) {
        super(eat, sleep);
        this.bark = bark;
        this.sniff = sniff;
    }

    //default constructor
    public Dog(){

    }

    //variables unique to dogs - generate getters and setters
    private String bark;
    private String sniff;

    public String getBark() {
        return bark;
    }

    public void setBark(String bark) {
        this.bark = bark;
    }

    public String getSniff() {
        return sniff;
    }

    public void setSniff(String sniff) {
        this.sniff = sniff;

    }

    @Override
    public String toString() {
        // insert super.toString() + BEFORE "Dog{" to ensure that parent variables are included
        return super.toString() + "Dog{" +
                "bark='" + bark + '\'' +
                ", sniff='" + sniff + '\'' +
                '}';
    }
}
