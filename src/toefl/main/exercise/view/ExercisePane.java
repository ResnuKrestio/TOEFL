package toefl.main.exercise.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import screen.MainFrame;

@SuppressWarnings("serial")
public class ExercisePane extends JPanel {

	public static String string;
	/**
	 * Create the panel.
	 */
	public ExercisePane(String label) {
		
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setSize(MainFrame.workspacePanel.getWidth(), MainFrame.workspacePanel.getHeight());
//		setSize(MainFrame.workspacePanel.getWidth(), 150);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(null);
		mainPanel.setBounds(0, 0, MainFrame.workspacePanel.getWidth(), 200);
		add(mainPanel);
		
		JLabel lblNewLabel = new JLabel(label);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(350, 81, 116, 34);
		mainPanel.add(lblNewLabel);
		
		JPanel footerPanel = new JPanel();
		footerPanel.setLayout(null);
		footerPanel.setBackground(Color.GRAY);
		footerPanel.setBounds(0, 350, MainFrame.workspacePanel.getWidth(), 100);
		add(footerPanel);

		JButton btnA = new JButton("A");
		btnA.setBackground(Color.YELLOW);
		btnA.setLocation(10, 11);
		btnA.setSize(50, 50);
		footerPanel.add(btnA);
		btnA.setFont(new Font("Tahoma", Font.BOLD, 18));
		JButton btnB = new JButton("B");
		btnB.setBackground(Color.YELLOW);
		btnB.setLocation(70, 11);
		btnB.setSize(50, 50);
		footerPanel.add(btnB);
		btnB.setFont(new Font("Tahoma", Font.BOLD, 18));
		JButton btnC = new JButton("C");
		btnC.setBackground(Color.YELLOW);
		btnC.setLocation(130, 11);
		btnC.setSize(50, 50);
		footerPanel.add(btnC);
		btnC.setFont(new Font("Tahoma", Font.BOLD, 18));
		JButton btnD = new JButton("D");
		btnD.setBackground(Color.YELLOW);
		btnD.setLocation(190, 11);
		btnD.setSize(50, 50);
		footerPanel.add(btnD);
		btnD.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel lblQuestion = new JLabel("Question ");
		lblQuestion.setLocation(10, 189);
		lblQuestion.setSize(100, 50);
		footerPanel.add(lblQuestion);
		lblQuestion.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel lblDetik = new JLabel(string);
		lblDetik.setLocation(584, 189);
		lblDetik.setSize(200, 50);
		footerPanel.add(lblDetik);
		lblDetik.setFont(new Font("Tahoma", Font.BOLD, 18));		
	}
}
