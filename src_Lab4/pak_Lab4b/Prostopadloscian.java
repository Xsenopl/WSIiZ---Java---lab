package pak_Lab4b;

public class Prostopadloscian {
    int a = 0, b = 0, c = 0;

    public Prostopadloscian(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int Pole() {
        return 2 * a * b + 2 * b * c + 2 * a * c;
    }

    public int Objetosc(){
        return a*b*c;
    }

    public void Wyswietl_dane(){
        System.out.println("--Prostopadłościan \t P= "+Pole() + "  V= "+Objetosc());
    }
}