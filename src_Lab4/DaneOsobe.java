import java.util.Scanner;

public class DaneOsobe {
    Osoba o1 = new Osoba();
    Osoba o2 = new Osoba("Zad1a",15);
    Osoba o3 = new Osoba("Zad1b", "Hoho", 16);

    public void DaneOsobaMain(){
         o1.pokazDane(); o2.pokazDane(); o3.pokazDane();
    }

    public static void main(String[] args) {
        Student s1 = new Student("IT");
        System.out.println("Podaj kolejno: Imię \t Nazwisko \t Wiek \t Nr_indeksu \t rok_studiów \t specjalizację");
        Scanner input = new Scanner(System.in);
        s1.setImie(input.next());
        s1.setNazwisko(input.next());
        s1.setWiek(input.nextInt());
        s1.setNr_indeksu(input.nextInt());
        s1.setRok_studiow(input.nextInt());
        s1.setSpecjalnosc(input.next());

        s1.pokazDane();


    }
}
