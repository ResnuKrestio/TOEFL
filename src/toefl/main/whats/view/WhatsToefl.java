package toefl.main.whats.view;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
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
				textArea.setBounds(1, 1, MainFrame.workspacePanel.getWidth(),
						MainFrame.workspacePanel.getHeight());
				try {
					FileReader textReader = new FileReader(
							"F://App Herry/History.txt");
					BufferedReader buffer = new BufferedReader(textReader);
					textArea.read(buffer, "Test Read .txt");
					buffer.close();
					MainFrame.workspacePanel.repaint();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				MainFrame.workspacePanel.add(textArea);
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
