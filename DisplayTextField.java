/*
27-10-21
Author: G. Vimal Keerthi
Question:
Write a program to create two labels and two text fields for entering name and passwords.
The password typed by the user in the text field is hidden.
*/

import java.awt.*;
import java.awt.event.*;

class DisplayTextField extends Frame implements ActionListener{
	TextField name, pass;
	DisplayTextField(){
		setLayout(new FlowLayout());
		Label n = new Label("Name: ", Label.LEFT);
		Label p = new Label("Password: ", Label.LEFT);
		name = new TextField(20);
		pass = new TextField(20);
		pass.setEchoChar('*');
		name.setBackground(Color.yellow);
		name.setForeground(Color.red);
		Font f = new Font("Arial", Font.PLAIN, 25);
		name.setFont(f);
		add(n);
		add(name);
		add(p);
		add(pass);
		name.addActionListener(this);
		pass.addActionListener(this);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}
	public void actionPerformed(ActionEvent ae){
		Graphics g = this.getGraphics();
		g.drawString("Name: "+name.getText(), 10, 200);
		g.drawString("Pass Word: "+pass.getText(), 10, 240);
	}
	public static void main(String[] args){
		DisplayTextField dt = new DisplayTextField();
		dt.setSize(400,400);
		dt.setTitle("Password Check");
		dt.setVisible(true);
	}
}