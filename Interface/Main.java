package com.pkg;

// Interface representing something that can be played
interface Playable {
    // Abstract method that must be implemented by all classes
    void play();

    // Default method with a common implementation
    default void tune() {
        System.out.println("Tuning the instrument...");
    }
}

// Guitar class implementing Playable interface
class Guitar implements Playable {
    // Implementation of play() specific to Guitar
    public void play() {
        System.out.println("Strumming the guitar");
    }
}

// Piano class implementing Playable interface
class Piano implements Playable {
    // Implementation of play() specific to Piano
    public void play() {
        System.out.println("Playing the piano");
    }
}

// Piano class implementing Playable interface
class Drums implements Playable {
    // Implementation of play() specific to Drums
    public void play() {
        System.out.println("Beating the drums");
    }
}

public class Main {
    public static void main(String[] args) {
        // Playable reference pointing to Guitar object
        Playable g = new Guitar();
        g.tune();
        g.play();
        
        // Playable reference pointing to Piano object
        Playable p = new Piano();
        p.tune();
        p.play();

        // Playable reference pointing to Drums object
        Playable d = new Drums();
        d.tune();
        d.play();
    }
}
