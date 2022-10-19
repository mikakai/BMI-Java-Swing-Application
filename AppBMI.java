
/**
 * Write a description of class AppBMI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AppBMI extends JFrame
{
    public AppBMI()
    {
        JFrame frameApp = new JFrame();
        
        frameApp.setTitle("BMI Calculator");
        
        JLabel titleL = new JLabel("Calculate Your Body Mass Index", SwingConstants.CENTER);
        titleL.setVerticalAlignment(JLabel.TOP);
        titleL.setSize(800, 500);
        frameApp.add(titleL);
        
        JLabel weightL = new JLabel("Weight (KILOGRAMS): ");
        weightL.setBounds(20, 40, 250, 40);
        frameApp.add(weightL);
        
        JLabel heightL = new JLabel("Height (METERS): ");
        heightL.setBounds(20, 80, 250, 40);
        frameApp.add(heightL);
        
        JTextField weightTF = new JTextField("");
        weightTF.setBounds(150, 40, 500, 40);
        frameApp.add(weightTF);
        
        JTextField heightTF =  new JTextField("");
        heightTF.setBounds(150, 80, 500, 40);
        frameApp.add(heightTF);
        
        JLabel calRSLT = new JLabel("BMI: ");
        calRSLT.setBounds(20, 120, 250, 40);
        frameApp.add(calRSLT);
        
        JTextField calFNL = new JTextField("");
        calFNL.setBounds(150, 120, 500, 40);
        frameApp.add(calFNL);
        
        JButton calBTN = new JButton("Compute BMI");
        calBTN.setBounds(150, 150, 300, 40);
        frameApp.add(calBTN);
        
        JButton clearBTN = new JButton("Clear");
        clearBTN.setBounds(450, 150, 100, 40);
        frameApp.add(clearBTN);
        
        JButton exitBTN = new JButton("Exit");
        exitBTN.setBounds(550, 150, 100, 40);
        frameApp.add(exitBTN);

        //COMPUTING the BMI
        calBTN.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                double userW = Double.parseDouble(weightTF.getText());
                double userH = Double.parseDouble(heightTF.getText());
                
                double computeBMI = userW / (userH * userH);
                
            if (computeBMI < 18.50){
                calFNL.setText("The Body Mass Index (BMI) of yours is " + String.format("%.2f", computeBMI) + " kg/m². This is considered as UNDERWEIGHT.");
            } else if (computeBMI >= 18.50 && computeBMI <= 24.99){
                calFNL.setText("The Body Mass Index (BMI) of yours is " + String.format("%.2f", computeBMI) + " kg/m². This is considered as NORMAL.");
            } else if (computeBMI > 25.00){
                calFNL.setText("The Body Mass Index (BMI) of yours is " + String.format("%.2f", computeBMI) + " kg/m². This is considered as OVERWEIGHT.");
            } else if (computeBMI > 30.00){
                calFNL.setText("The Body Mass Index (BMI) of yours is " + String.format("%.2f", computeBMI) + " kg/m². This is considered as OBESE.");
            }
        
            }
        });
        //CLEARING the content
        clearBTN.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(frameApp, "Clearing the inputted data");
                weightTF.setText("");
                heightTF.setText("");
                calFNL.setText("");
            }
        });
        //EXITING the application
        exitBTN.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(frameApp, "Exiting the BMI Application, Thank you!");
                System.exit(0);
            }
        });
          
        frameApp.setSize(750, 300);
        frameApp.setLayout(null);
        frameApp.setVisible(true);
        
        pack();
    }
    
    public static void main(String [] args)
    {
        new AppBMI().show();
    }
    
    }

