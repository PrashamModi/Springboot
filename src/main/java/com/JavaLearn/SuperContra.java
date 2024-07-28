package com.JavaLearn;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("QualifierContraGame")
public class SuperContra implements GamingConsole {
    public void up(){
        System.out.println("Up clicked In SuperContra..!!");
    }
    public void down(){
        System.out.println("Down clicked In SuperContra..!!");
    }
    public void left(){
        System.out.println("Left clicked In SuperContra..!!");
    }
    public void right(){
        System.out.println("Right clicked In SuperContra..!!");
    }
}
