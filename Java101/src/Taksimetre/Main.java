package Taksimetre;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        int km, acilisUcreti=10;
        double perKm= 2.20, total;

        Scanner input = new Scanner(System.in);

        System.out.println("Gideceginiz mesafeyi KM cinsinden giriniz-> ");
        km = input.nextInt();

        total = (km* perKm) + acilisUcreti;

        total = (total<20) ? 20 : total;
        System.out.println("Odenecek Tutar "+total+" TL!");


    }
}
