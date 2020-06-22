import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class A2_Gui4calcMain extends JFrame {

	private JPanel contentPane;
	private JTextField Num1;
	private JTextField Num2;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JSeparator separator;
	private JTextField Result1;
	private JLabel lblNewLabel_2;
	private JButton btnAdd;
	private JButton btnMin;
	private JButton btnMul;
	private JButton btnDiv;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					A2_Gui4calcMain frame = new A2_Gui4calcMain();
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
	public A2_Gui4calcMain() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 953, 669);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getNum1());
		contentPane.add(getNum2());
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getSeparator());
		contentPane.add(getResult1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getBtnAdd());
		contentPane.add(getBtnMin());
		contentPane.add(getBtnMul());
		contentPane.add(getBtnDiv());
	}

	private JTextField getNum1() {
		if (Num1 == null) {
			Num1 = new JTextField();
			Num1.setBounds(140, 77, 229, 53);
			Num1.setColumns(10);
		}
		return Num1;
	}
	private JTextField getNum2() {
		if (Num2 == null) {
			Num2 = new JTextField();
			Num2.setBounds(140, 175, 229, 53);
			Num2.setColumns(10);
		}
		return Num2;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("입력값1 ");
			lblNewLabel.setBounds(66, 96, 52, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("입력값2");
			lblNewLabel_1.setBounds(66, 194, 52, 15);
		}
		return lblNewLabel_1;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(66, 303, 311, 15);
		}
		return separator;
	}
	private JTextField getResult1() {
		if (Result1 == null) {
			Result1 = new JTextField();
			Result1.setEditable(false);
			Result1.setBounds(140, 338, 229, 53);
			Result1.setColumns(10);
		}
		return Result1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("결과값");
			lblNewLabel_2.setBounds(66, 357, 52, 15);
		}
		return lblNewLabel_2;
	}
	
	//-----------------------------------------------
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("더하기");
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//
						Sum();
				}
			});
			btnAdd.setForeground(Color.RED);
			btnAdd.setBounds(478, 77, 149, 113);
		}
		
		return btnAdd;
	}
	private JButton getBtnMin() {
		if (btnMin == null) {
			btnMin = new JButton("뺄셈");
			btnMin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//ㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁ
						Min();
				}
			});
			btnMin.setForeground(Color.RED);
			btnMin.setBounds(478, 248, 149, 107);
		}
		return btnMin;
	}
	private JButton getBtnMul() {
		if (btnMul == null) {
			btnMul = new JButton("곱셈");
			btnMul.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//ㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁ
						Mul();
				}
			});
			btnMul.setForeground(Color.RED);
			btnMul.setBounds(478, 410, 149, 107);
		}
		return btnMul;
	}
	private JButton getBtnDiv() {
		if (btnDiv == null) {
			btnDiv = new JButton("나눗셈");
			btnDiv.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//ㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁ
					Div();
				}
			});
			btnDiv.setForeground(Color.RED);
			btnDiv.setBounds(654, 248, 168, 107);
		}
		return btnDiv;
	}
	
	// --------------------------------------------------
	// 사칙연산 메소드
	
	private void Sum() {
		try {
			
		 int wkNum1 = Integer.parseInt(Num1.getText());
	      int wkNum2 = Integer.parseInt(Num2.getText());
	      int wkResult = wkNum1 + wkNum2;
	      
	      String stResult = Integer.toString(wkResult);
	      Result1.setText(stResult);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "숫자1,2 를 모두 입력하세요");
		}

		
	}
	
	private void Min() {
		try {
			
			 int wkNum1 = Integer.parseInt(Num1.getText());
		      int wkNum2 = Integer.parseInt(Num2.getText());
		      int wkResult = wkNum1 - wkNum2;
		      
		      String stResult = Integer.toString(wkResult);
		      Result1.setText(stResult);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "숫자1,2 를 모두 입력하세요");
			}

		
	}
	
	private void Mul() {
		try {
			
			 int wkNum1 = Integer.parseInt(Num1.getText());
		      int wkNum2 = Integer.parseInt(Num2.getText());
		      int wkResult = wkNum1 * wkNum2;
		      
		      String stResult = Integer.toString(wkResult);
		      Result1.setText(stResult);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "숫자1,2 를 모두 입력하세요");
			}

		
	}
	
	private void Div() {
		 try {
			    int wkResult = 0;
			    int wkNum1 = Integer.parseInt(Num1.getText());
		        int wkNum2 = Integer.parseInt(Num2.getText());
		        
		        if(wkNum2 != 0) {
		             wkResult = wkNum1 / wkNum2;
		             String stResult = Integer.toString(wkResult);
			          Result1.setText(stResult);
		                          }
		        
		      if(wkNum2 == 0) {
		    	  
		    	  // 메세지 박스 보여주기
		    	  JOptionPane.showMessageDialog(null, "0을 입력하면 안되죠?");
		    	 
		      }
		      
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "숫자1,2 를 모두 입력하세요");
			}


		
	}
	//-------------------------------------------------
	// 숫자 1이나 2에 빈칸인경우 사칙연산 버튼을 누르면 숫자1이나 숫자2를 넣으라는 
	// Message box 보여주기
	// 나눗셈에서 숫자2에 0을 제외한다는 메세지를 메세지 박스로 보여주기.
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	//---------------------------------------------------
	
	

