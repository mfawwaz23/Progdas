import java.util.*;

public class Kasus32 {
    //Nama : M. FAWWAZ KHAIRUL MUJTABA
    //NIM  : 225150207111030
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1, x2, x3, y1, y2, y3, xp, xt, yp, yt;
        String ojek1, ojek2, ojek3, ojek = "", penumpang, tujuan;
        float distance1, distance2, distance3, distancefinal, pengantaran, penjemputan, total, distance = 0;
        System.out.print("Nama pengojek terdekat 1: ");
        ojek1 = in.nextLine();
        System.out.print("Koordinat: ");
        x1 = in.nextInt();
        y1 = in.nextInt();

        in.nextLine();
        System.out.print("Nama pengojek terdekat 2: ");
        ojek2 = in.nextLine();
        System.out.print("Koordinat: ");
        x2 = in.nextInt();
        y2 = in.nextInt();

        in.nextLine();
        System.out.print("Nama pengojek terdekat 3: ");
        ojek3 = in.nextLine();
        System.out.print("Koordinat: ");
        x3 = in.nextInt();
        y3 = in.nextInt();

        in.nextLine();
        System.out.print("Nama penumpang: ");
        penumpang = in.nextLine();
        System.out.print("Koordinat: ");
        xp = in.nextInt();
        yp = in.nextInt();

        in.nextLine();
        System.out.print("Nama tujuan: ");
        tujuan = in.nextLine();
        System.out.print("Koordinat: ");
        xt = in.nextInt();
        yt = in.nextInt();

        distance1 = (float) Math.sqrt((xp - x1) * (xp - x1) + (yp - y1) * (yp - y1));
        distance2 = (float) Math.sqrt((xp - x2) * (xp - x2) + (yp - y2) * (yp - y2));
        distance3 = (float) Math.sqrt((xp - x3) * (xp - x3) + (yp - y3) * (yp - y3));
        distancefinal = (float) Math.sqrt((xp - xt) * (xp - xt) + (yp - yt) * (yp - yt));

        if (distance1 <= distance2 && distance1 <= distance3) {
            ojek = ojek1;
            distance = distance + distance1;
        } else if (distance2 <= distance1 && distance2 <= distance3) {
            ojek = ojek2;
            distance = distance + distance2;
        } else if (distance3 <= distance1 && distance3 <= distance2) {
            ojek = ojek3;
            distance = distance + distance3;
        }
        pengantaran = 2000 * distancefinal;
        penjemputan = 1500 * distance;
        total = pengantaran + penjemputan;

        System.out.printf("\nSaudara/i %s akan dijemput oleh %s\n", penumpang, ojek);
        System.out.printf("Dengan tujuan %s (%.2fkm)\n", tujuan, distancefinal);
        System.out.printf("Biaya yang harus dikeluarkan adalah Rp%.0f\n", total);
    }
}
