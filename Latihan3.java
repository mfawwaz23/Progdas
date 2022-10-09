import java.util.*;

public class Latihan3 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String prodi;
        
        prodi = in.next();
        if("TIF".equals(prodi)){
            System.out.println("Teknik Informatika");
        }else if("TKOM".equals(prodi)){
            System.out.println("Teknik Komputer");
        }else if("SI".equals(prodi)){
            System.out.println("Sistem Informasi");
        }else if("TI".equals(prodi)){
            System.out.println("Teknologi Informasi");
        }else{
            System.out.println("Anda Salah Memasukkan Kode");
        }
    }
}
