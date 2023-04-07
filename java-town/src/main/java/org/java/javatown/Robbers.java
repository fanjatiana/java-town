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
}
