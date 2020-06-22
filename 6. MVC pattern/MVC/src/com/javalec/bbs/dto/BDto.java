package com.javalec.bbs.dto;

import java.sql.Timestamp;

public class BDto {
	
	// Fields
	int bId;
	String bName;
	String bTitle;
	String bContent;
	Timestamp bDate; // DB의 시간과 맞추려구

	// Constructor (여기선 2개 만듦)
	// 빈생성자
	public BDto() {
	
	}

	// 필드값이 들어오는 생성자 (소스-컨스트럭트 유징필드로 만듦 : 위에꺼 또 타이핑하기 싫어서..), 생성자 이름이 같음 오버라이딩
	// 다른 클래스? 같은 곳에서 값을 받아서 여기에 보관
	public BDto(int bId, String bName, String bTitle, String bContent, Timestamp bDate) {
		super();
		this.bId = bId;
		this.bName = bName;
		this.bTitle = bTitle;
		this.bContent = bContent;
		this.bDate = bDate;
	}

	// Setters & Getters
	public int getbId() { // 다른곳에서 getid 같이 이용해서 값을 가져감
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getbTitle() {
		return bTitle;
	}

	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}

	public String getbContent() {
		return bContent;
	}

	public void setbContent(String bContent) {
		this.bContent = bContent;
	}

	public Timestamp getbDate() {
		return bDate;
	}

	public void setbDate(Timestamp bDate) {
		this.bDate = bDate;
	}
	
	
}
