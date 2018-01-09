/**
 * Created by bwojn on 12.11.2017.
 */
import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args)
    {
        System.out.println("Podaj numery 1 i 2:");
        Scanner inp= new Scanner(System.in);
        int numer1,numer2;
        numer1 = inp.nextInt();
        numer2 = inp.nextInt();

        System.out.println("1. Dodawanie, 2. Odejmowanie, 3. Dzielenie, 4. Mnozenie");
        int wybierz;
        wybierz = inp.nextInt();
        switch (wybierz){
            case 1:
                System.out.println("wynik to " + dodawanie( numer1,numer2));
                break;
            case 2:
                System.out.println("wynik to " + odejmowanie( numer1,numer2));
                break;
            case 3:
                System.out.println("wynik to " + mnozenie( numer1,numer2));
                break;
            case 4:
                System.out.println("wynik to " + dzielenie( numer1,numer2));
                break;
            default:
                System.out.println("Blad");


        }

    }
    public static int dodawanie(int x, int y)
    {
        int wynik = x+y;
        return wynik;
    }
    public static int odejmowanie(int x, int y)
    {
        int wynik = x-y;
        return wynik;
    }
    public static int mnozenie(int x, int y)
    {
        int wynik = x*y;
        return wynik;
    }
    public static int dzielenie(int x, int y)
    {
        int wynik = x/y;
        return wynik;
    }

}
