package org.java.javatown;

public class Sherif extends Cowboys implements Outlaw {
 private String name;
    private String temperament=" honnête";
    private  int nbBanditsArrested;
    Sherif(String name,int nbBanditsArrested) {
        super(name);
        this.nbBanditsArrested = nbBanditsArrested;
    }

    public void catchABandit(Robbers robber){
        System.out.println("Au nom de la loi" + " " +robber.getName() + ", je\n" + "vous arrête !");
    }
   /* @Override
    public void toExclaim() {
        super.toExclaim();
        System.out.println("Au nom de la loi, je\n" + "vous arrête !");
    }*/

    public  void lookForABandit(Robbers robber){
        int reward =  robber.rewardIfCapture(true);
        System.out.println("OYEZ OYEZ BRAVE GENS !!" + reward + "$ a qui\n" +
                "arrêtera" +  " " + robber.getName() + " le brigand, mort ou vif !!");

    }

    @Override
    public void introduceOneself(String favoriteDrink) {
        super.introduceOneself(favoriteDrink);
        System.out.println("eh je suis l' " + this.temperament + " "+ getName()+  " " + "j'ai déjà arrêté" + " " + this.nbBanditsArrested +" "+ "et ma boisson favorite est le " + favoriteDrink);
    }
}
