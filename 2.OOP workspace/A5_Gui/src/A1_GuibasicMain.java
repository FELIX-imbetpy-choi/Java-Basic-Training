import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class A1_GuibasicMain extends JFrame {

	private JPanel contentPane;
	private JTextField tfMsg;
	private JButton btnNewadd;
	private JTextField textField1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					A1_GuibasicMain frame = new A1_GuibasicMain();
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
	public A1_GuibasicMain() {
		setTitle("windows test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 722, 638);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setForeground(Color.YELLOW);
		btnNewButton.setFont(new Font("Algerian", Font.PLAIN, 29));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tfMsg.setText("버튼을 눌렀습니다.");
			}
		});
		btnNewButton.setBounds(477, 43, 193, 77);
		contentPane.add(btnNewButton);
		
		tfMsg = new JTextField();
		tfMsg.setBounds(91, 457, 537, 116);
		contentPane.add(tfMsg);
		tfMsg.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("clear");
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tfMsg.setText(" ");
			}
		});
		btnNewButton_1.setFont(new Font("Baskerville Old Face", Font.PLAIN, 31));
		btnNewButton_1.setBounds(477, 132, 193, 77);
		contentPane.add(btnNewButton_1);
		
		btnNewadd = new JButton("New add");
		btnNewadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//JOP
				JOptionPane.showMessageDialog(null, "ok버튼을 눌렀습니다!");
			}
		});
		btnNewadd.setBounds(477, 221, 193, 83);
		contentPane.add(btnNewadd);
		
		textField1 = new JTextField();
		textField1.setHorizontalAlignment(SwingConstants.TRAILING);
		textField1.setBounds(64, 43, 124, 30);
		contentPane.add(textField1);
		textField1.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				//
				String aaa = textField1.getText();
				tfMsg.setText(aaa);
			}
		});
		btnNewButton_2.setBounds(200, 43, 89, 30);
		contentPane.add(btnNewButton_2);
	}
}
