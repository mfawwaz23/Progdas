import java.util.*;

public class Solution {
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int p, l, k;
        p = in.nextInt();
        l = in.nextInt();
        k = in.nextInt();
        
        for(int i = 0; i < p; i++) {
            if (i < p - k) {
                for (int j = 0; j < l; j++) {
                    if (j < k || j >= l - k) {
                        System.out.print("U");
                    } else {
                        System.out.print(" ");
                    }
                }
            }else {
                for(int j = 0; j<l; j++){
                    System.out.print("U");
                }
            }
            System.out.println("");
        }
    }
}
