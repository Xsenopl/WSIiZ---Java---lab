public class SamochodOsobowy extends Samochod{
    double waga, pojemnoscSilnika;
    int iloscOsob;

    SamochodOsobowy(){
        super();
       System.out.println("Podaj kolejno: Waga[t], pojemność silnika, ilość osób. Uważaj na dane, bo będę je zmieniał!");
        waga = GoodWaga(input.nextDouble());
        pojemnoscSilnika = GoodPojemnosc(input.nextDouble());
        iloscOsob = input.nextInt();

}
    protected double GoodWaga(double w){
        if(w<2.0) return 2.0;
        if(w>4.5) return 4.5;
        return w;
    }
    protected double GoodPojemnosc(double w){
        if(w<0.8) return 0.8;
        if(w>3.0) return 3.0;
        return w;
    }

    public void opis(){
        super.opis();
        System.out.println("Podaję kolejno: waga, pojemność silnika, ilość osób");
        System.out.println(waga+", "+pojemnoscSilnika+", "+iloscOsob);
    }

}
