package org.java.javatown;

public class Cowboys extends Human {
    private int nbPopularity;
    private String temperament;

    Cowboys(String name) {
        super(name);
    }

    public void toExclaim() {
        System.out.println("Prend ça rascal !");
    }

    public void release(Human lady){
        System.out.println("Vous voilà de nouveau libre charmante demoiselle" + " " + lady);
    }

    public void shoot(Human robber){
        System.out.println(this + " " + "tire sur" + " "+ robber + " " + "PAN !");
    }
}
