package quizapp;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class Login extends JFrame implements ActionListener {
	JButton rules,back;
	JTextField tfname;
	
	Login(){
		getContentPane().setBackground(Color.PINK);
		setLayout(null);
		ImageIcon i1=new ImageIcon("icons/login.jpeg");
		JLabel image=new JLabel(i1);
		image.setBounds(180,200,600,650);
		add(image);
		
		JLabel heading=new JLabel("Let's start!");
		heading.setBounds(1320,200,300,45);
		heading.setFont(new Font("Viner Hand ITC",Font.BOLD,52));
		heading.setForeground(new Color(30,144,254));
		add(heading);
		
		JLabel name=new JLabel("Enter your name");
		name.setBounds(1350,320,300,25);
		name.setFont(new Font("Mongolian Baiti",Font.BOLD,30));
		name.setForeground(new Color(30,144,254));
		add(name);
		
		tfname=new JTextField();
		tfname.setBounds(1290,430,350,40);
		tfname.setFont(new Font("Times New Roman",Font.BOLD,30));
		add(tfname);
		
		rules=new JButton("Rules");
		rules.setBounds(1280,600,150,35);
		rules.setBackground(new Color(30,144,254));
		rules.setForeground(Color.WHITE);
		rules.setFont(new Font("Times New Roman",Font.BOLD,23));
		rules.addActionListener(this);
		add(rules);
		
	    back=new JButton("Back");
		back.setBounds(1480,600,150,35);
		back.setBackground(new Color(30,144,254));
		back.setForeground(Color.WHITE);
		back.setFont(new Font("Times New Roman",Font.BOLD,23));
		back.addActionListener(this);
		add(back);
		setSize(1200,500);
		setLocation(200,200);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		
			String name=tfname.getText();
			if(ae.getSource()==rules) {
			setVisible(false);
			new Rules(name);
			
		}else if(ae.getSource()==back) {
			setVisible(false);
		}
	}
	
	public static void main(String[] args) {
		 new Login();
	}

}