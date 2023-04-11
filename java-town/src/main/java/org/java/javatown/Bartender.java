package org.java.javatown;

public class Bartender extends Human {

    private String name;
    private String barName;
    private String favoriteDrink = "vin";

    Bartender(String name) {
        super(name);
        this.barName = "Chez" + name;
    }

    public Bartender(String name, String barName) {
        super(name);
        this.barName = barName;
    }

    public void serveADrink(Human human) {
        System.out.println("hey toi !" + human.getName() + " je sais ce qu'il te ferait plaisir, un bon verre de  " + this.favoriteDrink + " " + "coco");
    }

    @Override
    public void speak(String text) {
        super.speak(text);
        System.out.println(text + "coco.");
    }

    @Override
    public void introduceOneself(String favoriteDrink) {
        super.introduceOneself(favoriteDrink);
        System.out.println("Bonjour, je suis " + " " + this.getName() + " tournée générale dans mon bar " + " " + barName +
                "je vous ferai découvrir ma boisson favorite : le " + favoriteDrink + ", recette secrete de mon père Coco");
    }
}