package Studenci;
//Nie wiem i nie znalazłem jak zaimportować klasę, która jest w src, dlatego skopiowałem co mi potrzebne
import javax.swing.*;

public class Studenci {
    public static void main(String[] args) {
        Student s1 = new Student("s");

        Student[] tstud = new Student[100];

        for(int i=0; i<100;i++){
            tstud[i] = Student.TworzStudenta();
    //        tstud[i].pokazDane();
     //       System.out.printf("\n");
        }
        tstud[0].WyswietlTab(tstud);
        tstud[0].Wprowadz_dane(tstud);
        tstud[0].Wprowadz_dane(tstud);
        tstud[0].ZmienImieDla(tstud);
        tstud[0].UsunStud(tstud);
        tstud[0].WyswietlZakres(tstud);








    }
}
