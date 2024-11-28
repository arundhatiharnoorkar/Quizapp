

package quizapp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Themes extends JFrame {
	Themes(){

		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		
		JLabel heading=new JLabel("Plese "+"select "+"your "+"theme ");
		heading.setBounds(50,50,700,30);
		heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
		heading.setForeground(new Color(30,144,254));
		add(heading);
		setVisible(true);
	}

public static void main(String[] args) {
	new Themes();
	
}
}