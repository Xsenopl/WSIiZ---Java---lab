class Trojkat extends Figura
{
    double wys=0, podst=0;

    Trojkat(double wys, double podst)
    {
        this.wys = wys;
        this.podst = podst;
    }
    Trojkat(double wys, double podst, String kolor){        //13
        super(kolor); this.wys = wys; this.podst=podst;
    }
    String opis(){
        return "Klasa Trojkat ma kolor "+kolor;
    }
}