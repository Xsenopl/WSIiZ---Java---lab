import java.util.*;

public class Uczestnicy {
    int ID=0, wiek;
    String imie;

    public Uczestnicy(int ID, int wiek, String imie) {
        this.ID = ID;
        this.wiek = wiek;
        this.imie = imie;
    }

    @Override
    public String toString(){
        return "Uczestnicy { id="+ID+", imie="+imie+"\'"+wiek+"}";
    }
    @Override
    public int hashCode() {
        return Objects.hash(ID, imie, wiek);
    }
    @Override
    public boolean equals (Object ob){
        if(this==ob) return true;
        else if(!(ob instanceof Uczestnicy)) return false;
        Uczestnicy uczestnik = (Uczestnicy) ob;
        return this.getID()==uczestnik.getID() && this.getWiek()==uczestnik.getWiek() && this.getImie()==uczestnik.getImie();
    }

    public int getID() {
        return ID;
    }
    public int getWiek() {
        return wiek;
    }
    public String getImie() {
        return imie;
    }

    public static List<Uczestnicy> filtrowanie(List<Uczestnicy> li1){
        List<Uczestnicy> li2 = new ArrayList<Uczestnicy>();
        for(int i=0; i<li1.toArray().length;i++)
        {
            if(li1.get(i).getWiek()<18) {
                li2.add(li1.get(i));
                li1.remove(i);
            }else continue;
        }

        return li2;
    }





}