import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lab 7 - Programowanie obiektowe - obsługa wyjątków");
        Scanner input = new Scanner(System.in);
        double userinput = 0d;
        System.out.println("Podaj liczbę ");
        while (true) {
            try {
                userinput = input.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Podaj poprawną liczbę!");
                input.next();
            }
        }//koniec while
        if (userinput < 0) {
            throw new IllegalArgumentException(String.format("pierwiastek kwadratowy " + " z  liczby rzeczywistej %.4f nie istnieje!", userinput));
        }
        System.out.println(String.format("Pierwiastek z %.4f = %.4f", userinput, Math.sqrt(userinput)));

    //ZAD 2___________
        try {
            System.out.println("5! = " + silnia(5));
            System.out.println("-2! = " + silnia(-2));
        } catch (BlednaWartoscDlaSilniExeption e) {
            System.out.println("Błąd " + e.getMessage());
        }

    //ZAD 3___________
        System.out.println("\n\n Zad 3 ");
        Adres a1 = new Adres("ul", "poczta", "Rze", 32);
        a1.wypisz();
        Adres a2 = new Adres("nuill", null, "", -6);
        a2.wypisz();

    }

    public static int silnia(int n) throws BlednaWartoscDlaSilniExeption {
        if (n < 0) {
            throw new BlednaWartoscDlaSilniExeption("Silnia nie jest liczona z wartości <0");
        }//koniec if'a
        int wynik = 1;
        for (int i = 2; i <= n; i++) {
            wynik *= i;
        }
        return wynik;
    }//koniec metody z throwem








}//koniec klasy Main


//klasa z obsługą błędu
class BlednaWartoscDlaSilniExeption extends Exception {
    public BlednaWartoscDlaSilniExeption(String message) {
        super(message);
    }
}