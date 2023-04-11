package org.java.javatown;

public class Indian extends Human {
    private int nbFeathers = 0;
    private String totem = "Coyote";
    private String favoriteDrink = "jus de racine";

    Indian(String name, int nbFeathers, String totem,String favoriteDrink) {
        super(name);
        this.nbFeathers=nbFeathers;
        this.totem = totem;
        this.favoriteDrink = favoriteDrink;
    }

    public void scalp(Human human){
        System.out.println(this.name + " scalpe un VisagePale et ajoute une plume !");
        human.speak(" crie : Aie ma tête !!");
        this.nbFeathers++;;
    }

    @Override
    public void speak(String text) {
        super.speak(text);

    }



    @Override
    public void introduceOneself(String favoriteDrink) {
        super.introduceOneself(favoriteDrink);
        System.out.println("Salut,je suis " + name + " " + "j'ai" + this.nbFeathers + " de plumes" +
                "mon totem est le " +this.totem + ", " + " ma boisson favorite est le " + this.favoriteDrink + " Ugh !" );
    }

    @Override
    public void drink(String favoriteDrink) {
        super.drink(favoriteDrink);
    }
}
