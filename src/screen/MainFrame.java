package screen;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

import toefl.component.panel.HeaderPanel;
import toefl.component.panel.NavigationPanel;
import toefl.component.panel.WorkspacePanel;
import toefl.main.abouts.view.AboutThisApp;
import toefl.main.mynotes.view.MyNotes;
import toefl.main.option.view.Option;
import toefl.main.whats.view.WhatsToefl;
import config.ConfigurationManager;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {

	
	private JPanel contentPane;
	WhatsToefl whats = new WhatsToefl();
	AboutThisApp about = new AboutThisApp();
	Option option = new Option();
	MyNotes myNotes = new MyNotes();
	public static WorkspacePanel workspacePanel = new WorkspacePanel();
	public static HeaderPanel headerPanel = new HeaderPanel();
	public static NavigationPanel navigationPanel = new NavigationPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConfigurationManager.init();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {					
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public MainFrame() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1034, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(75, 0, 130));

		headerPanel.setBounds(0, 0, 1008, 150);
		headerPanel.setBackground(new Color(75, 0, 130));

		navigationPanel.setBorder(UIManager.getBorder("InternalFrame.border"));
		navigationPanel.setBounds(10, 150,
		240, 500);
		navigationPanel.setBackground(new Color(240, 248, 255));
		workspacePanel.setBorder(UIManager.getBorder("InternalFrame.border"));

		workspacePanel.setBounds(250, 150, 758, 500);
		workspacePanel.setBackground(new Color(240, 248, 255));
		contentPane.setLayout(null);
		contentPane.add(headerPanel, "wrap, pushx, growx");
		try {
			BufferedImage image = ImageIO.read(getClass().getResourceAsStream(
					"HeadLogo.png"));
			JLabel imageLabel = new JLabel(new ImageIcon(image));
			imageLabel.setBounds(10, 0, 1008, 100);
			headerPanel.add(imageLabel);
		} catch (Exception e) {
			e.printStackTrace();
		}

		JButton btnWhats = new JButton("WHAT'S TOEFL");
		btnWhats.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnWhats.setBounds(10, 111, 150, 35);
		headerPanel.add(btnWhats);
		btnWhats.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				navigationPanel.removeAll();
				workspacePanel.removeAll();
				navigationPanel.add(whats.Whats());
				MainFrame.this.repaint();
				MainFrame.this.revalidate();
			}
		});

		JButton btnAbout = new JButton("ABOUT THIS APP");
		btnAbout.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAbout.setBounds(180, 111, 150, 35);
		headerPanel.add(btnAbout);
		btnAbout.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				navigationPanel.removeAll();
				workspacePanel.removeAll();
				navigationPanel.add(about.Abouts());
				MainFrame.this.repaint();
				MainFrame.this.revalidate();
				
			}
		});

		JButton btnExercise = new JButton("EXERCISE");
		btnExercise.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnExercise.setBounds(350, 111, 150, 35);
		headerPanel.add(btnExercise);

		JButton btnAnswerKey = new JButton("ANSWER KEY");
		btnAnswerKey.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAnswerKey.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAnswerKey.setBounds(520, 111, 150, 35);
		headerPanel.add(btnAnswerKey);

		JButton btnOption = new JButton("OPTION");
		btnOption.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnOption.setBounds(690, 111, 150, 35);
		headerPanel.add(btnOption);
		btnOption.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				navigationPanel.removeAll();
				workspacePanel.removeAll();
				workspacePanel.add(option.option());
				MainFrame.this.repaint();
				MainFrame.this.revalidate();
			}
		});

		JButton btnMyNotes = new JButton("MY NOTES");
		btnMyNotes.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnMyNotes.setBounds(858, 111, 150, 35);
		headerPanel.add(btnMyNotes);
		
		btnMyNotes.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				navigationPanel.removeAll();
				workspacePanel.removeAll();
				navigationPanel.add(myNotes.myNote());
				MainFrame.this.repaint();
				MainFrame.this.revalidate();
			}
		});
		
		navigationPanel.add(whats.Whats());
		contentPane.add(navigationPanel);
		contentPane.add(workspacePanel);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(10, 77, 89, 23);
		setContentPane(contentPane);
		System.out.println("Running");
	}
}
