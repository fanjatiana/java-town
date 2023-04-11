package org.java.javatown;

public interface Outlaw {
    public default void kidnapLadies(Ladies lady){};

    public default void isCaptured(Cowboys cowboys){};

    public  default  String getName(String name){
        return name;
    };
    public default int getRewardValue (){
        return 0;
    };
    
}
