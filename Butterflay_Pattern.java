import java.util.*;

public class Butterflay_Pattern {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Eneter a number of rows: ");
        int row = sc.nextInt();

        // upper half;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int spaces = 2 * (row - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

        // lower half;

        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int spaces = 2 * (row - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

        sc.close();

    }

}