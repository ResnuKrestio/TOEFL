package toefl.main.answerkey.view;

import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import screen.MainFrame;

import javax.swing.JButton;

import config.ConfigurationManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;

public class AnsKeyPane extends JPanel {

	/**
	 * Create the panel.
	 */
	public AnsKeyPane() {
		setBackground(Color.CYAN);

		setSize(MainFrame.workspacePanel.getWidth(), 505);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 1, 70, 500);
		add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(80, 1, 709, 500);
		add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnKeyword = new JButton();
		btnKeyword.setIcon(new ImageIcon(AnsKeyPane.class.getResource("/toefl/main/answerkey/view/keyword.png")));
		btnKeyword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnKeyword.setBounds(10, 11, 50, 50);		
		panel.add(btnKeyword);
		
		JButton btnGrammar = new JButton();
		btnGrammar.setIcon(new ImageIcon(AnsKeyPane.class.getResource("/toefl/main/answerkey/view/grammar.png")));
		btnGrammar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGrammar.setBounds(10, 72, 50, 50);
		panel.add(btnGrammar);
		
		JButton btnExplain = new JButton();
		btnExplain.setIcon(new ImageIcon(AnsKeyPane.class.getResource("/toefl/main/answerkey/view/explaination.png")));
		btnExplain.setBounds(10, 133, 50, 50);
		panel.add(btnExplain);
		
		JButton btnPDF = new JButton("");
		btnPDF.setIcon(new ImageIcon(AnsKeyPane.class.getResource("/toefl/main/answerkey/view/PDF.png")));
		btnPDF.setBounds(10, 194, 50, 50);
		panel.add(btnPDF);
		
		JButton btnPrev = new JButton("");
		btnPrev.setIcon(new ImageIcon(AnsKeyPane.class.getResource("/toefl/main/answerkey/view/prev.png")));
		btnPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPrev.setBounds(10, 378, 50, 50);
		panel.add(btnPrev);
		
		JButton btnNext = new JButton("");
		btnNext.setIcon(new ImageIcon(AnsKeyPane.class.getResource("/toefl/main/answerkey/view/next.png")));
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNext.setBounds(10, 439, 50, 50);
		panel.add(btnNext);
		
		JLabel lblSoal = new JLabel("Ini SOAL.......");
		lblSoal.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblSoal.setBounds(10, 11, 689, 50);
		panel_1.add(lblSoal);
		
		JLabel lblOpsiA = new JLabel("Opsi A");
		lblOpsiA.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblOpsiA.setBounds(36, 72, 614, 50);
		panel_1.add(lblOpsiA);
		
		JLabel lblA = new JLabel("A.");
		lblA.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblA.setBounds(10, 72, 50, 50);
		panel_1.add(lblA);
		
		JLabel lblB = new JLabel("B.");
		lblB.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblB.setBounds(10, 133, 50, 50);
		panel_1.add(lblB);
		
		JLabel lblOpsiB = new JLabel("Opsi B");
		lblOpsiB.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblOpsiB.setBounds(36, 133, 614, 50);
		panel_1.add(lblOpsiB);
		
		JLabel lblC = new JLabel("C.");
		lblC.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblC.setBounds(10, 194, 50, 50);
		panel_1.add(lblC);
		
		JLabel lblOpsiC = new JLabel("Opsi C");
		lblOpsiC.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblOpsiC.setBounds(36, 194, 614, 50);
		panel_1.add(lblOpsiC);
		
		JLabel lblD = new JLabel("D.");
		lblD.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblD.setBounds(10, 255, 50, 50);
		panel_1.add(lblD);
		
		JLabel lblOpsiD = new JLabel("Opsi D");
		lblOpsiD.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblOpsiD.setBounds(36, 255, 614, 50);
		panel_1.add(lblOpsiD);
		
		JLabel lblKeyWord = new JLabel("Key Word :");
		lblKeyWord.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblKeyWord.setBounds(10, 307, 60, 20);
		panel_1.add(lblKeyWord);
		
		JTextPane keywordTxtPane = new JTextPane();
		keywordTxtPane.setText("Key Word");
		keywordTxtPane.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		keywordTxtPane.setEditable(false);
		keywordTxtPane.setBounds(154, 307, 500, 20);
		panel_1.add(keywordTxtPane);
		
		JLabel lblGrammaticalDiscussion = new JLabel("Grammatical Discussion :");
		lblGrammaticalDiscussion.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblGrammaticalDiscussion.setBounds(10, 338, 146, 14);
		panel_1.add(lblGrammaticalDiscussion);
		
		JTextPane txtpnGrammarText = new JTextPane();
		txtpnGrammarText.setText("Grammar Text");
		txtpnGrammarText.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnGrammarText.setEditable(false);
		txtpnGrammarText.setBounds(154, 338, 500, 20);
		panel_1.add(txtpnGrammarText);
		
		JLabel lblExplaination = new JLabel("Explaination :");
		lblExplaination.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblExplaination.setBounds(10, 363, 80, 14);
		panel_1.add(lblExplaination);
		
		JTextPane txtpnExplainationAboutThis = new JTextPane();
		txtpnExplainationAboutThis.setText("Explaination About this Task");
		txtpnExplainationAboutThis.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnExplainationAboutThis.setEditable(false);
		txtpnExplainationAboutThis.setBounds(154, 363, 500, 126);
		panel_1.add(txtpnExplainationAboutThis);
		
	}
}
