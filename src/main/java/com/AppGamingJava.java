package com;
import com.JavaLearn.GameRunner;
import com.JavaLearn.MarioGame;

public class AppGamingJava {
    public static void main(String args[]){
       MarioGame game = new MarioGame(); // Object creation
       GameRunner gameRunner = new GameRunner(game); // Object Creation +  Wiring of depedencies
       //Game is a dependency of GameRunnder class
       gameRunner.run();
    }
}
