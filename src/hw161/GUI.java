package hw161;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.ArrayList;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JLabel a;
	private JLabel b;
	private JLabel c;
	private JLabel d;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);//開始 GUI 設定可見度
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		RandomCard r = new RandomCard();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//設定關閉時動作
		setBounds(100, 100, 450, 300);//設定大小
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);//設定排版
		
		
		JPanel cardDisplay = new JPanel();
		contentPane.add(cardDisplay, BorderLayout.CENTER);
		
		
		
		
		JLabel labelA = new JLabel(new ImageIcon(GUI.class.getResource(r.getRandomCard()+".png")));
		cardDisplay.add(labelA);
		
		JLabel labelB = new JLabel(new ImageIcon(GUI.class.getResource(r.getRandomCard()+".png")));
		cardDisplay.add(labelB);
		
		JLabel labelC = new JLabel(new ImageIcon(GUI.class.getResource(r.getRandomCard()+".png")));
		cardDisplay.add(labelC);
		
		JLabel labelD = new JLabel(new ImageIcon(GUI.class.getResource(r.getRandomCard()+".png")));
		cardDisplay.add(labelD);//建立 jlabel，把 imageicon 掛上去
		
		JPanel buttonPanel = new JPanel();
		contentPane.add(buttonPanel, BorderLayout.SOUTH); //放按鍵用的 jpanel
		
		JButton refreashButton = new JButton("refresh");//建立按鍵
		refreashButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelA.setIcon(new ImageIcon(GUI.class.getResource(r.getRandomCard()+".png")));
				labelB.setIcon(new ImageIcon(GUI.class.getResource(r.getRandomCard()+".png")));
				labelC.setIcon(new ImageIcon(GUI.class.getResource(r.getRandomCard()+".png")));
				labelD.setIcon(new ImageIcon(GUI.class.getResource(r.getRandomCard()+".png")));
			}
		});//設定按下後的動作
		buttonPanel.add(refreashButton);
	}
	
	

}
