package com.javalec.usermgmt;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.awt.event.ActionEvent;

@SuppressWarnings("unused")
public class A1_userInsert extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblUserId;
	private JTextField tfUserid;
	private JButton btnNewButton;

	// 1. Database 환경정의
	// 데이터베이스 환경 : mysql - 로컬주소 - 사용할 스키마를 지정해서 경로를 설정.
	// 아이디와 패스워드 입력으로 접속이 가능하게 한다.
	private final String url_mysql = "jdbc:mysql://127.0.0.1/user";
	private final String id_mysql = "root";
	private final String pw_mysql = "1111";
	
	private JLabel lblNewLabel;
	private JTextField tfPassword;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					A1_userInsert frame = new A1_userInsert();
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
	public A1_userInsert() {
		setTitle("고객정보 입력");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 317);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblUserId());
		contentPane.add(getTfUserid());
		contentPane.add(getBtnNewButton());
		contentPane.add(getLblNewLabel());
		contentPane.add(getTfPassword());
	}
	private JLabel getLblUserId() {
		if (lblUserId == null) {
			lblUserId = new JLabel("User ID :");
			lblUserId.setBounds(24, 27, 57, 15);
		}
		return lblUserId;
	}
	private JTextField getTfUserid() {
		if (tfUserid == null) {
			tfUserid = new JTextField();
			tfUserid.setBounds(103, 24, 116, 21);
			tfUserid.setColumns(10);
		}
		return tfUserid;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("입력");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int i_chk = InsertFieldCheck();
					if(i_chk == 0) {
						InsertAction();
					}
				}
			});
			btnNewButton.setBounds(325, 228, 97, 23);
		}
		return btnNewButton;
	}
	

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Password :");
			lblNewLabel.setBounds(24, 63, 77, 15);
		}
		return lblNewLabel;
	}
	private JTextField getTfPassword() {
		if (tfPassword == null) {
			tfPassword = new JTextField();
			tfPassword.setBounds(103, 60, 116, 21);
			tfPassword.setColumns(10);
		}
		return tfPassword;
	}
	
	
	//-----------------------------------------------------------
	//2. 입력확인문
	private int InsertFieldCheck() {
		int i = 0;
		if(tfUserid.getText().length() == 0) {
			i++;
			tfUserid.requestFocus();
		}
		if(tfPassword.getText().length() == 0) {
			i++;
			tfPassword.requestFocus();
		}
		if(i > 0) {
			JOptionPane.showMessageDialog(this, "사용자 등록 화면! \n Data를 입력하세요!", 
					"주소록 정보", JOptionPane.INFORMATION_MESSAGE);
		}
		return i;
	}
	
	// 3. 입력문
	private void InsertAction() {
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			String A = "insert into info (userid, userpassword ";
			String B = ") values (?,?)";
			
			ps = conn_mysql.prepareStatement(A+B);
			ps.setString(1, tfUserid.getText().trim());
			ps.setString(2, tfPassword.getText().trim());
			
			ps.executeUpdate();
			conn_mysql.close();
		}catch(Exception e) {
			JOptionPane.showMessageDialog(this, "DB에 자료 입력중 에러가 발생했습니다. \n 시스템 관리자에게 문의하세요!", 
										"Critical Error", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		
		JOptionPane.showMessageDialog(this, tfUserid.getText()+"님의 정보가 입력 되었습니다.!", 
				"입력완료", JOptionPane.INFORMATION_MESSAGE);

	}
	
	
	
} // ----------------
