package pak_Lab4b;

public class Szescian {
    int a=0;

    public Szescian(int a) {
        this.a = a;
    }

    public int Pole(){
        return a*a*6;
    }
    public int Objetosc(){
        return a*a*a;
    }
    public void Wyswietl_dane(){
        System.out.println("--Sześcian \t P= "+Pole() + "  V= "+Objetosc());
    }
}
