import java.util.Scanner;
public class Samochod {
    String marka, model, kolor;
    int nadwozie, rokProdukcji;
    int przebieg = 0;
    static Scanner input = new Scanner(System.in);

    Samochod(){
        System.out.println("Podaj kolejno: marka, model, kolor, nadwozie, rokProdukcji, przebieg. Uważaj na dane, bo będę je zmieniał!");
        marka = input.next();
        model = input.next();
        kolor = input.next();
        nadwozie = input.nextInt();
        rokProdukcji = input.nextInt();
        przebieg = GoodPrzebieg(input.nextInt());
    }
    public Samochod(String marka, String model, String kolor, int nadwozie, int rokProdukcji, int przebieg) {
        this.marka = marka;
        this.model = model;
        this.kolor = kolor;
        this.nadwozie = nadwozie;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = GoodPrzebieg(przebieg);
    }

    protected int GoodPrzebieg(int p){
        if(p<0) return 0;
        else return p;
    }
    public void opis(){
        System.out.println("Podaję kolejno: marka, model, kolor, nadwozie, rokProdukcji, przebieg:");
        System.out.println(marka+", "+model+", "+kolor+", "+nadwozie+", "+rokProdukcji+", "+przebieg);
    }
}
