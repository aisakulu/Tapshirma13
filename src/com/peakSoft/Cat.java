package com.peakSoft;

public class Cat {
    private String type;
    private String placeofResidence;
    private boolean domestic;
    private int age;
    private String color;
    private char gender;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlaceofResidence() {
        return placeofResidence;
    }

    public void setPlaceofResidence(String placeofResidence) {
        this.placeofResidence = placeofResidence;
    }

    public boolean isDomestic() {
        return domestic;
    }

    public void setDomestic(boolean domestic) {
        this.domestic = domestic;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void infoCat() {
        System.out.println("Type of Cat is: " + type);
        System.out.println("Place of residence is: " + placeofResidence);
        System.out.println("Color is: " + color);
        System.out.println("Is " + type + " domestic? " + domestic);
        System.out.println("She is " + age + " years old.");
        System.out.println("Gender is: " + gender);
    }
}
