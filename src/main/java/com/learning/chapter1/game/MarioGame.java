package com.learning.chapter1.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
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
