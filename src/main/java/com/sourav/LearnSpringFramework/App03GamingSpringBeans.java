package com.sourav.LearnSpringFramework;

import com.sourav.Game.GameRunner;
import com.sourav.Game.GamingConsole;
import com.sourav.Game.PackManGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }

    }
}