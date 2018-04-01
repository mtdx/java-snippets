package javaapplication9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Calc c = new Calc(2, 3);
        
        System.out.println(c.calc(new Addition(2, 3)));
    }

}
