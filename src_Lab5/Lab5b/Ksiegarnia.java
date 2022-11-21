package Lab5b;
import java.util.Scanner;
import java.util.Objects;

public class Ksiegarnia {
    static Scanner input = new Scanner(System.in);
    String nazwa;
    Powiesc[] powiosci = new Powiesc[20];
    Podrecznik[] podreczniki = new Podrecznik[20];
    Klient[] klienci = new Klient[20];
 //   private T typ;


    public void Wejscie(Klient k){
        System.out.printf("Dzień dobry "+k.imie +" "+k.nazwisko+".\n");
        System.out.printf("Jaką chcesz książkę z dostępnych?");



    }
    //public void Przegladaj(FancyBox<?> tab){

    }



}
