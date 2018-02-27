package javaapplication1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tas = new Scanner(System.in);

        System.out.print("n = ");
        int n = tas.nextInt();

        int s = 0;
        for (int i = 0; i < n; i++) {
            s += tas.nextInt();
        }

        System.out.println(s);
    }

}