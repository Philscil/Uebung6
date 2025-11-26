package p3;

public class P3_main {
    public static void main(String[] args) {
        int[] input = {1,2,3,4,4};

        int ergebnis = methode(input);

        System.out.println(ergebnis);
    }

    public static int methode(int[] a) {
        int max = -1;
        int k = a.length - 1;

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                if (a[j] > a[i]) {
                    max = a[j];
                }
            }
        }
        return max;
    }
}
