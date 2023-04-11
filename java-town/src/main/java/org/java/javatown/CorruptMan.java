package org.java.javatown;

public class CorruptMan implements Outlaw {
    private String nom;
    private int rewardValue;

    public CorruptMan(String nom, int rewardValue) {
        this.nom = nom;
        this.rewardValue = rewardValue;
    }

    @Override
    public void kidnapLadies(Ladies lady) {
        Outlaw.super.kidnapLadies(lady);
        System.out.println(nom + " le ripoux, a kidnapé " + lady.getName());
    }

    @Override
    public int getRewardValue() {
        return Outlaw.super.getRewardValue();
    }

    @Override
    public void isCaptured(Cowboys cowboys) {
        Outlaw.super.isCaptured(cowboys);
        System.out.println(nom + " le ripoux, a été arrêté par " + cowboys.getName());
    }

    @Override
    public String getName(String name) {
        return Outlaw.super.getName(name);
    }
}