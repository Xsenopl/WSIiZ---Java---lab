import java.util.*;

public class Main {
    public static void main(String[] args) {System.out.println("Lab 8 - Programowanie Obiektowe - Kolekcje");
        //tworzenie listy (można duplikować wartości)
        List<Object> listAnything = new ArrayList<Object>();
        List<Integer> listNumbers = new ArrayList<>();
        List<String> linkedWords = new LinkedList<String>();

        listNumbers.add(2); //dodaje
        listNumbers.get(5); //pobiera(index)
        listNumbers.set(2,23); //dodaje na index=2 wartość 23
        listNumbers.remove(2); //usuwa(index)

        //tworzenie set'a (NIE można duplikować wartości)
        Set<Object> setAnything = new HashSet<Object>();
        Set<Integer> setNumber= new LinkedHashSet<Integer>();
        Set<String> setWords= new TreeSet<String>();



    } // NIedokończone, bo męczyłem się nad wyjątkami.
}
