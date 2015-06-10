package toefl.main.exercise.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import screen.MainFrame;
import toefl.main.exercise.model.Answer;
import toefl.main.exercise.model.Exercise;
import toefl.main.exercise.model.Package;
import toefl.main.exercise.model.Question;

@SuppressWarnings("serial")
public class Title extends JPanel {
	int count;
	private int delay;
	int detik;
	Exercise exercise;
	String time = null;
	String a = "A";
	String b = "B";
	String c = "C";
	String d = "D";
	String e = "E";
	String label;
	Timer timer;
	Timer timer2;
	

	/**
	 * Create the panel.
	 */
	public Title(final Exercise exercise, Package package1) {
		this.exercise = exercise;
		count = exercise.getQuestions().size();
		delay = package1.getDuration()*100;
		detik = 3000/1000;
		setLayout(null);
		setBackground(Color.WHITE);
		setSize(MainFrame.workspacePanel.getWidth() - 5, 250);		
		
		JLabel lblTitle1 = new JLabel("YOU ARE ABOUT THE " + exercise.getName(),
				JLabel.CENTER);
		JLabel lblTitle2 = new JLabel("FOR " + package1.getDuration() + " DURATION ",
				JLabel.CENTER);
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
		} catch (Exception ex) {
			// TODO: handle exception
		}
		btnStart.setBounds(302, 146, 151, 50);
		add(btnStart);
		btnStart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(exercise.getId());
				final Iterator<Question>iterator=exercise.getQuestions().iterator();
				final Iterator<Answer>iteAnswer=exercise.getAnswers().iterator();
				start(iterator, iteAnswer);
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
	
	public void start(final Iterator<Question>iterator, final Iterator<Answer> iterAnwer) {
		
			timer = new Timer(delay, new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {					
					if (iterator.hasNext()) {
						timer2 = new Timer(1000, new ActionListener() {							
							@Override
							public void actionPerformed(ActionEvent e) {								
								if (detik==0&&count==0) {
									timer2.stop();									
								}else if (detik==0) {
									timer2.stop();
									detik = delay/1000;
								} else{
									System.out.println(detik);
									ExercisePane.lblDetik.setText(detik+" Detik");
									detik--;
								}
							}
						});
						
						count--;
						System.out.println(count);
						ExercisePane exerciseP = new ExercisePane(iterator.next(),iterAnwer.next());
						exerciseP.setBounds(0, 0, exerciseP.getWidth(),exerciseP.getHeight());
						PopUpExercise.exerciseFrame.getContentPane().removeAll();
						PopUpExercise.exerciseFrame.getContentPane().add(exerciseP);
						
						PopUpExercise.exerciseFrame.revalidate();
						PopUpExercise.exerciseFrame.repaint();
						timer2.start();
						
					}
					
					if(count==0){
						timer.stop();
					}					
				}
			});
			Question question = new Question();
			question.setQuestion("Please Wait");
			Answer answers = new Answer();
			System.out.println("id di start"+exercise.getId());
			ExercisePane exercise = new ExercisePane(question,answers);
			exercise.setBounds(0, 0, exercise.getWidth(),exercise.getHeight());
			PopUpExercise.exerciseFrame.getContentPane().removeAll();
			PopUpExercise.exerciseFrame.getContentPane().add(exercise);
			PopUpExercise.exerciseFrame.revalidate();
			PopUpExercise.exerciseFrame.repaint();
			timer.start();
				
	}
}
