package com.bratash.shipDroid;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    List<? extends Droid> droids = new ArrayList<>();

    public Ship(List<? extends Droid> droids){
        this.droids = droids;
    }

    public void setDroid(List<? extends Droid> droids){
        this.droids = droids;
    }

    public List<? extends Droid> getDroid(){
        return droids;
    }
}

