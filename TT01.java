import java.util.*;

public class TT01 {
    //NAMA : M. FAWWAZ KHAIRUL MUJTABA
    //NIM  : 225150207111030
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int stok = 0, totalHarga = 0;
        String namaBarang, agen;
        
        System.out.println("Masukan nama agen");
        agen = in.nextLine();
        
        System.out.println("Masukan nama barang 'Besar' atau 'Kecil'");
        namaBarang = in.next();
        if("Besar".equals(namaBarang)){
            System.out.println("Masukan jumlah barang yang ingin dibeli");
            stok = in.nextInt();
            if(stok<=33){
                System.out.println("barang tersedia: 33");
                totalHarga = stok*534000;
                System.out.printf("\nAgen: %s akan membeli barang %s berjumlah %d dengan harga Rp%d", agen, namaBarang, stok, totalHarga);
            }else{
                System.out.println("barang tidak tersedia");
            }
        }else if("Kecil".equals(namaBarang)){
            System.out.println("Masukan jumlah barang yang ingin dibeli");
            stok = in.nextInt();
            if(stok <=67){
                System.out.println("barang tersedia: 67");
                totalHarga = stok*267000;
                System.out.printf("\nAgen: %s akan membeli barang %s berjumlah %d dengan harga Rp%d", agen, namaBarang, stok, totalHarga);
            }else{
                System.out.println("barang tidak tersedia");
            }
        }
    }
}
