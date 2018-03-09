package Tables;

import java.util.Scanner;
import java.util.Arrays;

public class ExTables2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("n = ");
        int n = s.nextInt();
        int[][] v2 = new int[n][];

        for (int i = 0; i < n; i++) {
            v2[i] = new int[i+1];

            for (int j = 0; j < i+1; j++) {
                v2[i][j] = j+1;
            }
        }

        for (int i = 0; i < v2.length; i++) {
            System.out.println(Arrays.toString(v2[i]));
        }

    }
}