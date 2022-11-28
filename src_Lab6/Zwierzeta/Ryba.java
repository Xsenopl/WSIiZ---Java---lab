package Zwierzeta;
import Transport.Plywa;

public abstract class Ryba extends Zwierze implements Plywa {

    public boolean Wydalaj(){
        return true;
    }
    public void Jedz(){System.out.println("Jem, smaczne.");}
    public void Plyn(){
        System.out.println("plyne");
    };
    public void Wynurz(){
        System.out.printf("wynurzam sie ");
    };
    public void Zanurz(){
        System.out.println("zanurzam sie ");
    };
}
