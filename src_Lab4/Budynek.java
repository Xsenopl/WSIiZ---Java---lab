import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Budynek {
    String nazwa;
    int lpPieter;
    LocalDate rokBudowy;

    public Budynek(String nazwa, int lpPieter, LocalDate rokBudowy) {
        this.nazwa = nazwa;
        this.lpPieter = lpPieter;
        this.rokBudowy = rokBudowy;
    }

    public void setNazwa(String nazwa) {this.nazwa = nazwa; }

    public long getIleLat(){
        LocalDate today = LocalDate.now();
        long ileLat = ChronoUnit.YEARS.between(rokBudowy,today);
        return ileLat;
    }
    public void wypiszDane(){
        System.out.println("Nazwa "+nazwa+ " pięter "+lpPieter+"\nRok budowy: "+rokBudowy+ " Lat ma "+getIleLat());
    }



}