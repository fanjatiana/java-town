package org.java.javatown;

public class WomenBandit extends Ladies implements Outlaw {
    private int rewardIfWanted;
    WomenBandit(String name) {
        super(name);
    }
    @Override
    public void kidnapLadies(Ladies lady) {
        Outlaw.super.kidnapLadies(lady);
    }
    @Override
    public void isCaptured(Cowboys cowboys) {
        Outlaw.super.isCaptured(cowboys);
    }
    @Override
    public String getName(String name) {
        return Outlaw.super.getName(name);
    }
    @Override
    public int getRewardValue() {
        return Outlaw.super.getRewardValue();
    }
}