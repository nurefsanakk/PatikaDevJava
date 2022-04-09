package DaireAlanCevre;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int yariCap,merkezAci;
        double pi =3.14,alan,cevre, dilimAlan;

        Scanner input = new Scanner(System.in);

        System.out.println("Dairenin yaricapini Giriniz -> ");
        yariCap= input.nextInt();

        System.out.println("Dairenin Merkez Aci Olcusunu Giriniz -> ");
        merkezAci= input.nextInt();

        cevre= 2*pi*yariCap;
        System.out.println("Dairenin Cevresi : "+cevre);

        alan= pi*yariCap*yariCap;
        System.out.println("Dairenin Alani : "+alan);

        dilimAlan = (pi * (yariCap*yariCap) * merkezAci) / 360;
        System.out.println("Daire Diliminin Alani : "+dilimAlan);

    }
}
