package NotOrtalamasi;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz-> ");
        mat = inp.nextInt();

        System.out.println("Fizik Notunuzu Giriniz-> ");
        fizik = inp.nextInt();

        System.out.println("Kimya Notunuzu Giriniz-> ");
        kimya = inp.nextInt();

        System.out.println("Turkce Notunuzu Giriniz-> ");
        turkce = inp.nextInt();

        System.out.println("Tarih Notunuzu Giriniz-> ");
        tarih = inp.nextInt();

        System.out.println("Muzik Notunuzu Giriniz-> ");
        muzik = inp.nextInt();

        double ort = (mat + fizik + kimya + turkce + tarih + muzik) / 6;
        if (ort >= 60 && ort <= 100) {
            System.out.println("Sinifi Gectin!");
        }
        else if (ort < 55 && ort >= 00) {
            System.out.println("Sinifta Kaldin!");
        }
        else {
            System.out.println("Ortalamam 0-100 arasında olmali!");
        }
    }
}
