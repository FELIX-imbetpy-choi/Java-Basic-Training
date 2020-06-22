package com.address.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import com.address.function.Bean;
import com.address.function.DbAction;

import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.ListSelectionModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

@SuppressWarnings("unused")
public class Main extends JFrame {
	
	
	//SDI방식 MDI 는 이곳의 소스를 복붙해서 쓰면된다.

	/**
	 * 
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JRadioButton rbinsert;
	private JRadioButton rbupdate;
	private JRadioButton rbdelete;
	private JRadioButton rbquery;
	private JComboBox<?> cbselection;
	private JTextField tfselection;
	private JButton btnquery;
	private JTextField tfseq;
	private JTextField tfname;
	private JTextField tftelnum;
	private JTextField tfaddress;
	private JTextField tfemail;
	private JTextField tfrelation;
	private JLabel lblSeq;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label;
	private JLabel label_4;
	private JLabel lblNewLabel;
	private JTextField tfcount;
	private JButton btnOk;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	//------------------------------
	private final DefaultTableModel Outer_Table = new DefaultTableModel();
	private JScrollPane scrollPane;
	private JTable inner_table;
	private JLabel lblNewLabel_1;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				// 1. 윈도우 시작시 액션
				TableInit();
				SearchAction();
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 585);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLUE);
		contentPane.setBackground(new Color(255, 240, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getRbinsert());
		contentPane.add(getRbupdate());
		contentPane.add(getRbdelete());
		contentPane.add(getRbquery());
		contentPane.add(getCbselection());
		contentPane.add(getTfselection());
		contentPane.add(getBtnquery());
		contentPane.add(getTfseq());
		contentPane.add(getTfname());
		contentPane.add(getTftelnum());
		contentPane.add(getTfaddress());
		contentPane.add(getTfemail());
		contentPane.add(getTfrelation());
		contentPane.add(getLblSeq());
		contentPane.add(getLabel_1());
		contentPane.add(getLabel_2());
		contentPane.add(getLabel_3());
		contentPane.add(getLabel());
		contentPane.add(getLabel_4());
		contentPane.add(getLblNewLabel());
		contentPane.add(getTfcount());
		contentPane.add(getBtnOk());
		contentPane.add(getScrollPane());
		contentPane.add(getLblNewLabel_1());
	}
	private JRadioButton getRbinsert() {
		if (rbinsert == null) {
			rbinsert = new JRadioButton("입력");
			rbinsert.setBackground(new Color(255, 240, 245));
			rbinsert.setForeground(Color.BLUE);
			rbinsert.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// 2. 라디오버튼 판별메소드
					SettingEditTrue();
				}
			});
			buttonGroup.add(rbinsert);
			rbinsert.setBounds(24, 6, 65, 23);
		}
		return rbinsert;
	}
	private JRadioButton getRbupdate() {
		if (rbupdate == null) {
			rbupdate = new JRadioButton("수정");
			rbupdate.setBackground(new Color(255, 240, 245));
			rbupdate.setForeground(Color.BLUE);
			rbupdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					SettingEditTrue();
				}
			});
			buttonGroup.add(rbupdate);
			rbupdate.setBounds(93, 6, 71, 23);
		}
		return rbupdate;
	}
	private JRadioButton getRbdelete() {
		if (rbdelete == null) {
			rbdelete = new JRadioButton("삭제");
			rbdelete.setBackground(new Color(255, 240, 245));
			rbdelete.setForeground(Color.BLUE);
			rbdelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					SettingEditFalse();
				}
			});
			buttonGroup.add(rbdelete);
			rbdelete.setBounds(168, 6, 81, 23);
		}
		return rbdelete;
	}
	private JRadioButton getRbquery() {
		if (rbquery == null) {
			rbquery = new JRadioButton("검색");
			rbquery.setBackground(new Color(255, 240, 245));
			rbquery.setForeground(Color.BLUE);
			rbquery.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					SettingEditFalse();
				}
			});
			buttonGroup.add(rbquery);
			rbquery.setSelected(true);
			rbquery.setBounds(253, 6, 88, 23);
		}
		return rbquery;
	}
	private JComboBox getCbselection() {
		if (cbselection == null) {
			cbselection = new JComboBox();
			cbselection.setBackground(new Color(255, 240, 245));
			cbselection.setForeground(Color.BLUE);
			cbselection.setModel(new DefaultComboBoxModel(new String[] {"이름", "주소", "전화번호", "관계"}));
			cbselection.setBounds(24, 54, 86, 21);
		}
		return cbselection;
	}
	private JTextField getTfselection() {
		if (tfselection == null) {
			tfselection = new JTextField();
			tfselection.setBounds(122, 54, 179, 21);
			tfselection.setColumns(10);
		}
		return tfselection;
	}
	private JButton getBtnquery() {
		if (btnquery == null) {
			btnquery = new JButton("검색");
			btnquery.setIcon(null);
			btnquery.setBackground(new Color(255, 240, 245));
			btnquery.setForeground(Color.BLUE);
			btnquery.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// 2.검색하는 메소드
					ConditionQueryAction();
				}
			});
			btnquery.setBounds(313, 53, 65, 22);
		}
		return btnquery;
	}

	private JTextField getTfseq() {
		if (tfseq == null) {
			tfseq = new JTextField();
			tfseq.setBackground(new Color(255, 255, 255));
			tfseq.setHorizontalAlignment(SwingConstants.TRAILING);
			tfseq.setEditable(false);
			tfseq.setBounds(90, 275, 57, 21);
			tfseq.setColumns(10);
		}
		return tfseq;
	}
	private JTextField getTfname() {
		if (tfname == null) {
			tfname = new JTextField();
			tfname.setBackground(new Color(255, 255, 255));
			tfname.setEditable(false);
			tfname.setColumns(10);
			tfname.setBounds(90, 306, 105, 21);
		}
		return tfname;
	}
	private JTextField getTftelnum() {
		if (tftelnum == null) {
			tftelnum = new JTextField();
			tftelnum.setBackground(new Color(255, 255, 255));
			tftelnum.setEditable(false);
			tftelnum.setColumns(10);
			tftelnum.setBounds(90, 337, 179, 21);
		}
		return tftelnum;
	}
	private JTextField getTfaddress() {
		if (tfaddress == null) {
			tfaddress = new JTextField();
			tfaddress.setBackground(new Color(255, 255, 255));
			tfaddress.setEditable(false);
			tfaddress.setColumns(10);
			tfaddress.setBounds(90, 368, 288, 21);
		}
		return tfaddress;
	}
	private JTextField getTfemail() {
		if (tfemail == null) {
			tfemail = new JTextField();
			tfemail.setBackground(new Color(255, 255, 255));
			tfemail.setEditable(false);
			tfemail.setColumns(10);
			tfemail.setBounds(90, 399, 231, 21);
		}
		return tfemail;
	}
	private JTextField getTfrelation() {
		if (tfrelation == null) {
			tfrelation = new JTextField();
			tfrelation.setBackground(new Color(255, 255, 255));
			tfrelation.setEditable(false);
			tfrelation.setColumns(10);
			tfrelation.setBounds(90, 430, 288, 21);
		}
		return tfrelation;
	}
	private JLabel getLblSeq() {
		if (lblSeq == null) {
			lblSeq = new JLabel("SEQ :");
			lblSeq.setForeground(Color.BLUE);
			lblSeq.setBounds(24, 275, 57, 15);
		}
		return lblSeq;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("이름 :");
			label_1.setForeground(Color.BLUE);
			label_1.setBounds(24, 306, 57, 15);
		}
		return label_1;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("전화번호 :");
			label_2.setForeground(Color.BLUE);
			label_2.setBounds(24, 337, 65, 15);
		}
		return label_2;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("주소 :");
			label_3.setForeground(Color.BLUE);
			label_3.setBounds(24, 371, 57, 15);
		}
		return label_3;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("전자우편 :");
			label.setForeground(Color.BLUE);
			label.setBounds(24, 399, 65, 15);
		}
		return label;
	}
	private JLabel getLabel_4() {
		if (label_4 == null) {
			label_4 = new JLabel("관계 :");
			label_4.setForeground(Color.BLUE);
			label_4.setBounds(24, 430, 57, 15);
		}
		return label_4;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("명");
			lblNewLabel.setForeground(Color.BLUE);
			lblNewLabel.setBounds(360, 278, 20, 15);
		}
		return lblNewLabel;
	}
	private JTextField getTfcount() {
		if (tfcount == null) {
			tfcount = new JTextField();
			tfcount.setBackground(new Color(255, 255, 255));
			tfcount.setEditable(false);
			tfcount.setHorizontalAlignment(SwingConstants.TRAILING);
			tfcount.setBounds(312, 275, 43, 21);
			tfcount.setColumns(10);
		}
		return tfcount;
	}
	private JButton getBtnOk() {
		if (btnOk == null) {
			btnOk = new JButton("OK");
			btnOk.setBackground(new Color(255, 240, 245));
			btnOk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					// 3. 기능들의 Ok 버튼
					ActionPartition();
				}
			});
			btnOk.setBounds(152, 469, 97, 23);
		}
		return btnOk;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();	
			scrollPane.setBounds(24, 85, 356, 164);
			scrollPane.setViewportView(getInner_table());
		}
		return scrollPane;
	}
	private JTable getInner_table() {
		if (inner_table == null) {
			inner_table = new JTable();
			inner_table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		}
		inner_table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//4. 테이블 클릭시 정보 보여주는 메소드
				ActionClick();
			}
		});
		//
		inner_table.setModel(Outer_Table);
		return inner_table;
		
		
	}//----------------------------------------------

	
	
	// 1. 윈도우 시작시 실행되는 테이블 설정 메소드
	private void TableInit() {
		
		Outer_Table.addColumn("순서"); //table 의 from을 만들어줌 
		Outer_Table.addColumn("이름");
		Outer_Table.addColumn("전화번호");
		Outer_Table.addColumn("관계");
		Outer_Table.setColumnCount(4);
		
		int i = Outer_Table.getRowCount(); //화면에 총 몇개있나 가져움
		
		//기존 데이터 삭제  기존에 쓴적이 잇을 때 초기화 해준다는 의미
		for(int j =0; j<i; j++) {
			Outer_Table.removeRow(0); //0은 null 값
		}
		//table 크기 조절 불가
		inner_table.setAutoResizeMode(inner_table.AUTO_RESIZE_OFF);
		
		//data field 정의 
		int vColIndex =0; //첫번째 인덱스 설정
		TableColumn col =inner_table.getColumnModel().getColumn(vColIndex);
		int width =50;
		col.setPreferredWidth(width);// 제일 처음 컬럼 크기 50으로 정해줌
		vColIndex =1; //두번째 인덱스 설정
		col =inner_table.getColumnModel().getColumn(vColIndex);
		width = 80;
		col.setPreferredWidth(width);
		vColIndex =2; //두번째 인덱스 설정
		col =inner_table.getColumnModel().getColumn(vColIndex);
		width = 110;
		col.setPreferredWidth(width);
		vColIndex =3; //두번째 인덱스 설정
		col =inner_table.getColumnModel().getColumn(vColIndex);
		width = 100;
		col.setPreferredWidth(width);	
		
	}
	
	// 1. 윈도우 시작시 
	// Main 소스에는 Sql 문장이 없음 다 다른 클레스에서 받아옴!
	private void SearchAction() {
		//다른 클래스를 만들것임! -- selectList메소드를 를 DbAction class에  만들어 놨음
		DbAction dbAction =new DbAction();
		ArrayList<Bean> beanList =dbAction.selectList();  //ArrayList,Bean 둘다 import
		
		int listCount = beanList.size(); //return 받은 beanlist의 싸이즈를 알려줌 
		String count = Integer.toString(listCount);
		tfcount.setText(count);
		for(int i = 0 ; i< listCount; i++) {
			String temp =Integer.toString(beanList.get(i).getSeqno());// getter setter 함수를 임포트 했기 때문에 가능
			//seqno 숫자이기 때문에 string에 넣어줌
			String[] qTxt = {temp, beanList.get(i).getName(),beanList.get(i).getTelno(),beanList.get(i).getRelation()};
			//나머지는 String이기때문에  그냥 불러서 사용하면 됌
			Outer_Table.addRow(qTxt);
		}
	
	}
	
	// 3. ok버튼
	private void ActionPartition() {
		if(rbinsert.isSelected() == true) {
			InsertAction();
			TableInit();
			SearchAction();
			ClearColumn();
		}
		if(rbupdate.isSelected() == true) {
			UpdateAction();
			TableInit();
			SearchAction();
			ClearColumn();
		}
		if(rbdelete.isSelected() == true) {
			DeleteAction();
			TableInit();
			SearchAction();
			ClearColumn();
		}
		
	}
	
	// 텍스트박스 정리
	private void ClearColumn() {
		tfseq.setText("");
		tfname.setText("");
		tftelnum.setText("");
		tfaddress.setText("");
		tfemail.setText("");
		tfrelation.setText("");
	}
	
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
	}
	
	//3. 수정 메소드
	private void UpdateAction(){
		int seq = Integer.parseInt(tfseq.getText());
		String name = tfname.getText();
		String telno = tftelnum.getText();
		String address = tfaddress.getText();
		String email = tfemail.getText();
		String relation = tfrelation.getText();
		
		DbAction dbAction =new DbAction(seq, name, telno, address, email, relation);
		boolean updateAct =dbAction.UpdateAction();
		if(updateAct==true) {
			JOptionPane.showMessageDialog(this, tfname.getText()+ " 님의 정보가 수정되었습니다.! ",
					"입력완료", JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(this, "DB자료 입력중에 에러가 발생했습니다. \n 시스템 관리자에게 문의 하세요!", "Critical Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	//3. 삭제 메소드
		private void DeleteAction() {
			int deseq = Integer.parseInt(tfseq.getText());
			
			DbAction dbAction =new DbAction(deseq);
			boolean deleteAct =dbAction.DeleteAction();
			
			if(deleteAct==true) {
				JOptionPane.showMessageDialog(this, tfname.getText()+ " 님의 정보가 삭제되었습니다.! ",
						"입력완료", JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(this, "DB자료 입력중에 에러가 발생했습니다. \n 시스템 관리자에게 문의 하세요!", "Critical Error", JOptionPane.ERROR_MESSAGE);
			}
			
		}
	
	//4. 테이블 클릭 메소드
	private void ActionClick(){
		int i = inner_table.getSelectedRow(); //클릭한 테이블이 몇번째 수인지 i에 저장한다.
		String tkSeq =(String)inner_table.getValueAt(i, 0); //i의 첫번째 열의 값을 가져온다. - 문자이므로 스트링
		int wkseq =Integer.parseInt(tkSeq); //seq넘버의 값을 숫자로 바꿔준다.
		DbAction dbAction =new DbAction(wkseq); //바뀐 seq 을 이용해 
		Bean bean =dbAction.ActionClick();
		
		tfseq.setText(Integer.toString(bean.getSeqno()));
		tfname.setText(bean.getName());
		tftelnum.setText(bean.getTelno());
		tfaddress.setText(bean.getAddress());
		tfemail.setText(bean.getEmail());
		tfrelation.setText(bean.getRelation());
	}
	
	
	// 텍스트박스 온오프
	private void  SettingEditTrue(){
		
		
		tfname.setEditable(true);
		tftelnum.setEditable(true);
		tfaddress.setEditable(true);
		tfemail.setEditable(true);
		tfrelation.setEditable(true);
		
	}

	private void  SettingEditFalse(){
	
	
		tfname.setEditable(false);
		tftelnum.setEditable(false);
		tfaddress.setEditable(false);
		tfemail.setEditable(false);
		tfrelation.setEditable(false);
	
	}
	
	//2-1. 검색버튼 입력시 - 콤보박스에서 검색조건 받아오기
	private String ConditionQuery() {
		 int i =cbselection.getSelectedIndex();
		String ColumnName=null;
		switch (i) {
		case 0:
			ColumnName = "name";
			break;
		case 1:
			ColumnName = "address";
			break;
		case 2:
			ColumnName = "tel";
			break;
		case 3:
			ColumnName = "relation";
			break;
		default :
			break;
		}
	
		return ColumnName;
	
	}
	
	//2. 검색버튼 입력시 실행 메소드
	private void ConditionQueryAction() {
		TableInit();
		ClearColumn();
		// 콤보박스에서 값을 받아오는 메소드
		String column =ConditionQuery();
		String searching =tfselection.getText();
		DbAction dbAction =new DbAction(searching,column);
		ArrayList<Bean> beanList =dbAction.ConditionQueryAction();  //ArrayList,Bean 둘다 import
		int listCount = beanList.size(); //return 받은 beanlist의 싸이즈를 알려줌 
		String count = Integer.toString(listCount);
		tfcount.setText(count);
		for(int i = 0 ; i< listCount; i++) {
			String temp =Integer.toString(beanList.get(i).getSeqno());// getter setter 함수를 임포트 했기 때문에 가능
			//seqno 숫자이기 때문에 string에 넣어줌
			String[] qTxt = {temp, beanList.get(i).getName(),beanList.get(i).getTelno(),beanList.get(i).getRelation()};
			//나머지는 String이기때문에  그냥 불러서 사용하면 됌
			Outer_Table.addRow(qTxt);
		}
		
		
		
		
	}
	
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\TJ\\Desktop\\tel.png"));
			lblNewLabel_1.setBounds(266, 275, 180, 153);
		}
		return lblNewLabel_1;
	}
}//-----------------------------------------


