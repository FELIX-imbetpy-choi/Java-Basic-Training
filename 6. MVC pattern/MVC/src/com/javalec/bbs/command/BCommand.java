package com.javalec.bbs.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface BCommand {
	
	// new - interface 로 만들었고, 메소드는 못 만들지만 명령은 내릴 수 있음
	public void execute(HttpServletRequest request, HttpServletResponse response);
}
