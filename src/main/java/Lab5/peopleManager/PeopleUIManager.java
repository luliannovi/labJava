package Lab5.peopleManager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PeopleUIManager extends JFrame{
    private JButton previous;
    private JButton next;
    private JButton insert;
    private JButton remove;
    private JTextField textNome;
    private JTextField textCognome;
    private JTextField texteta;
    private JTextField textCF;
    private JPanel mainPanel;
    private JPanel downPanel;
    private JPanel upPanel;
    private List<People> peopleList;
    private int selectedPerson=-1;
    public PeopleUIManager(){
        super();
        setButton();

        initData();

        generateMenu();

        showPerson();

        setTitle("People Manager");
        setContentPane(mainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400,400);
        setResizable(false);
        setVisible(true);
    }
    void setButton(){
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(selectedPerson!=-1) {
                    try {
                        if (selectedPerson == (peopleList.size() - 1))
                            selectedPerson = 0;
                        else
                            selectedPerson++;
                        showPerson();
                    } catch (IndexOutOfBoundsException exception) {
                        JOptionPane.showMessageDialog(null, "ERRORE IN LETTURA");
                    }
                }
            }
        });

        previous.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(selectedPerson!=-1){
                    try {
                        if(selectedPerson == 0)
                            selectedPerson=peopleList.size()-1;
                        else
                            selectedPerson--;
                        showPerson();
                    }catch(IndexOutOfBoundsException exception){
                        JOptionPane.showMessageDialog(null, "ERRORE IN LETTURA");
                    }
                }
            }
        });

        insert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome=textNome.getText();
                String cognome=textCognome.getText();
                int eta=Integer.parseInt(texteta.getText());
                String cf=textCF.getText();
                People p=new People(nome,cognome,eta,cf);
                peopleList.add(p);
                selectedPerson++;
            }
        });

        remove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                peopleList.remove(selectedPerson);
                selectedPerson--;
                showPerson();
            }
        });
    }

    void initData(){
        peopleList=new ArrayList<>();
    }

    void initData(List<People> peopleList){
        this.peopleList=peopleList;
        selectedPerson=0;
    }

    void showPerson() {
        if (selectedPerson!=-1) {
            People p = peopleList.get(selectedPerson);
            textNome.setText(p.getName());
            textCognome.setText(p.getCognome());
            texteta.setText(Integer.toString(p.getEtà()));
            textCF.setText(p.getCodiceFiscale());
        }else{
            textNome.setText("");
            textCognome.setText("");
            texteta.setText("");
            textCF.setText("");
        }

    }

    void generateMenu(){
        JMenuItem open=new JMenuItem("Open file");
        JMenuItem save=new JMenuItem("Save file");
        JMenuItem close=new JMenuItem("Close");

        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser=new JFileChooser();
                int option = chooser.showOpenDialog(null);
                if(option == JFileChooser.APPROVE_OPTION){
                    try {
                        initData(PeopleSaver.load(chooser.getSelectedFile().toPath()));
                        showPerson();
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null,"Qualcosa è andato storto nell'apertura");
                    }
                }
            }
        });

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser=new JFileChooser();
                int option = chooser.showSaveDialog(null);
                if(option == JFileChooser.APPROVE_OPTION){
                    try {
                        PeopleSaver.save(chooser.getSelectedFile().toPath(),peopleList);
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null,"Qualcosa è andato storto nella chiusura");
                    }
                }
            }
        });

        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        JMenu file=new JMenu("File");
        file.add(open);
        file.add(save);
        file.add(close);

        JMenuBar bar=new JMenuBar();
        bar.add(file);
        this.setJMenuBar(bar);
    }
}
