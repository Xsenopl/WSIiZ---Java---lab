public class Gatunek {
    String nrodzaju, ngatunku, opis;
    int lpChromosomow2n, lpChomosomowX;

    public Gatunek(String nrodzaju, String ngatunku, String opis, int lpChromosomow2n, int lpChomosomowX) {
        this.nrodzaju = nrodzaju;
        this.ngatunku = ngatunku;
        this.opis = opis;
        this.lpChromosomow2n = lpChromosomow2n;
        this.lpChomosomowX = lpChomosomowX;
    }
    public void setNrodzaju(String nrodzaju) {
        this.nrodzaju = nrodzaju;
    }

    public void PodajNazwy(String ngatunku, String nrodzaju) {
        this.nrodzaju = nrodzaju;
        this.ngatunku = ngatunku;
    }
    public void Podaj2n(int lpChromosomow2n){ this.lpChromosomow2n = 2*lpChromosomow2n;}
}
