import java.time.LocalDate;

public class Main {
    public static void main(String[] args) { System.out.println("Lab_4 Prog. Objektowe");
 /*     //zad1
        Prostokat prostokat1 = new Prostokat(2,3);
        prostokat1.Wypisz();
        Prostokat prostokat2 = new Prostokat(-2,3);
        prostokat2.Wypisz();

        System.out.println("\n");   //zad2
        Budynek b1 = new Budynek("B1",1, LocalDate.of(2000,1,25));
        b1.wypiszDane();
        Budynek b2 = new Budynek("B2",2,LocalDate.of(1902,12,25));
        b2.wypiszDane();
        Budynek b3 = new Budynek("B3",3,LocalDate.of(1,1,25));
        b3.wypiszDane();
        Budynek b4 = new Budynek("B4",-4,LocalDate.of(-2000,1,25));
        b4.wypiszDane();

        System.out.println("\n");   //zad3
        Gatunek g1 = new Gatunek("płaz","żaba1","Bardzo ładna", 24,2);
        g1.getWszystko();
        g1.set1n(20); g1.setNazwy("płazik", "żabol1");
        g1.getWszystko();
        Gatunek g2;
        g2 = g1.kopiaObj(g1);

        g1.set1n(6);
        System.out.printf("\n\n");
        g1.getWszystko();
        g2.getWszystko();
  */
        //zad1
        DaneOsobe do1 = new DaneOsobe();
        do1.DaneOsobaMain();

        System.out.println("\n");   //zad2
        Student s1 = new Student("Jan","Kowal", 20,1111,1,"IoT");
        Student s2 = new Student(2222, 2, "ToI");
        Student s3 = new Student("Paweł","Nowak", 23,3333);
        Student s4 = new Student("BD");

        s1.pokazDane(); s2.pokazDane(); s3.pokazDane(); s4.pokazDane();

        System.out.println("Zad 3 z drugiej części jest w klasie DaneOsobe \n");   //zad3          --- W klasie DaneOsoba

    }



}