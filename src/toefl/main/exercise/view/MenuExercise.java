/**
 * 
 */
package toefl.main.exercise.view;

import java.awt.Component;
import java.awt.Label;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import screen.MainFrame;

/**
 * @author Resnu
 *
 */
public class MenuExercise {
	
	public Component exerciseMenus(){
		JPanel menusExercise = new JPanel();
		menusExercise.setBounds(1, 1, MainFrame.navigationPanel.getWidth() - 5,MainFrame.navigationPanel.getHeight() - 5);
		Label lbl37s = new Label("37 SECOND DURATION");
		//lbl37s.setBounds(1, 1, 50, 20);
		Label lbl30s = new Label("30 SECOND DURATION");
		Label lbl25s = new Label("25 SECOND DURATION");
		
		JRadioButton exc137s = new JRadioButton("Exercise 1");
		JRadioButton exc237s = new JRadioButton("Exercise 2");
		JRadioButton exc337s = new JRadioButton("Exercise 3");
		JRadioButton exc430s = new JRadioButton("Exercise 4");
		JRadioButton exc530s = new JRadioButton("Exercise 5");
		JRadioButton exc630s = new JRadioButton("Exercise 6");
		JRadioButton exc730s = new JRadioButton("Exercise 7");
		JRadioButton exc825s = new JRadioButton("Exercise 8");
		JRadioButton exc925s = new JRadioButton("Exercise 9");
		JRadioButton exc1025s = new JRadioButton("Exercise 10");
		JRadioButton exc1125s = new JRadioButton("Exercise 11");
		JRadioButton exc1225s = new JRadioButton("Exercise 12");
		
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
		
		menusExercise.setLayout(new BoxLayout(menusExercise, BoxLayout.Y_AXIS));
		menusExercise.add(lbl37s);
		menusExercise.add(exc137s);
		menusExercise.add(exc237s);
		menusExercise.add(exc337s);
		menusExercise.add(lbl30s);
		menusExercise.add(exc430s);
		menusExercise.add(exc530s);
		menusExercise.add(exc630s);
		menusExercise.add(exc730s);
		menusExercise.add(lbl25s);
		
		return menusExercise;
	}

}
