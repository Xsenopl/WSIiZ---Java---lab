package Lab5b;

public class Podrecznik extends Ksiazka{
    String dziedzina;

    public Podrecznik(String autor, String nazwa, String wydawnictwo, int stron, String dziedzina) {
        super(autor, nazwa, wydawnictwo, stron);
        this.dziedzina = dziedzina;
    }
}
