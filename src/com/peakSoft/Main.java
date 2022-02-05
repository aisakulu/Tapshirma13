package com.peakSoft;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Fish fish = new Fish();
        fish.setTypes("Sazan");
        fish.setPlaceofResidence("Daria Baligi");
        fish.setSize(36.2);
        fish.setWeight(5.6);
        fish.setDomestic(false);
        fish.infoFish(); // Method

        System.out.println("_________________________");

        Parrot parrot = new Parrot();
        parrot.setType("Parakeets");
        parrot.setAge(2);
        parrot.setGender('M');
        parrot.setPlaceofResidence("African Parrot");
        parrot.setColor("Bluish");
        parrot.setCanTalk(true);
        parrot.setDomestic(true);
        parrot.infoParrot();

        System.out.println("___________________________________");
        Cat cat = new Cat();
        cat.setType("Snowshoe");
        cat.setAge(3);
        cat.setGender('F');
        cat.setColor("Yellow");
        cat.setDomestic(true);
        cat.setPlaceofResidence("British");
        cat.infoCat();

        System.out.println("_______________________________");
        Dog dog = new Dog();
        dog.setType("Bulldog");
        dog.setAge(3);
        dog.setGender('M');
        dog.setColor("Yellow");
        dog.setDomestic(true);
        dog.setPlaceofResidence("France");
        dog.infoCat();
    }

}
