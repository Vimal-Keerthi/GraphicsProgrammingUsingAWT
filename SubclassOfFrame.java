/*
04-10-2021
Author: G. Vimal Keerthi
Question:
Write a program to create a frame by creating an object to the subclass of Frame class

Warning! : Frame doesnot close. Use taskmanager to close it.
*/

import java.awt.*;

class SubClass extends Frame{
	SubClass(String str){
		super(str);
	}		
}

class SubclassOfFrame{
	public static void main(String[] args){
		SubClass sc = new SubClass("MyFrame");
		sc.setSize(400,240);
		sc.setVisible(true);
	}
}