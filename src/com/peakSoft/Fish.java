package com.peakSoft;

public class Fish {
    private String types;
    private String placeofResidence;
    private double size;
    private double weight;
    private boolean domestic;

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String getPlaceofResidence() {
        return placeofResidence;
    }

    public void setPlaceofResidence(String placeofResidence) {
        this.placeofResidence = placeofResidence;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isDomestic() {
        return domestic;
    }

    public void setDomestic(boolean domestic) {
        this.domestic = domestic;
        if (domestic == true) {
            String str = "Yes";
            boolean isDomestic = Boolean.parseBoolean(str);
            System.out.println(isDomestic);
        } else {
            String str = "No";
            boolean isDomestic = Boolean.parseBoolean(str);
            System.out.println(isDomestic);
        }

    }

    public void infoFish () {
        System.out.println("Type of fish is: " + types);
        System.out.println("Place of residence is: " + placeofResidence);
        System.out.println("Size of fish is: " + size);
        System.out.println("Weight of fish is: " + weight);
        System.out.println("Is " + types + " domestic? " + domestic);
    }
}
