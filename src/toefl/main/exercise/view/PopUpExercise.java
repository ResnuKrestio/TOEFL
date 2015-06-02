package toefl.main.exercise.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import screen.MainFrame;

public class PopUpExercise {

	public void exerciseWindow(){
		JPanel panel = new JPanel();
		JFrame exerciseFrame = new JFrame();
		Title title2 = new Title();
		Footer footer = new Footer();
		title2.setBounds(0, 0, title2.getWidth(), title2.getHeight());
		panel.add(title2);
		footer.setBounds(0, title2.getHeight(), footer.getWidth(), footer.getHeight());
		panel.add(footer);
		panel.setBounds(0, 0, exerciseFrame.getWidth(), exerciseFrame.getHeight());
		panel.setOpaque(true);
		exerciseFrame.add(panel);
		
		exerciseFrame.setSize(MainFrame.workspacePanel.getWidth(), MainFrame.workspacePanel.getHeight());
		exerciseFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		exerciseFrame.setVisible(true);
	}
}
