package pak_Lab4b;

public class Kolo {
    int r=0;

    public Kolo(int r) {
        this.r = r;
    }

    public double Pole(){
        return Math.PI*r*r;
    }
    public double Obw(){
        return 2*Math.PI*r;
    }
    public void Wyswietl_dane(){
        System.out.println("--Koło \t P= "+Pole() + "  Obw= "+Obw());
    }

}
