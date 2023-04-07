package org.java.javatown;

public class Robbers extends Human {
    private String look = "méchant";
    private int nbLadiesKidnapped;
    private int rewardIfWanted;
    private boolean isInPrison;

    Robbers(String name) {
        super(name);
    }

    public void captureALady(Human lady){
        System.out.println("Ah ah !" + " " +lady.getName() + " "+ "tu es mienne désormais");
    }
    public void toBeCaptured(Cowboys cowboy){
        System.out.println("Damned, je suis fait !" + " "+ cowboy.getName() + " "+ "tu m’as eu !");
    }

    public int rewardIfCapture(Cowboys cowboy){
        int sum = 10_000;
        if(isInPrison==true){
            System.out.println("Celui qui l'a capturé reçoit la coquette somme de" + " "+ sum+ " "+ "$");
        }else{
            System.out.println("Dépêchez vous sinon vous pourrez dire adieu aux" + " "+ sum+ " "+ "$ !");
        }
        return sum;
    }

}
