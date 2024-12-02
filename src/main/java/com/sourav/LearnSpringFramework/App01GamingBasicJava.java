package com.sourav.LearnSpringFramework;

import com.sourav.Game.GameRunner;
import com.sourav.Game.PackManGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {
        var game = new PackManGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
