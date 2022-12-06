import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIExample  extends JFrame{
    private JPanel JPanel1;
    private JButton okButton1;
    private JButton closeButton;
    private JFormattedTextField formattedTextField1;

    public static void main(String[] args) {
        GUIExample Example1 = new GUIExample();
        Example1.setVisible(true);
    }

    public GUIExample(){
        super("Moje okno");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.pack();
        int width = 300, height = 300;
        this.setSize(width, height);


        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        okButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello");
            }
        });
    }
}
