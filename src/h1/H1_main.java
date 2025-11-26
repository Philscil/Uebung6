package h1;

public class H1_main {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {3,2,1};

        boolean ergebnis = isMirrorArray(a, b);

        System.out.print(ergebnis);
    }

    public static boolean isMirrorArray(int[] a, int[] b) {

        if (a.length != b.length) {
            return false;
        }

        boolean ergebnis = true;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[a.length - 1 - i]) {
                ergebnis = false;
            }
        }

        return ergebnis;
    }
}
