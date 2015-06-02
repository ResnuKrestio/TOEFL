/**
 * 
 */
package toefl.main.abouts.view;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import screen.MainFrame;
import config.ConfigurationManager;

/**
 * @author Resnu
 *
 */
public class AboutThisApp {
	
	public Component Abouts() {
		JPanel panelAbout = new JPanel();
		panelAbout.setBounds(1, 1, MainFrame.navigationPanel.getWidth() - 5,
				MainFrame.navigationPanel.getHeight() - 5);
		JRadioButton first = new JRadioButton("TOEFL is an easy Application");
		first.setBounds(1, 1, 50, 20);
		JRadioButton second = new JRadioButton("Whats In This Application");
		second.setBounds(10, 5, 20, 5);
		JRadioButton third = new JRadioButton("How To Use This Application");
		third.setBounds(15, 5, 20, 5);
		
		ButtonGroup groupButton = new ButtonGroup();
		groupButton.add(first);
		groupButton.add(second);
		groupButton.add(third);
		
		first.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JTextArea textArea = new JTextArea();				
				JScrollPane areaScrollPane = new JScrollPane(textArea,
		                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
		                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);;	
				areaScrollPane.setBounds(1, 1, MainFrame.workspacePanel.getWidth(),
						MainFrame.workspacePanel.getHeight());
				
				textArea.setBounds(1, 1, areaScrollPane.getWidth(),
						areaScrollPane.getHeight());
				try {
					FileReader textReader = new FileReader(ConfigurationManager.getConfiguration("whatstoeflcomeseasy"));
					BufferedReader reader = new BufferedReader(textReader);
					textArea.read(reader, "Test Read .txt");
					MainFrame.workspacePanel.removeAll();
					MainFrame.workspacePanel.add(areaScrollPane);
					MainFrame.workspacePanel.repaint();
					reader.close();
				} catch (Exception e1) {
					e1.printStackTrace();
				}				
			}
		});
		
		second.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextArea textArea = new JTextArea();				
				JScrollPane areaScrollPane = new JScrollPane(textArea,
		                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
		                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);;	
				areaScrollPane.setBounds(1, 1, MainFrame.workspacePanel.getWidth(),
						MainFrame.workspacePanel.getHeight());
				
				textArea.setBounds(1, 1, areaScrollPane.getWidth(),
						areaScrollPane.getHeight());
				try {
					FileReader textReader = new FileReader(ConfigurationManager.getConfiguration("whatinthisapplication"));
					BufferedReader reader = new BufferedReader(textReader);
					textArea.read(reader, "Test Read .txt");
					MainFrame.workspacePanel.removeAll();
					MainFrame.workspacePanel.add(areaScrollPane);
					MainFrame.workspacePanel.repaint();
					reader.close();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		
		third.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextArea textArea = new JTextArea();				
				JScrollPane areaScrollPane = new JScrollPane(textArea,
		                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
		                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);;	
				areaScrollPane.setBounds(1, 1, MainFrame.workspacePanel.getWidth(),
						MainFrame.workspacePanel.getHeight());
				
				textArea.setBounds(1, 1, areaScrollPane.getWidth(),
						areaScrollPane.getHeight());
				try {
					FileReader textReader = new FileReader(ConfigurationManager.getConfiguration("howtouse"));
					BufferedReader reader = new BufferedReader(textReader);
					textArea.read(reader, "Test Read .txt");
					MainFrame.workspacePanel.removeAll();
					MainFrame.workspacePanel.add(areaScrollPane);
					MainFrame.workspacePanel.repaint();
					reader.close();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		
		
		panelAbout.setLayout(new BoxLayout(panelAbout, BoxLayout.Y_AXIS));
		panelAbout.add(first);
		panelAbout.add(second);
		panelAbout.add(third);
		return panelAbout;
	}

}
