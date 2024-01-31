package formulaire;



//import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;

public class Form  extends JFrame implements ActionListener {
    JRadioButton r1, r2, M1, M2, M3;

    JButton next;



    JTextField textName, textFName, textEmail, textAdd, textcity, textpin;

    JSpinner dateChooser;



    Random ran = new Random();

    long first4 = (ran.nextLong() % 9000L) + 1000L;

    String first = " " + Math.abs(first4);


    Form(){


       
        

        super("Application Form");


        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setPreferredSize(new Dimension(850, 1000)); // Définir une taille plus grande pour le JPanel




        JLabel label1 = new JLabel("APPLICATION FORM No: " + first);
        label1.setBounds(160, 20, 600, 40);
        label1.setFont(new Font("Ralway", Font.BOLD, 38));
        panel.add(label1);


        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Ralway", Font.BOLD, 22));
        label2.setBounds(330, 70, 600, 30);
        panel.add(label2);


        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(290, 90, 600, 30);
        panel.add(label3);


        JLabel labelName = new JLabel("Username: ");
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelName.setBounds(100, 190, 150, 30);
        panel.add(labelName);


        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(300, 190, 400, 30);
        panel.add(textName);

        JLabel labelfName = new JLabel("Password: ");
        labelfName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelfName.setBounds(100, 240, 150, 30);
        panel.add(labelfName);


        textFName = new JTextField();
        textFName.setFont(new Font("Raleway", Font.BOLD, 14));
        textFName.setBounds(300, 240, 400, 30);
        panel.add(textFName);



        // JLabel DOB = new JLabel("Date of Birth: ");
        // DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        // DOB.setBounds(100, 340, 200, 30);
        // panel.add(DOB);


        // SpinnerDateModel model = new SpinnerDateModel(new Date(), null, null, Calendar.DAY_OF_MONTH);
        // dateChooser = new JSpinner(model); 


        // JSpinner.DateEditor editor = new JSpinner.DateEditor(dateChooser, "dd/MM/yyyy");
        // dateChooser.setEditor(editor);
        // dateChooser.setForeground(new Color(105, 105, 105));
        // dateChooser.setBounds(300, 340, 400, 30);
        // panel.add(dateChooser);



        // JLabel labelG = new JLabel("Genre: ");
        // labelG.setFont(new Font("Raleway", Font.BOLD, 20));
        // labelG.setBounds(100, 290, 200, 30);
        // panel.add(labelG);


        // r1 = new JRadioButton("Homme");
        // r1.setFont(new Font("Raleway", Font.BOLD, 14));
        // r1.setBackground(new Color(222, 255, 228));
        // r1.setBounds(300, 290, 90, 30);
        // panel.add(r1);

        // r2 = new JRadioButton("Femme");
        // r2.setFont(new Font("Raleway", Font.BOLD, 14));
        // r2.setBackground(new Color(222, 255, 228));
        // r2.setBounds(450, 290, 90, 30);
        // panel.add(r2);


        // ButtonGroup buttonGroup = new ButtonGroup();
        // buttonGroup.add(r1);
        // buttonGroup.add(r2);


        // JLabel labelEmail = new JLabel("Adresse Email: ");
        // labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        // labelEmail.setBounds(100, 390, 200, 30);
        // panel.add(labelEmail);


        // textEmail = new JTextField();
        // textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
        // textEmail.setBounds(300, 390, 400, 30);
        // panel.add(textEmail);


        // JLabel labelMs = new JLabel("Marital Status: ");
        // labelMs.setFont(new Font("Raleway", Font.BOLD, 20));
        // labelMs.setBounds(100, 440, 200, 30);
        // panel.add(labelMs);

        // M1 = new JRadioButton("Marié");
        // M1.setFont(new Font("Raleway", Font.BOLD, 14));
        // M1.setBackground(new Color(222, 255, 228));
        // M1.setBounds(300, 440, 100, 30);
        // panel.add(M1);

        // M2 = new JRadioButton("Célibataire");
        // M2.setFont(new Font("Raleway", Font.BOLD, 14));
        // M2.setBackground(new Color(222, 255, 228));
        // M2.setBounds(450, 440, 100, 30);
        // panel.add(M2);


        // M3 = new JRadioButton("Autres");
        // M3.setFont(new Font("Raleway", Font.BOLD, 14));
        // M3.setBackground(new Color(222, 255, 228));
        // M3.setBounds(635, 440, 100, 30);
        // panel.add(M3);

        // ButtonGroup buttonGroup1 = new ButtonGroup();
        // buttonGroup1.add(M1);
        // buttonGroup1.add(M2);
        // buttonGroup1.add(M3);

       


        // JLabel labelAdd = new JLabel("Adresse: ");
        // labelAdd.setFont(new Font("Raleway", Font.BOLD, 20));
        // labelAdd.setBounds(100, 490, 200, 30);
        // panel.add(labelAdd);


        // textAdd = new JTextField();
        // textAdd.setFont(new Font("Raleway", Font.BOLD, 14));
        // textAdd.setBounds(300, 490, 400, 30);
        // panel.add(textAdd);


        // JLabel labelCity = new JLabel("Ville: ");
        // labelCity.setFont(new Font("Raleway", Font.BOLD, 20));
        // labelCity.setBounds(100, 540, 200, 30);
        // panel.add(labelCity);


        // textcity = new JTextField();
        // textcity.setFont(new Font("Raleway", Font.BOLD, 14));
        // textcity.setBounds(300, 540, 400, 30);
        // panel.add(textcity);


        // JLabel labelPin = new JLabel("Pin Code: ");
        // labelPin.setFont(new Font("Raleway", Font.BOLD, 20));
        // labelPin.setBounds(100, 590, 200, 30);
        // panel.add(labelPin);


        // textpin = new JTextField();
        // textpin.setFont(new Font("Raleway", Font.BOLD, 14));
        // textpin.setBounds(300, 590, 400, 30);
        // panel.add(textpin);


        next = new JButton("Conexion");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620, 360, 150, 30);
        next.addActionListener(this);
        panel.add(next);

        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(0, 0, 850, 800);

        // Ajouter le JScrollPane au JFrame
        this.add(scrollPane);

        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(850, 600);
        setLocation(230, 10);
        setVisible(true);


    }


    @Override
    public void actionPerformed(ActionEvent e){
       
        String username = textName.getText();
        String password = textFName.getText();

        if(username.equals("Quentin") && password.equals("1234")){
            
            new Accueil().setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Wrong username or password");
        }
        

       


    }

    public static void main(String[] args) {
        new Form();
        
    }
}

