package Lab5b;

public class Main {
    public static void main(String[] args) {
        Klient kl1 = new Klient("Marek", "Mata");
        Klient kl2 = new Klient("Mirek", "Meta");
        Klient kl3 = new Klient("Maciek", "Mate");
        Powiesc pow1 = new Powiesc("Harry", "Rowling", "UK", 200, "Czary");
        Podrecznik pod1 = new Podrecznik("Przyroda", "Operon", "Operon", 200, "Przyroda");

        Ksiegarnia ksiegarnia = new Ksiegarnia();
  //      ksiegarnia.NowaKsiazka();
  //      ksiegarnia.NowaKsiazka();
  //      ksiegarnia.NowaKsiazka();
        ksiegarnia.NowaKsiazka(pow1);
        ksiegarnia.NowaKsiazka(pod1);
        ksiegarnia.Przegladaj();

        ksiegarnia.Wejscie(kl1);
        System.out.printf("Klient: "+kl1.toString() +" posiada książki: ");
        kl1.Przegladaj();



    }
}
