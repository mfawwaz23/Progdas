import java.util.*;

public class abcd {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int j, k, i, n;
        
        n = input.nextInt();
        for (i = n; i >= 1; i--) {
            for (j = 0; j <= i - 1; j++) {
                k = n - j;
                if (i % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print(Integer.toString(k) + " ");
                }
            } System.out.print("\n");
        }
    }
}
