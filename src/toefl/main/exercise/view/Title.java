package toefl.main.exercise.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import org.eclipse.swt.internal.theme.Theme;

import screen.MainFrame;

@SuppressWarnings("serial")
public class Title extends JPanel {

	private int counter = 10;
	private int delay = 3000;
	List<String> strings = new ArrayList<String>();
	int exercise = 0;
	String time = null;
	String a = "A";
	String b = "B";
	String c = "C";
	String d = "D";
	String e = "E";
	Timer timer;

	/**
	 * Create the panel.
	 */
	public Title() {
		setLayout(null);
		setBackground(Color.WHITE);
		setSize(MainFrame.workspacePanel.getWidth() - 5, 250);		
		strings.add(a);
		strings.add(b);
		strings.add(c);
		strings.add(d);
		strings.add(e);
		
		final Map<String, String> maps = new HashMap<>();
		for (String string : strings) {
			maps.put(string, string);
		}
		
		final String[] store = new String[]{"A","B","C","D","E"};
		JLabel lblTitle1 = new JLabel("YOU ARE ABOUT THE EXERCISE " + exercise,
				JLabel.CENTER);
		JLabel lblTitle2 = new JLabel("FOR " + time + " DURATION ",
				JLabel.CENTER);
		lblTitle1.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 30));
		lblTitle1.setBounds(54, 11, 637, 50);
		add(lblTitle1);
		lblTitle2.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 30));
		lblTitle2.setBounds(187, 61, 379, 74);
		add(lblTitle2);

		JButton btnStart = new JButton();
		try {
			Image image = ImageIO.read(getClass().getResourceAsStream(
					"startButton.png"));
			btnStart.setIcon(new ImageIcon(image));
		} catch (Exception ex) {
			// TODO: handle exception
		}
		btnStart.setBounds(302, 146, 151, 50);
		add(btnStart);
		
		
		
		btnStart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				start();
			}
		});	
				/*for (int i = 0; i < store.length; i++) {*/
					
//				counter(counter);
//				
				
				
				/*Timer timer = null;
				
				for (final String string : strings) {
					
					timer = new Timer(3000, new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							
							System.out.println("ini di for - "+strings.indexOf(string));
							
//							System.out.println("Lagi di - "
//									+ string);
//							ExercisePane exercise = new ExercisePane(string);
//							exercise.setBounds(0, 0, exercise.getWidth(),
//									exercise.getHeight());
//							PopUpExercise.exerciseFrame.getContentPane()
//									.removeAll();
//							PopUpExercise.exerciseFrame.getContentPane().add(
//									exercise);					
//							PopUpExercise.exerciseFrame.revalidate();
//							PopUpExercise.exerciseFrame.repaint();
						}
						
					}); //timer.stop();
					timer.start();
				}*/
				
				/*for (String string : strings) {
					try {
						Thread.sleep(3000);
						System.out.println(string);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}*/
				
//			}
//
//			private void counter(final int counter) {
//				ActionListener actionListener = new ActionListener() {
//						
//					int counter2;
//						@Override
//						public void actionPerformed(ActionEvent e) {
//							//System.out.println("ini di for - "+strings.indexOf(string));
//							//System.out.println(string);
//							//System.out.println(store[i]);
//							counter2=counter+1;
//							
//							System.out.println(counter2);
//						}
//					};
//				//}
//				
//				Timer timer = new Timer(500, actionListener);
//				timer.start();
//			}
//
//		});

		JLabel lblStart = new JLabel("Click START to Begin The Exercise");
		lblStart.setBounds(250, 189, 230, 50);
		lblStart.setHorizontalAlignment(SwingConstants.CENTER);
		lblStart.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		add(lblStart);

	}
	
	public void start() {
		
		for (String string : strings) {
			
			try {
				Thread.sleep(3000);
				ExercisePane exercise = new ExercisePane(string);
				exercise.setBounds(0, 0, exercise.getWidth(),
						exercise.getHeight());
				PopUpExercise.exerciseFrame.getContentPane()
						.removeAll();
				PopUpExercise.exerciseFrame.getContentPane().add(
						exercise);					
				PopUpExercise.exerciseFrame.revalidate();
				PopUpExercise.exerciseFrame.repaint();
				System.out.println(string);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			/*if (counter == 0) {
				timer.stop();				
				ExercisePane exercise = new ExercisePane(string);
				exercise.setBounds(0, 0, exercise.getWidth(),
						exercise.getHeight());
				PopUpExercise.exerciseFrame.getContentPane()
						.removeAll();
				PopUpExercise.exerciseFrame.getContentPane().add(
						exercise);					
				PopUpExercise.exerciseFrame.revalidate();
				PopUpExercise.exerciseFrame.repaint();
			} else {
				ExercisePane.string = "Wait for " + counter + " sec";
				counter--;
				System.out.println(string);
				System.out.println(counter);
			}*/
		}
		
//		ActionListener actionListener = new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				for (String string : strings) {
//					if (counter == 0) {
//						timer.stop();
//						
//						ExercisePane exercise = new ExercisePane(string);
//						exercise.setBounds(0, 0, exercise.getWidth(),
//								exercise.getHeight());
//						PopUpExercise.exerciseFrame.getContentPane()
//								.removeAll();
//						PopUpExercise.exerciseFrame.getContentPane().add(
//								exercise);					
//						PopUpExercise.exerciseFrame.revalidate();
//						PopUpExercise.exerciseFrame.repaint();
//					} else {
//						ExercisePane.string = "Wait for " + counter + " sec";
//						counter--;
//						System.out.println(string);
//						System.out.println(counter);
//					}
//				}
//			}
//		};
//		timer = new Timer(delay, actionListener);
//		timer.setInitialDelay(0);
//		timer.start();
	}

}
