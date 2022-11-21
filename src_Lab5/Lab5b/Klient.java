package Lab5b;

public class Klient {
    String imie, nazwisko;
    int id;

    public Klient(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    public Klient(int id, String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.id = id;
    }
}
