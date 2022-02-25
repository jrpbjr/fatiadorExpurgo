package com.fatiaddoExpurgo;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import java.awt.GraphicsEnvironment;
import java.awt.GraphicsDevice;

//sun.awt.CGraphicsEnvironment

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.fatiadorExpurgo.view.FatiadorExpurgoView;

public class Principal {

	public static void main(String[] args) {
		
		//java swing changing the size relative to the frame size, not the monitor size
		
		//JPanel positions and sizes changes according to screensize
		
		//How to change window size according to screen size in Java
		
		// java - get screen size using the Toolkit class
		//Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		
		// the screen height
		//screenSize.getHeight();

		// the screen width
		//screenSize.getWidth();
		
		//int screenHeight = screenSize.height;
		//int screenWidth = screenSize.width;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		
		System.out.println(width);
		System.out.println(height);
		
		//Em uma configuração de vários monitores, você deve usar isto:

			GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
			int widthgd = gd.getDisplayMode().getWidth();
			int heightgd = gd.getDisplayMode().getHeight();
	
			System.out.println(widthgd);
			System.out.println(heightgd);
		
		try {
			// Set System L&F
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (UnsupportedLookAndFeelException e) {
			// handle exception
		} catch (ClassNotFoundException e) {
			// handle exception
		} catch (InstantiationException e) {
			// handle exception
		} catch (IllegalAccessException e) {
			// handle exception
		}
		
			//new SwingApplication(); // Create and show the GUI.
		
		
		/*
		
		//try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    try {
						javax.swing.UIManager.setLookAndFeel(info.getClassName());
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InstantiationException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (UnsupportedLookAndFeelException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                    break;
                }
            }
            
       // } catch (ClassNotFoundException ex) {
       //     java.util.logging.Logger.getLogger(BiatApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       // } catch (InstantiationException ex) {
       //     java.util.logging.Logger.getLogger(BiatApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       // } catch (IllegalAccessException ex) {
        //    java.util.logging.Logger.getLogger(BiatApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        //} catch (javax.swing.UnsupportedLookAndFeelException ex) {
        //    java.util.logging.Logger.getLogger(BiatApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        //}

	 */

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
