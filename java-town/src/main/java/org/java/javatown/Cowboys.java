package org.java.javatown;

public class Cowboys extends Human {
    private int nbPopularity;
    private String temperament = " le vaillant";

    Cowboys(String name) {
        super(name);
    }

    public void toExclaim() {
        System.out.println("Prend ça rascal !");
    }

    public void release(Human lady) {
        System.out.println("Vous voilà de nouveau libre charmante demoiselle" + " " + lady.getName());
    }
    public void shoot(Human robber) {
        System.out.println(this.getName() + " " + "tire sur" + " " + robber.getName() + " " + "PAN !");
    }
    public void capture(Outlaw outlaw) {
        System.out.println("ah ah pris la main dans le sac !");
    }
    @Override
    public void introduceOneself(String favoriteDrink) {
        super.introduceOneself(favoriteDrink);
        favoriteDrink = "Wisky";
        System.out.println("Rien ne vaut un bon " + favoriteDrink);
    }
}
