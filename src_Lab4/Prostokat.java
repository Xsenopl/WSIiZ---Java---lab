import java.util.SortedMap;

public class Prostokat {
    double dlugosc, szerokosc;

    //Alt+Insert   -  generuje
    public Prostokat() {
    }
    public Prostokat(double dlugosc, double szerokosc) {
        this.dlugosc = Math.abs(dlugosc);
        this.szerokosc = Math.abs(szerokosc);
    }
    public double Pole() {return dlugosc*szerokosc;};
    public double Obwod(){return 2*dlugosc+2*szerokosc;}
    public double Przekotna(){return Math.sqrt((Math.pow(dlugosc,2) + Math.pow(szerokosc,2) ));}
    public void Wypisz(){
        System.out.println("Prostokat o boku a: "+dlugosc+ " i boku b = "+szerokosc );
        System.out.println("Pole = "+Pole() );
        System.out.println("Obwod = "+Obwod() );
        System.out.println("Przekotna = "+Przekotna() );
    }
}