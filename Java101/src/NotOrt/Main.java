package NotOrt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int mat, fizik, turkce, kimya, tarih, muzik;

        System.out.println("Matematik Notunuzu Giriniz -> ");
        mat = scanner.nextInt();
        System.out.println("Fizik Notunuzu Giriniz -> ");
        fizik = scanner.nextInt();
        System.out.println("Turkce Notunuzu Giriniz -> ");
        turkce = scanner.nextInt();
        System.out.println("Kimya Notunuzu Giriniz -> ");
        kimya = scanner.nextInt();
        System.out.println("Tarih Notunuzu Giriniz -> ");
        tarih = scanner.nextInt();
        System.out.println("Muzik Notunuzu Giriniz -> ");
        muzik = scanner.nextInt();

        int ort = (mat + fizik + turkce + kimya + muzik + tarih) / 6;

        if (ort >= 55 && ort <= 100) {
            System.out.println("Gectin!");
        }
        else if (ort < 55 && ort >= 00) {
            System.out.println("Kaldin");
        }
        else {
            System.out.println("Notunuz 0-100 arasinda olmalidir.");
        }
    }
}
