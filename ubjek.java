import java.util.*;
import java.util.Scanner;

public class ubjek {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total;
        int x1, x2, y1, y2;
        float distance, pengantaran, penjemputan;
            x1 = in.nextInt();
            y1 = in.nextInt();
            x2 = in.nextInt();
            y2 = in.nextInt();
                distance = (float) Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
                pengantaran = 2000*distance;
                penjemputan = (pengantaran*3)/4;
                total = (int) (pengantaran+penjemputan);
                    
                    System.out.printf("Total biaya untuk %.1f km adalah Rp%d", distance, total);
    }
}