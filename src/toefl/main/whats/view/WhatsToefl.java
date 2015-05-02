package toefl.main.whats.view;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import screen.MainFrame;

public class WhatsToefl {

	public Component Abouts() {
		JPanel panelAbout = new JPanel();
		panelAbout.setBounds(1, 1, MainFrame.navigationPanel.getWidth() - 5,
				MainFrame.navigationPanel.getHeight() - 5);
		JLabel label = new JLabel("What's TOEFL");
		label.setBounds(1, 1, 50, 20);
		JRadioButton historyRadioButton = new JRadioButton("HYSTORI");
		historyRadioButton.setBounds(10, 5, 20, 5);
		JRadioButton ibtRadioButton = new JRadioButton("IBT");
		ibtRadioButton.setBounds(15, 5, 20, 5);
		JRadioButton pbtRadioButton = new JRadioButton("PBT");
		pbtRadioButton.setBounds(20, 5, 20, 5);
		JRadioButton itpRadioButton = new JRadioButton("ITP");
		itpRadioButton.setBounds(25, 5, 20, 5);
		JRadioButton scoreRadioButton = new JRadioButton("Nilai");
		scoreRadioButton.setBounds(30, 5, 20, 5);
		JRadioButton regulationRadioButton = new JRadioButton("REGULATION");
		regulationRadioButton.setBounds(35, 5, 20, 5);
		ButtonGroup groupButton = new ButtonGroup();
		groupButton.add(historyRadioButton);
		groupButton.add(ibtRadioButton);
		groupButton.add(pbtRadioButton);
		groupButton.add(itpRadioButton);
		groupButton.add(scoreRadioButton);
		groupButton.add(regulationRadioButton);

		historyRadioButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JTextArea textArea = new JTextArea();				
				JScrollPane areaScrollPane = new JScrollPane(textArea,
		                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
		                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);;	
				areaScrollPane.setBounds(1, 1, MainFrame.workspacePanel.getWidth(),
						MainFrame.workspacePanel.getHeight());
				
				textArea.setBounds(1, 1, areaScrollPane.getWidth(),
						areaScrollPane.getHeight());
				try {
					FileReader textReader = new FileReader("src/toefl/main/whats/view/History.txt");
					BufferedReader reader = new BufferedReader(textReader);
					textArea.read(reader, "Test Read .txt");
					MainFrame.workspacePanel.removeAll();
					MainFrame.workspacePanel.add(areaScrollPane);
					MainFrame.workspacePanel.repaint();
					reader.close();
				} catch (Exception e1) {
					e1.printStackTrace();
				}				
			}
		});
		
		ibtRadioButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextArea textArea = new JTextArea();				
				JScrollPane areaScrollPane = new JScrollPane(textArea,
		                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
		                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);;	
				areaScrollPane.setBounds(1, 1, MainFrame.workspacePanel.getWidth(),
						MainFrame.workspacePanel.getHeight());
				
				textArea.setBounds(1, 1, areaScrollPane.getWidth(),
						areaScrollPane.getHeight());
				try {
					FileReader textReader = new FileReader("src/toefl/main/whats/view/IBT.txt");
					BufferedReader reader = new BufferedReader(textReader);
					textArea.read(reader, "Test Read .txt");
					MainFrame.workspacePanel.removeAll();
					MainFrame.workspacePanel.add(areaScrollPane);
					MainFrame.workspacePanel.repaint();
					reader.close();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		
		pbtRadioButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextArea textArea = new JTextArea();				
				JScrollPane areaScrollPane = new JScrollPane(textArea,
		                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
		                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);;	
				areaScrollPane.setBounds(1, 1, MainFrame.workspacePanel.getWidth(),
						MainFrame.workspacePanel.getHeight());
				
				textArea.setBounds(1, 1, areaScrollPane.getWidth(),
						areaScrollPane.getHeight());
				try {
					FileReader textReader = new FileReader("src/toefl/main/whats/view/PBT.txt");
					BufferedReader reader = new BufferedReader(textReader);
					textArea.read(reader, "Test Read .txt");
					MainFrame.workspacePanel.removeAll();
					MainFrame.workspacePanel.add(areaScrollPane);
					MainFrame.workspacePanel.repaint();
					reader.close();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		
		itpRadioButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextArea textArea = new JTextArea();				
				JScrollPane areaScrollPane = new JScrollPane(textArea,
		                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
		                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);;	
				areaScrollPane.setBounds(1, 1, MainFrame.workspacePanel.getWidth(),
						MainFrame.workspacePanel.getHeight());
				
				textArea.setBounds(1, 1, areaScrollPane.getWidth(),
						areaScrollPane.getHeight());
				try {
					FileReader textReader = new FileReader("src/toefl/main/whats/view/ITP.txt");
					BufferedReader reader = new BufferedReader(textReader);
					textArea.read(reader, "Test Read .txt");
					MainFrame.workspacePanel.removeAll();
					MainFrame.workspacePanel.add(areaScrollPane);
					MainFrame.workspacePanel.repaint();
					reader.close();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});

		panelAbout.setLayout(new GridLayout(8, 1));
		panelAbout.add(label);
		panelAbout.add(historyRadioButton);
		panelAbout.add(ibtRadioButton);
		panelAbout.add(pbtRadioButton);
		panelAbout.add(itpRadioButton);
		panelAbout.add(scoreRadioButton);
		panelAbout.add(regulationRadioButton);

		return panelAbout;
	}
}
