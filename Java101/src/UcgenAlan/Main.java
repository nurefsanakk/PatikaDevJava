package UcgenAlan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int a,b,c;
        double u, alan,cevre;
        Scanner input = new Scanner(System.in);

        System.out.println("Ilk kenarin uzunlugunu giriniz-> ");
        a = input.nextInt();

        System.out.println("Ikinci kenarin uzunlugunu giriniz-> ");
        b = input.nextInt();

        System.out.println("Ucuncu kenarin uzunlugunu giriniz-> ");
        c = input.nextInt();

        u = (a+b+c)/ 2;
        cevre = u*(2.0);
        System.out.println("Cevre: "+ cevre);
        alan = Math.sqrt(u * ( u - a ) * (u - b) * (u - c));
        System.out.println("Alan:"+ alan);





    }
}
