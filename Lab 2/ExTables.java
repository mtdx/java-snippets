package Tables;

import java.util.Arrays;

public class ExTables {

    public static void main(String[] args) {
        int[] v = {7, -5, 4, 9, 8, 10};

        System.out.println(Arrays.toString(v));

        Arrays.sort(v);
        System.out.println(Arrays.toString(v));

        int[] w = Arrays.copyOf(v, v.length);
        System.out.println(Arrays.toString(w));

        w[0] = 1;
        System.out.println(Arrays.toString(v));
    }
}
