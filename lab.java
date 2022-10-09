import java.util.*;

public class lab {
    // Nama : M. FAWWAZ KHAIRUL MUJTABA
    // NIM  : 225150207111030
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        float abc, kuis, uts, uas, keaktifan, total;
        nama = input.nextLine();
        
        abc = input.nextFloat();
        if (abc >= 1 && abc <= 100){
            abc = (abc*10)/100;
        }
            kuis = input.nextFloat();
        if (kuis >= 1 && kuis <= 100){
            kuis = (kuis*20)/100;
        }
            uts = input.nextFloat();
        if (uts >= 1 && uts <= 100){
            uts = (uts*30)/100;
        }
            uas = input.nextFloat();
        if (uas >= 1 && uas <= 100){
            uas = (uas*30)/100;
        }
            keaktifan = input.nextFloat();
        if (keaktifan >= 1 && keaktifan <= 100){
            keaktifan = (keaktifan*10)/100;
        }
            total = (abc+kuis+uts+uas+keaktifan);
            
        switch ((79<total && total<101)?1:
                (75<total && total<80)?2:
                (69<total && total<76)?3:
                (60<total && total<70)?4:
                (55<total && total<61)?5:
                (50<total && total<56)?6:
                (44<total && total<51)?7:
                (0<=total && total<45)?8:8){
            
            case 1:
                System.out.printf("Nilai akhir %s:\n", nama);
                System.out.printf("- Nilai Akhir: %.2f\n", total);
                System.out.println("- Huruf Mutu : A");
                System.out.println("- Angka Mutu : 4,0");
                System.out.println("- Predikat   : Sangat Baik");break;
            case 2:
                System.out.printf("Nilai akhir %s:\n", nama);
                System.out.printf("- Nilai Akhir: %.2f\n", total);
                System.out.println("- Huruf Mutu : B+");
                System.out.println("- Angka Mutu : 3,5");
                System.out.println("- Predikat   : Lebih Baik");break;
            case 3:
                System.out.printf("Nilai akhir %s:\n", nama);
                System.out.printf("- Nilai Akhir: %.2f\n", total);
                System.out.println("- Huruf Mutu : B");
                System.out.println("- Angka Mutu : 3,0");
                System.out.println("- Predikat   : Baik");break;
            case 4:
                System.out.printf("Nilai akhir %s:\n", nama);
                System.out.printf("- Nilai Akhir: %.2f\n", total);
                System.out.println("- Huruf Mutu : C+");
                System.out.println("- Angka Mutu : 2,5");
                System.out.println("- Predikat   : Lebih dari Cukup");break;
            case 5:
                System.out.printf("Nilai akhir %s:\n", nama);
                System.out.printf("- Nilai Akhir: %.2f\n", total);
                System.out.println("- Huruf Mutu : C");
                System.out.println("- Angka Mutu : 2,0");
                System.out.println("- Predikat   : Cukup");break;
            case 6:
                System.out.printf("Nilai akhir %s:\n", nama);
                System.out.printf("- Nilai Akhir: %.2f\n", total);
                System.out.println("- Huruf Mutu : D+");
                System.out.println("- Angka Mutu : 1,5");
                System.out.println("- Predikat   : Lebih dari Kurang");break;
            case 7:
                System.out.printf("Nilai akhir %s:\n", nama);
                System.out.printf("- Nilai Akhir: %.2f\n", total);
                System.out.println("- Huruf Mutu : D");
                System.out.println("- Angka Mutu : 1,0");
                System.out.println("- Predikat   : Kurang");break;
            case 8:
                System.out.printf("Nilai akhir %s:\n", nama);
                System.out.printf("- Nilai Akhir: %.2f\n", total);
                System.out.println("- Huruf Mutu : E");
                System.out.println("- Angka Mutu : 0,0");
                System.out.println("- Predikat   : Gagal");break;
        } 
    }
}
