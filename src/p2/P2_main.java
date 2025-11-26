package p2;

public class P2_main {
    public static void main(String[] args) {
        int[] someNumbers = {1,2,3,4,3};

        boolean ergebnis = pairwiseDifferent(someNumbers);

        System.out.println(ergebnis);
    }

    public static boolean pairwiseDifferent(int[] someNumbers) {
        boolean ergebnis = false;

        for (int i = 0; i < someNumbers.length; i++) {
            for (int k = 0; k < someNumbers.length; k++) {
                if (someNumbers[i] == someNumbers[k] && i != k) {
                    ergebnis = true;
                }
            }
        }

        return ergebnis;
    }
}
