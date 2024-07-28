package com.JavaLearn;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {
    @Override
    public String toString(){
        return "Mario";
    }

    public void up(){
        System.out.println("Up clicked");
    }
    public void down(){
        System.out.println("Down clicked");
    }
    public void left(){
        System.out.println("Left clicked");
    }
    public void right(){
        System.out.println("Right clicked");
    }
}
