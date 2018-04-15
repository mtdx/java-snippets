package javaapplication77;

import java.io.*;
import java.util.Arrays;

public class BufferFile {

    public static void main(String[] args) {
        try {
            BufferedReader fin = new BufferedReader(new FileReader("txt.txt"));
            String line;

            while ((line = fin.readLine()) != null) {

                String[] words = line.split("[ ]+");
                Arrays.sort(words);
                System.out.println(Arrays.toString(words));
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
