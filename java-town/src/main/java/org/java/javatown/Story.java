package org.java.javatown;

/*
 * Dans cette classe Histoire, vous créerez un humain qui se présente et qui boit.
 * */
public class Story {
    public static void main(String[] args) {

        // test Human class
        // robert.speak(" salut à toi ! ");
        //robert.introduceOneself("Vin");
        //robert.drink("vin");

        Ladies sophie = new Ladies("Sophie");
        Bandits sam = new Bandits("Sam", "Mechant", 10, 1000000);
        Cowboys john = new Cowboys("John");
        Bartender sebastien = new Bartender("Sebastien");
        Sherif bob = new Sherif("Sherif", 150);

        // test Ladies class
        sophie.speak("Hey moi c'/est Sophie, 35 ans, célibaire...");
        sophie.whatsYourName();
        sophie.introduceOneself("rosé pamplemousse");
        sophie.drink("jus de fruit");
        sophie.getKidnapped(sam);
        sophie.getReleased("Georges");

        // test Cowboys class
        john.speak("Je suis john !");
        john.introduceOneself("rhum");
        john.drink("rhum arrangé");
        john.toExclaim();
        john.release(sophie);
        john.shoot(sam);

        // test Bandits class
        sam.speak("je m'appelle sam!  ");
        sam.whatsYourName();
        sam.introduceOneself("verre de lait");
        sam.drink("de lait bien frais ! ");
        sam.captureALady(sophie);
        sam.toBeCaptured(john);
        sam.rewardIfCapture(Boolean.parseBoolean("false"));

        // test Bartender
        sebastien.introduceOneself("vin");
        sebastien.speak("allez un petit verre ");
        sebastien.serveADrink(sophie);
        sebastien.serveADrink(sam);
        sebastien.serveADrink(john);

        // test Sherif Bob
        bob.introduceOneself("café");
        bob.catchABandit(sam);
        bob.lookForABandit(sam);

        // ex Question 2.7: Les shérifs sont des cowboys dans l’âme
        Cowboys clint = new Sherif("Clint", 100);
        /*clint ne peut pas attraper de brigand car la méthode catchBandit()
        n'est définie que dans la classe Shérif qui extend  la classe Cowboys */

        // interface
        Outlaw outlawRobert = new Bandits("Rober", "Terrible", 500, 50_000);
        outlawRobert.kidnapLadies(sophie);
        outlawRobert.isCaptured(john);
        sophie.getKidnapped(outlawRobert);
        john.capture(outlawRobert);

        // test classe CorruptMan
        Outlaw corruptMan = new CorruptMan("Erwan", 500);
        john.capture(corruptMan);
        sophie.getKidnapped(corruptMan);

        // test classe Calamity
        Outlaw ladyBandit = new CorruptMan("Calamity Jane", 1000000);
        ladyBandit.isCaptured(john);
        ladyBandit.kidnapLadies(sophie);

        // test classe Indien
        Indian indian = new Indian("Chetan", 15, "Faucon", "'ayahuasca");
        indian.scalp(john);
    }
}
