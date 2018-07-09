package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Randomiser {


    private ArrayList<String> names;

    public Randomiser() {
        this.names = new ArrayList<>(Arrays.asList("Greg", "Adri", "Angelina", "Campbell", "Cleyra", "Craig",
                "Debi", "Derek", "Farheen", "Harjit", "Jack", "Joe", "Matt", "Pete", "Richard", "Roddy",
                "Stephan", "Steve", "Tara"));
    }

    public ArrayList<String> getNames() {
        return names;
    }

    public String oneRandoName(){
        Collections.shuffle(getNames());
        return getNames().get(0);
    }

    public ArrayList<String> twoRandoNames(){
        ArrayList<String> randomCouple = new ArrayList();
        Collections.shuffle(getNames());
        randomCouple.add(getNames().get(0));
        randomCouple.add(getNames().get(1));
        return randomCouple;
    }
}
