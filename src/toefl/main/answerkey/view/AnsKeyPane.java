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
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.Border;

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
	int index = 0;
	private JLabel questionLbl;
	private JLabel optionALbl;
	private JLabel optionBLbl;
	private JLabel optionCLbl;
	private JLabel optionDLbl;
	private JTextPane keywordField;
	private JTextPane grammaticalDiscussionField;
	private JTextPane explainationField;
	private JLabel ALbl;
	private JLabel BLbl;
	private JLabel CLbl;
	private JLabel DLbl;
	Border border = BorderFactory.createLineBorder(Color.green, 5);
	Border noBorder = BorderFactory.createEmptyBorder();

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
				showKeyword();
			}
		});

		btnKeyword.setBounds(10, 11, 50, 50);		
		navigationPanel.add(btnKeyword);

		JButton btnGrammar = new JButton();
		btnGrammar.setIcon(new ImageIcon(grammarImg));
		btnGrammar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showGrammar();
			}
		});
		btnGrammar.setBounds(10, 72, 50, 50);
		navigationPanel.add(btnGrammar);

		JButton btnExplain = new JButton();
		btnExplain.setIcon(new ImageIcon(explanationImg));
		btnExplain.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				showExplanation();
			}
		});
		btnExplain.setBounds(10, 133, 50, 50);
		navigationPanel.add(btnExplain);

		JButton btnPDF = new JButton();
		btnPDF.setIcon(new ImageIcon(pdfImg));
		btnPDF.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				showPdf();
			}
		});
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

		questionLbl = new JLabel();
		questionLbl.setText(questionData.getQuestion());
		questionLbl.setFont(new Font("Times New Roman", Font.BOLD, 18));
		questionLbl.setBounds(10, 11, 689, 50);
		workspacePanel.add(questionLbl);

		ALbl = new JLabel("A.");
		ALbl.setFont(new Font("Times New Roman", Font.BOLD, 18));
		ALbl.setBounds(10, 72, 50, 50);
		workspacePanel.add(ALbl);

		BLbl = new JLabel("B.");
		BLbl.setFont(new Font("Times New Roman", Font.BOLD, 18));
		BLbl.setBounds(10, 133, 50, 50);
		workspacePanel.add(BLbl);

		CLbl = new JLabel("C.");
		CLbl.setFont(new Font("Times New Roman", Font.BOLD, 18));
		CLbl.setBounds(10, 194, 50, 50);
		workspacePanel.add(CLbl);

		DLbl = new JLabel("D.");
		DLbl.setFont(new Font("Times New Roman", Font.BOLD, 18));
		DLbl.setBounds(10, 255, 50, 50);
		workspacePanel.add(DLbl);

		optionALbl = new JLabel();
		optionALbl.setText(answerData.getAnswerA());
		optionALbl.setFont(new Font("Times New Roman", Font.BOLD, 18));
		optionALbl.setBounds(60, 72, 614, 50);
		workspacePanel.add(optionALbl);

		optionBLbl = new JLabel("Opsi B");
		optionBLbl.setText(answerData.getAnswerB());
		optionBLbl.setFont(new Font("Times New Roman", Font.BOLD, 18));
		optionBLbl.setBounds(60, 133, 614, 50);
		workspacePanel.add(optionBLbl);

		optionCLbl = new JLabel("Opsi C");
		optionCLbl.setText(answerData.getAnswerC());
		optionCLbl.setFont(new Font("Times New Roman", Font.BOLD, 18));
		optionCLbl.setBounds(60, 194, 614, 50);
		workspacePanel.add(optionCLbl);

		optionDLbl = new JLabel("Opsi D");
		optionDLbl.setText(answerData.getAnswerD());
		optionDLbl.setFont(new Font("Times New Roman", Font.BOLD, 18));
		optionDLbl.setBounds(60, 255, 614, 50);
		workspacePanel.add(optionDLbl);

		JLabel keywordLbl = new JLabel("Key Word :");
		keywordLbl.setFont(new Font("Times New Roman", Font.BOLD, 12));
		keywordLbl.setBounds(10, 307, 60, 20);
		workspacePanel.add(keywordLbl);

		JLabel grammaticalDiscussionLbl = new JLabel("Grammatical Discussion :");
		grammaticalDiscussionLbl.setFont(new Font("Times New Roman", Font.BOLD, 12));
		grammaticalDiscussionLbl.setBounds(10, 338, 146, 14);
		workspacePanel.add(grammaticalDiscussionLbl);

		JLabel explanationLbl = new JLabel("Explaination :");
		explanationLbl.setFont(new Font("Times New Roman", Font.BOLD, 12));
		explanationLbl.setBounds(10, 363, 80, 14);
		workspacePanel.add(explanationLbl);

		keywordField = new JTextPane();
		//keywordField.setText(answerInfoData.getKeyword());
		keywordField.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		keywordField.setEditable(false);
		keywordField.setBounds(154, 307, 500, 20);
		workspacePanel.add(keywordField);

		grammaticalDiscussionField = new JTextPane();
		//grammaticalDiscussionField.setText(answerInfoData.getGramaticalDisc());
		grammaticalDiscussionField.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		grammaticalDiscussionField.setEditable(false);
		grammaticalDiscussionField.setBounds(154, 338, 500, 20);
		workspacePanel.add(grammaticalDiscussionField);

		explainationField = new JTextPane();
		//explainationField.setText(answerInfoData.getExplanation());
		explainationField.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		explainationField.setEditable(false);
		explainationField.setBounds(154, 363, 500, 126);
		workspacePanel.add(explainationField);

	}

	protected void showPdf() {
		updateData(index);
		String command = "rundll32 url.dll,FileProtocolHandler ";
		StringBuffer param = new StringBuffer();
		try {
			if ((new File(answerInfoData.getPdf())).exists()) {
				param=param.append(command).append(answerInfoData.getPdf());
				Process p = Runtime
						.getRuntime()
						.exec(param.toString());
				p.waitFor();
			} else {
				System.out.println("File is not exists");
			}
			System.out.println("Done");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	protected void showExplanation() {
		updateData(index);
		explainationField.setText(answerInfoData.getExplanation());
	}

	protected void showGrammar() {
		updateData(index);
		grammaticalDiscussionField.setText(answerInfoData.getGramaticalDisc());
	}

	protected void showKeyword() {
		updateData(index);
		if(answerInfoData.getRightAnswer().equals("A")) {
			ALbl.setBorder(border);
			optionALbl.setForeground(Color.green);
		}
		if(answerInfoData.getRightAnswer().equals("B")) {
			BLbl.setBorder(border);
			optionBLbl.setForeground(Color.green);
		}
		if(answerInfoData.getRightAnswer().equals("C")) {
			CLbl.setBorder(border);
			optionCLbl.setForeground(Color.green);
		}
		if(answerInfoData.getRightAnswer().equals("D")) { 
			DLbl.setBorder(border);
			optionDLbl.setForeground(Color.green);
		}
		keywordField.setText(answerInfoData.getKeyword());
	}

	private void loadData() {
		Datapool.init();
		exercises = new ArrayList<>();
		exercises = Datapool.getListExercises();
		for (Exercise exercise : exercises) {
			if (exercise.getId()==2) {
				questions = new ArrayList<>();
				questions.addAll(exercise.getQuestions());
				answers = new ArrayList<>();
				answers.addAll(exercise.getAnswers());
				answerInfos = new ArrayList<>();
				answerInfos.addAll(exercise.getAnswerInfos());
			}
		}
		updateData(index);
	}

	private void updateData(int index) {
		// update data

		questionData = new Question();
		questionData = questions.get(index);
		answerData = new Answer();
		answerData = answers.get(index);
		answerInfoData = new AnswerInfo();
		answerInfoData = answerInfos.get(index);

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
		index =index - 1;
		updateData(index);
		updateView();
	}

	private void next() {
		index = index + 1;
		updateData(index);
		updateView();
	}

	private void updateView() {
		questionLbl.setText(questionData.getQuestion());
		optionALbl.setText(answerData.getAnswerA());
		optionBLbl.setText(answerData.getAnswerB());
		optionCLbl.setText(answerData.getAnswerC());
		optionDLbl.setText(answerData.getAnswerD());
		keywordField.setText(answerInfoData.getKeyword());
		grammaticalDiscussionField.setText(answerInfoData.getGramaticalDisc());
		explainationField.setText(answerInfoData.getExplanation());
		ALbl.setBorder(noBorder);
		BLbl.setBorder(noBorder);
		CLbl.setBorder(noBorder);
		DLbl.setBorder(noBorder);
		optionALbl.setForeground(null);
		optionBLbl.setForeground(null);
		optionCLbl.setForeground(null);
		optionDLbl.setForeground(null);
		revalidate();
		repaint();
		updateUI();
	}
}
