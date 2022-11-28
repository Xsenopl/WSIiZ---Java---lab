package Lab5b;
import java.util.Scanner;

public class Podrecznik extends Ksiazka{
    static Scanner input = new Scanner(System.in);
    String dziedzina;

    public Podrecznik(){
        super();
        System.out.printf("Podaj dziedzinę: ");     dziedzina = input.next();
    }
    public Podrecznik(String autor, String nazwa, String wydawnictwo, int stron, String dziedzina) {
        super(nazwa, autor, wydawnictwo, stron);
        this.dziedzina = dziedzina;
    }
}
