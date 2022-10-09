import java.util.*;

public class Percabangan2 {
        //Nama : M. Fawwaz Khairul Mujtaba
        //NIM  : 225150207111030

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int i;
        
        i = in.nextInt();
        if(i%7 == 1 || i == 1){
            System.out.println("Minggu");
        }if(i%7 == 2 || i == 2){
            System.out.println("Senin");
        }if(i%7 == 3 || i == 3){
            System.out.println("Selasa");
        }if(i%7 == 4 || i == 4){
            System.out.println("Rabu");
        }if(i%7 == 5 || i == 5){
            System.out.println("Kamis");
        }if(i%7 == 6 || i == 6){
            System.out.println("Jumat");
        }if(i%7 == 7 || i == 7){
            System.out.println("Sabtu");
        }
    }
}