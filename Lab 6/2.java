package javaapplication77;

import java.io.*;
import java.util.Scanner;

public class NumbersFile {

    public static void main(String[] args) {
        try {
            Scanner fin = new Scanner(new File("nr.txt"));
            PrintWriter foutPoz = new PrintWriter("nrpos.txt");
            PrintWriter foutNeg = new PrintWriter("nrneg.txt");

            int x;

            while (fin.hasNext()) {
                x = fin.nextInt();
                if (x > 0) {
                    foutPoz.write(x + " ");
                } else if (x < 0) {
                    foutNeg.write(x + " ");
                }
            }

            foutPoz.close();
            foutNeg.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

    }
}