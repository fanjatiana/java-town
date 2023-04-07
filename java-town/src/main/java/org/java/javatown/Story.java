package org.java.javatown;

/*
* Dans cette classe Histoire, vous créerez un humain qui se présente et qui boit.
* */
public class Story {
    public static void main(String[] args) {
        Human robert = new Human("Robert");
        Ladies sophie = new Ladies("Sophie");
        Robbers sam = new Robbers("Sam");
        Cowboys john = new Cowboys("John");

        // test Human class
        robert.speak(" salut à toi ! ");
        robert.introduceOneself("Vin");
        robert.drink("vin");

        // test Ladies class
        sophie.speak("Hey moi c'/est Sophie, 35 ans, célibaire...");
        sophie.getKidnapped();
        sophie.getReleased("Georges");
        sophie.changeDress("rouge");

        // test Cowboys class
        john.speak("Je suis john !");
        john.toExclaim();
        john.release(sophie);
        john.shoot(robert);

        // test Robbers class
        sam.speak("je m'appelle sam!  ");
        sam.captureALady(sophie);
        sam.toBeCaptured(john);
        sam.rewardIfCapture(Boolean.parseBoolean("false"));

    }

}
