import java.util.Random;
import java.util.Scanner;

public class Main {
    static Random generator = new Random();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {System.out.println("Lab3 - Prog. Objektowe - tablice");

        int[] tab = new int[10], tab1 = {3,1,2,5,31,2,55};
        losowanie(tab);
        zad1(tab);
        zad2(tab); zad2(tab1);
        String[] zad3 = {"Ala", "miała", "KoTa"};
        zad3(zad3);

    }
    public static void zad1(int[] tab){
        int suma=0;
        double srednia=0;

        for(int i=0; i<tab.length; i++){
            suma += tab[i];
        }
        srednia = suma/tab.length;
        System.out.println("Zad1: Suma="+suma+"  Średnia="+srednia);
        suma=0;
        for(int i:tab){
            suma+=i;
        }
        srednia = suma/tab.length;
        System.out.println("Zad1: Suma="+suma+"  Średnia="+srednia);
    }

    public static void zad2(int[] tab){
        System.out.println("Zad2: ");
        for (int i=0; i<tab.length; i+=2) {
            System.out.println(tab[i]);
        }
    }

    public static void zad3(String[] yu){
        System.out.print("Zad3: ");
        for(String i:yu){
            System.out.print(i.toUpperCase()+" ");
        }
        System.out.println(" ");
    }

    public static void zad4(){
        String[] zdanie = new String[5];
        for(int i = 0; i<zdanie.length;i++)
        zdanie[i] = input.nextLine();
    }











    private static void losowanie(int[] tab){
        for(int i=0; i<tab.length; i++){
            tab[i] = generator.nextInt(10)+10;
            System.out.println(tab[i]);}
    }
}