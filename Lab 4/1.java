package javaapplication6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         System.out.print("s = ");
         String str = in.next();

         System.out.print("c = ");
         char c = in.next().charAt(0);

         int p = str.indexOf(c);
         str = str.substring(0, p) + str.substring(p+1);

         System.out.println(str);
    }

}