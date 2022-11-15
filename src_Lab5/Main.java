import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {System.out.println("Prog Objektowe - Lab 5!"); //1

        Punkt p1 = new Punkt(), p2 = new Punkt(), p3 = new Punkt(1,2); //6

        //7
        p2.setX(3); p2.setY(4);
        System.out.println("Zad 1.7: "+p2.getX() + ", "+p2.getY());
        p2.przesun(-1,-1);
        p2.opis();  p2.zeruj();

        //9
        Figura f1 = new Figura();
        Prostokat pr1 = new Prostokat(2,6);
        Trojkat t1 = new Trojkat(3,3);

        f1.opis(); System.out.println("F1 kolor = "+ f1.getKolor());
        System.out.println("Pr1 P = "+pr1.getPowierzchnia());

        pr1.przesun(1,1);
    //    System.out.printf(pr1.punkt.getY());

    }
}