package uloha7_kvadratickaRovnica;

/**
 * trieda KvadratickaRovnica, ktora obsahuje premenne a, b, c, d
 */
public class KvadratickaRovnica {

    public double a;
    public double b;
    public double c;
    public double d;


    /**
     * vytvori novy objekt KvadratickaRovnica s koeficientami a, b, c, ktore zada uzivatel a vypocita diskriminant
     * @param a koeficient rovnice
     * @param b koeficient rovnice
     * @param c koeficient rovnice
     */
    public KvadratickaRovnica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = (b * b) - 4 * (a * c);

    }

    /**
     * metoda zisti, ci je rovnica riesitelna
     * @return true alebo false
     */
    public boolean jeRiesitelna() {
        d = (b * b) - 4 * (a * c);
        if (d < 0) {
            return false;

        } else
            return true;
    }

    /**
     * metoda vypocita prvy koren rovnice
     * @return prvy koren rovnice
     */
    public double getRiesenie1() {
        double x1 = 0;
        if (d > 0) {
            x1 = (-b - Math.sqrt(d)) / (a * 2);
        }
        return x1;
    }

    /**
     * metoda vypocita druhy koren rovnice
     * @return druhy koren rovnice
     */
    public double getRiesenie2() {

        double x2 = 0;
        if (d > 0) {
            x2 = (-b + Math.sqrt(d)) / (a * 2);
        }
        return x2;
    }

    /**
     * metoda vypocita dvojnasobny koren rovnice
     * @return dvojnasobny koren rovnice
     */
    public double getRiesenie3() {
        double x = 0;
        if (d == 0) {
            x = (-b + Math.sqrt(d)) / (a * 2);
        }
        return x;

    }


}
