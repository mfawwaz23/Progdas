import java.util.*;
public class Latihan {

    public static void main(String args[]) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 1; i <=n ; i++){
            
            if(i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz");
            } else if(i%3 == 0 && i%5 != 0){
                System.out.println("Fizz");
            } else if(i%5 == 0 && i%3 != 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
