package com.learning.looseCoupling.game;

public class MarioGame implements GamingConsole{

    public void up(){
        System.out.println("JUMP");
    }

    public void down(){
        System.out.println("Go into hole");
    }

    public void left(){
        System.out.println("Go back");
    }

    public void right(){
        System.out.println("accelerate");
    }
}
