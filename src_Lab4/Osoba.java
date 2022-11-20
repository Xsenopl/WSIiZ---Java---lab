public class Osoba {
    String imie, nazwisko; int wiek;

    public Osoba(){};
    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }
    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }
    public void pokazDane(){ System.out.println("Osoba "+imie+" "+nazwisko+" "+wiek+ " lat"); }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
}
