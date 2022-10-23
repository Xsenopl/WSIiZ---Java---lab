import java.util.Random;
import java.util.Scanner;
public class Lab2_zadA {
    static Scanner input = new Scanner(System.in);
    public static void zad1(){
        System.out.println("Zad1. Podaj liczbę studentów ");
        int n = input.nextInt(), i=n;
        double suma = 0;
        while(i>0){
            System.out.println("Student nr "+i+" liczba pktów: ");
            suma += input.nextInt();
            i--;
        }
        System.out.println("Średnia liczba pktów: "+(suma/n));
    }

    public static void zad2(){
        System.out.println("Zad2. Podaj 10 liczb ");
        int temp, ilM = 0, sM = 0, ilP = 0, sP = 0;
        for(int i = 0; i<10; i++){
            temp = input.nextInt();
            if(temp<0)      {ilM++;      sM +=temp;           }
            else if(temp>0) {ilP++;      sP +=temp;}
            else continue;
        }
        System.out.println("Zad2. Ujemne: ilM = "+ilM+ " sM = "+sM);
        System.out.println("Zad2. Ujemne: ilP = "+ilP+ " sP = "+sP);
    }

    public static void zad3i4(){
        System.out.println("Zad3i4. Podaj ile liczb ma być w tablicy: ");
        int n = input.nextInt(), suma = 0;
        if(n<1) {System.out.println("Zad3. złe n ");    return;}
        int[] tab = new int[n];
        tab  = zapisDoTab(tab);

        for(int i = 0; i<n; i++) {
            if(tab[i]%2==0) suma+=tab[i];
        }
        System.out.println("Zad4i4. Suma liczb parzystych= "+suma);
    }

    public static void zad5(){
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







    static int[] zapisDoTab(int[] tab){
        Random generator = new Random();
        for(int i = 0; i<tab.length; i++) {
            tab[i] = generator.nextInt(54) - 9;
        }
        return tab;
    }
}
