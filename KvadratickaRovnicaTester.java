package uloha7_kvadratickaRovnica;

import java.util.Scanner;

public class KvadratickaRovnicaTester {
    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in);
        double a;
        double b;
        double c;

        System.out.print("Zadaj koeficient a: ");
        a = vstup.nextDouble();
        System.out.print("Zadaj koeficient b: ");
        b = vstup.nextDouble();
        System.out.print("Zadaj koeficient c: ");
        c = vstup.nextDouble();
        KvadratickaRovnica rovnica = new KvadratickaRovnica(a, b, c);

        boolean vysledok = rovnica.jeRiesitelna();


        if (vysledok == false) {
            System.out.println("Rovnica nema riesenie");
        } else {
            System.out.println("Rovnica ma riesenie");
            System.out.println("Rovnica ma dva korene: x1 = " + rovnica.getRiesenie1() + ", x2 = " + rovnica.getRiesenie2());
        }

        double vysledok2 = rovnica.getRiesenie3();

        if (vysledok2 != 0) {
            System.out.println("Rovnica ma jeden dvojnasobny koren: x =  " + rovnica.getRiesenie3());
        }


    }
}
