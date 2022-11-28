package Lab5b;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Objects;

public class Ksiegarnia {
    static Scanner input = new Scanner(System.in);
    String nazwa;
//    Powiesc[] powiosci = new Powiesc[20];
 //   Podrecznik[] podreczniki = new Podrecznik[20];
    List<Ksiazka> ksiazki = new ArrayList<Ksiazka>(20);
    Klient[] klienci = new Klient[20];
 //   private T typ;


    public void Wejscie(Klient k){
        System.out.printf("Dzień dobry "+k.imie +" "+k.nazwisko+".\n");
        System.out.printf("Jaką chcesz książkę z dostępnych - podaj numer?\n");
        System.out.printf("0. Wyjdź.\n");
        Przegladaj();
        int wybor = input.nextInt();
        if(wybor == -1) {
            System.out.printf("Żegnamy\n"); return;
        }
        else k.DodajKsiazke(ksiazki.get(wybor));
    }

    public void NowaKsiazka(){
        System.out.printf("Jaką chcesz książkę dodać?\n 1 - Powieść \t 2 - Podręcznik \t");
        if(input.nextInt()==1){
            ksiazki.add(new Powiesc());
        }
        else  ksiazki.add(new Podrecznik());
    }

    public void NowaKsiazka(Ksiazka k) {
        ksiazki.add(k);
    }
    public void Przegladaj(){
        int i=0;
        for(Ksiazka ksiazka : ksiazki) {
            System.out.printf("\n"+ i + ". ");
            ksiazka.opis();
            i++;
        }
    }



}




