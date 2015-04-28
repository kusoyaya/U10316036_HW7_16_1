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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
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
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		ImageIcon a = new ImageIcon("cards/"+r.getRandomCard()+".png");
		ImageIcon b = new ImageIcon("cards/"+r.getRandomCard()+".png");
		ImageIcon c = new ImageIcon("cards/"+r.getRandomCard()+".png");
		ImageIcon d = new ImageIcon("cards/"+r.getRandomCard()+".png");
		
		ArrayList<ImageIcon> i = new ArrayList<ImageIcon>();
		i.add(a);
		i.add(b);
		i.add(c);
		i.add(d);
		
		JPanel cardDisplay = new JPanel();
		contentPane.add(cardDisplay, BorderLayout.CENTER);
		
		JLabel labelA = new JLabel(a);
		cardDisplay.add(labelA);
		
		JLabel labelB = new JLabel(b);
		cardDisplay.add(labelB);
		
		JLabel labelC = new JLabel(c);
		cardDisplay.add(labelC);
		
		JLabel labelD = new JLabel(d);
		cardDisplay.add(labelD);
		
		JPanel buttonPanel = new JPanel();
		contentPane.add(buttonPanel, BorderLayout.SOUTH);
		
		JButton refreashButton = new JButton("refresh");
		refreashButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(ImageIcon c : i){
					Image image = null;
					try{
						image = ImageIO.read(new File("cards/"+r.getRandomCard()+".png"));
					}catch(Exception ex){
						
					}
					c.setImage(image);
				}
				cardDisplay.repaint();
			}
		});
		buttonPanel.add(refreashButton);
	}
	
	

}
