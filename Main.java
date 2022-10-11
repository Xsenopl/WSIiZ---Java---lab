import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String imie = "Jan", miasto = "Rzeszów";
        int wiek = 24;
        //      System.out.println("Imie: "+imie+ ", miasto: "+miasto+ ", wiek: "+wiek);

        //Wczytywanie danych z klawiatury
        Scanner input = new Scanner(System.in);
        System.out.printf("Podaj wiek: ");
        wiek = input.nextInt();

        System.out.printf("Podaj imię: ");
        imie = input.next();
        System.out.println("Next " + imie);

        imie = input.next();
        System.out.println("Next pattern " + imie);

        imie = input.nextLine();
        System.out.println("NextLine " + imie);

        System.out.println(getMyName());
        System.out.println(getMyAge());
        obliczenia(1,3);
        wiek = input.nextInt();
      //  zad3(wiek);
    }

//________________________________________________________________________________
//  ___Zadanie 1___
    public static String getMyName(){
        return "Bogdan";
    }
    public static int getMyAge(){
        return 21;
    }

//  ___Zadanie 2___
    public static void obliczenia(int l1, int l2){
        System.out.println( "Suma "+ l1 +" i "+l2+ " = "+(l1+l2));
        System.out.println( "Różnica "+ l1 +" i "+l2+ " = "+(l1-l2));
        System.out.println( "Iloczyn "+ l1 +" i "+l2+ " = "+(l1*l2));
    }
//  ___Zadanie 3___
    public static boolean zad3(){
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.printf("Podaj a i b: ");
        a = input.nextInt();
        b = input.nextInt();
    return true;
    }


}
