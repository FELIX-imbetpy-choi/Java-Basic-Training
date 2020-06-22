package com.javalec.bbs.dto;

import java.sql.Timestamp;

public class BDto {

	// Fields 정리
	int bId;
	String bName;
	String bTitle;
	String bContent;
	Timestamp bDate;
	
	// Constructor 하나는 빈 생성자, 하나는 필드값이 들어오는 생성자
	public BDto() {
	
	}

	public BDto(int bId, String bName, String bTitle, String bContent, Timestamp bDate) {
		super();
		this.bId = bId;
		this.bName = bName;
		this.bTitle = bTitle;
		this.bContent = bContent;
		this.bDate = bDate;
	}

	
	// Setters & Getters
	public int getbId() {
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
