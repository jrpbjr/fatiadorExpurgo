package com.fatiadorExpurgo.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JTree;
import javax.swing.JTable;

public class FatiadorView extends JInternalFrame {
	private JTable table;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FatiadorView frame = new FatiadorView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public FatiadorView() {
		setTitle("fatiador expurgo");
		setClosable(true);
		setBounds(100, 100, 588, 475);
		
		JSplitPane splitPane = new JSplitPane();
		getContentPane().add(splitPane, BorderLayout.CENTER);
		
		JTree tree = new JTree();
		splitPane.setLeftComponent(tree);
		
		table = new JTable();
		splitPane.setRightComponent(table);

	}

}
