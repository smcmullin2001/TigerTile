package com.stephen.java;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import javax.swing.SwingConstants;

public class ScaryFrame2 extends JFrame {

	private JLabel contentPane;
	private JLabel jl;
	JLabel panel = new JLabel();
	JLabel panel_1 = new JLabel();
	JLabel panel_2 = new JLabel();
	JLabel panel_3 = new JLabel();
	JLabel panel_4 = new JLabel();
	JLabel panel_5 = new JLabel();
	JLabel panel_6 = new JLabel();
	JLabel panel_7 = new JLabel();
	JLabel panel_8 = new JLabel();
	JLabel panel_9 = new JLabel();
	JLabel panel_10 = new JLabel();
	JLabel panel_11 = new JLabel();
	JLabel panel_12 = new JLabel();
	JLabel panel_13 = new JLabel();
	JLabel panel_14 = new JLabel();
	JLabel panel_15 = new JLabel();
	private boolean isClicked;
	int randomIndex;
	
	Random randImage = new Random();
	ImageIcon[] images = {createImageIcon("img0.jpg"), createImageIcon("img1.jpg"),createImageIcon("img2.jpg"),
	createImageIcon("img3.jpg"),createImageIcon("img4.jpg"),createImageIcon("img5.jpg"),createImageIcon("img6.jpg"),
	createImageIcon("img7.jpg"),createImageIcon("img8.jpg"),createImageIcon("img9.jpg"),createImageIcon("img10.jpg"),
	createImageIcon("img11.jpg"),createImageIcon("img12.jpg"),createImageIcon("img13.jpg"),createImageIcon("img14.jpg"),
	createImageIcon("img15.jpg")};
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScaryFrame2 frame = new ScaryFrame2();
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
	public ScaryFrame2() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 506, 629);
		setTitle("Tile Puzzle");
		
		contentPane = new JLabel();
		contentPane.setHorizontalTextPosition(SwingConstants.CENTER);
		contentPane.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.setBorder(null);
		contentPane.setBounds(0,0,500,600);
		contentPane.setBackground(Color.BLACK);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.BLACK);
		
		panel.setBounds(0,0,125,150);
		createPanel(panel, 0);
		panel_1.setBounds(125,0,125,150);
		createPanel(panel_1, 1);
		panel_2.setBounds(250,0,125,150);
		createPanel(panel_2, 2);
		panel_3.setBounds(375,0,125,150);
		createPanel(panel_3, 3);
		panel_4.setBounds(0,150,125,150);
		createPanel(panel_4, 4);
		panel_5.setBounds(125,150,125,150);
		createPanel(panel_5, 5);
		panel_6.setBounds(250,150,125,150);
		createPanel(panel_6, 6);
		panel_7.setBounds(375,150,125,150);
		createPanel(panel_7, 7);
		panel_8.setBounds(0,300,125,150);
		createPanel(panel_8, 8);
		panel_9.setBounds(125,300,125,150);
		createPanel(panel_9, 9);
		panel_10.setBounds(250,300,125,150);
		createPanel(panel_10, 10);
		panel_11.setBounds(375,300,125,150);
		createPanel(panel_11, 11);
		panel_12.setBounds(0,450,125,150);
		createPanel(panel_12, 12);
		panel_13.setBounds(125,450,125,150);
		createPanel(panel_13, 13);
		panel_14.setBounds(250,450,125,150);
		createPanel(panel_14, 14);
		panel_15.setBounds(375,450,125,150);
		createPanel(panel_15, 15);
		
		
	}
	public void createPanel(final JLabel jl, final int i){
		this.jl = jl;
	//	jl.setBorder(new EtchedBorder(Color.LIGHT_GRAY, Color.GRAY));
		randomIndex = randImage.nextInt(images.length);
		jl.setIcon(images[randomIndex]);
		contentPane.add(jl);
		jl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(jl.getIcon().equals(images[i])){
				}else{
				changeImage(jl);
				}
				jl.setBorder(null);
			}
		});
		jl.isVisible();
	}
	
	public ImageIcon createImageIcon(String image){
		java.net.URL imgURL = getClass().getResource(image);

		if(imgURL != null){
			return new ImageIcon(imgURL);
		}else{
			return null;
		}
	}
	public void changeImage(JLabel jl){
		randomIndex = randImage.nextInt(images.length);
		if(isClicked){
			isClicked = false;
			jl.setIcon(images[randomIndex]);
		}else{
			isClicked = true;
			jl.setIcon(images[randomIndex]);
		}
	}
//	public void changeColor(JLabel jp){
//		int randomIndex = randomColor.nextInt(colors.length);
//		if(isClicked){
//			isClicked = false;
//			jp.setBackground(colors[randomIndex]);
//			
//		}else{
//			isClicked = true;
//			jp.setBackground(colors[randomIndex]);
//		}
//	}
}
