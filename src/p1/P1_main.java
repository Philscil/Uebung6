package p1;

public class P1_main {

    public static void main(String[] args) {
        int eingabe = 2;

        int ergebnis = squared(eingabe);

        System.out.println(ergebnis);
    }

    public static int squared(int eingabe) {
        return (eingabe + 1) * (eingabe + 1);
    }

}
