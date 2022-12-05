import java.util.InputMismatchException;
public class Adres {
    String ulica, kodPocztowy, miasto;
    int nrDomu;

    public String getUlica() {
        return ulica;
    }
    public String getKodPocztowy() {
        return kodPocztowy;
    }
    public String getMiasto() {
        return miasto;
    }
    public int getNrDomu() {
        return nrDomu;
    }
    public void wypisz(){
        System.out.println(getUlica()+getKodPocztowy()+getMiasto()+getNrDomu());
    }

    public void setUlica(String ulica) throws NieprawidlowyAdresException{
        if(ulica!=null){
            throw  new IllegalArgumentException(String.format("Ulica nie może być nullem!"));
        }

        this.ulica = ulica;
    }
    public void setKodPocztowy(String kodPocztowy) throws NieprawidlowyAdresException {
        if(kodPocztowy==null){
            throw  new IllegalArgumentException(String.format("KodPocztowy nie może być nullem!"));
        }
        this.kodPocztowy = kodPocztowy;
    }
    public void setMiasto(String miasto) throws NieprawidlowyAdresException  {
        if(miasto==null)
            throw  new IllegalArgumentException(String.format("Miasto nie może być nullem!"));
        this.miasto = miasto;
    }
    public void setNrDomu(int nrDomu) throws NieprawidlowyAdresException{
        if(nrDomu<=0) {
            throw new IllegalArgumentException(String.format("Numer domu nie może być <0"));
        }
        this.nrDomu = nrDomu;
    }

    public Adres(String ulica, String kodPocztowy, String miasto, int nrDomu) {

        //     this.setUlica(ulica);
        try {
            this.setUlica(ulica);
        } catch (NieprawidlowyAdresException e) {
        } finally {

            try {
                this.setKodPocztowy(kodPocztowy);
            } catch (NieprawidlowyAdresException e) {
            } finally {


                try {
                    this.setMiasto(miasto);
                } catch (NieprawidlowyAdresException e) {
                }

                try {
                    this.setNrDomu(nrDomu);
                } catch (NieprawidlowyAdresException e) {
                }

                //
                //

            }
        }
    }
}       //Siedzę nad tym zadaniem zdecydowanie zbyt długo. Nie mam pomysłu na wykonanie tego, a robiłem różne rzeczy.


class NieprawidlowyAdresException extends Exception {
//    public NieprawidlowyAdresException(){}
    public NieprawidlowyAdresException(String message) {
        super(message);

    }
}