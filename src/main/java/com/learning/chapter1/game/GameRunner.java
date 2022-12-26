package com.learning.chapter1.game;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class GameRunner {
    private GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    @PostConstruct
    public void init(){
        System.out.println("All required loaded");
    }

    @PreDestroy
    public void cleanUp(){
        System.out.println("CleanUp completed");
    }
    
    public void run() {
        System.out.println("Running Game "+game);
        game.up();
        game.down();
        game.left();
        game.right();
    }

}
