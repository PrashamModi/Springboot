package com.JavaLearn;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacmanGame implements GamingConsole {
    public void up(){
        System.out.println("Up clicked In Pacman");
    }
    public void down(){
        System.out.println("Down clicked In Pacman");
    }
    public void left(){
        System.out.println("Left clicked Pacman");
    }
    public void right(){
        System.out.println("Right clicked Pacman");
    }
}
