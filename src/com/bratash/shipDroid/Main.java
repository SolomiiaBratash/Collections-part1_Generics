package com.bratash.shipDroid;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Droid droid = new Droid("BlaBla", 400);
        Droid droid1 = new Droid("BlaBla1", 500);
        ArrayList<Droid> droids = new ArrayList<>(Arrays.asList(droid, droid1));
        Ship droidShip = new Ship(droids);
        System.out.println(droidShip.getDroid());
    }
}
