import java.util.Scanner;

public class Lab2_zad {
    public static void zad1(){
        Scanner input = new Scanner(System.in);
        System.out.println("Zad1. Podaj liczbę studentów");
        int n = input.nextInt(), i=n;
        double suma = 0;
        while(i>0){
            System.out.println("Student nr "+i+" liczba pktów: ");
            suma += input.nextInt();
            i--;
        }
        System.out.println("Średnia liczba pktów: "+(suma/n));
    }



}
