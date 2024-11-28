package quizapp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Rules extends JFrame implements ActionListener {
	JButton start,back;
	JTextField tfname;
	

	String name;
	Rules(String name){
		this.name=name;
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel heading=new JLabel("Welcome "+name+" "+"to "+"the "+"Quiz "+"world");
		heading.setBounds(600,100,700,60);
		heading.setFont(new Font("Viner Hand ITC",Font.BOLD,45));
		heading.setForeground(new Color(30,144,254));
		add(heading);
		
		JLabel rules=new JLabel();
		rules.setBounds(650,200,700,350);
		rules.setFont(new Font("Tahoma",Font.PLAIN,27));
		rules.setText(
				"<html>"+
					"1. The application contains 10 multiple choice questions."+"<br><br>" +
					"2. Each question carries 10 points."+"<br><br>"+
					"3. Each question is given a maximum time of 15 seconds."+"<br><br>"+
					"4. Each question has a 50:50 lifeline option that eliminates two incorrect options."+"<br><br>"+
		            "5. The score is diplayed out of 100 at the end."+"<br><br>"+
					"<html>"
		            );
		            
	     add(rules);
		
		 back=new JButton("Back");
		 back.setBounds(700,600,100,30);
		 back.setBackground(new Color(30,144,254));
		 back.setForeground(Color.WHITE);
		 back.addActionListener(this);
		 add(back);
			
		start=new JButton("Start");
		start.setBounds(750,600,100,30);
		start.setBackground(new Color(30,144,254));
		start.setForeground(Color.WHITE);
		start.addActionListener(this);
		add(start);
		
	    
		setSize(800,800);
		setLocation(350,100);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==start) {
			setVisible(false);
			
			new quiz(name);
			
			
		}else  {
			setVisible(false);
			new Login();
		}
	}
	public static void main(String[] args) {
		new Rules("user");
	}

}
