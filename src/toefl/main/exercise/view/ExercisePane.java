package toefl.main.exercise.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import screen.MainFrame;
import toefl.main.exercise.model.Answer;
import toefl.main.exercise.model.Question;

@SuppressWarnings("serial")
public class ExercisePane extends JPanel {

	public static String string;
	public static JLabel lblDetik = new JLabel();
	/**
	 * Create the panel.
	 */
	public ExercisePane(Question question, Answer answer) {
		
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setSize(MainFrame.workspacePanel.getWidth(), MainFrame.workspacePanel.getHeight());
//		setSize(MainFrame.workspacePanel.getWidth(), 150);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(null);
		mainPanel.setBounds(0, 0, MainFrame.workspacePanel.getWidth(), 200);
		add(mainPanel);
		
		JLabel lblSoal = new JLabel(question.getQuestion());
		lblSoal.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSoal.setBounds(10, 26, 116, 34);
		mainPanel.add(lblSoal);
		
		JLabel lblA = new JLabel("A.");
		lblA.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblA.setBounds(10, 94, 46, 14);
		mainPanel.add(lblA);
		
		JLabel lblB = new JLabel("B.");
		lblB.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblB.setBounds(10, 119, 46, 14);
		mainPanel.add(lblB);
		
		JLabel lblC = new JLabel("C.");
		lblC.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblC.setBounds(10, 144, 46, 14);
		mainPanel.add(lblC);
		
		JLabel lblD = new JLabel("D.");
		lblD.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblD.setBounds(10, 169, 46, 14);
		mainPanel.add(lblD);
		
		JLabel lblAnswerA = new JLabel(answer.getAnswerA());
		lblAnswerA.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblAnswerA.setBounds(40, 94, 600, 14);
		mainPanel.add(lblAnswerA);
		
		JLabel lblAnswerB = new JLabel(answer.getAnswerB());
		lblAnswerB.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblAnswerB.setBounds(40, 119, 600, 14);
		mainPanel.add(lblAnswerB);
		
		JLabel lblAnswerC = new JLabel(answer.getAnswerC());
		lblAnswerC.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblAnswerC.setBounds(40, 144, 600, 14);
		mainPanel.add(lblAnswerC);
		
		JLabel lblAnswerD = new JLabel(answer.getAnswerD());
		lblAnswerD.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblAnswerD.setBounds(40, 169, 600, 14);
		mainPanel.add(lblAnswerD);
		
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
		
		btnA.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Title.answers.add("A");
				Title.count--;
				Title.timer2.stop();
				Title.detik = Title.delay/1000;
				ExercisePane exerciseP = new ExercisePane(Title.iterator.next(),Title.iteAnswer.next());
				exerciseP.setBounds(0, 0, exerciseP.getWidth(),exerciseP.getHeight());
				PopUpExercise.exerciseFrame.getContentPane().removeAll();
				PopUpExercise.exerciseFrame.getContentPane().add(exerciseP);						
				PopUpExercise.exerciseFrame.revalidate();
				PopUpExercise.exerciseFrame.repaint();
				System.out.println(Title.count);
				System.out.println("A");
				Title.timer.restart();
				Title.timer2.restart();
				if (Title.count==0) {
					Title.getScore();
					Title.timer.stop();
					Title.timer2.stop();
				}
			}
		});
		
		JButton btnB = new JButton("B");
		btnB.setBackground(Color.YELLOW);
		btnB.setLocation(70, 11);
		btnB.setSize(50, 50);
		footerPanel.add(btnB);
		btnB.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		btnB.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Title.answers.add("B");
				Title.count--;
				Title.timer2.stop();
				Title.detik = Title.delay/1000;
				ExercisePane exerciseP = new ExercisePane(Title.iterator.next(),Title.iteAnswer.next());
				exerciseP.setBounds(0, 0, exerciseP.getWidth(),exerciseP.getHeight());
				PopUpExercise.exerciseFrame.getContentPane().removeAll();
				PopUpExercise.exerciseFrame.getContentPane().add(exerciseP);						
				PopUpExercise.exerciseFrame.revalidate();
				PopUpExercise.exerciseFrame.repaint();
				System.out.println(Title.count);
				System.out.println("B");
				Title.timer.restart();
				Title.timer2.restart();
				if (Title.count==0) {
					Title.getScore();
					Title.timer.stop();
					Title.timer2.stop();
				}
			}
		});
		
		JButton btnC = new JButton("C");
		btnC.setBackground(Color.YELLOW);
		btnC.setLocation(130, 11);
		btnC.setSize(50, 50);
		footerPanel.add(btnC);
		btnC.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		btnC.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Title.answers.add("C");
				Title.count--;
				Title.timer2.stop();
				Title.detik = Title.delay/1000;
				ExercisePane exerciseP = new ExercisePane(Title.iterator.next(),Title.iteAnswer.next());
				exerciseP.setBounds(0, 0, exerciseP.getWidth(),exerciseP.getHeight());
				PopUpExercise.exerciseFrame.getContentPane().removeAll();
				PopUpExercise.exerciseFrame.getContentPane().add(exerciseP);						
				PopUpExercise.exerciseFrame.revalidate();
				PopUpExercise.exerciseFrame.repaint();
				System.out.println(Title.count);
				System.out.println("C");
				Title.timer.restart();
				Title.timer2.restart();
				if (Title.count==0) {
					Title.getScore();
					Title.timer.stop();
					Title.timer2.stop();
				}
			}
		});
		
		JButton btnD = new JButton("D");
		btnD.setBackground(Color.YELLOW);
		btnD.setLocation(190, 11);
		btnD.setSize(50, 50);
		footerPanel.add(btnD);
		btnD.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		btnD.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Title.answers.add("D");
				Title.count--;
				Title.timer2.stop();
				Title.detik = Title.delay/1000;
				ExercisePane exerciseP = new ExercisePane(Title.iterator.next(),Title.iteAnswer.next());
				exerciseP.setBounds(0, 0, exerciseP.getWidth(),exerciseP.getHeight());
				PopUpExercise.exerciseFrame.getContentPane().removeAll();
				PopUpExercise.exerciseFrame.getContentPane().add(exerciseP);						
				PopUpExercise.exerciseFrame.revalidate();
				PopUpExercise.exerciseFrame.repaint();
				System.out.println(Title.count);
				System.out.println("D");
				Title.timer.restart();
				Title.timer2.restart();
				if (Title.count==0) {
					Title.getScore();
					Title.timer.stop();
					Title.timer2.stop();
				}
			}
		});
		
		JLabel lblQuestion = new JLabel(question.getQuestion());
		lblQuestion.setLocation(10, 189);
		lblQuestion.setSize(170, 50);
		footerPanel.add(lblQuestion);
		lblQuestion.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		
		lblDetik.setLocation(584, 189);
		lblDetik.setSize(200, 50);
		footerPanel.add(lblDetik);
		lblDetik.setFont(new Font("Tahoma", Font.BOLD, 18));		
	}
}
