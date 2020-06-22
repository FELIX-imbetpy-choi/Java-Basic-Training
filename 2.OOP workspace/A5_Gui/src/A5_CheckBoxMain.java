import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class A5_CheckBoxMain extends JFrame {
	
	//체크박스는 여러개선택 라디오버튼은 한개만 선택 할 수 있음
	
	// 라디오버튼에선 오른쪽마우스 클릭 SetbuttonGroup 에서 뉴스탠다스 선택하면 둘중에 하나만 선택가능
	// 표준화처럼 굳어있는건 체크박스는 빈상태 라디오버튼은 선택된 상태로 만들어 주려면 Selected에서 true체크해줘야

	private JPanel contentPane;
	private JCheckBox ckApple;
	private JCheckBox ckBanana;
	private JRadioButton rdKBS;
	private JRadioButton rdMBC;
	private JButton btnCheck;
	private JButton btnRadio;
	private JTextField tfCheck;
	private JTextField tfRadio;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton btnTouch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//화면 시작전 다른 실행을 넣고 싶다면 여기서 제어 하면된다.
				try {
					A5_CheckBoxMain frame = new A5_CheckBoxMain();
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
	public A5_CheckBoxMain() {
		setTitle("CheckBox/ RadioButton");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 796, 554);   //화면에 띄운다는 뜻 setBound - 앞의 두자리는 왼쪽 끝에서 얼마나 떨어져있나 표시하는 좌표  - 그다음은 크기
		contentPane = new JPanel();      // 전체 창 안에 하얀창을 불러오는 것
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getCkApple());
		contentPane.add(getCkBanana());
		contentPane.add(getRdKBS());
		contentPane.add(getRdMBC());
		contentPane.add(getBtnCheck());
		contentPane.add(getBtnRadio());
		contentPane.add(getTfCheck());
		contentPane.add(getTfRadio());
		contentPane.add(getBtnTouch());
	}

	private JCheckBox getCkApple() {
		if (ckApple == null) {
			ckApple = new JCheckBox("Apple");
			ckApple.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
			ckApple.setBounds(55, 74, 151, 48);
		}
		return ckApple;
	}
	private JCheckBox getCkBanana() {
		if (ckBanana == null) {
			ckBanana = new JCheckBox("Banana");
			ckBanana.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
			ckBanana.setBounds(55, 149, 151, 39);
		}
		return ckBanana;
	}
	private JRadioButton getRdKBS() {
		if (rdKBS == null) {
			rdKBS = new JRadioButton("KBS");
			rdKBS.setSelected(true);
			buttonGroup.add(rdKBS);
			rdKBS.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
			rdKBS.setBounds(433, 74, 151, 48);
		}
		return rdKBS;
	}
	private JRadioButton getRdMBC() {
		if (rdMBC == null) {
			rdMBC = new JRadioButton("MBC");
			buttonGroup.add(rdMBC);
			rdMBC.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
			rdMBC.setBounds(433, 149, 151, 39);
		}
		return rdMBC;
	}
	private JButton getBtnCheck() {
		if (btnCheck == null) {
			btnCheck = new JButton("OK");
			btnCheck.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//체크박스 선택 메소드
					JuicyBro();
					
				}
			});
			btnCheck.setBounds(55, 267, 151, 48);
		}
		return btnCheck;
	}
	private JButton getBtnRadio() {
		if (btnRadio == null) {
			btnRadio = new JButton("OK");
			btnRadio.addActionListener(new ActionListener() {
				// 라디오버튼 엑션퍼폼드
				public void actionPerformed(ActionEvent arg0) {
					BroadcastCheck();
					
				}
			});
			btnRadio.setBounds(455, 267, 151, 48);
		}
		return btnRadio;
	}
	private JButton getBtnTouch() {
		
		       // 터치버튼
		if (btnTouch == null) {
			btnTouch = new JButton("touch");
			btnTouch.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent arg0) {
					BroadcastCheck();
					JuicyBro();
					
				}
				@Override
				public void mouseExited(MouseEvent arg0) {
					Clear();
				}
			});
			btnTouch.setBounds(650, 267, 95, 48);
		}
		return btnTouch;
	}
	private JTextField getTfCheck() {
		if (tfCheck == null) {
			tfCheck = new JTextField();
			tfCheck.setBounds(55, 353, 304, 48);
			tfCheck.setColumns(10);
		}
		return tfCheck;
	}
	private JTextField getTfRadio() {
		if (tfRadio == null) {
			tfRadio = new JTextField();
			tfRadio.setBounds(453, 353, 304, 48);
			tfRadio.setColumns(10);
		}
		return tfRadio;
	}
	
	//----------------------------------------------------------------
	//메소드 추가
	private void BroadcastCheck() {
		if(rdKBS.isSelected()==true) {  //값이 선택 되었나 물어보는 액션 선택되었으면 true 값
			tfRadio.setText("KBS가 선택 되었습니다.");
		}
		if(rdMBC.isSelected()==true) {
			tfRadio.setText("MBC가 선택 되었습니다.");
		}
		
	}
	
	
	private void JuicyBro() {
		
		int sum = 0;
		
		if(ckApple.isSelected()==true) {
			tfCheck.setText("사과가 선택되었습니다.");
			sum = sum + 1;
		}
		if(ckBanana.isSelected()==true) {
			tfCheck.setText("바나나가 선택되었습니다.");
			sum = sum + 1;
		}
		if(sum == 2) {
			tfCheck.setText("사과와 바나나가 선택되었습니다.");
		}
		
		
	}
	
	private void Clear() {
		tfCheck.setText(" ");
		tfRadio.setText(" ");
	}
	
	
	
	
	
	//----------------------------------------------------------------
}
