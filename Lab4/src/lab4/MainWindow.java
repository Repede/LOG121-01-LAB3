package lab4;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;

import javax.swing.*;

public class MainWindow
{
	private JFrame frame;
	public MainWindow()
	{
		createGui();
	}
	
	public void createGui()
	{
		frame = new JFrame("Laboratoire 4");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(0, 0, 600, 600);
		
		FlowLayout fl = new FlowLayout();
		JPanel allp = new JPanel(fl);
		
		
		JPanel iff = new JPanel();
		iff.setBackground(Color.red);
		iff.setSize(200, 200);
		iff.setVisible(true);
		
		JPanel ifff = new JPanel();
		ifff.setBackground(Color.green);
		ifff.setSize(200,200);
		ifff.setVisible(true);
		
		JPanel iffff = new JPanel();
		iffff.setBackground(Color.blue);
		iffff.setSize(200, 200);
		iffff.setVisible(true);
		
		allp.add(iff);
		allp.add(ifff);
		allp.add(iffff);
		
		allp.setVisible(true);
		frame.setVisible(true);
	}
}
