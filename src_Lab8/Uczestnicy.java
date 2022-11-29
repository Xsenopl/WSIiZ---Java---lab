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
    public boolean equals (Object ob){
        if(this==ob) return true;
        else(!(ob instanceof Uczestnicy)) return false;
        Uczestnicy uczestnik = (Uczestnicy) ob;
        return getID()==uczestnik.getID() && getWiek() && Object.equals(getImie(),uczestnik.getImie());

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
}
