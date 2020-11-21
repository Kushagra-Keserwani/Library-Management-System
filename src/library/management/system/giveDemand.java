package library.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class giveDemand extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField t1, t2, t4;
    private JButton b1,b2;
    JComboBox comboBox;
        
    public static void main(String[] args) {
	new giveDemand("").setVisible(true);
    }

    public giveDemand(String student_id) {
        
        setBounds(600, 200, 518, 442);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);

	JLabel l1 = new JLabel("Username");
	l1.setForeground(new Color(47, 79, 79));
	l1.setFont(new Font("Tahoma", Font.BOLD, 14));
	l1.setBounds(73, 84, 90, 22);
	contentPane.add(l1);

        JLabel l2 = new JLabel("Book Name");
	l2.setForeground(new Color(47, 79, 79));
	l2.setFont(new Font("Tahoma", Font.BOLD, 14));
	l2.setBounds(73, 117, 90, 22);
	contentPane.add(l2);
        
	JLabel l3 = new JLabel("Publisher");
	l3.setForeground(new Color(47, 79, 79));
	l3.setFont(new Font("Tahoma", Font.BOLD, 14));
	l3.setBounds(73, 150, 90, 22);
	contentPane.add(l3);

	JLabel l7 = new JLabel("Edition");
	l7.setForeground(new Color(47, 79, 79));
	l7.setFont(new Font("Tahoma", Font.BOLD, 14));
	l7.setBounds(73, 183, 90, 22);
	contentPane.add(l7);

        t1 = new JTextField();
	t1.setForeground(new Color(47, 79, 79));
	t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t1.setBounds(169, 84, 198, 20);
	contentPane.add(t1);
	t1.setColumns(10);
        
	t2 = new JTextField();
	t2.setForeground(new Color(47, 79, 79));
	t2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t2.setColumns(10);
	t2.setBounds(169, 117, 198, 20);
	contentPane.add(t2);

	t4 = new JTextField();
	t4.setForeground(new Color(47, 79, 79));
	t4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t4.setColumns(10);
	t4.setBounds(169, 153, 198, 20);
	contentPane.add(t4);

	comboBox = new JComboBox();
	comboBox.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
	comboBox.setBounds(173, 186, 194, 20);
	contentPane.add(comboBox);

        b1 = new JButton("Suggest");
	b1.addActionListener(this);
	b1.setBorder(new CompoundBorder(new LineBorder(new Color(128, 128, 128)), null));
        b1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	b1.setBounds(102, 300, 100, 33);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
	contentPane.add(b1);

	b2 = new JButton("Back");
	b2.addActionListener(this);
	b2.setBorder(new CompoundBorder(new LineBorder(new Color(105, 105, 105)), null));
	b2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	b2.setBounds(212, 300, 108, 33);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
	
	contentPane.add(b2);

	JPanel panel = new JPanel();
	panel.setBorder(new TitledBorder(new LineBorder(new Color(138, 43, 226), 2), "Suggest Books", TitledBorder.LEADING,
			TitledBorder.TOP, null, new Color(0, 0, 255)));
	panel.setBounds(10, 29, 398, 344);
	contentPane.add(panel);
        
        panel.setBackground(Color.WHITE);
        contentPane.setBackground(Color.WHITE);

    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            conn con = new conn();
            if(ae.getSource() == b1){
                String sql = "insert into booksuggestedbystudent(student_id,  book_name, publisher, edition) values(?, ?, ?, ?)";
		PreparedStatement st = con.c.prepareStatement(sql);
                // st.setInt(1, Integer.parseInt(textField.getText()));
		st.setString(1, t1.getText());
		st.setString(2, t2.getText());
		st.setString(3, t4.getText());
		st.setString(4, (String) comboBox.getSelectedItem());

		int rs = st.executeUpdate();
		if (rs > 0)
                    JOptionPane.showMessageDialog(null, "Successfully Suggested");
		else
                    JOptionPane.showMessageDialog(null, "Error");
                t1.setText("");
                t2.setText("");
                t4.setText("");
		st.close();
            }
            if(ae.getSource() == b2){
                this.setVisible(false);
		new Student_Home(t1.getText()).setVisible(true);

            }
            con.c.close();
        }catch(Exception e){
            
        }
    }
}

