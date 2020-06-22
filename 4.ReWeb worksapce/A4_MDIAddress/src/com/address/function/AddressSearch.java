package com.address.function;

import java.awt.EventQueue;
import java.awt.ScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import javax.swing.table.TableColumn;
import javax.swing.JTextField;

public class AddressSearch extends JInternalFrame {
	private JScrollPane Outer_Table;
	private JTable Inner_Table;
	private JTextField tfname;
	private JTextField tftelnum;
	private JTextField tfaddress;
	private JTextField tfemail;
	private JTextField tfrelation;
	private JTextField tfseq;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddressSearch frame = new AddressSearch();
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
	public AddressSearch() {
		setClosable(true);
		addInternalFrameListener(new InternalFrameAdapter() {
			@Override
			public void internalFrameActivated(InternalFrameEvent arg0) {
				//검색창 뜰 때 실행
				SearchAction();
			}
		});
		setTitle("주소록 검색");
		setBounds(100, 100, 540, 684);
		getContentPane().setLayout(null);
		getContentPane().add(getOuter_Table());
		getContentPane().add(getTfname());
		getContentPane().add(getTftelnum());
		getContentPane().add(getTfaddress());
		getContentPane().add(getTfemail());
		getContentPane().add(getTfrelation());
		getContentPane().add(getTfseq());

		
	}
	
	private JScrollPane getOuter_Table() {
		if (Outer_Table == null) {
			Outer_Table = new JScrollPane();
			Outer_Table.setBounds(17, 26, 490, 219);
			Outer_Table.setViewportView(getInner_Table());
			Outer_Table.setViewportView(getTable());
		}
		return Outer_Table;
	}
	private JTable getInner_Table() {
		if (Inner_Table == null) {
			Inner_Table = new JTable();
			Inner_Table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		}
		Inner_Table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//4. 테이블 클릭시 정보 보여주는 메소드
				ActionClick(); 
			}
		});
		//
		Inner_Table.setModel(Outer_Table);
		return Inner_Table;
	
	
	private void SearchAction() {
		//다른 클래스를 만들것임! -- selectList메소드를 를 DbAction class에  만들어 놨음
		DbAction dbAction =new DbAction();
		ArrayList<Bean> beanList =dbAction.selectList();  //ArrayList,Bean 둘다 import
		
		int listCount = beanList.size(); //return 받은 beanlist의 싸이즈를 알려줌 
		String count = Integer.toString(listCount);
		for(int i = 0 ; i< listCount; i++) {
			String temp =Integer.toString(beanList.get(i).getSeqno());// getter setter 함수를 임포트 했기 때문에 가능
			//seqno 숫자이기 때문에 string에 넣어줌
			String[] qTxt = {temp, beanList.get(i).getName(),beanList.get(i).getTelno(),beanList.get(i).getRelation()};
			//나머지는 String이기때문에  그냥 불러서 사용하면 됌
			Outer_Table.addRow(qTxt);
		}
	
	}
	
	private void ActionClick(){
		int i = Inner_Table.getSelectedRow(); //클릭한 테이블이 몇번째 수인지 i에 저장한다.
		String tkSeq =(String)Inner_Table.getValueAt(i, 0); //i의 첫번째 열의 값을 가져온다. - 문자이므로 스트링
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
		Inner_Table.setAutoResizeMode(Inner_Table.AUTO_RESIZE_OFF);
		
		//data field 정의 
		int vColIndex =0; //첫번째 인덱스 설정
		TableColumn col =Inner_Table.getColumnModel().getColumn(vColIndex);
		int width =50;
		col.setPreferredWidth(width);// 제일 처음 컬럼 크기 50으로 정해줌
		vColIndex =1; //두번째 인덱스 설정
		col =Inner_Table.getColumnModel().getColumn(vColIndex);
		width = 80;
		col.setPreferredWidth(width);
		vColIndex =2; //두번째 인덱스 설정
		col =Inner_Table.getColumnModel().getColumn(vColIndex);
		width = 110;
		col.setPreferredWidth(width);
		vColIndex =3; //두번째 인덱스 설정
		col =Inner_Table.getColumnModel().getColumn(vColIndex);
		width = 100;
		col.setPreferredWidth(width);	
		
	}
	
	
	//-----------------------------------------------------

	private JTextField getTfname() {
		if (tfname == null) {
			tfname = new JTextField();
			tfname.setBounds(115, 336, 276, 27);
			tfname.setColumns(10);
		}
		return tfname;
	}
	private JTextField getTftelnum() {
		if (tftelnum == null) {
			tftelnum = new JTextField();
			tftelnum.setColumns(10);
			tftelnum.setBounds(115, 395, 276, 27);
		}
		return tftelnum;
	}
	private JTextField getTfaddress() {
		if (tfaddress == null) {
			tfaddress = new JTextField();
			tfaddress.setColumns(10);
			tfaddress.setBounds(115, 449, 276, 27);
		}
		return tfaddress;
	}
	private JTextField getTfemail() {
		if (tfemail == null) {
			tfemail = new JTextField();
			tfemail.setColumns(10);
			tfemail.setBounds(115, 509, 276, 27);
		}
		return tfemail;
	}
	private JTextField getTfrelation() {
		if (tfrelation == null) {
			tfrelation = new JTextField();
			tfrelation.setColumns(10);
			tfrelation.setBounds(115, 555, 276, 27);
		}
		return tfrelation;
	}
	private JTextField getTfseq() {
		if (tfseq == null) {
			tfseq = new JTextField();
			tfseq.setColumns(10);
			tfseq.setBounds(115, 278, 276, 27);
		}
		return tfseq;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
		}
		return table;
	}
}
