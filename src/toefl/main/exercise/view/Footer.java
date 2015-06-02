package toefl.main.exercise.view;

import javax.swing.JButton;
import javax.swing.JPanel;

import screen.MainFrame;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Footer extends JPanel {

	/**
	 * Create the panel.
	 */
	public Footer() {
		setLayout(null);
		setSize(MainFrame.workspacePanel.getWidth(), 150);
		JButton btnA = new JButton("A");
		btnA.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnA.setLocation(10, 11);
		btnA.setSize(50, 50);
		JButton btnB = new JButton("B");
		btnB.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnB.setLocation(70, 11);
		btnB.setSize(50, 50);
		JButton btnC = new JButton("C");
		btnC.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnC.setLocation(130, 11);
		btnC.setSize(50, 50);
		JButton btnD = new JButton("D");
		btnD.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnD.setLocation(190, 11);
		btnD.setSize(50, 50);
		add(btnA);
		add(btnB);
		add(btnC);
		add(btnD);
		
		JLabel lblQuestion = new JLabel("Question ");
		lblQuestion.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblQuestion.setBounds(10, 111, 170, 28);
		add(lblQuestion);
		
		JLabel lblDetik = new JLabel("Detik");
		lblDetik.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDetik.setBounds(468, 111, 97, 28);
		add(lblDetik);
		
	}
}
