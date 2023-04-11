package org.java.javatown;

public class Robbers extends Human implements Outlaw {
    private String look = " le méchant";
    private int nbLadiesKidnapped;
    private int rewardIfWanted;
    private boolean isInPrison;

    Robbers(String name, String look, int nbLadiesKidnapped, int rewardIfWanted) {
        super(name);
        this.look = look;
        this.nbLadiesKidnapped =nbLadiesKidnapped;
        this.rewardIfWanted = rewardIfWanted;


    }

    public void captureALady( Ladies lady){
        System.out.println("Ah ah !" + " " +lady.getName() + " "+ "tu es mienne désormais");
    }
    public void toBeCaptured(Human cowboy){
        System.out.println("Damned, je suis fait !" + " "+ cowboy.getName() + " "+ "tu m’as eu !");
    }



    public int rewardIfCapture(boolean isInPrison){
        int sum = 10_000;
        if(isInPrison==true){
            System.out.println("Bravo ! tu as capturé" +" " + this.getName() + " "+ " tu as gagné la coquette somme de " + sum+ " "+ "$");
        }else{
            System.out.println("Dépêchez vous sinon vous pourrez dire adieu aux" + " "+ sum+ " "+ "$ !");
        }
        return sum;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String whatsYourName() {
        String name = this.name;
        System.out.println(this.name + " " + this.look);;
        return name;
    }

    @Override
    public void introduceOneself(String favoriteDrink) {
        favoriteDrink = "Tord-boyaux";
        super.introduceOneself(favoriteDrink);
        System.out.println("Bonjour je suis" + " " + this.name + " le " + this.look + " " + "j'aime boire du" + " " + favoriteDrink);
        System.out.println("J'ai l'air " + this.look + " et j'ai déjà kidnappé " + this.nbLadiesKidnapped+ " dames !");
        System.out.println("Ma tête est mise à prix à " + this.rewardIfWanted + "$ !");
    }

    // implement methode
    @Override
    public void isCaptured(Cowboys cowboys) {
        Outlaw.super.isCaptured(cowboys);
        System.out.println(cowboys.getName() + "" + "m'attrapé !");
    }

    @Override
    public void kidnapLadies(Ladies lady) {
        Outlaw.super.kidnapLadies(lady);
        System.out.println("ah ah j'ai kidnapé " + lady.getName() + " !");

    }

    @Override
    public int getRewardValue() {
        return Outlaw.super.getRewardValue();
    }

    @Override
    public String getName(String name) {
        return Outlaw.super.getName(name);    }
}
