import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIExample2 extends JFrame {

    private JPanel JPanel1;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JButton okButton;
    private JButton closeButton;

    public static void main(String[] args) {
        Zadania Zad3 = new Zadania();
        Zad3.setVisible(true);
    }


    public Zadania(){
        super("Moje pierwsze okiendko");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //    this.pack();
        int width = 300, height = 300;
        this.setSize(width, height);

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });


}
