/*
10-10-2021
Author: G. Vimal Keerthi
Question:
Write a program to create a polygon that is filled with green color.
This polygon must be created inside a rounded rectangle which is filled with red color.
*/

import java.awt.*;
import java.awt.event.*;

class MyDrawing extends Frame{
	public void paint(Graphics g){
		g.setColor(Color.red);
		g.fillRoundRect(30,30,250,250,30,30);
		g.setColor(Color.green);
		int x[] = {40,200,100,40};
		int y[] = {40,40,200,200};
		g.fillPolygon(x,y,4);
	}
}

class Polygon{
	public static void main(String[] args){
		MyDrawing d = new MyDrawing();
		d.setTitle("Polygon");
		d.setSize(400,400);
		d.setVisible(true);
		d.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
}