package library.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class aboutUs extends JFrame{

	private JPanel contentPane;

        public static void main(String[] args) {
            new aboutUs().setVisible(true);			
	}
    
        public aboutUs() {
            
            super("About Us");
            setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ram\\Desktop\\rohit.jpg"));
            setBackground(new Color(173, 216, 230));
            setBounds(500, 250, 700, 500);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel l1 = new JLabel("New label");
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/logo.png"));
            Image i2 = i1.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l1 = new JLabel(i3);
            l1.setBounds(450, 40, 150, 150);
            contentPane.add(l1);


            JLabel l3 = new JLabel("Library");
            l3.setForeground(new Color(0, 250, 154));
            l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l3.setBounds(160, 40, 150, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Mangement System");
            l4.setForeground(new Color(127, 255, 0));
            l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l4.setBounds(70, 90, 405, 40);
            contentPane.add(l4);

//            JLabel l5 = new JLabel("v5.1");
//            l5.setForeground(new Color(30, 144, 255));
//            l5.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
//            l5.setBounds(185, 140, 100, 21);
//            contentPane.add(l5);


            JLabel l6 = new JLabel("Developed By : ");
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l6.setBounds(70, 148, 600, 35);
            contentPane.add(l6);

            JLabel l7 = new JLabel("Apoorva Aggarwal 2K19/IT/029");
            l7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l7.setBounds(70, 200, 600, 34);
            contentPane.add(l7);
            
            JLabel l7a = new JLabel("apoorva27sep@gmail.com");
            l7a.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l7a.setBounds(70, 230, 600, 34);
            contentPane.add(l7a);

            JLabel l8 = new JLabel("Kushagra Keserwani 2K19/IT/070");
            l8.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l8.setBounds(70, 290, 600, 34);
            contentPane.add(l8);

            JLabel l9 = new JLabel("kushagrakeserwani@gmail.com");
            l9.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
            l9.setBounds(70, 320, 600, 34);
            contentPane.add(l9);


            JLabel l10 = new JLabel("**Help us by sending your valuable feedback and suggestions**");
            l10.setForeground(new Color(47, 79, 79));
            l10.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
            l10.setBounds(70, 400, 600, 34);
            contentPane.add(l10);
            
//            JLabel l11 = new JLabel("**about this project**");
//            l11.setForeground(new Color(47, 79, 79));
//            l11.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
//            l11.setBounds(70, 370, 600, 34);
//            contentPane.add(l11);
                
            contentPane.setBackground(Color.WHITE);
	}
        

}

