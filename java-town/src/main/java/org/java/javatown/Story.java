package org.java.javatown;

/*
* Dans cette classe Histoire, vous créerez un humain qui se présente et qui boit.
* */
public class Story {
    public static void main(String[] args) {
        Human robert = new Human("Robert");
        robert.speak(" salut à toi ! ");
        robert.introduceOneself("Vin");
        robert.drink("vin");
    }
}
