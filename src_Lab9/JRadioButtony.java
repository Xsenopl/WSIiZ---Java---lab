
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JRadioButtony extends JFrame{
    public static void main(String[] args) {
        JRadioButtony zad2 = new JRadioButtony();
        zad2.setVisible(true);
    }

    private JLabel label;
    private JPanel mainPanel;
    private JRadioButton Linux;
    private JRadioButton Windows;
    private JRadioButton MacOS;
    private JButton okButton;
    private JLabel labelikonka;


    public JRadioButtony() {
        super("Przyciski Radio");
        this.setContentPane(this.mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //    this.pack();
        int width = 500, height = 500;
        this.setSize(width, height);

        ButtonGroup group = new ButtonGroup();
        group.add(Linux);
        group.add(Windows);
        group.add(MacOS);



        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String system = "";

                if (Linux.isSelected()) {
                    system = Linux.getText();
                    Icon ic = new ImageIcon("linux.png");

                    labelikonka.setIcon(ic);
                    labelikonka.setPreferredSize(new Dimension(100, 100));  //Powinno zmienić wielkość zdjęcia, ale tego nie robi
//                  mainPanel.add(new JLabel(new ImageIcon("linux.png")));        // Ponoć ma to jakoś umieścić zdjęcie w message
                }

                if (Windows.isSelected()) {
                    system = Windows.getText();
                    Icon ic = new ImageIcon("windows.png");
                    labelikonka.setPreferredSize(new Dimension(100, 100));
                    labelikonka.setIcon(ic);

                }

                if (MacOS.isSelected()) {
                    system = MacOS.getText();
                    Icon ic = new ImageIcon("apple.png");
                    labelikonka.setPreferredSize(new Dimension(100, 100));
                    labelikonka.setIcon(ic);
                }
                JOptionPane.showMessageDialog(null,"Wybrano system " + system);
            }
        });
    }








}