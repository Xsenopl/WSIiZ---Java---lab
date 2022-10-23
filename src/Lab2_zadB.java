import java.util.Scanner;

public class Lab2_zadB {
    static Scanner input = new Scanner(System.in);
    public static void zad1(){
        double a,b,c,x;
        System.out.println("Zad1: Podaj a,b, a potem c: ");
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
        System.out.println("Zad2: a(x) = ... Podaj x: ");
        System.out.println("Zad2: a(x) = "+a2(input.nextInt()));
        System.out.println("Zad2: b(x) = ... Podaj x: ");
        System.out.println("Zad2: b(x) = "+b2(input.nextInt()));
        System.out.println("Zad2: c(x) = ... Podaj x: ");
        System.out.println("Zad2: c(x) = "+c2(input.nextInt()));
    }

    public static void zad3(){
        System.out.println("Zad3: Podaj x: ");
        int x = input.nextInt();
        System.out.println("Zad3: Podaj y: ");
        int y = input.nextInt();
        System.out.println("Zad3: Podaj z: ");
        int z = input.nextInt();
        if(x<=y && x<=z){
            System.out.print("X: "+x);
            if(y<z) System.out.print("  Y: "+y +"  Z: "+z);
            else    System.out.println("  Z: "+z +"  Y: "+y);
        }
        else if(y<=x && y<=z) {
            System.out.print("Y: " + y);
            if (x < z)  System.out.print("  X: " + x + "  Z: " + z);
            else        System.out.println("  Z: " + z + "  X: " + x);
        }
        else {
            System.out.print("Z: " + z);
            if (x < y)  System.out.print("  X: " + x + "  Y: " + y);
            else        System.out.println("  Y: " + y + "  X: " + x);
        }
    }

    public static void zad4(){
        System.out.println("Zad4: Podaj czy pada i czy bus jest na przystanku: ");
        boolean pada = input.nextBoolean();
        boolean bus = input.nextBoolean();
        if(pada && bus) System.out.println("Weź parasol”, Dostaniesz się na uczelnie");
        if(pada && !bus) System.out.println("Nie dostaniesz się na uczelnię");
        if(!pada && bus) System.out.println("Dostaniesz się na uczelnie. Miłego dnia i pięknej pogody");
    }
    public static void zad5(){
        System.out.println("Zad5: Podaj czy jest zniżka i cy masz premię: ");
        boolean znizka = input.nextBoolean();
        boolean premia = input.nextBoolean();
        if(znizka || premia)  {System.out.println("Możesz kupić samochód!"); return;}
        if(!znizka || !premia){System.out.println("Zakup samochód trzeba odłożyć na później... Zniżki na samochód nie ma"); return;}
        if(!znizka || premia) {System.out.println("Możesz kupić samochód! Zniżki na samochód nie ma"); return;}
    }

    public static void zad6(){
        System.out.println("Zad6: Co robimy?\n1 - dodawanie\n2 - odejmowanie\n3 - mnożenie\n4 - dzielenie\n5 - modulo");
        switch (input.nextInt()){
            case 1: System.out.println("Będziem dodawanie"); break;
            case 2: System.out.println("Będziem odejmowanie"); break;
            case 3: System.out.println("Będziem mnożenie"); break;
            case 4: System.out.println("Będziem dzielenie"); break;
            case 5: System.out.println("Będziem modulo"); break;
            default: System.out.println("Nie określono działania"); break;
        }
    }




    public static int a2(int x)
    {
        if(x>0) {return 2*x;}
        if(x==0) {return 0;}
        if(x<0) {return -3*x;}
        return -1;
    }
    public static int b2(int x){
        if(x>=1) return x*x;
        if(x<1) return x;
        return -1;
    }
    public static int c2(int x){
        if(x>2) return 2+x;
        if(x==2) return 8;
        if(x<2) return x-4;
        return -1;
    }
}
