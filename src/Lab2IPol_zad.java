import jdk.jshell.Snippet;
import java.util.Scanner;
import java.util.SortedMap;

public class Lab2IPol_zad {
    public static void zad1(){
        double a,b,c,x;
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj a,b, a potem c: ");
        a= input.nextDouble();
        b= input.nextDouble();
        c= input.nextDouble();
        double delta = b*b-4*a*c;

        if(delta>0){
            delta = Math.sqrt(delta);
            x = (-b+delta)/2*a;
            System.out.println("x1 = "+x);
            x = (-b-delta)/2*a;
            System.out.println("x2 = "+x);
        }
        else if(delta==0){
            x = -b/2*a;
            System.out.println("x = "+x);
        }
        else {
            System.out.println("Brak pierwsiastów. Delta<0");
        }
    }

    public static void zad2(){

    }

}
