package com.learning.looseCoupling;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learning.looseCoupling.game.GameRunner;
import com.learning.looseCoupling.game.GamingConsole;
import com.learning.looseCoupling.game.SuperContraGame;

import lombok.var;

public class App01GamingBasicJava {

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }

        // var game = new MarioGame();
        // var game = new SuperContraGame();
        // var gameRunner = new GameRunner(game);
        // gameRunner.run();

    }

}
