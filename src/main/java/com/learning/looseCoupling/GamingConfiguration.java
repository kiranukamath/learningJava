package com.learning.looseCoupling;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learning.looseCoupling.game.GameRunner;
import com.learning.looseCoupling.game.GamingConsole;
import com.learning.looseCoupling.game.PacmanGame;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game() {
        var game = new PacmanGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }

}
