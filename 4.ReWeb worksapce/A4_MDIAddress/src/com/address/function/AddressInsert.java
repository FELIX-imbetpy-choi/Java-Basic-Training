package com.address.function;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddressInsert extends JInternalFrame {
	private JTextField tfname;
	private JLabel lblNewLabel;
	private JTextField tftelnum;
	private JLabel label;
	private JTextField tfaddress;
	private JLabel label_1;
	private JTextField tfemail;
	private JLabel label_2;
	private JTextField tfrelation;
	private JLabel label_3;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddressInsert frame = new AddressInsert();
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
	public AddressInsert() {
		setTitle("입력창");
		setClosable(true);
		setBounds(100, 100, 599, 480);
		getContentPane().setLayout(null);
		getContentPane().add(getTfname());
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getTftelnum());
		getContentPane().add(getLabel());
		getContentPane().add(getTfaddress());
		getContentPane().add(getLabel_1());
		getContentPane().add(getTfemail());
		getContentPane().add(getLabel_2());
		getContentPane().add(getTfrelation());
		getContentPane().add(getLabel_3());
		getContentPane().add(getBtnNewButton());

	}
	private JTextField getTfname() {
		if (tfname == null) {
			tfname = new JTextField();
			tfname.setBounds(196, 63, 148, 27);
			tfname.setColumns(10);
		}
		return tfname;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("이름 : ");
			lblNewLabel.setBounds(17, 69, 100, 21);
		}
		return lblNewLabel;
	}
	private JTextField getTftelnum() {
		if (tftelnum == null) {
			tftelnum = new JTextField();
			tftelnum.setColumns(10);
			tftelnum.setBounds(196, 114, 197, 27);
		}
		return tftelnum;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("전화번호 :");
			label.setBounds(17, 120, 100, 21);
		}
		return label;
	}
	private JTextField getTfaddress() {
		if (tfaddress == null) {
			tfaddress = new JTextField();
			tfaddress.setColumns(10);
			tfaddress.setBounds(196, 156, 295, 27);
		}
		return tfaddress;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("주소 : ");
			label_1.setBounds(17, 162, 100, 21);
		}
		return label_1;
	}
	private JTextField getTfemail() {
		if (tfemail == null) {
			tfemail = new JTextField();
			tfemail.setColumns(10);
			tfemail.setBounds(196, 201, 197, 27);
		}
		return tfemail;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("전자우편 : ");
			label_2.setBounds(17, 207, 100, 21);
		}
		return label_2;
	}
	private JTextField getTfrelation() {
		if (tfrelation == null) {
			tfrelation = new JTextField();
			tfrelation.setColumns(10);
			tfrelation.setBounds(196, 247, 197, 27);
		}
		return tfrelation;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("관계");
			label_3.setBounds(17, 253, 100, 21);
		}
		return label_3;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("OK");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					// 입력 클릭
					InsertAction();
				}
			});
			btnNewButton.setBounds(402, 351, 164, 60);
		}
		return btnNewButton;
	}
	
	//-------------------------------
	//3. 삽입 메소드
		private void InsertAction() {
			String name = tfname.getText();
			String telno = tftelnum.getText();
			String address = tfaddress.getText();
			String email = tfemail.getText();
			String relation = tfrelation.getText();
			
			//  name telno address email relation 에 관한 내용을 넘겨줄 생성자가 필요함
			//dbAction 을 실행할 때 생성자를 만들면서 위의 5개의 값을 넘겨줌
			DbAction dbAction = new DbAction(name, telno, address, email, relation);
			boolean insAct =dbAction.InsertAction();
			if(insAct==true) {
				JOptionPane.showMessageDialog(this, tfname.getText()+ " 님의 정보가 입력되었습니다.! ",
						"입력완료", JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(this, "DB자료 입력중에 에러가 발생했습니다. \n 시스템 관리자에게 문의 하세요!", "Critical Error", JOptionPane.ERROR_MESSAGE);
			}
			ClearColumn();
		}
		
		private void ClearColumn() {
			tfname.setText("");
			tftelnum.setText("");
			tfaddress.setText("");
			tfemail.setText("");
			tfrelation.setText("");
		}
	
	
	//==================================
}
