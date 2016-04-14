package ua.gvv.Client;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class GUI  {
	
	private JFrame frame = new JFrame("SuperTetris");
	
	GUI(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(550,600 );
		frame.setVisible(true);
		Image image = Toolkit.getDefaultToolkit().getImage("Image/icon.jpg");
		frame.setIconImage(image);
		frame.setResizable(false);
		frame.setLocation(500, 100);
		JPanel panel = new JPanel();
		
		
		
		
		panel.setBackground(Color.GRAY);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel userName = new JLabel("Gavrik");
		userName.setFont(new Font("MS Gothic", Font.BOLD, 32));
		userName.setBounds(400, 111, 117, 52);
		panel.add(userName);
		
		JLabel userLevel = new JLabel("Level");
		userLevel.setFont(new Font("MS Gothic", Font.BOLD, 26));
		userLevel.setBounds(400, 160, 117, 52);
		panel.add(userLevel);
		
		JLabel userScore = new JLabel("Score");
		userScore.setVerticalAlignment(SwingConstants.TOP);
		userScore.setHorizontalAlignment(SwingConstants.LEFT);
		userScore.setFont(new Font("MS Gothic", Font.BOLD, 26));
		userScore.setBounds(400, 220, 117, 81);
		panel.add(userScore);
		
		
		
	}
}
