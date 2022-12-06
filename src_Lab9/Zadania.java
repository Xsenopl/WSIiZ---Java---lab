import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zadania extends JFrame{
    private JPanel JPanel1;
    private JButton sumaButton;
    private JButton różnicaButton;
    private JButton closeButton;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel Wynik;

    double LiczbaA, LiczbaB, wynik;


    public static void main(String[] args) {
        Zadania Zad3 = new Zadania();
        Zad3.setVisible(true);
    }


    public Zadania(){
        super("Moje pierwsze okiendko");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        sumaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LiczbaA = Double.parseDouble(textField1.getText());
                LiczbaB = Double.parseDouble(textField2.getText());
                wynik = LiczbaA + LiczbaB;
                Wynik.setText("Suma " + String.valueOf(LiczbaA) + " + " + String.valueOf(LiczbaB) + " = " + String.valueOf(wynik));
            }
        });
        różnicaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LiczbaA = Double.parseDouble(textField1.getText());
                LiczbaB = Double.parseDouble(textField2.getText());
                wynik = LiczbaA - LiczbaB;
                Wynik.setText("Suma " + String.valueOf(LiczbaA) + " - " + String.valueOf(LiczbaB) + " = " + String.valueOf(wynik));
            }
        });



    }
}
