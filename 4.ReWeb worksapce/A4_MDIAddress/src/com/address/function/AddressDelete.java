package com.address.function;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class AddressDelete extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddressDelete frame = new AddressDelete();
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
	public AddressDelete() {
		setClosable(true);
		setBounds(100, 100, 504, 506);

	}

}
