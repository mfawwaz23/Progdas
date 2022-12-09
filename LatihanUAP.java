import java.util.*;

public class Solution {

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        double xPenumpang, yPenumpang, xOjek, yOjek;
        int ojekTerdekat;
        xPenumpang = in.nextDouble();
        yPenumpang = in.nextDouble();
        int jumlahOjek = in.nextInt();
        double[] minOjek = new double[jumlahOjek];
        for(int i = 0; i<jumlahOjek; i++){
            xOjek = in.nextDouble();
            yOjek = in.nextDouble();
            minOjek[i] = Jarak(xPenumpang, yPenumpang, xOjek, yOjek);
        }
        ojekTerdekat = Terdekat(minOjek);
        if (minOjek[ojekTerdekat] < 20){
            String y = Double.toString(minOjek[ojekTerdekat]);
            System.out.printf("Driver yang mengambil order adalah ojek ke-%d\n", ojekTerdekat+1);
            System.out.printf("Jarak yang ditempuh : %s km", y);
        }else{
            System.out.println("Tidak ada driver yang mengambil order");
            System.out.println("Order diluar jangkauan");
        }
    }
    public static double Jarak(double xPenumpang, double yPenumpang, double xOjek, double yOjek){
        double jarak = Math.sqrt(((xPenumpang-xOjek)*(xPenumpang-xOjek)) + ((yPenumpang-yOjek)*(yPenumpang-yOjek)));
        return jarak;
    }
    public static int Terdekat(double[] minOjek){
        int index = 0;
        double min = minOjek[index];
        
        for(int i = 1; i<minOjek.length; i++){
            if(minOjek[i] <= min){
                min = minOjek[i];
                index = i;
            }
        }
        return index;
    }
}
