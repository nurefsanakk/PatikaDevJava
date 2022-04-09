package HesapMakinesi;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        int secim,sayi1,sayi2;

        Scanner input = new Scanner(System.in);

        System.out.println("1. Sayi : ");
        sayi1= input.nextInt();

        System.out.println("2. Sayi : ");
        sayi2= input.nextInt();

        System.out.println("1-Toplama/n2-Cikarma/n3-Carpma/n4-Bolme/nSeçimizini Yapiniz -> ");
        secim= input.nextInt();

        switch (secim){
            case 1:
                System.out.println("Sayilarin Toplami: "+(sayi1+sayi2));
                break;
            case 2:
                System.out.println("Sayilarin Farki: "+(sayi1-sayi2));
                break;
            case 3:
                System.out.println("Sayilarin Carpimi: "+(sayi1*sayi2));
                break;
            case 4:
                System.out.println("Sayilarin Bolumu: "+(sayi1/sayi2));
                break;
            default:
                System.out.println("Hatali Giris Yaptiniz!");
                break;
        }
    }
}
