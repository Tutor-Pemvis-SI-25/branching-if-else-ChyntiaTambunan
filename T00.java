import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int jumlah, kali;
        double a, b;
        String m, n;

        a = Double.parseDouble(input.nextLine());
        b = Double.parseDouble(input.nextLine());
        if (a % 2 == 0) {
            m = "genap";
        } else {
            m = "ganjil";
        }
        if (b % 2 == 0) {
            n = "genap";
        } else {
            n = "ganjil";
        }
        System.out.println("bilangan pertama: " + a);
        System.out.println("bilangan kedua: " + b);
        if (a > b) {
            System.out.println("bilangan pertama lebih besar");
        } else {
            if (a == b) {
                System.out.println("kedua bilangan sama besar");
            } else {
                System.out.println("bilangan kedua lebih besar");
            }
        }
        if (m.equals("genap") && n.equals("genap")) {
            jumlah = m + n;
            System.out.println("hasil penjumlahan: " + jumlah);
        } else {
            if (m.equals("ganjil") && n.equals("ganjil")) {
                kali = a * b;
                System.out.println("hasil perkalian: " + kali);
            } else {
                System.out.println("berbeda jenis");
            }
        }
    }
}
