

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class A8_PasswordMain extends JFrame {

	/**
	 * 
	 */
	// final 의 변수는 못바꾼다 - 바꾸면 에러걸림  - Long 타입이라 값에 L이 들어가 있음
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblPassword;
	private JPasswordField pfFiled;
	private JButton btnView;
	private JTextField tfView;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					A8_PasswordMain frame = new A8_PasswordMain();
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
	public A8_PasswordMain() {
		setTitle("Password");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 842, 573);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblPassword());
		contentPane.add(getPfFiled());
		contentPane.add(getBtnView());
		contentPane.add(getTfView());
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password : ");
			lblPassword.setBounds(61, 74, 111, 28);
		}
		return lblPassword;
	}
	private JPasswordField getPfFiled() {
		if (pfFiled == null) {
			pfFiled = new JPasswordField();
			pfFiled.setBounds(174, 69, 223, 40);
		}
		return pfFiled;
	}
	private JButton getBtnView() {
		if (btnView == null) {
			btnView = new JButton("View");
			btnView.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					//액션
					gettp();
				}
			});
			btnView.setBounds(424, 68, 104, 34);
		}
		return btnView;
	}
	private JTextField getTfView() {
		if (tfView == null) {
			tfView = new JTextField();
			tfView.setEditable(false);
			tfView.setBounds(174, 140, 223, 40);
			tfView.setColumns(10);
		}
		return tfView;
	}
	
	//----------------------------------------------------------
	// 패스워드 항목은 get text 하지 못한다.
	private void gettp() {
		//패스워드는 문자형식의 배열로 받아진다  - 이런 배열을 출력하려면 for문을 통해서 하나씩 나오게 해야하는데 그걸 해주는 메소드가 String 메소드
		char[] psw = pfFiled.getPassword();
		//스트링 메소드를 사용해서 패스워드 배열을 한번에 변수에 담을 수 있음
		String passString = new String(psw);
		tfView.setText(passString);
		
	}
	
	//----------------------------------------------------------
}
