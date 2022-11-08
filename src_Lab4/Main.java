import java.time.LocalDate;

public class Main {
    public static void main(String[] args) { System.out.println("Lab_4 Prog. Objektowe");
    Prostokat prostokat1 = new Prostokat(2,3);
    prostokat1.Wypisz();
    Prostokat prostokat2 = new Prostokat(-2,3);
    prostokat2.Wypisz();

   Budynek b1 = new Budynek("B1",1, LocalDate.of(2000,1,25));
   b1.wypiszDane();
   Budynek b2 = new Budynek("B2",2,LocalDate.of(1902,12,25));
   b2.wypiszDane();
   Budynek b3 = new Budynek("B3",3,LocalDate.of(1,1,25));
   b3.wypiszDane();
   Budynek b4 = new Budynek("B4",-4,LocalDate.of(-2000,1,25));
   b4.wypiszDane();

    }
}