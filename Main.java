import java.util.Random;
import java.util.Scanner;
import java.util.function.IntToDoubleFunction;

public class Main {
    public static void main(String[] args)
    {
        String imie = "Jan", miasto = "Rzeszów";
        int wiek = 24;
        //      System.out.println("Imie: "+imie+ ", miasto: "+miasto+ ", wiek: "+wiek);



                                                    //______Wczytywanie danych z klawiatury
        Scanner input = new Scanner(System.in);
        System.out.printf("Podaj wiek: ");
        wiek = input.nextInt();

/*
        System.out.printf("Podaj imię: ");
        imie = input.next();
        System.out.println("Next " + imie);

        imie = input.next();
        System.out.println("Next pattern " + imie);

        imie = input.nextLine();
        System.out.println("NextLine " + imie);
*/


        System.out.println(getMyName());
        System.out.println(getMyAge());
        System.out.println("Podaj dwie liczby: ");
        int a, b;
        a = input.nextInt();    b = input.nextInt();
        obliczenia(a,b);
        System.out.println("Zad 3: "+zad3(a));
        System.out.println("Zad 4: "+zad4(a));
        System.out.println("Zad 5: "+zad5((double)a));
        System.out.println("Zad 6: "+zad6((double)a));
        System.out.println("Podaj dwie liczby, z których przedziału będzie program losował do zadania 7: ");
        a = input.nextInt();    b = input.nextInt();
        Random generator = new Random();
        int x = generator.nextInt(b-a)+a;
        int y = generator.nextInt(b-a)+a;
        int z = generator.nextInt(b-a)+a;
        System.out.println("Zad 7: "+zad7(x,y,z));
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
    public static boolean zad3(int a){
        if(a%2==0){
            return true;
        }
        else return false;
    }
    public static boolean zad4(int a) {
        if(a%3==0 && a%5==0){
            return true;
        }
        else return false;
    }
    public static double zad5(double a){
        a=Math.pow(a,3);
        return a;
    }
    public static double zad6(double a){
        a=Math.sqrt(a);
        return a;
    }
    //___Zadanie 7___
    public static boolean zad7(int x,int y,int z){
        if(x*x==y*y+z*z && x*x+y*y==z*z && x*x+z*z==y*y)
            return true;
        else return false;
    } 
}
