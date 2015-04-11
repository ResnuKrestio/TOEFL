package toefl.main.about.view;

import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import screen.MainFrame;

public class About {
	
	public Component Abouts() {
		JPanel panelAbout = new JPanel();
		panelAbout.setBounds(1, 1, MainFrame.navigationPanel.getWidth()-5, MainFrame.navigationPanel.getHeight()-5);
		JLabel label = new JLabel("What's TOEFL");
		label.setBounds(1, 1, 50, 20);
		JRadioButton historyRadioButton = new JRadioButton("SEJARAH");
		historyRadioButton.setBounds(10, 5, 20, 5);
		JRadioButton ibtRadioButton = new JRadioButton("IBT");
		ibtRadioButton.setBounds(15, 5, 20, 5);
		JRadioButton pbtRadioButton = new JRadioButton("PBT");
		pbtRadioButton.setBounds(20, 5, 20, 5);
		JRadioButton itpRadioButton = new JRadioButton("ITP");
		itpRadioButton.setBounds(25, 5, 20, 5);
		JRadioButton scoreRadioButton = new JRadioButton("SCORE");
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
