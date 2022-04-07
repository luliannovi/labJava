package provaGrafica;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Prova extends JFrame implements ActionListener {
    JTextField tcel;
    JTextField tfar;
    JButton btcelfar;
    JButton btfarcel;

    public Prova() throws HeadlessException{
        super("CONVERTER");
        this.tfar = new JTextField("32");
        this.tcel = new JTextField("0");
        btcelfar=new JButton("C -> F");
        btfarcel = new JButton("F -> C");

        JPanel mainPanel=new JPanel();
        mainPanel.add(tcel);
        mainPanel.add(new JLabel("CELSIUS\n"));
        mainPanel.add(tfar);
        mainPanel.add(new JLabel("FARENHEIT"));
        mainPanel.add(btcelfar);
        mainPanel.add(btfarcel);
        btcelfar.addActionListener(this);
        btfarcel.addActionListener(this);
        setContentPane(mainPanel);
        setSize(800,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(true);
        setVisible(true);


    }

    public static void main(String[] args) {
        new Prova();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btcelfar){
            System.out.println("btcelfar");
        }else if(e.getSource() == btfarcel){
            System.out.println("btfarcel");
        }
    }
}
