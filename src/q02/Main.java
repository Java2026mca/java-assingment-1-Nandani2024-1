package.q02;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int val = 1;

            for (int j = 0; j <= i; j++) {
                System.out.print(val);

                // avoid trailing space
                if (j < i) {
                    System.out.print(" ");
                }

                // compute next value
                val = val * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
