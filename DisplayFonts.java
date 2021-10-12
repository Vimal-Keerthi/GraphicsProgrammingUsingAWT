/*
12-10-2021
Author: G. Vimal Keerthi
Question: 
Write a program to know which fonts are available in a local system.
*/

import java.awt.*;

class DisplayFonts{
	public static void main(String[] args){
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		String fonts[] = ge.getAvailableFontFamilyNames();
		System.out.println("Available fonts on this system: ");
		for(int i=0;i<fonts.length;i++)
			System.out.println(fonts[i]);
	}
}