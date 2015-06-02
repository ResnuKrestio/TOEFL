package toefl.main.exercise.view;

import java.awt.Container;
import java.awt.Font;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import screen.MainFrame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Title extends JPanel {

	/**
	 * Create the panel.
	 */
	public Title() {
		setLayout(null);
		setBackground(Color.WHITE);
		setSize(MainFrame.workspacePanel.getWidth()-5, 250);
		int exercise = 0;
		String time = null;
		
		JLabel lblTitle1 = new JLabel("YOU ARE ABOUT THE EXERCISE "+exercise, JLabel.CENTER);
		JLabel lblTitle2 = new JLabel("FOR "+time+" DURATION ", JLabel.CENTER);
		lblTitle1.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 30));
		lblTitle1.setBounds(54, 11, 637, 50);
		add(lblTitle1);
		lblTitle2.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 30));
		lblTitle2.setBounds(187, 61, 379, 74);
		add(lblTitle2);
		
		JButton btnStart = new JButton();
		try {
			Image image = ImageIO.read(getClass().getResourceAsStream("startButton.png"));
			btnStart.setIcon(new ImageIcon(image));
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnStart.setBounds(302, 146, 151, 50);		
		add(btnStart);
		
		btnStart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ExercisePane exercise = new ExercisePane();
				exercise.setBounds(0, 0, exercise.getWidth(), exercise.getHeight());
				PopUpExercise.exerciseFrame.getContentPane().removeAll();
				PopUpExercise.exerciseFrame.getContentPane().add(exercise);				
				PopUpExercise.exerciseFrame.revalidate();
				PopUpExercise.exerciseFrame.repaint();
			}
		});
		
		JLabel lblStart = new JLabel("Click START to Begin The Exercise");
		lblStart.setBounds(250, 189, 230, 50);
		lblStart.setHorizontalAlignment(SwingConstants.CENTER);
		lblStart.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		add(lblStart);

	}

}
