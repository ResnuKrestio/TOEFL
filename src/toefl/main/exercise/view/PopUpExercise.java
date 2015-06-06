package toefl.main.exercise.view;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import screen.MainFrame;

public class PopUpExercise {
	public static JFrame exerciseFrame = new JFrame();
	public void exerciseWindow(){
		exerciseFrame.setResizable(false);
		Title title2 = new Title();
	
		title2.setBounds(0, 0, title2.getWidth(), title2.getHeight());
		exerciseFrame.getContentPane().removeAll();
		exerciseFrame.getContentPane().add(title2);
		exerciseFrame.setSize(MainFrame.workspacePanel.getWidth(), MainFrame.workspacePanel.getHeight());
		exerciseFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		exerciseFrame.setVisible(true);
	}
}
