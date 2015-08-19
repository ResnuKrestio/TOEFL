package toefl.main.mynotes.view;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import screen.MainFrame;

import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyQuotation extends JPanel {
	
	Image myPersonalNotes;
	Image myTrickAndPattern;

	/**
	 * Create the panel.
	 */
	public MyQuotation() {
		setBackground(Color.WHITE);
		loadImage();
		
		setBounds(1, 1, MainFrame.workspacePanel.getWidth(), MainFrame.workspacePanel.getHeight());
		setLayout(null);
		
		JButton myPersonalBtn = new JButton();
		myPersonalBtn.setBounds(156, 23, 200, 310);
		myPersonalBtn.setIcon(new ImageIcon(myPersonalNotes));
		myPersonalBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				MyPersonalNote myPersonalNote = new MyPersonalNote();
				myPersonalNote.isEnabled();
			}
		});
		add(myPersonalBtn);
		
		JButton myTrickBtn = new JButton();
		myTrickBtn.setBounds(442, 23, 200, 310);
		myTrickBtn.setIcon(new ImageIcon(myTrickAndPattern));
		add(myTrickBtn);

	}
	
	public void loadImage() {
		try {
			myPersonalNotes=ImageIO.read(new File("image/mypersonal.png"));
			myTrickAndPattern=ImageIO.read(new File("image/mypattern.png"));
		} catch (IOException ie) {
			System.out.println("Image Null");
			ie.printStackTrace();
		}
	}
}
