/**
 * 
 */
package toefl.main.exercise.view;

import java.awt.Component;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

import main.MainFrame;
import config.Datapool;
import toefl.main.exercise.model.Exercise;
import toefl.main.exercise.model.Package;

/**
 * @author Resnu
 *
 */
public class MenuExercise {
	
	String param = "exercise";
	public Component exerciseMenus(){
		Datapool.init();
		JPanel menusExercise = new JPanel();
		JScrollPane scrollPane = new JScrollPane(menusExercise,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(1, 1, MainFrame.navigationPanel.getWidth()-5,MainFrame.navigationPanel.getHeight()-5);
		menusExercise.setBounds(1, 1, scrollPane.getWidth(),scrollPane.getHeight());
		
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
				for (Package package1 : Datapool.getListPackages()) {
					for (Exercise exercise : Datapool.getListExercises()) {
						if (exercise.getName().equalsIgnoreCase("exercise 1")&&exercise.getPackageId()==package1.getId()) {
							System.out.println("Exercise Id = "+exercise.getPackageId());
							System.out.println("Package id = "+package1.getId());
							PopUpExercise exerciseWin = new PopUpExercise();
							exerciseWin.exerciseWindow(param,exercise,package1);
						}
					}
				}
				
			}
		});
		
		JRadioButton exc237s = new JRadioButton("Exercise 2");
		exc237s.setBounds(30, 40, 20, 10);
		exc237s.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (Package package1 : Datapool.getListPackages()) {
					for (Exercise exercise : Datapool.getListExercises()) {
						if (exercise.getName().equalsIgnoreCase("exercise 2")&&exercise.getPackageId()==package1.getId()) {
							System.out.println("Exercise Id = "+exercise.getPackageId());
							System.out.println("Package id = "+package1.getId());
							PopUpExercise exerciseWin = new PopUpExercise();
							exerciseWin.exerciseWindow(param,exercise,package1);
						}
					}
				}
			}
		});
		
		JRadioButton exc337s = new JRadioButton("Exercise 3");
		exc337s.setBounds(30, 60, 20, 10);
		exc337s.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (Package package1 : Datapool.getListPackages()) {
					for (Exercise exercise : Datapool.getListExercises()) {
						if (exercise.getName().equalsIgnoreCase("exercise 3")&&exercise.getPackageId()==package1.getId()) {
							System.out.println("Exercise Id = "+exercise.getPackageId());
							System.out.println("Package id = "+package1.getId());
							PopUpExercise exerciseWin = new PopUpExercise();
							exerciseWin.exerciseWindow(param,exercise,package1);
						}
					}
				}
			}
		});
		
		JRadioButton exc430s = new JRadioButton("Exercise 4");
		exc430s.setBounds(30, 100, 20, 10);
		exc430s.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (Package package1 : Datapool.getListPackages()) {
					for (Exercise exercise : Datapool.getListExercises()) {
						if (exercise.getName().equalsIgnoreCase("exercise 4")&&exercise.getPackageId()==package1.getId()) {
							System.out.println("Exercise Id = "+exercise.getPackageId());
							System.out.println("Package id = "+package1.getId());
							PopUpExercise exerciseWin = new PopUpExercise();
							exerciseWin.exerciseWindow(param,exercise,package1);
						}
					}
				}
			}
		});
		
		JRadioButton exc530s = new JRadioButton("Exercise 5");
		exc530s.setBounds(30, 120, 20, 10);
		exc530s.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (Package package1 : Datapool.getListPackages()) {
					for (Exercise exercise : Datapool.getListExercises()) {
						if (exercise.getName().equalsIgnoreCase("exercise 5")&&exercise.getPackageId()==package1.getId()) {
							System.out.println("Exercise Id = "+exercise.getPackageId());
							System.out.println("Package id = "+package1.getId());
							PopUpExercise exerciseWin = new PopUpExercise();
							exerciseWin.exerciseWindow(param,exercise,package1);
						}
					}
				}
			}
		});
		
		JRadioButton exc630s = new JRadioButton("Exercise 6");
		exc630s.setBounds(30, 140, 20, 10);
		exc630s.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (Package package1 : Datapool.getListPackages()) {
					for (Exercise exercise : Datapool.getListExercises()) {
						if (exercise.getName().equalsIgnoreCase("exercise 6")&&exercise.getPackageId()==package1.getId()) {
							System.out.println("Exercise Id = "+exercise.getPackageId());
							System.out.println("Package id = "+package1.getId());
							PopUpExercise exerciseWin = new PopUpExercise();
							exerciseWin.exerciseWindow(param,exercise,package1);
						}
					}
				}
			}
		});
		
		JRadioButton exc730s = new JRadioButton("Exercise 7");
		exc730s.setBounds(30, 160, 20, 10);
		exc730s.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (Package package1 : Datapool.getListPackages()) {
					for (Exercise exercise : Datapool.getListExercises()) {
						if (exercise.getName().equalsIgnoreCase("exercise 7")&&exercise.getPackageId()==package1.getId()) {
							System.out.println("Exercise Id = "+exercise.getPackageId());
							System.out.println("Package id = "+package1.getId());
							PopUpExercise exerciseWin = new PopUpExercise();
							exerciseWin.exerciseWindow(param,exercise,package1);
						}
					}
				}
			}
		});
		
		JRadioButton exc825s = new JRadioButton("Exercise 8");
		exc825s.setBounds(30, 200, 20, 10);
		exc825s.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (Package package1 : Datapool.getListPackages()) {
					for (Exercise exercise : Datapool.getListExercises()) {
						if (exercise.getName().equalsIgnoreCase("exercise 8")&&exercise.getPackageId()==package1.getId()) {
							System.out.println("Exercise Id = "+exercise.getPackageId());
							System.out.println("Package id = "+package1.getId());
							PopUpExercise exerciseWin = new PopUpExercise();
							exerciseWin.exerciseWindow(param,exercise,package1);
						}
					}
				}
			}
		});
		
		JRadioButton exc925s = new JRadioButton("Exercise 9");
		exc925s.setBounds(30, 220, 20, 10);
		exc925s.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (Package package1 : Datapool.getListPackages()) {
					for (Exercise exercise : Datapool.getListExercises()) {
						if (exercise.getName().equalsIgnoreCase("exercise 9")&&exercise.getPackageId()==package1.getId()) {
							System.out.println("Exercise Id = "+exercise.getPackageId());
							System.out.println("Package id = "+package1.getId());
							PopUpExercise exerciseWin = new PopUpExercise();
							exerciseWin.exerciseWindow(param,exercise,package1);
						}
					}
				}
			}
		});
		
		JRadioButton exc1025s = new JRadioButton("Exercise 10");
		exc1025s.setBounds(30, 240, 20, 10);
		exc1025s.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (Package package1 : Datapool.getListPackages()) {
					for (Exercise exercise : Datapool.getListExercises()) {
						if (exercise.getName().equalsIgnoreCase("exercise 10")&&exercise.getPackageId()==package1.getId()) {
							System.out.println("Exercise Id = "+exercise.getPackageId());
							System.out.println("Package id = "+package1.getId());
							PopUpExercise exerciseWin = new PopUpExercise();
							exerciseWin.exerciseWindow(param,exercise,package1);
						}
					}
				}
			}
		});
		
		JRadioButton exc1125s = new JRadioButton("Exercise 11");
		exc1125s.setBounds(30, 260, 20, 10);
		exc1125s.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (Package package1 : Datapool.getListPackages()) {
					for (Exercise exercise : Datapool.getListExercises()) {
						if (exercise.getName().equalsIgnoreCase("exercise 11")&&exercise.getPackageId()==package1.getId()) {
							System.out.println("Exercise Id = "+exercise.getPackageId());
							System.out.println("Package id = "+package1.getId());
							PopUpExercise exerciseWin = new PopUpExercise();
							exerciseWin.exerciseWindow(param,exercise,package1);
						}
					}
				}
			}
		});
		
		JRadioButton exc1225s = new JRadioButton("Exercise 12");
		exc1225s.setBounds(30, 280, 20, 10);
		exc1225s.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (Package package1 : Datapool.getListPackages()) {
					for (Exercise exercise : Datapool.getListExercises()) {
						if (exercise.getName().equalsIgnoreCase("exercise 12")&&exercise.getPackageId()==package1.getId()) {
							System.out.println("Exercise Id = "+exercise.getPackageId());
							System.out.println("Package id = "+package1.getId());
							PopUpExercise exerciseWin = new PopUpExercise();
							exerciseWin.exerciseWindow(param,exercise,package1);
						}
					}
				}
			}
		});
		
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
		menusExercise.add(exc825s);
		menusExercise.add(exc925s);
		menusExercise.add(exc1025s);
		menusExercise.add(exc1125s);
		menusExercise.add(exc1225s);
		
		return scrollPane;
	}

}
