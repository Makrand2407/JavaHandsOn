package com.pkg;

interface Playable {
    void play();

    default void tune() {
        System.out.println("Tuning the instrument...");
    }
}

class Guitar implements Playable {
    public void play() {
        System.out.println("Strumming the guitar");
    }
}

class Piano implements Playable {
    public void play() {
        System.out.println("Playing the piano");
    }
}

class Drums implements Playable {
    public void play() {
        System.out.println("Beating the drums");
    }
}

public class Main {
    public static void main(String[] args) {
        Playable g = new Guitar();
        g.tune();
        g.play();

        Playable p = new Piano();
        p.tune();
        p.play();

        Playable d = new Drums();
        d.tune();
        d.play();
    }
}
