package org.java.javatown;

public class Human {
    private String name;
    private String favoriteDrink = "eau";

    Human(String name) {
        this.name = name;
    };

    public void speak(String text) {
        System.out.println(this.name + "-" + text);
    };

    public void introduceOneself(String favoriteDrink) {
        System.out.println("bonjour, je m'appelle" + " " + this + "" + "j'ai boire du" + " " + favoriteDrink);
    };

    public void drink(String favoriteDrink) {
        System.out.println("Ah ! un bon verre de" + "" + favoriteDrink + " " + "! GLOUPS !");
    };

    public String getName() {
        return this.name;
    };

    public String getFavoriteDrink() {
        return favoriteDrink;
    };
}
