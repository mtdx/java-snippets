package javaapplication64;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class JavaApplication64
{
    public static void main(String[] args) throws IOException
    {
        Scanner fin = new Scanner(new File("numere.txt"));
        int x;
        HashSet<Integer> set = new HashSet<Integer>();
        while (fin.hasNextInt()) {
            x = fin.nextInt();
            set.add(x);
        }
        for (int i : set) {
            System.out.println(i + " ");
        }
        fin.close();
    }
}