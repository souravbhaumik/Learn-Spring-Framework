package com.sourav.LearnSpringFramework;

import com.sourav.Game.GameRunner;
import com.sourav.Game.GamingConsole;
import com.sourav.Game.PackManGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game () {
        return new PackManGame();
    }

    @Bean
    public GameRunner gameRunner (GamingConsole game) {
        return new GameRunner(game);
    }

}
