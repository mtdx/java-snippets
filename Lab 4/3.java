
package javaapplication6;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         System.out.print("s = ");
         String str = in.nextLine();

         String[] nums = str.split("[^0-9]+");
         System.out.println(Arrays.toString(nums));
        
    }

}