package com.javalec.usermgmt;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class A4_UserDelete extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JLabel lblUserId;
	private JTextField tfUserid;
	private JButton btnOk;
	private JSeparator separator;
	private JLabel lblPassword;
	private JTextField tfPassword;
	
	// 1 Database 환경 정의
	private final String url_mysql = "jdbc:mysql://127.0.0.1/user";
	private final String id_mysql = "root";
	private final String pw_mysql = "1111";
	private JButton btnNewButton;
 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					A4_UserDelete frame = new A4_UserDelete();
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
	public A4_UserDelete() {
		setTitle("사용자 삭제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 431, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblUserId());
		contentPane.add(getTfUserid());
		contentPane.add(getBtnOk());
		contentPane.add(getSeparator());
		contentPane.add(getLblPassword());
		contentPane.add(getTfPassword());
		contentPane.add(getBtnNewButton());
	}

	private JLabel getLblUserId() {
		if (lblUserId == null) {
			lblUserId = new JLabel("User ID :");
			lblUserId.setBounds(23, 14, 57, 15);
		}
		return lblUserId;
	}
	private JTextField getTfUserid() {
		if (tfUserid == null) {
			tfUserid = new JTextField();
			tfUserid.setBounds(108, 11, 116, 21);
			tfUserid.setColumns(10);
		}
		return tfUserid;
	}
	private JButton getBtnOk() {
		if (btnOk == null) {
			btnOk = new JButton("검색");
			btnOk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//2 검색문
					SearchAction();
				}
			});
			btnOk.setBounds(253, 10, 97, 23);
		}
		return btnOk;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(23, 47, 372, 15);
		}
		return separator;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password :");
			lblPassword.setBounds(23, 60, 73, 15);
		}
		return lblPassword;
	}
	private JTextField getTfPassword() {
		if (tfPassword == null) {
			tfPassword = new JTextField();
			tfPassword.setBounds(108, 57, 116, 21);
			tfPassword.setColumns(10);
		}
		return tfPassword;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("삭제");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//3 삭제문
					DeleteAction();
				}
			});
			btnNewButton.setBounds(253, 56, 97, 23);
		}
		return btnNewButton;
	}

	
	//--------------------------------------------------------------------------------------
	// 2 검색문
	private void SearchAction() {
		
		String WhereDefault = "select userpassword from info ";
		String WhereString = " where userid = '" + tfUserid.getText().trim() + "'";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			ResultSet rs = stmt_mysql.executeQuery(WhereDefault + WhereString);

			while(rs.next()) {
				tfPassword.setText(rs.getString(1));
			}
			
			conn_mysql.close();

		}catch(Exception e) {
			JOptionPane.showMessageDialog(this, "DB에 자료 입력중 에러가 발생했습니다. \n 시스템 관리자에게 문의하세요!", 
					"Critical Error", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		
	}
	
	// 3 삭제문
	private void DeleteAction() {
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			String A = "delete from info ";
			String B = " where userid = ?";
			
			ps = conn_mysql.prepareStatement(A+B);
			ps.setString(1, tfUserid.getText().trim());
			
			ps.executeUpdate();
			conn_mysql.close();
		}catch(Exception e) {
			JOptionPane.showMessageDialog(this, "DB에 자료 입력중 에러가 발생했습니다. \n 시스템 관리자에게 문의하세요!", 
										"Critical Error", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		
		JOptionPane.showMessageDialog(this, tfUserid.getText()+"님의 정보가 삭제 되었습니다.!", 
				"삭제완료", JOptionPane.INFORMATION_MESSAGE);

		
	}
	
	
	
	
	
	
	
} // ----------------------
