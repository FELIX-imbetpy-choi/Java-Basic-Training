package com.javalec.bbs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.javalec.bbs.dto.BDto;
import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

public class BDao {
	
	// Fields
	DataSource dataSource;

	// Constructor
	public BDao() {
		
		//DB 연결
		try {
			Context context = new InitialContext(); // Context : 숫자, 문자, 그림 등을 모두 받을 수 있는 것
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/bmvc"); // lookup : DB에 있는지 없는지 확인하러 가는 부분 
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// Method
	public ArrayList<BDto> list() {
		ArrayList<BDto> dtos = new ArrayList<BDto>(); // ArrayList<> 괄호에 원래 한가지 타입만 들어가는데 BDto에 작성해 놓은 걸 쓰면 여러 타입 넣을 수 있음
		
		// Xml에서 설정해놨기 때문에 값을 따로 안줘도됨
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection(); // connect 되는 부분
			String query = "select bId, bName, bTitle, bContent, bDate from mvc_board";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				// BDto의 getter, setter 부분 해놔서 가능 한 것
				int bId = resultSet.getInt("bId");
				String bName = resultSet.getString("bName");
				String bTitle = resultSet.getString("bTitle");
				String bContent= resultSet.getString("bContent");
				Timestamp bDate = resultSet.getTimestamp("bDate");
				
				BDto dto = new BDto(bId, bName, bTitle, bContent, bDate); // BDto 부분에 컨스트럭터 이용해서 담아주는거
				dtos.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) resultSet.close(); // 가져왔으면 닫아준다
				if (preparedStatement != null) resultSet.close();
				if (connection != null) resultSet.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return dtos;
	}
	
	
	// Write
	public void write(String bName, String bTitle, String bContent) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = dataSource.getConnection();
			String query = "insert into mvc_board(bName, bTitle, bContent, bDate) values (?,?,?,now())";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, bName);
			preparedStatement.setString(2, bTitle);
			preparedStatement.setString(3, bContent);
			preparedStatement.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (preparedStatement != null) preparedStatement.close();
				if (connection != null) connection.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	
	// contentView
	public BDto contentView(String strID) {
		BDto dto = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "select * from mvc_board where bId = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, Integer.parseInt(strID));
			resultSet = preparedStatement.executeQuery();
			
			// 여러 사용자가 보고 있을 때 누군가 삭제해버리면 
			if(resultSet.next()) {
				int bId = resultSet.getInt("bId");
				String bName = resultSet.getString("bName");
				String bTitle = resultSet.getString("bTitle");
				String bContent = resultSet.getString("bContent");
				Timestamp bDate = resultSet.getTimestamp("bDate");
				
				dto = new BDto(bId, bName, bTitle, bContent, bDate);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(resultSet != null) resultSet.close();
				if (preparedStatement != null) preparedStatement.close();
				if (connection != null) connection.close();
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return dto;
	}
	
	// delete
	public void delete(String strID) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "delete from mvc_board where bId = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, Integer.parseInt(strID));
			System.out.println(strID);
			preparedStatement.executeUpdate(); // delete, update, insert 에서는 executeUpdate를 사용하고 select는 executeQuery 를 사용해서 결과를 받아온다.
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (preparedStatement != null) preparedStatement.close();
				if (connection != null) connection.close();
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	//update
	public void update(String strID, String bTitle, String bContent, String bName) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "update mvc_board set  bName = ?, bTitle = ? , bContent = ? where bId = ?;";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, bName);
			preparedStatement.setString(2, bTitle);
			preparedStatement.setString(3, bContent);
			preparedStatement.setInt(4, Integer.parseInt(strID));
			preparedStatement.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (preparedStatement != null) preparedStatement.close();
				if (connection != null) connection.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
}
