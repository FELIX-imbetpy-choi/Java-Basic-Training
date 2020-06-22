package com.javalec.useraddress;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class UserInsert extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JTextField tfName;
	private JTextField tfTelNo;
	private JTextField tfAddress;
	private JTextField tfEmail;
	private JTextField tfRelation;
	private JButton btnOK;
	
// 1 Database 환경 정의	
    private final String url_mysql = "jdbc:mysql://127.0.0.1/addressbook";
    private final String id_mysql = "root";
    private final String pw_mysql = "1111";
// -------	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserInsert frame = new UserInsert();
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
	public UserInsert() {
		setTitle("주소록 등록");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 472, 328);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLabel());
		contentPane.add(getLabel_1());
		contentPane.add(getLabel_2());
		contentPane.add(getLabel_3());
		contentPane.add(getLabel_4());
		contentPane.add(getTfName());
		contentPane.add(getTfTelNo());
		contentPane.add(getTfAddress());
		contentPane.add(getTfEmail());
		contentPane.add(getTfRelation());
		contentPane.add(getBtnOK());
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("성명 :");
			label.setBounds(25, 19, 61, 16);
		}
		return label;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("전화번호 :");
			label_1.setBounds(25, 60, 61, 16);
		}
		return label_1;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("주소 :");
			label_2.setBounds(25, 103, 61, 16);
		}
		return label_2;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("전자우편 :");
			label_3.setBounds(25, 143, 61, 16);
		}
		return label_3;
	}
	private JLabel getLabel_4() {
		if (label_4 == null) {
			label_4 = new JLabel("관계 :");
			label_4.setBounds(25, 184, 61, 16);
		}
		return label_4;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setBounds(87, 14, 130, 26);
			tfName.setColumns(10);
		}
		return tfName;
	}
	private JTextField getTfTelNo() {
		if (tfTelNo == null) {
			tfTelNo = new JTextField();
			tfTelNo.setBounds(87, 55, 188, 26);
			tfTelNo.setColumns(10);
		}
		return tfTelNo;
	}
	private JTextField getTfAddress() {
		if (tfAddress == null) {
			tfAddress = new JTextField();
			tfAddress.setBounds(87, 98, 335, 26);
			tfAddress.setColumns(10);
		}
		return tfAddress;
	}
	private JTextField getTfEmail() {
		if (tfEmail == null) {
			tfEmail = new JTextField();
			tfEmail.setBounds(87, 138, 188, 26);
			tfEmail.setColumns(10);
		}
		return tfEmail;
	}
	private JTextField getTfRelation() {
		if (tfRelation == null) {
			tfRelation = new JTextField();
			tfRelation.setBounds(87, 179, 335, 26);
			tfRelation.setColumns(10);
		}
		return tfRelation;
	}
	private JButton getBtnOK() {
		if (btnOK == null) {
			btnOK = new JButton("입력");
			btnOK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//2 사용자 입력 체크
					int i_chk = insertFieldCheck();
					if(i_chk == 0){
						// 2 입력기능 
						insertAction();
					}
				}
			});
			btnOK.setBounds(305, 229, 117, 29);
		}
		return btnOK;
	}
// -----------
	// 2 사용자 값 입력체크
	private int insertFieldCheck(){
		int i = 0;
		if(tfName.getText().length() == 0){
			i++;
			tfName.requestFocus();
		}
		if(tfTelNo.getText().length() == 0){
			i++;
			tfTelNo.requestFocus();
		}
		if(tfAddress.getText().length() == 0){
			i++;
			tfAddress.requestFocus();
		}
		if(tfEmail.getText().length() == 0){
			i++;
			tfEmail.requestFocus();
		}
		if(tfRelation.getText().length() == 0){
			i++;
			tfRelation.requestFocus();
		}
		
		if(i > 0){
			JOptionPane.showMessageDialog(this, "주소록 정보 입력 화면 입니다! " + "\n" + 
					"Data를 입력하세요 하세요!",
					"주소록 정보", 
					JOptionPane.INFORMATION_MESSAGE);        			
		}
		
		return i;
	}
	
	// 2 사용자 입력값 데이터베이스 입력
	private void insertAction(){
        PreparedStatement ps = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
            @SuppressWarnings("unused")
			Statement stmt_mysql = conn_mysql.createStatement();

            String A = "insert into info (name, telno, address, email, relation";
            String B = ") values (?,?,?,?,?)";

            ps = conn_mysql.prepareStatement(A+B);
            ps.setString(1, tfName.getText().trim());
            ps.setString(2, tfTelNo.getText().trim());
            ps.setString(3, tfAddress.getText().trim());
            ps.setString(4, tfEmail.getText().trim());
            ps.setString(5, tfRelation.getText().trim());
            ps.executeUpdate();

            conn_mysql.close();
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "DB에 자료 입력중 에러가 발생했습니다! \n 시스템관리자에 문의하세요!",
                                         "Critical Error!", 
                                         JOptionPane.ERROR_MESSAGE);                    
            e.printStackTrace();
        }
          JOptionPane.showMessageDialog(this, tfName.getText()+" 님의 정보가 입력 되었습니다.!",
                                         "입력 완료!", 
                                         JOptionPane.INFORMATION_MESSAGE);                    
		
	}

	
}
