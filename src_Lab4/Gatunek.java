import javax.swing.*;

public class Gatunek {
    String nrodzaju, ngatunku, opis;
    int lpChromosomow2n, lpChomosomowX;     //nie za bardzo rozumiem, jak mam się poruszać wśród tych chromosomów

    public Gatunek(){}
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
    public void setNgatunku(String ngatunku) {
        this.ngatunku = ngatunku;
    }
    public void setNazwy(String ngatunku, String nrodzaju) {
        this.nrodzaju = nrodzaju;
        this.ngatunku = ngatunku;
    }
    public void set1n(int lpChromosomow2n){ this.lpChromosomow2n = 2*lpChromosomow2n;}

    public void getNrodzaju(){
        System.out.println("Nazwa rodzaju: "+nrodzaju);
    }
    public void getNgatunku(){
        System.out.println("Nazwa gatunku: "+ngatunku);
    }
    public void getChapChrom(){
        System.out.println("Lp. chromosomów (1n): "+lpChromosomow2n/2);
    }
    public void getRodzajIGat(){
        getNrodzaju(); getNgatunku();
    }
    public void getWszystko(){
        getRodzajIGat(); getChapChrom();
        System.out.println("Lp. chromosomów X = "+lpChomosomowX+ " Opis: "+opis);
    }

    public Gatunek kopiaObj(Gatunek G){
        Gatunek g = new Gatunek(G.nrodzaju, G.ngatunku, G.opis, G.lpChromosomow2n, G.lpChomosomowX);
        return g;
    }
}