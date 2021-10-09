/*
04-10-2021
Author: G.Vimal Keerthi
Question:
Write a program to create a frame

WARNING! : Frame doesnot close. Use taskmanager to close it.  
*/

import java.awt.*;

class CreateFrame{
	public static void main(String[] args){
		Frame fr = new Frame("My Frame");
		fr.setSize(300,250);
		fr.setVisible(true);
	}
}