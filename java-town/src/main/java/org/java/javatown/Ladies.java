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

    public void changeDress(String colorDress){
        System.out.println("Regardez ma nouvelle robe" + " " + colorDress +"!");
    }
}
