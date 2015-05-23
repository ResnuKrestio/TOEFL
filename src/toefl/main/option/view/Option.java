package toefl.main.option.view;

import java.awt.Component;

import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

import screen.MainFrame;

public class Option {
	
	public Component option() {
		JPanel panelOption = new JPanel();
		JCheckBox popUpscore = new JCheckBox("Show Popup Score");
		JCheckBox myScore = new JCheckBox("Show My Score");
		JCheckBox timer = new JCheckBox("Show Timer");
		JCheckBox saveProgressHistory = new JCheckBox("Save Progress History");
		JCheckBox showProgressTable = new JCheckBox("Show My Progress Table");	
		
		panelOption.setLayout(new BoxLayout(panelOption, BoxLayout.Y_AXIS));
		panelOption.setBounds(1, 1, MainFrame.workspacePanel.getWidth(), MainFrame.workspacePanel.getHeight());
		panelOption.add(popUpscore);
		panelOption.add(myScore);
		panelOption.add(timer);
		panelOption.add(saveProgressHistory);
		panelOption.add(showProgressTable);
		
		return panelOption;
	}

}
