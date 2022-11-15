import java.security.PublicKey;

public class Okrag {
    Punkt srodek = new Punkt();
    double promien = 5;

    Okrag(){ srodek.zeruj(); }
    Okrag(Punkt p, double pr)       {this.srodek = p; this.promien = pr;}

    public double getPowierzcnia()  {return Math.PI *promien*promien;}
    public double getSrednica()     {return promien*2;}
    public double getPromien()      {return promien;}
    public void setPromien(double p){this.promien = p;}
    public void wSrodku(Punkt p) {
        if (Math.pow(srodek.getX() - p.getX(), 2) + Math.pow(srodek.getY() - p.getY(), 2) <= (promien * promien))
            System.out.println("Pubnkt " + p.getX() + "," + p.getY() + "znajduje się wewnątrz okręgu");
        else
            System.out.println("Pubnkt " + p.getX() + "," + p.getY() + "nie znajduje się wewnątrz okręgu");
    }

}
