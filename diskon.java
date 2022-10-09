import java.util.*;
public class diskon {

    public static void main(String args[]) {
        System.out.println("Masukan pendapatan: ");
        Scanner in = new Scanner(System.in);
        float total_komisi, total_pendapatan; 
        float pendapatan = in.nextFloat();
        
            if(pendapatan <= 154000){
            total_komisi = (pendapatan*35)/1000;
            total_pendapatan = total_komisi+12000;
            System.out.printf("total pendapatan: Rp.%.2f", total_pendapatan);
        } else if(pendapatan > 154000) {
            total_komisi = (pendapatan*125)/1000;
            total_pendapatan = total_komisi+37000;
            System.out.printf("total pendapatan: Rp.%.2f", total_pendapatan);
        } else if(pendapatan >567000){
            total_komisi = (pendapatan*278)/1000;
            total_pendapatan = total_komisi+79000;
            System.out.printf("total pendapatan: Rp.%.2f", total_pendapatan);
        } 
    }
}
