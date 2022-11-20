package pak_Lab4b;

public class Kula {
    int r=0;

    public Kula(int r) {
        this.r = r;
    }

    public double Pole(){
        return 4*Math.PI*r*r;
    }
    public double Objetosc(){
        return 4*Math.PI*r*r*r/3;
    }

    public void Wyswietl_dane(){
        System.out.println("--Kula \t P= "+Pole() + "  V= "+Objetosc());
    }
}
