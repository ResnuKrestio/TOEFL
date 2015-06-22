/**
 * 
 */
package toefl.main.mynotes.view;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import config.Datapool;
import screen.MainFrame;
import toefl.main.exercise.model.MyProgress;
import toefl.main.mynotes.model.MyNoteObj;

/**
 * @author Resnu
 *
 */
public class MyNotes {

	public Component myNote() {

		Datapool.init();
		JPanel panelMyNotes = new JPanel();
		final JPanel panelTable = new JPanel();
		panelMyNotes.setBounds(1, 1, MainFrame.navigationPanel.getWidth() - 5,MainFrame.navigationPanel.getHeight() - 5);
		JRadioButton myProgress = new JRadioButton("My Progress");
		myProgress.setBounds(1, 1, 50, 20);
		JRadioButton myQuotation = new JRadioButton("My Quotation");
		myQuotation.setBounds(10, 5, 20, 5);

		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		String[] columnName = {"Date", "Score", "Time", "Package"};
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columnName);
		for (MyProgress myNoteObj : Datapool.getMyProgress()) {
			Object[] objects = new Object[4];
			objects[0] = myNoteObj.getDate();
			objects[1] = myNoteObj.getScore();
			objects[2] = myNoteObj.getTime();
			objects[3] = myNoteObj.getPackage1();
			model.addRow(objects);
		}
		JTable table = new JTable(model);
		table.setPreferredScrollableViewportSize(new Dimension(300,100));
		table.setFillsViewportHeight(true);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 300, 100);
		scrollPane.setViewportView(table);
		panelTable.add(scrollPane);
		panelTable.setBounds(1, 1, MainFrame.workspacePanel.getWidth(), MainFrame.workspacePanel.getHeight());

		myProgress.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame.workspacePanel.removeAll();
				MainFrame.workspacePanel.add(panelTable);
				MainFrame.workspacePanel.repaint();
			}
		});

		ButtonGroup groupButton = new ButtonGroup();
		groupButton.add(myProgress);
		groupButton.add(myQuotation);

		panelMyNotes.setLayout(new BoxLayout(panelMyNotes, BoxLayout.Y_AXIS));
		panelMyNotes.add(myProgress);
		panelMyNotes.add(myQuotation);
		return panelMyNotes;

	}

}
