package javaapplication64;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class JavaApplication64
{
    public static void main(String[] args) throws IOException
    {
        Scanner fin = new Scanner(new File("date.in"));
        String cuv;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        while (fin.hasNext()) {
            cuv = fin.next();
            if (map.containsKey(cuv)) {
               map.put(cuv, map.get(cuv) + 1);
            } else {
                map.put(cuv, 1);
            }
           
        }
        for (String k : map.keySet()) {
            System.out.println(k + " " + map.get(k));
        }
        fin.close();
    }
}