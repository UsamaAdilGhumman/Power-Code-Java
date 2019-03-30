package main.Main;
import javax.swing.*;
class Main
{
	public static void main(String args[])
	{
		int power = 1;
		int base;
		int expo;
		base=Integer.parseInt(JOptionPane.showInputDialog("Enter Base :"));
		expo=Integer.parseInt(JOptionPane.showInputDialog("Enter Expo :"));
	for(int i=0; i<=expo ; i++)
	{
		power = power * base;
	}
	System.out.println("Your Power is " + power);
	}
};