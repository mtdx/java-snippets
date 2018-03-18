package javaapplication6;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         System.out.print("s = ");
         String str = in.nextLine();

         String[] words = str.split("[,!;., ]+");
         System.out.println(words.length);

         Arrays.sort(words);
         System.out.println(Arrays.toString(words));
    }

}