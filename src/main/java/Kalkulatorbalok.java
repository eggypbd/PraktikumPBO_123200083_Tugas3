/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
package Main;
import javax.swing.*;
import java.awt.event.*;

public class Kalkulatorbalok extends JFrame {
    JLabel tittletext = new JLabel("Kalkulator Balok");
    JLabel lebarBangun = new JLabel("Lebar");
    JLabel panjangBangun = new JLabel("Panjang");
    JLabel tinggiBangun = new JLabel("Tinggi");
    JLabel cttHasil = new JLabel("Hasil");

    JLabel labLuas = new JLabel("");
    JLabel labKeliling = new JLabel("");
    JLabel labVolume = new JLabel("");
    JLabel labLpermukaan = new JLabel("");

    JTextField fieldLebar = new JTextField();
    JTextField fieldPanjang = new JTextField();
    JTextField fieldTinggi = new JTextField();

    JButton button1=  new JButton("Hitung");
    JButton button2=  new JButton("Reset");

    public Kalkulatorbalok(){
        setSize(400,600);
        setLayout(null);

        add(tittletext);
        add(lebarBangun);
        add(panjangBangun);
        add(tinggiBangun);
        add(cttHasil);

        add(fieldLebar);
        add(fieldPanjang);
        add(fieldTinggi);

        add(labLuas);
        add(labKeliling);
        add(labVolume);
        add(labLpermukaan);

        add(button1);
        add(button2);


        tittletext.setBounds(135,10,120,20);

        lebarBangun.setBounds(20,70,150,25);
        fieldLebar.setBounds(180,70,150,25);

        panjangBangun.setBounds(20,120,150,25);   
        fieldPanjang.setBounds(180,120,150,25);

        tinggiBangun.setBounds(20,170,150,25);
        fieldTinggi.setBounds(180,170,150,25);

        cttHasil.setBounds(150,200,150,70);

        labLuas.setBounds(20,290,300,25);
        labKeliling.setBounds(20,320,300,25);
        labVolume.setBounds(20,350,300,25);
        labLpermukaan.setBounds(20,380,300,25);

        button1.setBounds(75,450,80,50);
        button2.setBounds(200,450,80,50);


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double p= Double.parseDouble(fieldPanjang.getText());
                double l = Double.parseDouble(fieldLebar.getText());
                double t = Double.parseDouble(fieldTinggi.getText());

                double ls =  p * l;
                double k = 2*(p + l);
                double v = p * l * t;
                double lperm = 2 * (p*l + p*t + l*t);


                labLuas.setText("Luas Persegi Panjang        :  " + ls);
                labKeliling.setText("Keliling Persegi Panjang   :   " + k);
                labVolume.setText("Volume Balok                      :  " + v);
                labLpermukaan.setText("Luas Permukaan Balok      :  " + lperm);
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fieldPanjang.setText("");
                fieldLebar.setText("");
                fieldTinggi.setText("");
                labLuas.setText("");
                labKeliling.setText("");
                labVolume.setText("");
                labLpermukaan.setText("");
            }
        });

        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}