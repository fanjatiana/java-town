package org.java.javatown;

public abstract class Human {
    public String name;
    private String favoriteDrink = "eau";

    Human(String name) {
        this.name = name;
    };

    public void speak(String text) {

        System.out.println(this.name + "-" + text);
    };

    public void introduceOneself(String favoriteDrink) {
        System.out.println(" je m'appelle" + " " + this.name + " " + "j'aime boire du" + " " + favoriteDrink);
    };

    public void drink(String favoriteDrink) {
        System.out.println("Ah ! un bon verre de" + " " + favoriteDrink + " " + "!" + "GLOUPS !");
    };

    public String getName() {
        return this.name;
    };

    public String getFavoriteDrink() {
        return favoriteDrink;
    };
}
