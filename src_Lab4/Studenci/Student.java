package Studenci;
import java.util.Scanner;
public class Student extends Osoba {
    private static Scanner input = new Scanner(System.in);
    int nr_indeksu, rok_studiow;
    String specjalnosc;



    public Student(String imie, String nazwisko, int wiek, int nr_indeksu, int rok_studiow, String specjalnosc) {
        super(imie, nazwisko, wiek);
        this.nr_indeksu = nr_indeksu;
        this.rok_studiow = rok_studiow;
        this.specjalnosc = specjalnosc;
    }
    public Student(int nr_indeksu, int rok_studiow, String specjalnosc) {
        this.nr_indeksu = nr_indeksu;
        this.rok_studiow = rok_studiow;
        this.specjalnosc = specjalnosc;
    }
    public Student(String imie, String nazwisko, int wiek, int nr_indeksu) {
        super(imie, nazwisko, wiek);
        this.nr_indeksu = nr_indeksu;
    }
    public Student(String specjalnosc) {
        this.specjalnosc = specjalnosc;
    }

    public void pokazDane(){
        super.pokazDane();
        System.out.println("indeks "+nr_indeksu+ " specjalność "+specjalnosc +" rok studiów "+rok_studiow);
    }

    public void setNr_indeksu(int nr_indeksu) {
        this.nr_indeksu = nr_indeksu;
    }

    public void setRok_studiow(int rok_studiow) {
        this.rok_studiow = rok_studiow;
    }

    public void setSpecjalnosc(String specjalnosc) {
        this.specjalnosc = specjalnosc;
    }

    public static Student TworzStudenta(){
        return new Student("","",0,0,0,"");
    }
    public void  Wprowadz_dane(Student[] tab){

        System.out.println("Podaj miejsce w tablicy od 0 do 99, który chc3esz wprowadzić: ");
        int msc = input.nextInt();
        System.out.println("Podaj kolejno: Imię \t Nazwisko \t Wiek \t Nr_indeksu \t rok_studiów \t specjalizację");
        tab[msc].setImie(input.next());
        tab[msc].setNazwisko(input.next());
        tab[msc].setWiek(input.nextInt());
        tab[msc].setNr_indeksu(input.nextInt());
        tab[msc].setRok_studiow(input.nextInt());
        tab[msc].setSpecjalnosc(input.next());
    }
    public void ZmienImieDla(Student[] tab)
    {
        System.out.println("Podaj miejsce w tablicy od 0 do 99, któremu chcesz zmienić imie: "); //i tą metodę właściwie możnaby było powielać dla reszty pól (nazwiska itd)
        int msc = input.nextInt();
        System.out.println("Podaj Imię ");
        tab[msc].setImie(input.next());
    }
    public void UsunStud(Student[] tab){
        System.out.println("Podaj miejsce w tablicy od 0 do 99, który chc3esz usunąć: ");
        int msc = input.nextInt();
        tab[msc].setImie("");
        tab[msc].setNazwisko("");
        tab[msc].setWiek(0);
        tab[msc].setNr_indeksu(0);
        tab[msc].setRok_studiow(0);
        tab[msc].setSpecjalnosc("");
        System.out.println("Student Usunięty ");
    }
    public void WyswietlTab(Student[] tab) {
        for(int i=0; i<tab.length;i++){
            tab[i].pokazDane();
        }
    }
    public void WyswietlZakres(Student[] tab){
        System.out.println("Podaj start i koniec zakresu do podania (min=0, max=99)");
        int start = input.nextInt();
        int kon = input.nextInt();
        for(int i=start; i<kon;i++){
            tab[i].pokazDane();
        }

    }
}

