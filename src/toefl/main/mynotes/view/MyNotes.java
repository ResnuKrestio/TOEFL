/**
 * 
 */
package toefl.main.mynotes.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import screen.MainFrame;
import toefl.main.mynotes.model.MyNoteObj;

/**
 * @author Resnu
 *
 */
public class MyNotes {

	public Component myNote() {

		JPanel panelMyNotes = new JPanel();
		final JPanel panelTable = new JPanel();
		panelMyNotes.setBounds(1, 1, MainFrame.navigationPanel.getWidth() - 5,MainFrame.navigationPanel.getHeight() - 5);
		JRadioButton myProgress = new JRadioButton("My Progress");
		myProgress.setBounds(1, 1, 50, 20);
		JRadioButton myQuotation = new JRadioButton("My Quotation");
		myQuotation.setBounds(10, 5, 20, 5);

		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		String[] columnName = {"Date", "Score", "Package"};
		List<MyNoteObj> myNoteObjs = new ArrayList<MyNoteObj>();
		MyNoteObj obj1 = new MyNoteObj();
		MyNoteObj obj2 = new MyNoteObj();
		MyNoteObj obj3 = new MyNoteObj();
		MyNoteObj obj4 = new MyNoteObj();
		obj1.setDate(dateFormat.format(date));
		obj1.setScore(550);
		obj1.setPaket("30S01");
		obj2.setDate(dateFormat.format(date));
		obj2.setScore(500);
		obj2.setPaket("20S02");
		obj3.setDate(dateFormat.format(date));
		obj3.setScore(650);
		obj3.setPaket("30S01");
		obj4.setDate(dateFormat.format(date));
		obj4.setScore(550);
		obj4.setPaket("30S01");
		myNoteObjs.add(obj1);
		myNoteObjs.add(obj2);
		myNoteObjs.add(obj3);
		myNoteObjs.add(obj4);
		JTable table = new JTable();
		DefaultTableModel model = new DefaultTableModel();

		for (MyNoteObj myNoteObj : myNoteObjs) {
			Object[] objects = new Object[3];
			objects[0] = myNoteObj.getDate();
			objects[1] = myNoteObj.getScore();
			objects[2] = myNoteObj.getPaket();
			model.addRow(objects);
		}

		model.setColumnIdentifiers(columnName);
		table.setModel(model);
		table.setPreferredScrollableViewportSize(new Dimension(300,50));
		table.setFillsViewportHeight(true);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 300, 50);
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

		panelMyNotes.setLayout(new GridLayout(8, 1));
		panelMyNotes.add(myProgress);
		panelMyNotes.add(myQuotation);
		return panelMyNotes;

	}

}
