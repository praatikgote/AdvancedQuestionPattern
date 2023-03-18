import java.util.*;

public class Number_Pyramid {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number of rows: ");
        int row = sc.nextInt();

        // upper half;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.println(" ");
            }

            for (int j = 1; j <= row; j++) {
                System.out.println(i + " ");
            }

            System.out.println();

        }

        sc.close();

    }

}
