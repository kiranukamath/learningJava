package com.learning.chapter1.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan //("com.learning.looseCoupling.game")
public class GamingConfiguration {

    // @Bean
    // public GamingConsole game() {
    //     var game = new PacmanGame();
    //     return game;
    // }

    /*@Bean
    public GameRunner gameRunner(GamingConsole game) {
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }*/

    /*public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }

    }*/
}
