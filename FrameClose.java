/*
04-10-2021
Author: G. Vimal Keerthi
Question:
Write a program which first creates a frame and then closs it on clicking the close button
*/

import java.awt.*;
import java.awt.event.*;

class Close implements WindowListener{
	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowClosing(WindowEvent e){System.exit(0);}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
}

class FrameClose extends Frame{
	public static void main(String[] args){
		FrameClose fc = new FrameClose();
		fc.setTitle("MyFrame");
		fc.setSize(400,250);
		fc.setVisible(true);
		fc.addWindowListener(new Close());
	}
}