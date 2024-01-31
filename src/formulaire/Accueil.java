package formulaire;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;

public class Accueil extends JFrame implements ActionListener {

     JRadioButton r1, r2, M1, M2, M3;

    JButton nex;



    JTextField textName, textFName, textEmail, textAdd, textcity, textcontact;

    JSpinner dateChooser;



    Random ran = new Random();

    long first4 = (ran.nextLong() % 9000L) + 1000L;

    String first = " " + Math.abs(first4);

    



    Accueil(){
        super("Application Form");

       


        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setPreferredSize(new Dimension(850, 1000)); // Définir une taille plus grande pour le JPanel




        JLabel label1 = new JLabel("APPLICATION FORM No: " + first);
        label1.setBounds(160, 20, 600, 40);
        label1.setFont(new Font("Ralway", Font.BOLD, 38));
        panel.add(label1);


        JLabel label2 = new JLabel("Page 2");
        label2.setFont(new Font("Ralway", Font.BOLD, 22));
        label2.setBounds(330, 70, 600, 30);
        panel.add(label2);


        JLabel label3 = new JLabel("Ajouter une Personne");
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(290, 90, 600, 30);
        panel.add(label3);


        JLabel labelName = new JLabel("Nom: ");
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelName.setBounds(100, 190, 150, 30);
        panel.add(labelName);


        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(300, 190, 400, 30);
        panel.add(textName);

        JLabel labelfName = new JLabel("Prénom: ");
        labelfName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelfName.setBounds(100, 240, 150, 30);
        panel.add(labelfName);


        textFName = new JTextField();
        textFName.setFont(new Font("Raleway", Font.BOLD, 14));
        textFName.setBounds(300, 240, 400, 30);
        panel.add(textFName);

        JLabel labelcontact = new JLabel("Contact: ");
        labelcontact.setFont(new Font("Raleway", Font.BOLD, 20));
        labelcontact.setBounds(100, 290, 150, 30);
        panel.add(labelcontact);


        textcontact = new JTextField();
        textcontact.setFont(new Font("Raleway", Font.BOLD, 14));
        textcontact.setBounds(300, 290, 400, 30);
        panel.add(textcontact);



        


        nex = new JButton("Ajouter");
        nex.setFont(new Font("Raleway", Font.BOLD, 14));
        nex.setBackground(Color.BLACK);
        nex.setForeground(Color.WHITE);
        nex.setBounds(620, 360, 150, 30);
        nex.addActionListener(this);
        add(nex);

        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(0, 0, 850, 800);

        // Ajouter le JScrollPane au JFrame
        this.add(scrollPane);

        


        setLayout(null);
        setSize(850, 600);
        setLocation(230, 10);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    String Nom = textName.getText();
    String Prenom = textFName.getText();
    String Contact = textcontact.getText();

    try {
        Conn con1 = new Conn();
        String q1 = "SELECT * FROM personne WHERE Nom = '" + Nom + "' AND Prénom = '" + Prenom + "'";
        ResultSet rs = con1.statement.executeQuery(q1);
        if (rs.next()) {
            JOptionPane.showMessageDialog(null, "Ce nom et prénom existent déjà dans la base de données.");
        } else {
            if (textName.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Remplissez tous les champs");
            } else {
                String q2 = "INSERT INTO personne(Nom, Prénom, Contact) VALUES('" + Nom + "', '" + Prenom + "', '" + Contact + "')";
                con1.statement.executeUpdate(q2);
                setVisible(false);
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}


    public static void main(String[] args) {
        new Accueil();
    }

    public class setVisible {

        public setVisible(boolean b) {
            //TODO Auto-generated constructor stub
        }
    }
        
}
