package javaapplication9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StudentUTM[] tob = new StudentUTM[5];

        tob[0] = new StudentUTM("E", "E", 7);
        tob[1] = new StudentUTM("D", "D", 1);
        tob[2] = new StudentUTM("B", "B", 5);
        tob[3] = new StudentUTM("A", "A", 2);
        tob[4] = new StudentUTM("C", "C", 3);
     

        // Name Sort
        Arrays.sort(tob, new SortName());

        for (StudentUTM s : tob) {
            System.out.println(s);
        }

        System.out.println();
        Arrays.sort(tob, new SortYear());

        for (StudentUTM s : tob) {
            System.out.println(s);
        }
    }

}