package screen;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

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
import toefl.main.whats.view.WhatsToefl;

public class MainFrame extends JFrame {

	
	private JPanel contentPane;
	WhatsToefl whats = new WhatsToefl();
	AboutThisApp about = new AboutThisApp();
	public static WorkspacePanel workspacePanel = new WorkspacePanel();
	public static HeaderPanel headerPanel = new HeaderPanel();
	public static NavigationPanel navigationPanel = new NavigationPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(75, 0, 130));

		headerPanel.setBounds(0, 0, 1008, 150);
		headerPanel.setBackground(new Color(75, 0, 130));

		navigationPanel.setBorder(UIManager.getBorder("InternalFrame.border"));
		navigationPanel.setBounds(0, headerPanel.getHeight(),
		navigationPanel.getWidth(), navigationPanel.getHeight());
		navigationPanel.setBackground(new Color(240, 248, 255));
		workspacePanel.setBorder(UIManager.getBorder("InternalFrame.border"));

		workspacePanel.setBounds(250, 150, 758, 550);
		workspacePanel.setBackground(new Color(240, 248, 255));
		contentPane.setLayout(null);
		contentPane.add(headerPanel, "wrap, pushx, growx");
		try {
			BufferedImage image = ImageIO.read(getClass().getResourceAsStream(
					"HeadLogo.png"));
			JLabel imageLabel = new JLabel(new ImageIcon(image));
			imageLabel.setBounds(0, 0, 1008, 100);
			headerPanel.add(imageLabel);
		} catch (Exception e) {
			e.printStackTrace();
		}

		JButton btnWhats = new JButton("WHAT'S TOEFL");
		btnWhats.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnWhats.setBounds(34, 111, 150, 35);
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
		btnAbout.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAbout.setBounds(194, 111, 150, 35);
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
		btnExercise.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnExercise.setBounds(354, 111, 150, 35);
		headerPanel.add(btnExercise);

		JButton btnAnswerKey = new JButton("ANSWER KEY");
		btnAnswerKey.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAnswerKey.setBounds(514, 111, 150, 35);
		headerPanel.add(btnAnswerKey);

		JButton btnOption = new JButton("OPTION");
		btnOption.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnOption.setBounds(674, 111, 150, 35);
		headerPanel.add(btnOption);

		JButton btnMyNotes = new JButton("MY NOTES");
		btnMyNotes.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnMyNotes.setBounds(834, 111, 150, 35);
		headerPanel.add(btnMyNotes);
		JLabel jLabel = new JLabel("Test");
		jLabel.setBounds(10, 45, 89, 23);

		navigationPanel.add(whats.Whats());
		contentPane.add(navigationPanel);
		contentPane.add(workspacePanel);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(10, 77, 89, 23);
		setContentPane(contentPane);
		System.out.println("Running");
	}
}
