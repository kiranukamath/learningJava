package com.learning.looseCoupling;

import com.learning.looseCoupling.game.GameRunner;
import com.learning.looseCoupling.game.SuperContraGame;

import lombok.var;

public class AppGamingBasicJava {

    public static void main(String[] args) {

        // var game = new MarioGame();
        var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();

    }

}
