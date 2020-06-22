package com.javalec.usermgmt;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ListSelectionModel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("unused")
public class A5_UserFullQuery extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JLabel lblNewLabel;

	// -------
	private final DefaultTableModel Outer_Table = new DefaultTableModel(); //----------
	//1 데이터베이스 환경설정
	private final String url_mysql = "jdbc:mysql://127.0.0.1/user";
	private final String id_mysql = "root";
	private final String pw_mysql = "1111";
	private JTable Inner_Table;
	private JLabel lblPassword;
	private JTextField tfPassword;
	private JTextField tfUserid;
	private JTextField tfCount;
	private JLabel lblNewLabel_1;
	private JComboBox cbSelection;
	private JTextField tfCquery;
	private JButton btnQuery;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					A5_UserFullQuery frame = new A5_UserFullQuery();
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
	public A5_UserFullQuery() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent arg0) {
				// 1 윈도우 시작시 테이블 설정, 검색문
				TableInit();
				SearchAction();
			}
		});
		setTitle("주소록 검색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 325, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getScrollPane());
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblPassword());
		contentPane.add(getTfPassword());
		contentPane.add(getTfUserid());
		contentPane.add(getTfCount());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getCbSelection());
		contentPane.add(getTfCquery());
		contentPane.add(getBtnQuery());
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 62, 200, 99);
			scrollPane.setViewportView(getInner_Table());
		}
		return scrollPane;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("UserID :");
			lblNewLabel.setBounds(22, 187, 57, 15);
		}
		return lblNewLabel;
	}
	
	
	
	
	
	private JTable getInner_Table() {
		if (Inner_Table == null) {
			Inner_Table = new JTable();
			Inner_Table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					if(arg0.getButton() == 1) {
						// 2 테이블 클릭시 정보 띄우기
						TableClick();
					}
				}
			});
			Inner_Table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			Inner_Table.setModel(Outer_Table); //------------
		}
		return Inner_Table;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password :");
			lblPassword.setBounds(22, 215, 76, 15);
		}
		return lblPassword;
	}
	private JTextField getTfPassword() {
		if (tfPassword == null) {
			tfPassword = new JTextField();
			tfPassword.setEditable(false);
			tfPassword.setBounds(96, 212, 182, 21);
			tfPassword.setColumns(10);
		}
		return tfPassword;
	}
	private JTextField getTfUserid() {
		if (tfUserid == null) {
			tfUserid = new JTextField();
			tfUserid.setEditable(false);
			tfUserid.setBounds(96, 184, 182, 21);
			tfUserid.setColumns(10);
		}
		return tfUserid;
	}
	

	private JTextField getTfCount() {
		if (tfCount == null) {
			tfCount = new JTextField();
			tfCount.setHorizontalAlignment(SwingConstants.TRAILING);
			tfCount.setEditable(false);
			tfCount.setBounds(220, 139, 38, 21);
			tfCount.setColumns(10);
		}
		return tfCount;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("명");
			lblNewLabel_1.setBounds(259, 142, 19, 15);
		}
		return lblNewLabel_1;
	}
	private JComboBox getCbSelection() {
		if (cbSelection == null) {
			cbSelection = new JComboBox();
			cbSelection.setModel(new DefaultComboBoxModel(new String[] {"사용자ID", "패스워드"}));
			cbSelection.setBounds(12, 31, 86, 21);
		}
		return cbSelection;
	}
	private JTextField getTfCquery() {
		if (tfCquery == null) {
			tfCquery = new JTextField();
			tfCquery.setBounds(110, 31, 102, 21);
			tfCquery.setColumns(10);
		}
		return tfCquery;
	}
	private JButton getBtnQuery() {
		if (btnQuery == null) {
			btnQuery = new JButton("검색");
			btnQuery.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//4 콤보박스 검색
					ConditionQuery();
				}
			});
			btnQuery.setBounds(224, 30, 73, 23);
		}
		return btnQuery;
	}
	
	
	//------------------------------------------------------------------------------------------
	//2 테이블 규격 설정
	private void TableInit() {
		// Table Header
		Outer_Table.addColumn("사용자ID");
		Outer_Table.addColumn("패스워드");
		Outer_Table.setColumnCount(2);
		
		// 기존 Data 삭제
		int i = Outer_Table.getRowCount();
		for(int j = 0; j < i; j++) {
			Outer_Table.removeRow(0);
		}
		
		// Table 크기 조절 불가
		Inner_Table.setAutoResizeMode(Inner_Table.AUTO_RESIZE_OFF);
		
		// Data Field 정의
		int vColIndex = 0;
		TableColumn col = Inner_Table.getColumnModel().getColumn(vColIndex);
		int width = 90;
		col.setPreferredWidth(width);
		
		vColIndex = 1;
		col = Inner_Table.getColumnModel().getColumn(vColIndex);
		width = 90;
		col.setPreferredWidth(width);
	}
	
	// 2  검색문
	private void SearchAction() {
		
		int	Count = 0;
		String WhereDefault = "select userid, userpassword from info ";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			ResultSet rs = stmt_mysql.executeQuery(WhereDefault);

			while(rs.next()) {
				String[] qTxt = {rs.getString(1), rs.getString(2)};
				Outer_Table.addRow(qTxt);
				Count++;
			}
			
			conn_mysql.close();
			
			tfCount.setText(Integer.toString(Count));

		}catch(Exception e) {
			JOptionPane.showMessageDialog(this, "DB에 자료 입력중 에러가 발생했습니다. \n 시스템 관리자에게 문의하세요!", 
					"Critical Error", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		
	}
	
	//3 테이블 클릭시 정보 띄워
	private void TableClick() {
		
		int i = Inner_Table.getSelectedRow();
		String strUserid = (String)Inner_Table.getValueAt(i, 0);
		String strPassword = "";
		
		String WhereDefault = "select userpassword from info ";
		String WhereString = " where userid = '" + strUserid + "'";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			ResultSet rs = stmt_mysql.executeQuery(WhereDefault + WhereString);

			while(rs.next()) {
				strPassword = rs.getString(1);
			}
			
			conn_mysql.close();

			tfUserid.setText(strUserid);
			tfPassword.setText(strPassword);
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(this, "DB에 자료 입력중 에러가 발생했습니다. \n 시스템 관리자에게 문의하세요!", 
					"Critical Error", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		
	}
	
	
	// 4 콤보박스 판별 - 검색문
	private void ConditionQuery() {
		int i = cbSelection.getSelectedIndex();
		String ConditionQueryColumn = "";
		
		switch(i) {
		case 0:
			ConditionQueryColumn = "userid";
			break;
		case 1:
			ConditionQueryColumn = "userpassword";
			break;
		default:
			break;
		}
		
		TableInit();
		ClearColumn();
		ConditionQueryAction(ConditionQueryColumn);
	}
	
	private void ClearColumn() {
		tfUserid.setText("");
		tfPassword.setText("");
	}
	
	// 4 검색문
	private void ConditionQueryAction(String qcol) {
		// 몇명인지 카운트
		int	Count = 0;
		String WhereDefault = "select userid, userpassword from info where " + qcol;
		String WhereDefault2 = " like '%" + tfCquery.getText().trim() + "%'";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			ResultSet rs = stmt_mysql.executeQuery(WhereDefault + WhereDefault2);

			while(rs.next()) {
				String[] qTxt = {rs.getString(1), rs.getString(2)};
				Outer_Table.addRow(qTxt);
				Count++;
			}
			
			conn_mysql.close();
			
			tfCount.setText(Integer.toString(Count));

		}catch(Exception e) {
			JOptionPane.showMessageDialog(this, "DB에 자료 입력중 에러가 발생했습니다. \n 시스템 관리자에게 문의하세요!", 
					"Critical Error", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
}// --------------------
