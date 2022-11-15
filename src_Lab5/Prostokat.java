class Prostokat extends Figura {
    double wys=0, szer=0;

    Prostokat(double wys,double szer){
        this.wys = wys;
        this.szer = szer;
    }
    Prostokat(double wys, double szer, String kolor){
        super(kolor) ;
        this.wys=wys; this.szer=szer;
    }

    public double getPowierzchnia() {
        return (szer * wys);
    }
    public void przesun(float x, float y){
        punkt.przesun(x,y);
    }


}
