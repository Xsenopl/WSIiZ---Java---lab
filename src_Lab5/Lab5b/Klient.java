package Lab5b;

import java.util.ArrayList;
import java.util.List;

public class Klient {
    String imie, nazwisko;
    int id;
    List<Ksiazka> posiadane = new ArrayList<Ksiazka>();


    public Klient(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    public Klient(int id, String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.id = id;
    }
    public void DodajKsiazke(Ksiazka k){
        posiadane.add(k);
    }

    public void setId(int id) {
        this.id = id;
    }
    public void Przegladaj() {
        int i = 0;
        for (Ksiazka ksiazka : posiadane) {
            System.out.printf("\n" + i + ". ");
            ksiazka.opis();
            i++;
        }
    }
}
