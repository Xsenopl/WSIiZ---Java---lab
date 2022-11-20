package pak_Lab4b;

public class Stozek {
    int r=0, h=0;

    public Stozek(int r, int h) {
        this.r = r;
        this.h = h;
    }

    public double Pole(){
        return Math.PI*r*r + Math.PI*r*h;
    }
    public double Objetosc(){
        return Math.PI*r*r/3*h;
    }

    public void Wyswietl_dane(){
        System.out.println("--Stożek \t P= "+Pole() + " V= "+Objetosc());
    }
}
