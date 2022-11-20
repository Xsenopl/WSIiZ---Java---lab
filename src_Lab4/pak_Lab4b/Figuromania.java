package pak_Lab4b;

public class Figuromania {
    public static void main(String[] args) {
        Kwadrat kw1 = new Kwadrat(5);
        Prostokat pr1 = new Prostokat(5, 5);
        Kolo ko1 = new Kolo(5);
        Szescian sz1 = new Szescian(5);
        Prostopadloscian pros1 = new Prostopadloscian(5,5,5);
        Kula ku1 = new Kula(5);
        Stozek st1 = new Stozek(5, 5);


        kw1.Wyswietl_dane();
        pr1.Wyswietl_dane();
        ko1.Wyswietl_dane();
        sz1.Wyswietl_dane();
        pros1.Wyswietl_dane();
        ku1.Wyswietl_dane();
        st1.Wyswietl_dane();


    }
}
