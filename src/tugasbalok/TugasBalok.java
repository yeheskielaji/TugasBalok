/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasbalok;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author LENOVO
 */
public class TugasBalok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GUI gui = new GUI();
    }

}

class GUI extends JFrame implements ActionListener{
    JLabel title = new JLabel("Cuboid Calculator");
    
    JLabel legth = new JLabel("Legth");
    JTextField flegth = new JTextField(15);
    
    JLabel width = new JLabel("Width");
    JTextField fwidth = new JTextField(15);
    
    JLabel height = new JLabel("height");
    JTextField fheight = new JTextField(15);
    
    JLabel answer1 = new JLabel("");
    JLabel answer2 = new JLabel("");
    JLabel answer3 = new JLabel("");
    JLabel answer4 = new JLabel("");
    
    JLabel result = new JLabel("Result");
    JButton count = new JButton ("Count");
    JButton reset = new JButton ("Reset");
    
    public GUI(){
        setTitle("e");
        
        setSize(400, 500);
        add(title);
        add(legth);
        add(flegth);
        add(width);
        add(fwidth);
        add(height);
        add(fheight);
        add(result);
        add(answer1);
        add(answer2);
        add(answer3);
        add(answer4);
        add(count);
        add(reset);
        
        setLayout(null);
        title.setBounds(130, 30, 120, 20);
        legth.setBounds(30, 80, 100, 20);
        flegth.setBounds(130, 80, 200, 20);
        width.setBounds(30, 120, 100, 20);
        fwidth.setBounds(130, 120, 200, 20);
        height.setBounds(30, 160, 100, 20);
        fheight.setBounds(130, 160, 200, 20);
        result.setBounds(130, 190, 100, 20);
        answer1.setBounds(30, 220, 300, 20 );
        answer2.setBounds(30, 250, 300, 20 );
        answer3.setBounds(30, 280, 300, 20 );
        answer4.setBounds(30, 310, 300, 20 );
        
        count.setBounds(100, 350, 80, 20);
        reset.setBounds(200, 350, 80, 20);
        
        setVisible(true);
        
        count.addActionListener(this);
        reset.addActionListener(this);
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==count){
            try{
                double p = Double.parseDouble(flegth.getText());
                double l = Double.parseDouble(fwidth.getText());
                double t = Double.parseDouble(fheight.getText());
                Balok balok = new Balok(p,l,t);
                answer1.setText("Square Area\t: "+Double.toString(balok.hitungLuas()));
                answer2.setText("Square Circumference\t: " + Double.toString(balok.hitungKeliling()));
                answer3.setText("Cuboid Volume\t: " + Double.toString(balok.hitungVolume()));
                answer4.setText("Cuboid Surface Area\t: "+ Double.toString(balok.hitungLuasP()));
            }
            catch(NumberFormatException eror){
                JOptionPane.showMessageDialog(null,eror.getMessage(), "message", JOptionPane.ERROR_MESSAGE );
            }
        }
        if(e.getSource()==reset){
           flegth.setText("");
           fwidth.setText("");
           fheight.setText("");
           answer1.setText("");
           answer2.setText("");
           answer3.setText("");
           answer4.setText("");
           
        }
    }
    
}
