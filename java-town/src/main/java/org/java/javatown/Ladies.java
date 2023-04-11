package org.java.javatown;

public class Ladies extends Human {
private String colorDress;
private boolean isFree;

    Ladies(String name) {
        super(name);
    }

    public void getKidnapped(){
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH !! AAAA MOIIII !!! ");
    }

    public void  getReleased(String cowboy){
        System.out.println("Oh vous êtes mon héros" + " " + cowboy+ " merci");
    }

    public String changeDress(String colorDress){
        System.out.println("Regardez ma nouvelle robe" + " " + colorDress +"!");
        return colorDress;
    }



    @Override
    public String whatsYourName() {
        String name = this.name;
        System.out.println("Miss" + " " + name);;
        return name;
    }

    @Override
    public void introduceOneself(String favoriteDrink) {
        super.introduceOneself(favoriteDrink);

        String newColorDress = changeDress("verte");
        System.out.println("regardez ma belle robe " + newColorDress);
        System.out.println("Ma boisson favorite est le " + favoriteDrink);
    }

    @Override
    public void drink(String favoriteDrink) {
        favoriteDrink = "lait";
        super.drink(favoriteDrink);
    }
}
