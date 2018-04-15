package javaapplication77;

import java.io.*;

public class JavaApplication77 {

    public static void main2(String[] args) {

        try {
            FileInputStream fin = new FileInputStream("test.bin");
            System.out.println(fin.available());
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }     
    }
}
