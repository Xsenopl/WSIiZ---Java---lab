package Lab5b;
import java.util.Scanner;

public class Ksiazka {
    private static Scanner input = new Scanner(System.in);
    String autor, nazwa, wydawnictwo;
    int stron;
    Ksiazka ksiazka;

    public Ksiazka(){
        System.out.printf("Podaj kolejno: nazwa, autor, wydawnictwo, ilość_stron: \n");
        nazwa = input.next();    autor = input.next();   wydawnictwo = input.next();   stron = input.nextInt();
    }
    public Ksiazka(String nazwa, String autor, String wydawnictwo, int stron) {
        this.autor = autor;
        this.nazwa = nazwa;
        this.wydawnictwo = wydawnictwo;
        this.stron = stron;
    }


    public  void opis(){
        System.out.println(nazwa+" "+autor+" wyd. "+wydawnictwo);
    }

}
