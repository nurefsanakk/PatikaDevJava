package KdvHesap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double tutar, kdv1= 0.18, kdv2= 0.08;
        Scanner input = new Scanner(System.in);
        System.out.println("Aldiniz Urunun Fiyatini Giriniz -> ");
        tutar= input.nextDouble();

        if(tutar>0 && tutar<1000){
            double newKdv = tutar + (tutar*kdv1);
            System.out.println(newKdv);
        }

        else if(tutar>1000){
            double newTutar= tutar + (tutar*kdv2);
            System.out.println(newTutar);
        }
        else{
            System.out.println("Düzgün bir giris yapiniz!");
        }
    }
}
