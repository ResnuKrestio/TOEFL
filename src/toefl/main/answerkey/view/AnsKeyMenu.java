package toefl.main.answerkey.view;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;

import screen.MainFrame;
import toefl.main.exercise.view.PopUpExercise;

@SuppressWarnings("serial")
public class AnsKeyMenu extends JPanel {

	String param = "anskey";
	
	/**
	 * Create the panel.
	 */
	public AnsKeyMenu() {
		
		JScrollPane scrollPane = new JScrollPane(this, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(1, 1, MainFrame.navigationPanel.getWidth()-5,MainFrame.navigationPanel.getHeight()-5);
		setBounds(1, 1, MainFrame.navigationPanel.getWidth()-5,MainFrame.navigationPanel.getHeight()-5);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		Label lbl37s = new Label("37 SECOND DURATION");
		lbl37s.setBounds(1, 1, 20, 10);
		Label lbl30s = new Label("30 SECOND DURATION");
		lbl30s.setBounds(1, 80, 20, 10);
		Label lbl25s = new Label("25 SECOND DURATION");
		lbl25s.setBounds(1, 180, 20, 10);
		Label lbl24s = new Label("25 SECOND DURATION");
		lbl24s.setBounds(1, 260, 20, 10);
		
		JRadioButton exc137s = new JRadioButton("Exercise 1");
		exc137s.setBounds(30, 20, 20, 10);
		exc137s.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				PopUpExercise exercise = new PopUpExercise();
				exercise.exerciseWindow(param,null,null);
			}
		});
		JRadioButton exc237s = new JRadioButton("Exercise 2");
		exc237s.setBounds(30, 40, 20, 10);
		JRadioButton exc337s = new JRadioButton("Exercise 3");
		exc337s.setBounds(30, 60, 20, 10);
		JRadioButton exc430s = new JRadioButton("Exercise 4");
		exc430s.setBounds(30, 100, 20, 10);
		JRadioButton exc530s = new JRadioButton("Exercise 5");
		exc530s.setBounds(30, 120, 20, 10);
		JRadioButton exc630s = new JRadioButton("Exercise 6");
		exc630s.setBounds(30, 140, 20, 10);
		JRadioButton exc730s = new JRadioButton("Exercise 7");
		exc730s.setBounds(30, 160, 20, 10);
		JRadioButton exc825s = new JRadioButton("Exercise 8");
		exc825s.setBounds(30, 200, 20, 10);
		JRadioButton exc925s = new JRadioButton("Exercise 9");
		exc925s.setBounds(30, 220, 20, 10);
		JRadioButton exc1025s = new JRadioButton("Exercise 10");
		exc1025s.setBounds(30, 240, 20, 10);
		JRadioButton exc1125s = new JRadioButton("Exercise 11");
		exc1125s.setBounds(30, 260, 20, 10);
		JRadioButton exc1225s = new JRadioButton("Exercise 12");
		exc1225s.setBounds(30, 280, 20, 10);
		
		ButtonGroup group = new ButtonGroup();
		group.add(exc137s);
		group.add(exc237s);
		group.add(exc337s);
		group.add(exc430s);
		group.add(exc530s);
		group.add(exc630s);
		group.add(exc730s);
		group.add(exc825s);
		group.add(exc925s);
		group.add(exc1025s);
		group.add(exc1125s);
		group.add(exc1225s);
		
		add(lbl37s);
		add(exc137s);
		add(exc237s);
		add(exc337s);
		add(lbl30s);
		add(exc430s);
		add(exc530s);
		add(exc630s);
		add(exc730s);
		add(lbl25s);
		add(exc825s);
		add(exc925s);
		add(exc1025s);
		add(exc1125s);
		add(exc1225s);

	}

}
