import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class A4_GuiComboCalc extends JFrame {

	private JPanel contentPane;
	private JComboBox comb1;
	private JComboBox comb3;
	private JComboBox comb2;
	private JButton Okay;
	private JTextField result1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					A4_GuiComboCalc frame = new A4_GuiComboCalc();
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
	public A4_GuiComboCalc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 832, 578);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getComb1());
		contentPane.add(getComb3());
		contentPane.add(getComb2());
		contentPane.add(getOkay());
		contentPane.add(getResult1());
	}

	private JComboBox getComb1() {
		if (comb1 == null) {
			comb1 = new JComboBox();
			comb1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					selecNum();
				}
			});
			comb1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
			comb1.setBounds(29, 98, 165, 54);
		}
		return comb1;
	}
	private JComboBox getComb3() {
		if (comb3 == null) {
			comb3 = new JComboBox();
			comb3.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/"}));
			comb3.setBounds(220, 95, 99, 57);
		}
		return comb3;
	}
	private JComboBox getComb2() {
		if (comb2 == null) {
			comb2 = new JComboBox();
			comb2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
			comb2.setBounds(353, 98, 165, 54);
		}
		return comb2;
	}
	private JButton getOkay() {
		if (Okay == null) {
			Okay = new JButton("Okay");
			Okay.setBounds(603, 98, 154, 54);
		}
		return Okay;
	}
	private JTextField getResult1() {
		if (result1 == null) {
			result1 = new JTextField();
			result1.setEditable(false);
			result1.setBounds(448, 227, 309, 62);
			result1.setColumns(10);
		}
		return result1;
	}
	
	//-------------------------------
	private void selecNum() {
		
	}
}
