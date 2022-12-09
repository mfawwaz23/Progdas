import java.util.*;

public class latihanUAP {

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        double xPenumpang, yPenumpang, xOjek, yOjek;
        xPenumpang = in.nextDouble();
        yPenumpang = in.nextDouble();
        int jumlahOjek = in.nextInt();
        List<Double> minimum = new ArrayList<>();
        for(int i = 0; i<jumlahOjek; i++){
            xOjek = in.nextDouble();
            yOjek = in.nextDouble();
            minimum.add(Jarak(xPenumpang, yPenumpang, xOjek, yOjek));
        }
        if (Collections.min(minimum) < 20){
            String y = Double.toString(Collections.min(minimum));
            System.out.printf("Driver yang mengambil order adalah ojek ke-%d\n", minimum.indexOf(Collections.min(minimum))+1);
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
}
