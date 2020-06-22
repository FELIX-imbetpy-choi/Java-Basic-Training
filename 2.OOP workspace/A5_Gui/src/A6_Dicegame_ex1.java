import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class A6_Dicegame_ex1 extends JFrame {

	private JPanel contentPane;
	private JButton btnDice;
	private JRadioButton rdNum1;
	private JRadioButton rdNum2;
	private JRadioButton rdNum3;
	private JRadioButton rdNum4;
	private JRadioButton rdNum5;
	private JRadioButton rdNum6;
	private JTextField tfMelong;
	private JButton btn;
	private JTextField tfDing;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					A6_Dicegame_ex1 frame = new A6_Dicegame_ex1();
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
	public A6_Dicegame_ex1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 736, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnDice());
		contentPane.add(getRdNum1());
		contentPane.add(getRdNum2());
		contentPane.add(getRdNum3());
		contentPane.add(getRdNum4());
		contentPane.add(getRdNum5());
		contentPane.add(getRdNum6());
		contentPane.add(getTfMelong());
		contentPane.add(getBtn());
		contentPane.add(getTfDing());
		contentPane.add(getComboBox());
	}

	private JButton getBtnDice() {
		if (btnDice == null) {
			btnDice = new JButton("주사위 던지기");
			btnDice.setToolTipText("주사위를 던지세요"); //버튼속성에서 tool tip에 작성을 하면 도움말처럼 뜬다.
			btnDice.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//던져서 랜덤 숫자 받기
					dice();
					rdNum();
				}
			});
			btnDice.setBounds(61, 50, 239, 62);
		}
		return btnDice;
	}
	
	
	//라디오 버튼 ============================
	private JRadioButton getRdNum1() {
		if (rdNum1 == null) {
			rdNum1 = new JRadioButton("1");
			rdNum1.setEnabled(false);
			rdNum1.setSelected(true);
			rdNum1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					judg(1);
					btnon();
					}
			});
			buttonGroup.add(rdNum1);
			rdNum1.setBounds(33, 165, 60, 23);
		}
		return rdNum1;
	}
	private JRadioButton getRdNum2() {
		if (rdNum2 == null) {
			rdNum2 = new JRadioButton("2");
			rdNum2.setEnabled(false);
			rdNum2.setSelected(true);
			rdNum2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					judg(2);
					btnon();
				}
			});
			buttonGroup.add(rdNum2);
			rdNum2.setBounds(123, 165, 60, 23);
		}
		return rdNum2;
	}
	private JRadioButton getRdNum3() {
		if (rdNum3 == null) {
			rdNum3 = new JRadioButton("3");
			rdNum3.setEnabled(false);
			rdNum3.setSelected(true);
			rdNum3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					judg(3);
					btnon();
				}
			});
			buttonGroup.add(rdNum3);
			rdNum3.setBounds(202, 165, 60, 23);
		}
		return rdNum3;
	}
	private JRadioButton getRdNum4() {
		if (rdNum4 == null) {
			rdNum4 = new JRadioButton("4");
			rdNum4.setEnabled(false);
			rdNum4.setSelected(true);
			rdNum4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					judg(4);
					btnon();
				}
			});
			buttonGroup.add(rdNum4);
			rdNum4.setBounds(294, 165, 60, 23);
		}
		return rdNum4;
	}
	private JRadioButton getRdNum5() {
		if (rdNum5 == null) {
			rdNum5 = new JRadioButton("5");
			rdNum5.setEnabled(false);
			rdNum5.setSelected(true);
			rdNum5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					judg(5);
					btnon();
				}
			});
			buttonGroup.add(rdNum5);
			rdNum5.setBounds(381, 165, 60, 23);
		}
		return rdNum5;
	}
	private JRadioButton getRdNum6() {
		if (rdNum6 == null) {
			rdNum6 = new JRadioButton("6");
			rdNum6.setEnabled(false);
			rdNum6.setSelected(true);
			rdNum6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					judg(6);
					btnon();
				}
			});
			buttonGroup.add(rdNum6);
			rdNum6.setBounds(466, 165, 60, 23);
		}
		return rdNum6;
	}
	
	//=================================================
	
	private JTextField getTfMelong() {
		if (tfMelong == null) {
			tfMelong = new JTextField();
			tfMelong.setEditable(false);
			tfMelong.setBounds(61, 238, 274, 45);
			tfMelong.setColumns(10);
		}
		return tfMelong;
	}
	private JButton getBtn() {
		if (btn == null) {
			btn = new JButton("정답은?");
			btn.setEnabled(false);
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					ding();
					btn.setEnabled(false);
					
				}
			});
			btn.setBounds(61, 338, 128, 45);
			
		}
		return btn;
	}
	private JTextField getTfDing() {
		if (tfDing == null) {
			tfDing = new JTextField();
			tfDing.setEditable(false);
			tfDing.setBounds(253, 338, 297, 45);
			tfDing.setColumns(10);
		}
		return tfDing;
	}
	
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {}));
			comboBox.setBounds(541, 50, 152, 50);
		}
		return comboBox;
	}
	
	//--------------------------------------------------
	//메소드
	
	int i;
	private JComboBox comboBox;
	private void dice() {
		Random random = new Random();
		 i = random.nextInt(6)+1;
		

	}
	
	private int judg(int ii) {
		if(ii==i) {
			tfMelong.setText("맞았습니당~");
		}
		if(ii!=i) {
			tfMelong.setText("한강가즈아~");
		}
		return ii;
		
	}
	
	private void ding() {
		Integer.toString(i);
		tfDing.setText(""+i+"");
		comboBox.addItem(i);
	}
	
	private void rdNum() {			//라디오 버튼 활성호
		
		rdNum1.setEnabled(true);
		rdNum2.setEnabled(true);
		rdNum3.setEnabled(true);
		rdNum4.setEnabled(true);
		rdNum5.setEnabled(true);
		rdNum6.setEnabled(true);

	}
	
	private void btnon() { 			//정답버튼 활성화
		
		btn.setEnabled(true);
		
	}
	
	//-----------------------------------------------------------
	
	
}
