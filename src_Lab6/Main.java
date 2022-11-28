import  Transport.*;
import  Zwierzeta.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {System.out.println("Lab 6 - Progr. Obiektowe");
        Autobus bus1 = new Autobus();
        Samochod auto1 = new Samochod();
        Samolot sam1 = new Samolot();
        Statek st1 = new Statek();

        bus1.Jedzie();
        auto1.Jedzie();
         sam1.Lata();
         st1.Plywa();

        Wieloryb w1 = new Wieloryb();
        Wielorybia(w1);
        Tunczyk t1 = new Tunczyk();
        System.out.printf("\n\nT1 będzie jadł\n");
        t1.Jedz();
        System.out.printf("A czy wydalił potem to jedzenie?\t- "+t1.Wydalaj() );









    }

    public static void Wielorybia(Wieloryb w1){
        w1.setGtunek("wieloryb"); w1.setMasa(30000);
        System.out.println("Opowiem o pewnym wielorybie, który ma na imię W1. \t");
        System.out.println("W1 pływał w oceanie. Krzyczał \t");
        w1.Plyn();
        System.out.println("Ale zabrakło mu tlenu, więc się wynurzył \t");
        w1.Wynurz();
        System.out.println("Po zaczerpnięciu tlenu, W1 zanurzył się z powrotem\t");
        w1.Zanurz();


        };


}