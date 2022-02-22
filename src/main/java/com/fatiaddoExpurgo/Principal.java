package com.fatiaddoExpurgo;

import java.awt.EventQueue;

import com.fatiadorExpurgo.view.FatiadorExpurgoView;

public class Principal {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FatiadorExpurgoView window = new FatiadorExpurgoView();
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
