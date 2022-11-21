package Lab5b;

public class Powiesc extends Ksiazka{
    String gatunek;

    public Powiesc(String autor, String nazwa, String wydawnictwo, int stron, String gatunek) {
        super(autor, nazwa, wydawnictwo, stron);
        this.gatunek = gatunek;
    }
}
