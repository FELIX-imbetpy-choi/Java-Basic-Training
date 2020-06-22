import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class A7_Calculator_ex2 extends JFrame {

	private JPanel contentPane;
	private JButton btnNum1;
	private JButton btnNum2;
	private JButton btnNum3;
	private JButton btnNum4;
	private JButton btnNum5;
	private JButton btnNum6;
	private JButton btnNum7;
	private JButton btnNum8;
	private JButton btnNum9;
	private JTextField tfResult;
	private JButton btnNum0;
	private JButton btnSum;
	private JButton btnResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					A7_Calculator_ex2 frame = new A7_Calculator_ex2();
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
	public A7_Calculator_ex2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 610, 670);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnNum1());
		contentPane.add(getBtnNum2());
		contentPane.add(getBtnNum3());
		contentPane.add(getBtnNum4());
		contentPane.add(getBtnNum5());
		contentPane.add(getBtnNum6());
		contentPane.add(getBtnNum7());
		contentPane.add(getBtnNum8());
		contentPane.add(getBtnNum9());
		contentPane.add(getTfResult());
		contentPane.add(getBtnNum0());
		contentPane.add(getBtnSum());
		contentPane.add(getBtnResult());
	}
	
	//-------------------------------------------------------------
	private JButton getBtnNum1() {
		if (btnNum1 == null) {
			btnNum1 = new JButton("1");
			btnNum1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					///////////
					strNum1();
				}
			});
			btnNum1.setFont(new Font("굴림", Font.PLAIN, 34));
			btnNum1.setBounds(58, 205, 118, 109);
		}
		return btnNum1;
	}
	private JButton getBtnNum2() {
		if (btnNum2 == null) {
			btnNum2 = new JButton("2");
			btnNum2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					///////////
					strNum2();
				}
			});
			btnNum2.setFont(new Font("굴림", Font.PLAIN, 34));
			btnNum2.setBounds(202, 205, 118, 109);
		}
		return btnNum2;
	}
	private JButton getBtnNum3() {
		if (btnNum3 == null) {
			btnNum3 = new JButton("3");
			btnNum3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					///////////
					strNum3();
				}
			});
			btnNum3.setFont(new Font("굴림", Font.PLAIN, 34));
			btnNum3.setBounds(349, 205, 118, 109);
		}
		return btnNum3;
	}
	private JButton getBtnNum4() {
		if (btnNum4 == null) {
			btnNum4 = new JButton("4");
			btnNum4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//////////
					strNum4();
				}
			});
			btnNum4.setFont(new Font("굴림", Font.PLAIN, 34));
			btnNum4.setBounds(58, 330, 118, 109);
		}
		return btnNum4;
	}
	private JButton getBtnNum5() {
		if (btnNum5 == null) {
			btnNum5 = new JButton("5");
			btnNum5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//////////
					strNum5();
				}
			});
			btnNum5.setFont(new Font("굴림", Font.PLAIN, 34));
			btnNum5.setBounds(202, 330, 118, 109);
		}
		return btnNum5;
	}
	private JButton getBtnNum6() {
		if (btnNum6 == null) {
			btnNum6 = new JButton("6");
			btnNum6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//////////
					strNum6();
				}
			});
			btnNum6.setFont(new Font("굴림", Font.PLAIN, 34));
			btnNum6.setBounds(349, 330, 118, 109);
		}
		return btnNum6;
	}
	private JButton getBtnNum7() {
		if (btnNum7 == null) {
			btnNum7 = new JButton("7");
			btnNum7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					///////////
					strNum7();
				}
			});
			btnNum7.setFont(new Font("굴림", Font.PLAIN, 34));
			btnNum7.setBounds(58, 449, 118, 109);
		}
		return btnNum7;
	}
	private JButton getBtnNum8() {
		if (btnNum8 == null) {
			btnNum8 = new JButton("8");
			btnNum8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					///////////
					strNum8();
				}
			});
			btnNum8.setFont(new Font("굴림", Font.PLAIN, 34));
			btnNum8.setBounds(202, 449, 118, 109);
		}
		return btnNum8;
	}
	private JButton getBtnNum9() {
		if (btnNum9 == null) {
			btnNum9 = new JButton("9");
			btnNum9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					///////////
					strNum9();
				}
			});
			btnNum9.setFont(new Font("굴림", Font.PLAIN, 34));
			btnNum9.setBounds(349, 449, 118, 109);
		}
		return btnNum9;
	}
	
	private JButton getBtnNum0() {
		if (btnNum0 == null) {
			btnNum0 = new JButton("0");
			btnNum0.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//////////////
					strNum0();
				}
			});
			btnNum0.setFont(new Font("굴림", Font.PLAIN, 27));
			btnNum0.setBounds(202, 573, 118, 52);
		}
		return btnNum0;
	}
	
	//=============================================================
	
	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.setEditable(false);
			tfResult.setBounds(61, 44, 406, 99);
			tfResult.setColumns(10);
		}
		return tfResult;
	}
	
	private JButton getBtnSum() {
		if (btnSum == null) {
			btnSum = new JButton("+");
			btnSum.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					/////////////
					sumTool();
					
				}
			});
			btnSum.setFont(new Font("굴림", Font.PLAIN, 34));
			btnSum.setBounds(492, 205, 95, 234);
		}
		return btnSum;
	}
	private JButton getBtnResult() {
		if (btnResult == null) {
			btnResult = new JButton("=");
			btnResult.setFont(new Font("굴림", Font.PLAIN, 34));
			btnResult.setBounds(492, 449, 95, 109);
		}
		return btnResult;
	}
	
	//----------------------------------------------------------------
	//메소드
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	String ii = null;
	int kk = 0; // 플러스 버튼 누를때 배열을 바꾸어주는 카운트
	
	// 문자열더하기 문자열 
	private void sumTool() {
		String neo =tfResult.getText();
		int a = Integer.parseInt(neo); //변수로 받아야 정수로 변환된다.
		list.add(kk,a);
		tfResult.setText("");
		kk = kk + 1;
		System.out.println();
		

	}
	//--------------------------------------------------------
	private void strNum1() {
		String river = tfResult.getText();
		tfResult.setText(river+"1");
	}
	private void strNum2() {
		String river = tfResult.getText();
		tfResult.setText(river+"2");
	}
	private void strNum3() {
		String river = tfResult.getText();
		tfResult.setText(river+"3");
	}
	private void strNum4() {
		String river = tfResult.getText();
		tfResult.setText(river+"4");
	}
	private void strNum5() {
		String river = tfResult.getText();
		tfResult.setText(river+"5");
	}
	private void strNum6() {
		String river = tfResult.getText();
		tfResult.setText(river+"6");
	}
	private void strNum7() {
		String river = tfResult.getText();
		tfResult.setText(river+"7");
	}
	private void strNum8() {
		String river = tfResult.getText();
		tfResult.setText(river+"8");
	}
	private void strNum9() {
		String river = tfResult.getText();
		tfResult.setText(river+"9");
	}
	private void strNum0() {
		String river = tfResult.getText();
		tfResult.setText(river+"0");
	}
	
	
	//--------------------------------------------------
	
	
	
	
}
