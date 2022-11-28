package Lab5b;
import java.util.Scanner;

public class Powiesc extends Ksiazka{
    static Scanner input = new Scanner(System.in);
    String gatunek;

    public Powiesc(){
        super();
        System.out.printf("Podaj gatunek: ");     gatunek = input.next();
    }
    public Powiesc(String autor, String nazwa, String wydawnictwo, int stron, String gatunek) {
        super(nazwa, autor, wydawnictwo, stron);
        this.gatunek = gatunek;
    }
}
