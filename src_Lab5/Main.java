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

        System.out.println(f1.opis()+ " "+ f1.getKolor());
        System.out.println("Pr1 P = "+pr1.getPowierzchnia());

        System.out.println(pr1.punkt.getY() +" "+pr1.punkt.getY());
        pr1.przesun(3,5);                   //15
        System.out.println(pr1.punkt.getX() +" "+pr1.punkt.getY());
        System.out.println(f1.punkt.getX());
        System.out.println(t1.punkt.getY());

        Kwadrat k1 =new Kwadrat(); k1.setA(6);  //17
        //18 i 19
        System.out.println(f1.opis());
        System.out.println(pr1.opis());
        System.out.println(t1.opis());
        System.out.println(k1.opis());

        //21
        Okrag o1 = new Okrag();
        Okrag o2 = new Okrag(p3,5);
        o1.setPromien(2);
        System.out.println(o1.getPowierzcnia());
        System.out.println(o1.getPromien());
        System.out.println(o1.getSrednica());
        o1.wSrodku(p3);  o2.wSrodku(p3);

//________________________________________________________________________________
        System.out.println("\n\nZadanie 2. Z samochodami");
        Samochod sam1= new Samochod("Audi", "As","Czarny", 4,2000, -1  );
        Samochod sam2= new Samochod();
        SamochodOsobowy samo1= new SamochodOsobowy();

        sam1.opis(); sam2.opis(); samo1.opis();
    }
}