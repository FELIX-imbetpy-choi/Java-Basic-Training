package com.address.function;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class DbAction {
	
	private final String url_mysql = ShareVar.DBName;
	private final String id_mysql =ShareVar.DBUser;
	private final String pw_mysql =ShareVar.DBPass;
	
	int seq;
	String name;
	String telno;
	String address;
	String email;
	String relation;
	String searching;
	String column;
	int row;
	
	
	public DbAction() {

	}
	
	public DbAction(String name, String telno, String address, String email, String relation) {
		super();
		this.name = name;
		this.telno = telno;
		this.address = address;
		this.email = email;
		this.relation = relation;
	}

	public DbAction(int seq, String name, String telno, String address, String email, String relation) {
		super();
		this.seq = seq;
		this.name = name;
		this.telno = telno;
		this.address = address;
		this.email = email;
		this.relation = relation;
	}
	
	
	
	public DbAction(String searching, String column) {
		super();
		this.searching = searching;
		this.column = column;
	}

	public DbAction(int seq) {
		super();
		this.seq = seq;
	}

	// 1. 윈도우 시작시 Main의 SearchAction()에 정보 주기
	public ArrayList<Bean> selectList(){
		// arrayList를 차곡차곡 쌓을 때 필요한 것이 bean에 들어잇음
		ArrayList<Bean> BeanList =new ArrayList<Bean>();
		//BaenList 는 타입이 Bean 인 Array List 임
		
		//Search Action 함수와 동일  
		String WhereDefault ="select seqno, name, telno,relation  from info ";
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			 
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			                               
			Statement  stmt_mysql = conn_mysql.createStatement();
									
			
			ResultSet rs =stmt_mysql.executeQuery(WhereDefault);
			//array list 랑 비슷 하나씩 쌓임
			
			while(rs.next()) {
				int wkSeq = rs.getInt(1);
				String wkName = rs.getString(2);
				String wkTelno = rs.getString(3);
				String wkRelaion = rs.getString(4);
				
				Bean bean = new Bean(wkSeq, wkName, wkTelno, wkRelaion);
				BeanList.add(bean); // while 문이 돌아갈 떄마다 하나씩 생성해서 넣어줌 !
				//wkSeq, wkName, wkTelno, wkRelaion 를 하나로 묶은 콩을  arrayList 를 만들어 주는 것! 
				
			}			
			conn_mysql.close();
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return BeanList;
		
	}
	
	//3. 삽입메소드
	public boolean InsertAction() {
		PreparedStatement ps = null; 
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			// add external jar 로 추가했던 커넥션 파일 안에 패키지 사용 
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);//java.sql 사용 
			//데이터 베이스랑 연결 !!                                //로컬 호스트 자리  아이디 자리    패스워드 자리 
			Statement  stmt_mysql = conn_mysql.createStatement();// java.sql
									//이걸통해 연결 함
			String A = "insert into info(name ,telno, address, email, relation";
			String B = ") values (?,?,?,?,?)"; //values값은 아직 모르기 때문에 ? 로 insert 한 만큼 ? 써줘야함
			
			
					
				ps =conn_mysql.prepareStatement(A+B);
				ps.setString(1, name.trim());
				ps.setString(2, telno.trim());
				ps.setString(3, address.trim());
				ps.setString(4, email.trim());
				ps.setString(5, relation.trim());
				ps.executeUpdate(); //upadte 할떄 데이터가 넘어감
				
				conn_mysql.close(); // 데이터베이스 연결 해제 
				
			return true;
			
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	// 3.수정메소드
		public boolean UpdateAction() {
			
			PreparedStatement ps = null; //java.sql껄로  값을 가져올때 사용
			//db랑 연결 하는 것 이기 때문에 try catch  꼭해야함
			try {
				Class.forName("com.mysql.jdbc.Driver"); 
				// add external jar 로 추가했던 커넥션 파일 안에 패키지 사용 
				Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);//java.sql 사용 
				//데이터 베이스랑 연결 !!                                //로컬 호스트 자리  아이디 자리    패스워드 자리 
				Statement  stmt_mysql = conn_mysql.createStatement();// java.sql
										//이걸통해 연결 함
				
				String A = "update info set telno =?,address =?,email=?,relation =?,name =? ";
				String B = "where seqno =?"; //values값은 아직 모르기 때문에 ? 로 insert 한 만큼 ? 써줘야함
				
					
					ps =conn_mysql.prepareStatement(A+B);
					ps.setString(1, telno);
					// 1번은 첫번째 물음표  tfUserid 의 값을 가져와 trim(띄어쓰기 다 지우고 )해서 가져옴
					ps.setString(2, address);
					// 1번은 첫번째 물음표  tfPassword 의 값을 가져와 trim(띄어쓰기 다 지우고 )해서 가져옴 
					//?의 순서는 insert 한 순서대로
					ps.setString(3, email);
					ps.setString(4, relation);
					ps.setString(5, name);
					ps.setInt(6, seq);
					//string 일땐 setstring , int 일땐 setint
					
					
					ps.executeUpdate(); //upadte 할떄 데이터가 넘어감
					conn_mysql.close(); // 데이터베이스 연결 해제 
						
				return true;
			}catch(Exception e){
				
				e.printStackTrace();
				return false;
			}
			
			
		}
		
		//3. 삭제메소드
		public boolean DeleteAction(){
			PreparedStatement ps = null; //java.sql껄로  값을 가져올때 사용
			//db랑 연결 하는 것 이기 때문에 try catch  꼭해야함
			//자바의 문제가 아니더라고 db연결이 끊기면 오류가 생길 수 있기 때문에 그걸 확인 할 수 있도록 하기 위해
			try {
				Class.forName("com.mysql.jdbc.Driver"); 
				// add external jar 로 추가했던 커넥션 파일 안에 패키지 사용 
				Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);//java.sql 사용 
				//데이터 베이스랑 연결 !!                                //로컬 호스트 자리  아이디 자리    패스워드 자리 
				Statement  stmt_mysql = conn_mysql.createStatement();// java.sql
										//이걸통해 연결 함
				
				String A = "delete from info ";
				String B = "where seqno =?"; //values값은 아직 모르기 때문에 ? 로 insert 한 만큼 ? 써줘야함
				
				

					
					ps =conn_mysql.prepareStatement(A+B);
				
					ps.setInt(1, seq);
					
					
					ps.executeUpdate(); //upadte 할떄 데이터가 넘어감
					conn_mysql.close(); // 데이터베이스 연결 해제 
					
			return true;
			
				
			}catch(Exception e){
				e.printStackTrace();
				return false;
			}
		}
		
	
	//4. 클릭 할 때 검색하는 함수
	public Bean ActionClick () {
		Bean bean =null;
		String WhereDefault ="select seqno,name,telno,address,email,relation from info ";
		String WhereString  ="where seqno = "+seq;
		int count =0;
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			// add external jar 로 추가했던 커넥션 파일 안에 패키지 사용 
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);//java.sql 사용 
			//데이터 베이스랑 연결 !!                                //로컬 호스트 자리  아이디 자리    패스워드 자리 
			Statement  stmt_mysql = conn_mysql.createStatement();// java.sql
									//이걸통해 연결 함
			ResultSet rs =stmt_mysql.executeQuery(WhereDefault+WhereString);
			//array list 랑 비슷 하나씩 쌓임
			
			while(rs.next()) {
				int wkseq =rs.getInt(1);
				String wkname=rs.getString(2);
				String wktelno=rs.getString(3);
				String wkaddress=rs.getString(4);
				String wkemail=rs.getString(5);
				String wkrelation=rs.getString(6);
				bean = new Bean(wkseq, wkname, wktelno, wkaddress, wkemail, wkrelation);
					
			}
					
			conn_mysql.close();
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return bean;
	}
	
	


	// 2. 조건값을 받아서 검색하는 메소드
	public ArrayList<Bean> ConditionQueryAction(){
		ArrayList<Bean> BeanList =new ArrayList<Bean>();
		String WhereDefault ="select seqno, name,telno,relation from info where " + column;
		String WhereDefault2 =" like '%"+searching.trim()+"%'";
		int count =0;
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			// add external jar 로 추가했던 커넥션 파일 안에 패키지 사용 
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);//java.sql 사용 
			//데이터 베이스랑 연결 !!                                //로컬 호스트 자리  아이디 자리    패스워드 자리 
			Statement  stmt_mysql = conn_mysql.createStatement();// java.sql
									//이걸통해 연결 함
			
			ResultSet rs =stmt_mysql.executeQuery(WhereDefault+WhereDefault2);
			//array list 랑 비슷 하나씩 쌓임
			
			while(rs.next()) {
				int wkSeq = rs.getInt(1);
				String wkName = rs.getString(2);
				String wkTelno = rs.getString(3);
				String wkRelaion = rs.getString(4);
				
				Bean bean = new Bean(wkSeq, wkName, wkTelno, wkRelaion);
				BeanList.add(bean); // while 문이 돌아갈 떄마다 하나씩 생성해서 넣어줌 
				count++;
			}
			
			conn_mysql.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return BeanList;
	}


	

}
