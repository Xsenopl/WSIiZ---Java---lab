class Prostokat extends Figura {
    double wys=0, szer=0;

    Prostokat(){}
    Prostokat(double wys,double szer){
        this.wys = wys;
        this.szer = szer;
    }
    Prostokat(double wys, double szer, String kolor){       //12
        super(kolor) ;
        this.wys=wys; this.szer=szer;
    }

    public double getPowierzchnia() {
        return (szer * wys);
    }
    public void przesun(float x, float y){  //14
        punkt.przesun(x,y);
    }
    String opis(){
        return "Klasa Prostokąt ma kolor "+kolor;
    }

}