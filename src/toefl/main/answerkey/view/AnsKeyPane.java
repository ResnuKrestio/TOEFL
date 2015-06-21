package toefl.main.answerkey.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import screen.MainFrame;
import toefl.main.exercise.model.Answer;
import toefl.main.exercise.model.AnswerInfo;
import toefl.main.exercise.model.Exercise;
import toefl.main.exercise.model.Question;
import config.Datapool;

public class AnsKeyPane extends JPanel {

	private static final long serialVersionUID = -4345573935824307302L;
	Image keywordImg;
	Image grammarImg;
	Image explanationImg;
	Image pdfImg;
	Image previousImg;
	Image nextImg;
	List<Exercise> exercises;
	List<Question> questions;
	List<Answer> answers;
	List<AnswerInfo> answerInfos;
	Question questionData;
	Answer answerData;
	AnswerInfo answerInfoData;
	int index;

	public AnsKeyPane() {
		loadImage();
		loadData();
		setBackground(Color.CYAN);

		setSize(MainFrame.workspacePanel.getWidth(), 505);
		setLayout(null);

		JPanel navigationPanel = new JPanel();
		navigationPanel.setBounds(5, 1, 70, 500);
		add(navigationPanel);
		navigationPanel.setLayout(null);

		JPanel workspacePanel = new JPanel();
		workspacePanel.setBounds(80, 1, 709, 500);
		add(workspacePanel);
		workspacePanel.setLayout(null);

		JButton btnKeyword = new JButton();

		btnKeyword.setIcon(new ImageIcon(keywordImg));
		btnKeyword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		btnKeyword.setBounds(10, 11, 50, 50);		
		navigationPanel.add(btnKeyword);

		JButton btnGrammar = new JButton();
		btnGrammar.setIcon(new ImageIcon(grammarImg));
		btnGrammar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGrammar.setBounds(10, 72, 50, 50);
		navigationPanel.add(btnGrammar);

		JButton btnExplain = new JButton();
		btnExplain.setIcon(new ImageIcon(explanationImg));
		btnExplain.setBounds(10, 133, 50, 50);
		navigationPanel.add(btnExplain);

		JButton btnPDF = new JButton();
		btnPDF.setIcon(new ImageIcon(pdfImg));
		btnPDF.setBounds(10, 194, 50, 50);
		navigationPanel.add(btnPDF);

		JButton previousBtn = new JButton();
		previousBtn.setIcon(new ImageIcon(previousImg));
		previousBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				previous();
			}
		});
		previousBtn.setBounds(10, 378, 50, 50);
		navigationPanel.add(previousBtn);

		JButton nextBtn = new JButton();
		nextBtn.setIcon(new ImageIcon(nextImg));
		nextBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				next();
			}
		});
		nextBtn.setBounds(10, 439, 50, 50);
		navigationPanel.add(nextBtn);

		JLabel questionLbl = new JLabel();
		questionLbl.setText(questionData.getQuestion());
		questionLbl.setFont(new Font("Times New Roman", Font.BOLD, 18));
		questionLbl.setBounds(10, 11, 689, 50);
		workspacePanel.add(questionLbl);

		JLabel ALbl = new JLabel("A.");
		ALbl.setFont(new Font("Times New Roman", Font.BOLD, 18));
		ALbl.setBounds(10, 72, 30, 50);
		workspacePanel.add(ALbl);

		JLabel BLbl = new JLabel("B.");
		BLbl.setFont(new Font("Times New Roman", Font.BOLD, 18));
		BLbl.setBounds(10, 133, 50, 50);
		workspacePanel.add(BLbl);
		
		JLabel CLbl = new JLabel("C.");
		CLbl.setFont(new Font("Times New Roman", Font.BOLD, 18));
		CLbl.setBounds(10, 194, 50, 50);
		workspacePanel.add(CLbl);
		
		JLabel DLbl = new JLabel("D.");
		DLbl.setFont(new Font("Times New Roman", Font.BOLD, 18));
		DLbl.setBounds(10, 255, 50, 50);
		workspacePanel.add(DLbl);
		
		JLabel optionALbl = new JLabel();
		optionALbl.setText(answerData.getAnswerA());
		optionALbl.setFont(new Font("Times New Roman", Font.BOLD, 18));
		optionALbl.setBounds(40, 72, 604, 50);
		workspacePanel.add(optionALbl);

		JLabel optionBLbl = new JLabel("Opsi B");
		optionBLbl.setText(answerData.getAnswerB());
		optionBLbl.setFont(new Font("Times New Roman", Font.BOLD, 18));
		optionBLbl.setBounds(36, 133, 614, 50);
		workspacePanel.add(optionBLbl);

		JLabel optionCLbl = new JLabel("Opsi C");
		optionCLbl.setText(answerData.getAnswerC());
		optionCLbl.setFont(new Font("Times New Roman", Font.BOLD, 18));
		optionCLbl.setBounds(36, 194, 614, 50);
		workspacePanel.add(optionCLbl);

		JLabel optionDLbl = new JLabel("Opsi D");
		optionDLbl.setText(answerData.getAnswerD());
		optionDLbl.setFont(new Font("Times New Roman", Font.BOLD, 18));
		optionDLbl.setBounds(36, 255, 614, 50);
		workspacePanel.add(optionDLbl);

		JLabel keywordLbl = new JLabel("Key Word :");
		keywordLbl.setFont(new Font("Times New Roman", Font.BOLD, 12));
		keywordLbl.setBounds(10, 307, 60, 20);
		workspacePanel.add(keywordLbl);

		JTextPane keywordField = new JTextPane();
		keywordField.setText("Key Word");
		keywordField.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		keywordField.setEditable(false);
		keywordField.setBounds(154, 307, 500, 20);
		workspacePanel.add(keywordField);

		JLabel lblGrammaticalDiscussion = new JLabel("Grammatical Discussion :");
		lblGrammaticalDiscussion.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblGrammaticalDiscussion.setBounds(10, 338, 146, 14);
		workspacePanel.add(lblGrammaticalDiscussion);

		JTextPane txtpnGrammarText = new JTextPane();
		txtpnGrammarText.setText("Grammar Text");
		txtpnGrammarText.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnGrammarText.setEditable(false);
		txtpnGrammarText.setBounds(154, 338, 500, 20);
		workspacePanel.add(txtpnGrammarText);

		JLabel lblExplaination = new JLabel("Explaination :");
		lblExplaination.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblExplaination.setBounds(10, 363, 80, 14);
		workspacePanel.add(lblExplaination);

		JTextPane txtpnExplainationAboutThis = new JTextPane();
		txtpnExplainationAboutThis.setText("Explaination About this Task");
		txtpnExplainationAboutThis.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnExplainationAboutThis.setEditable(false);
		txtpnExplainationAboutThis.setBounds(154, 363, 500, 126);
		workspacePanel.add(txtpnExplainationAboutThis);

	}

	private void loadData() {
		exercises = new ArrayList<>();
		exercises = Datapool.getListExercises();
		questionData = new Question();
		answerData = new Answer();
	}

	private void loadImage() {
		try {
			keywordImg = ImageIO.read(new File("image/keyword.png"));
			grammarImg = ImageIO.read(new File("image/grammar.png"));
			explanationImg = ImageIO.read(new File("image/explaination.png"));
			pdfImg = ImageIO.read(new File("image/PDF.png"));
			previousImg = ImageIO.read(new File("image/prev.png"));
			nextImg = ImageIO.read(new File("image/next.png"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	private void previous() {
		// TODO Auto-generated method stub
		
	}
	
	private void next() {
		// TODO Auto-generated method stub
		
	}
}
