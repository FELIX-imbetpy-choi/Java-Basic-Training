import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class A3_GuiComboBoxMain extends JFrame {

	private JPanel contentPane;
	private JComboBox cbFruits;
	private JTextField tfFruit;
	private JTextField tfuFruit;
	private JButton btnInsert;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					A3_GuiComboBoxMain frame = new A3_GuiComboBoxMain();
					// 창 자체를 보이게 보이지 않게 할 수 있다.
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
	public A3_GuiComboBoxMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 757, 544);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getCbFruits());
		contentPane.add(getTfFruit());
		contentPane.add(getTfuFruit());
		contentPane.add(getBtnInsert());
	}
	private JComboBox getCbFruits() {
		if (cbFruits == null) {
			cbFruits = new JComboBox();
			cbFruits.addActionListener(new ActionListener() {
				//
				public void actionPerformed(ActionEvent arg0) {
					selectFruit();
				}
			});
			cbFruits.setModel(new DefaultComboBoxModel(new String[] {"Apple", "Banana", "Tomato", "Lemon", "Melon"}));
			cbFruits.setBounds(87, 98, 216, 65);
		}
		return cbFruits;
	}
	private JTextField getTfFruit() {
		if (tfFruit == null) {
			tfFruit = new JTextField();
			//tfFruit.addActionListener(new ActionListener()) {
			//});
			tfFruit.setBounds(372, 75, 238, 84);
			tfFruit.setColumns(10);
		}
		return tfFruit;
	}
	private JTextField getTfuFruit() {
		if (tfuFruit == null) {
			tfuFruit = new JTextField();
			tfuFruit.setBounds(88, 224, 191, 44);
			tfuFruit.setColumns(10);
		}
		return tfuFruit;
	}
	private JButton getBtnInsert() {
		if (btnInsert == null) {
			btnInsert = new JButton("Insert");
			btnInsert.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					insertFruit();
				}
			});
			btnInsert.setBounds(87, 278, 165, 44);
		}
		return btnInsert;
	}
	//-----------------------------------------------------------
	private void selectFruit()
	   {
	      String stFruit = cbFruits.getSelectedItem().toString();
	      tfFruit.setText(stFruit);
	   }
	private void insertFruit()
	   {
	      String stFruit = tfuFruit.getText();
	      cbFruits.addItem(stFruit);
	   }

}
