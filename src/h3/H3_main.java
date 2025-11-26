package h3;

import java.util.Arrays;

public class H3_main {
    public static void main(String[] args) {
        int[] a  = {2,2,3};
        int[] b = {3,2,2};

        boolean ergebnis = compareArraysVal(a, b);

        System.out.println(ergebnis);
    }

    public static boolean compareArraysVal(int[] a, int[] b) {
        
        if (a.length != b.length) {
            return false;
        }

        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }
}