import javax.swing.*;
import java.util.*;

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
        zad4();
        zad5();
        zad6();
        zad7();

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
        System.out.println("Zad4: Napisz 5 słów: ");
        String[] zdanie = new String[5];
        wpiszString(zdanie);
 //       if(zdanie.charAt(1) == zdanie.charAt(1))
        for(int i = zdanie.length-1; i>=0;i--) {
            for (int j = zdanie[i].length() - 1; j >= 0; j--)
                System.out.print(zdanie[i].charAt(j));
            System.out.print(" ");
        }
        System.out.println();
    }


    public static void zad5_Sprawdzenie(){
        System.out.println("Zad5. Podaj ciąg liter: ");
        String slowo = input.nextLine();
        if(slowo.isEmpty()) return;
        slowo = slowo.trim();
        slowo = slowo.toLowerCase();
        for(int p =0, k=slowo.length()-1; p<slowo.length()/2+1; p++, k--){
            if(slowo.charAt(p)!=slowo.charAt(k))
            {
                System.out.println("Zad5. Słowo NIE jest palidromem.");
                return;
            }
        }
        System.out.println("Zad5. Słowo jest palidromem.");
    }

    public static void zad5(){
        System.out.println("Zad5: Napisz 8 liczb, a ja je posortuje: ");
        int[] tab = new int[8];
        wpiszInt(tab);

        Arrays.sort(tab);                           //sortuje tablicę rosnąco
        for(int i:tab){
            System.out.print(i+" ");
        }
        java.util.Arrays.fill(tab,0);           //wypełnia tablicę wartością

        System.out.println("\nZad5: Napisz 8 liczb, a ja je posortuje: ");
        wpiszInt(tab);
        for(int i = 0; i<tab.length-1;i++){
            int max = tab[i];
            for(int j=i+1; j<tab.length;j++){
                if(tab[i]>tab[j]){
                    int z = tab[i];
                    tab[i] = tab[j];
                    tab[j] = z;
                }else continue;
            }
        }
        for(int i:tab){
            System.out.print(i+" ");
        }
    }

    public static void zad6(){
        System.out.println("\nZad6: Napisz 5 liczb: ");
        int[] tab = new int[5];
        wpiszInt(tab);
      //  silnia(tab[0]);
        for(int i:tab)
        { System.out.print(i+" > "+silnia(i)+"\t");}
    }

    public static void zad7(){
        System.out.println("\nZad7: Napisz 2 razy to samo: ");
        String a = input.nextLine();
        String b = input.nextLine();
        for(int i=0; i<a.length() && i<b.length(); i++)
            if(a.charAt(i)!=b.charAt(i))
            {   System.out.println("Stringi są różne"); return;}
        System.out.println("Stringi są te same");
    }



    private static int silnia(int n){
        if(n==1||n==0) return 1;
        else return n*silnia(--n);
    }
    private static void wpiszInt(int[] tab){
        for(int i = 0; i<tab.length;i++)
            tab[i] = input.nextInt();
    }
    private static void wpiszString(String[] tab){
        for(int i = 0; i<tab.length;i++)
            tab[i] = input.next();
    }
    private static void losowanie(int[] tab){
        for(int i=0; i<tab.length; i++){
            tab[i] = generator.nextInt(10)+10;
            System.out.println(tab[i]);}
    }
}