package com.bratash.stringComparator;

import java.util.Comparator;

public class twoStrings implements Comparable<twoStrings>{

    private String country;
    private String capital;

    public twoStrings(String country, String capital) {
        super();
        this.country = country;
        this.capital = capital;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getCapital() {
        return capital;
    }
    public void setCapital(String capital) {
        this.capital = capital;
    }

    @Override
    public int compareTo(twoStrings tS){
        return country.compareTo(tS.getCountry());
    }

     public static Comparator<twoStrings> capitalComparator = new Comparator<twoStrings>() {
        public int compare(twoStrings string1, twoStrings string2) {
            String capital1 = string1.getCapital().toUpperCase();
            String capital2 = string2.getCapital().toUpperCase();
            return capital1.compareTo(capital2);
        }
    };
}
