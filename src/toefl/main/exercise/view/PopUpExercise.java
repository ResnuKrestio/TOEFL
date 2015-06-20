package toefl.main.exercise.view;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import main.MainFrame;
import toefl.main.answerkey.view.AnsKeyPane;
import toefl.main.exercise.model.Exercise;
import toefl.main.exercise.model.Package;

public class PopUpExercise{
	public static JFrame exerciseFrame = new JFrame();
	
	public void exerciseWindow(String param, Exercise exercise, Package package1){
		exerciseFrame.setTitle("Question video 30 second duration");
		if (param == "exercise") {
			Title title2 = new Title(exercise,package1);	
			title2.setBounds(0, 0, title2.getWidth(), title2.getHeight());
			exerciseFrame.getContentPane().removeAll();
			exerciseFrame.getContentPane().add(title2);
		}else {
			AnsKeyPane ansKeyPane = new AnsKeyPane();
			ansKeyPane.setBounds(0, 0, ansKeyPane.getWidth(), ansKeyPane.getHeight());
			exerciseFrame.getContentPane().removeAll();
			exerciseFrame.getContentPane().add(ansKeyPane);
		}		
		
		exerciseFrame.setResizable(false);
		exerciseFrame.setSize(MainFrame.workspacePanel.getWidth()+40, 535);
		exerciseFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		exerciseFrame.setVisible(true);
	}
}
