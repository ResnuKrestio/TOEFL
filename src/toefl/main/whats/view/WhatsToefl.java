package toefl.main.whats.view;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import screen.MainFrame;
import config.ConfigurationManager;

public class WhatsToefl {

	public Component Whats() {
		JPanel panelAbout = new JPanel();
		panelAbout.setBounds(1, 1, MainFrame.navigationPanel.getWidth() - 5,MainFrame.navigationPanel.getHeight() - 5);
		JLabel label = new JLabel("What's TOEFL");
		label.setBounds(1, 1, 50, 20);
		JRadioButton historyRadioButton = new JRadioButton("HISTORY");
		historyRadioButton.setBounds(10, 5, 20, 5);
		JRadioButton ibtRadioButton = new JRadioButton("IBT");
		ibtRadioButton.setBounds(15, 10, 20, 5);
		JRadioButton pbtRadioButton = new JRadioButton("PBT");
		pbtRadioButton.setBounds(20, 10, 20, 5);
		JRadioButton cbtRadioButton = new JRadioButton("CBT");
		cbtRadioButton.setBounds(25, 10, 20, 5);
		JRadioButton itpRadioButton = new JRadioButton("ITP");
		itpRadioButton.setBounds(30, 10, 20, 5);
		JRadioButton scoreRadioButton = new JRadioButton("Nilai");
		scoreRadioButton.setBounds(35, 10, 20, 5);
		JRadioButton regulationRadioButton = new JRadioButton("REGULATION");
		regulationRadioButton.setBounds(40, 10, 20, 5);
		ButtonGroup groupButton = new ButtonGroup();
		groupButton.add(historyRadioButton);
		groupButton.add(ibtRadioButton);
		groupButton.add(pbtRadioButton);
		groupButton.add(cbtRadioButton);
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
						areaScrollPane.setBounds(1, 1, MainFrame.workspacePanel.getWidth(),MainFrame.workspacePanel.getHeight());

						textArea.setBounds(1, 1, areaScrollPane.getWidth(),areaScrollPane.getHeight());
						try {
							FileReader textReader = new FileReader(ConfigurationManager.getConfiguration("history"));
							BufferedReader reader = new BufferedReader(textReader);
							textArea.read(reader, "Test Read .txt");
							textArea.setEditable(false);
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
							FileReader textReader = new FileReader(ConfigurationManager.getConfiguration("ibt"));
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
						areaScrollPane.setBounds(1, 1, MainFrame.workspacePanel.getWidth(),MainFrame.workspacePanel.getHeight());

						textArea.setBounds(1, 1, areaScrollPane.getWidth(),
								areaScrollPane.getHeight());
						try {
							FileReader textReader = new FileReader(ConfigurationManager.getConfiguration("pbt"));
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
		
		cbtRadioButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JTextArea textArea = new JTextArea();				
				JScrollPane areaScrollPane = new JScrollPane(textArea,
						JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
						JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);;	
						areaScrollPane.setBounds(1, 1, MainFrame.workspacePanel.getWidth(),MainFrame.workspacePanel.getHeight());

						textArea.setBounds(1, 1, areaScrollPane.getWidth(),
								areaScrollPane.getHeight());
						try {
							FileReader textReader = new FileReader(ConfigurationManager.getConfiguration("cbt"));
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
						areaScrollPane.setBounds(1, 1, MainFrame.workspacePanel.getWidth(),MainFrame.workspacePanel.getHeight());

						textArea.setBounds(1, 1, areaScrollPane.getWidth(),areaScrollPane.getHeight());
						try {
							FileReader textReader = new FileReader(ConfigurationManager.getConfiguration("itp"));
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

		panelAbout.setLayout(new BoxLayout(panelAbout, BoxLayout.Y_AXIS));
		panelAbout.add(label);
		panelAbout.add(historyRadioButton);
		panelAbout.add(ibtRadioButton);
		panelAbout.add(pbtRadioButton);
		panelAbout.add(cbtRadioButton);
		panelAbout.add(itpRadioButton);
		panelAbout.add(scoreRadioButton);
		panelAbout.add(regulationRadioButton);

		return panelAbout;
	}
}
