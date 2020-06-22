package com.address.function;

public class Bean {
	int seqno;
	String name;
	String telno;
	String address;
	String email;
	String relation;

	
	//생성자와 getter setter 만들면 됌   getter setter는 모든 변수 다
	public Bean(int seqno, String name, String telno, String relation) {  //table에 표시해줄 4개의 변수를 포함한 constructor 만듬
		super();
		this.seqno = seqno;
		this.name = name;
		this.telno = telno;
		this.relation = relation;
	}

	public Bean(int seqno, String name, String telno, String address, String email, String relation) {
		super();
		this.seqno = seqno;
		this.name = name;
		this.telno = telno;
		this.address = address;
		this.email = email;
		this.relation = relation;
	}

	//------------------------------------------------getter setter-------------------------------------------------------
	public int getSeqno() {
		return seqno;
	}

	public void setSeqno(int seqno) {
		this.seqno = seqno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelno() {
		return telno;
	}

	public void setTelno(String telno) {
		this.telno = telno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}
	
	// 이 클래스의 메소드를 불러오기 위한. 빈메소드
	public Bean() {
	}
	
}
