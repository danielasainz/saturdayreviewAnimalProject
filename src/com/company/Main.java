package com.company;

public class Main {
    //psvm can only exist in the main method
    public static void main(String[] args){
     Animal animal = new Animal("meat", "a lot");
     Cat kitty = new Cat("cat food", "all day", "meow", "sharp");
     Dog doggy = new Dog ("dog food", "a lot", "loudly", "constantly");
     Bird bird = new Bird ("bird food", "soundly", "high", "well");

     //need to populate with to Strings
     System.out.println(animal);
     System.out.println(kitty);
     System.out.println(doggy);
     System.out.println(bird);
    }
}
