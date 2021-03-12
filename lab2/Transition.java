package labLFPC.lab2;

import java.util.ArrayList;

public class Transition {
    String from;
    String to;
    ArrayList<String> fromAL;
    ArrayList<String> toAL;
    String alphabet;
    public Transition(String from, String to, String alphabet){
        this.from = from;
        this.to = to;
        this.alphabet = alphabet;
    }
    public Transition(ArrayList<String> from, ArrayList<String> to, String alphabet){
        this.fromAL = from;
        this.toAL = to;
        this.alphabet = alphabet;
    }
}
