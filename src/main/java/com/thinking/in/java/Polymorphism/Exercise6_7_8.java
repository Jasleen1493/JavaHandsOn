package com.thinking.in.java.Polymorphism;

/*Exercise3 6: (1) Change Music3.java so that what( ) becomes the root Object method
toString( ). Try printing the Instrument objects using System.out.println( ) (without
any casting).
 Exercise3 7: (2) Add a new type of Instrument to Music3.java and verify that
polymorphism works for your new type.
Exercise3 8: (2) Modify Music3.java so that it randomly creates Instrument objects
the way Shapes.java does. */

import java.util.Random;

public class Exercise6_7_8 {
}
enum Note {
    MIDDLE_C, C_SHARP, B_FLAT; // Etc.
}
class Instrument {
    void play(Note n) {
        System.out.println("Instrument.play() " + n); }
    //String what() { return "Instrument"; }
    public String toString(){return "Instrument";}
    void adjust() { System.out.println("Adjusting Instrument"); }
}
class Wind extends Instrument {
    void play(Note n) { System.out.println("Wind.play() " + n); }
    //String what() { return "Wind"; }
    public String toString(){return "Wind";}
    void adjust() { System.out.println("Adjusting Wind"); }
}
class Percussion extends Instrument {
    void play(Note n) { System.out.println("Percussion.play() " + n); }
    //String what() { return "Percussion"; }
    public String toString(){return "Percussion";}
    void adjust() { System.out.println("Adjusting Percussion"); }
}
class Stringed extends Instrument {
    void play(Note n) { System.out.println("Stringed.play() " + n); }
    //String what() { return "Stringed"; }
    public String toString(){return "Stringed";}
    void adjust() { System.out.println("Adjusting Stringed"); }
}
class Brass extends Wind {
    void play(Note n) { System.out.println("Brass.play() " + n); }
    public String toString(){return "Brass";}
    void adjust() { System.out.println("Adjusting Brass"); }
}
class Woodwind extends Wind {
    void play(Note n) { System.out.println("Woodwind.play() " + n); }
    //String what() { return "Woodwind"; }
    public String toString(){return "Woodwind";}
}
class Flute extends Instrument{
    public String toString(){return "Flute";}
}

class Music3  {
    // Doesn’t care about type, so new types
    // added to the system still work right:
    public static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument[] e) {
        for(Instrument i : e)
            tune(i);
    }

     // // exercise 8 - creating random objects

    private static Random random = new Random(42);
    public static Instrument next() {
        switch (random.nextInt(5)){
            case 0: return new Wind();
            case 1: return new Brass();
            case 2: return new Stringed();
            case 3: return new Percussion();
            case 4: return new Flute();
                default: return new Instrument();
        }
    }
        // ----
    public static void main(String[] args) {
        // Upcasting during addition to the array:
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind(),
                new Flute()         // new Instrument added
        };
        tuneAll(orchestra);

        for(Instrument i : orchestra){      // printing objects
            System.out.println(i);
        }

        // exercise 8

        Instrument[] instruments = new Instrument[5];
                for(Instrument instrument : instruments){
                    instrument = next();
                    System.out.println(instrument);
                }

    }

}
