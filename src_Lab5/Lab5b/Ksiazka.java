package Lab5b;

public class Ksiazka {
    String autor, nazwa, wydawnictwo;
    int stron;
    Ksiazka ksiazka;

    public Ksiazka(String autor, String nazwa, String wydawnictwo, int stron) {
        this.autor = autor;
        this.nazwa = nazwa;
        this.wydawnictwo = wydawnictwo;
        this.stron = stron;
    }
    public  void opis(){
        System.out.println(nazwa+" "+autor+" wyd. "+wydawnictwo);
    }

}
