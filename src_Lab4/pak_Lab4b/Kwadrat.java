package pak_Lab4b;

public class Kwadrat {
    int a=0;

    public Kwadrat(){}
    public Kwadrat(int a) { this.a = a;}

    public int Pole(){
        return a*a;
    }
    public int Obw(){
        return 4*a;
    }
    public void Wyswietl_dane(){
        System.out.println("--Kwadrat \t P= "+Pole() + "  Obw= "+Obw());
    }

}
