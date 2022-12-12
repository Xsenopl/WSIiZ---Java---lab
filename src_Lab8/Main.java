import java.util.*;

public class Main {
    public static void main(String[] args) {System.out.println("Lab 8 - Programowanie Obiektowe - Kolekcje");
       //tworzenie listy (można duplikować wartości)
        List<Object> listAnything = new ArrayList<Object>();
        List<Integer> listNumbers = new ArrayList<>();
        List<String> linkedWords = new LinkedList<String>();

        //Z jakiegoś powodu wyskakują błędy z tego kodu
 /*       listNumbers.add(2); //dodaje
      //  listNumbers.get(5); //pobiera(index)
        listNumbers.set(2,23); //dodaje na index=2 wartość 23
        listNumbers.remove(2); //usuwa(index)
*/
        //tworzenie set'a (NIE można duplikować wartości)
        Set<Object> setAnything = new HashSet<Object>();
        Set<Integer> setNumber= new LinkedHashSet<Integer>();
        Set<String> setWords= new TreeSet<String>();

//_______ZAD 1____
        List<Uczestnicy> uczestnicyLista = new ArrayList<Uczestnicy>();
        List<Uczestnicy> uczestnicy17 = new ArrayList<Uczestnicy>();
        Uczestnicy u1= new Uczestnicy(1,15,"Albert");
        Uczestnicy u2= new Uczestnicy(2,18,"Bartek");
        Uczestnicy u3= new Uczestnicy(3,20,"Celina");
        Uczestnicy u4= new Uczestnicy(4,50,"Darek");

        uczestnicyLista.add(u1);
        uczestnicyLista.add(u2);
        uczestnicyLista.add(u3);
        uczestnicyLista.add(u4);

        System.out.println(uczestnicyLista.get(1).toString());
        System.out.println(uczestnicyLista.get(1).hashCode());
        System.out.println(uczestnicyLista.get(1).equals(uczestnicyLista.get(1)));
        System.out.println(uczestnicyLista.get(1).equals(uczestnicyLista.get(2)));
        System.out.println(uczestnicyLista.get(1).equals(null));

        uczestnicy17 = Uczestnicy.filtrowanie(uczestnicyLista);
        System.out.println(uczestnicy17.get(0).toString());
 //       System.out.println(uczestnicy17.get(1).toString());
        System.out.println(uczestnicyLista.get(0).toString());
        System.out.println(uczestnicyLista.get(1).toString());
        System.out.println(uczestnicyLista.get(2).toString());

//_______ZAD 2____
        System.out.printf("\n\n Zad 2\n");
        Uczestnicy[] tab = new Uczestnicy[5];
        tab[0] = new Uczestnicy(0,5,"Ola");
        tab[1] = new Uczestnicy(1,6,"Ala");
        tab[2] = u2;
        tab[3] = u3;
        tab[4] = u4;

        List<Uczestnicy> lista = new LinkedList<Uczestnicy>();
        lista = Arrays.asList(tab);
                                                //Dwa sposoby usuwania podlisty, które znalazłem w internecie. Nie działają :(
     //   lista.subList(1,3).clear();
    //    lista.removeRange(1, 3);

        System.out.println(lista);

//_______ZAD 3____
        System.out.printf("\n\n Zad 3\n");

        List<Integer> lista1 = new ArrayList<>();
        lista1.add(1); lista1.add(2);        lista1.add(3);        lista1.add(4);        lista1.add(5);

        List<Integer> lista2 = new ArrayList<>();

        ListIterator<Integer> iterator = lista1.listIterator(lista1.size());    //Pozycja iteratora za końcem listy
        while (iterator.hasPrevious()) {                                        //Jeśli przed iteratorem coś jest
            lista2.add(iterator.previous());                                    //Zwraca co jest przed iteratorem
        }

        System.out.println(lista2); // 5, 4, 3, 2, 1




    }
}