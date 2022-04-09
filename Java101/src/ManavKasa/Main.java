package ManavKasa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double toplamTutar, armut= 2.14, elma= 3.67, domates= 1.11, muz=0.95, patlican=5.00;

        Scanner input = new Scanner(System.in);

        System.out.println("Kac kilo armut aldiniz? ");
        armut*= input.nextInt();

        System.out.println("Kac kilo elma aldiniz? ");
        elma*= input.nextInt();

        System.out.println("Kac kilo domates aldiniz? ");
        domates*= input.nextInt();

        System.out.println("Kac kilo muz aldiniz? ");
        muz*= input.nextInt();

        System.out.println("Kac kilo patlican aldiniz? ");
        patlican*= input.nextInt();

        toplamTutar=(armut+elma+domates+muz+patlican);
        System.out.println("Toplam Tutar: "+toplamTutar);



    }
}
