package com.learning.looseCoupling.game;

public class PacmanGame implements GamingConsole{

    public void up(){
        System.out.println("JUMP");
    }

    public void down(){
        System.out.println("down");
    }

    public void left(){
        System.out.println("left");
    }

    public void right(){
        System.out.println("right");
    }
    
}
