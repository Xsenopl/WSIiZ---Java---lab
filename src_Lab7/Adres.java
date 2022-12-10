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

    }
    public void setKodPocztowy(String kodPocztowy) throws NieprawidlowyAdresException {

    }
    public void setMiasto(String miasto) throws NieprawidlowyAdresException  {

    }
    public void setNrDomu(int nrDomu) throws NieprawidlowyAdresException{

    }

    public Adres(String ulica, String kodPocztowy, String miasto, int nrDomu) throws NieprawidlowyAdresException{
        String opisBledu = "";
        if (ulica == null) {
            opisBledu += "Ulica nie moze byc nullem. ";
        }
        if (kodPocztowy == null) {
            opisBledu += "Kod pocztowy nie moze byc nullem. ";
        }
        if (miasto == null) {
            opisBledu += "Miasto nie moze byc nullem.";
        }
        if (nrDomu <= 0) {
            opisBledu += "Numer domu musi być liczbą dodatnią. ";
        }
        if (!opisBledu.equals("")) {                                    //Porównuje z opisB z argumentem metody equals
            throw new NieprawidlowyAdresException(opisBledu);
        }

        this.ulica = ulica;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
        this.nrDomu = nrDomu;

    }


    @Override
    public String toString() {
        return "Adres{" +
                "ulica='" + ulica + '\'' +
                ", kodPocztowy='" + kodPocztowy + '\'' +
                ", miasto='" + miasto + '\'' +
                ", nrDomu=" + nrDomu +
                '}';
    }
}

class NieprawidlowyAdresException extends Exception {
//    public NieprawidlowyAdresException(){}
    public NieprawidlowyAdresException(String message) {
        super(message);

    }
}
