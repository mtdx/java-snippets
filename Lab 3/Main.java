package javaapplication5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       EmployeUTM[] t = new EmployeUTM[3];

       Scanner in = new Scanner(System.in);
       int x = in.nextInt();

       if (x > 100) {
           t[0] = new Teacher();
       } else {
           t[0] = new Tesa();
       }

      System.out.println(t[0].calcPaycheck());
    }
}
