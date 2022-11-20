public class Student extends Osoba{
    int nr_indeksu, rok_studiow;
    String specjalnosc;



    public Student(String imie, String nazwisko, int wiek, int nr_indeksu, int rok_studiow, String specjalnosc) {
        super(imie, nazwisko, wiek);
        this.nr_indeksu = nr_indeksu;
        this.rok_studiow = rok_studiow;
        this.specjalnosc = specjalnosc;
    }
    public Student(int nr_indeksu, int rok_studiow, String specjalnosc) {
        this.nr_indeksu = nr_indeksu;
        this.rok_studiow = rok_studiow;
        this.specjalnosc = specjalnosc;
    }
    public Student(String imie, String nazwisko, int wiek, int nr_indeksu) {
        super(imie, nazwisko, wiek);
        this.nr_indeksu = nr_indeksu;
    }
    public Student(String specjalnosc) {
        this.specjalnosc = specjalnosc;
    }

    public void pokazDane(){
        super.pokazDane();
        System.out.println("indeks "+nr_indeksu+ " specjalność "+specjalnosc +" rok studiów "+rok_studiow);
    }

    public void setNr_indeksu(int nr_indeksu) {
        this.nr_indeksu = nr_indeksu;
    }

    public void setRok_studiow(int rok_studiow) {
        this.rok_studiow = rok_studiow;
    }

    public void setSpecjalnosc(String specjalnosc) {
        this.specjalnosc = specjalnosc;
    }
}
