package pak_Lab4b;

public class Prostokat{
    int a=0, b=0;

    public Prostokat(int a, int b){ this.a = a; this.b = b;}

    public int Pole(){
        return a*b;
    }
    public int Obw(){
        return 2*a+2*b;
    }
    public void Wyswietl_dane(){
        System.out.println("--Prostokąt \t P= "+Pole() + "  Obw= "+Obw());
    }
}
