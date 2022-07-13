package dbconnection.person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dbconnection.common.JDBCUtil;

public class PersonDAO {
	// JDBC 관련 변수
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	// 자료 삽입
	public void insertPerson(Person person) {
		try {
			conn = JDBCUtil.getConnection();	// DB 연결 메서드 호출
			// SQL - DML 언어, 동적 쿼리 - ?기호에 순서대로 대응
			String sql = "INSERT INTO person (userId, userPw, name, age) VALUES (?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);	// 예외 처리
			pstmt.setString(1, person.getUserId());
			pstmt.setString(2, person.getUserPw());
			pstmt.setString(3, person.getName());
			pstmt.setInt(4, person.getAge());
			
			pstmt.executeUpdate();		// db에 저장
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(conn, pstmt);	// 연결 종료 메서드 호출
		}
	}
	
	// 자료 목록 조회
	public ArrayList<Person> getPersonList(){
		ArrayList<Person> personList = new ArrayList<>();
		try {
			conn = JDBCUtil.getConnection();
			String sql = "SELECT * FROM person";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();		// 쿼리 실행
			while(rs.next()) {
				Person person = new Person();
				person.setUserId(rs.getString("userId"));
				person.setUserPw(rs.getString("userPw"));
				person.setName(rs.getString("name"));
				person.setAge(rs.getInt("age"));
				
				personList.add(person);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		return personList;
	}
	
	// 자료 수정
	public void updatePerson(Person person) {
		try {
			conn = JDBCUtil.getConnection();
			String sql = "UPDATE person SET userPw = ?, name = ?, age = ? WHERE userId = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, person.getUserPw());
			pstmt.setString(2, person.getName());
			pstmt.setInt(3, person.getAge());
			pstmt.setString(4, person.getUserId());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(conn, pstmt);
		}
	}
	
	// 자료 삭제
	public void deletePerson(Person person) {
		try {
			conn = JDBCUtil.getConnection();
			String sql = "DELETE FROM person WHERE userId = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, person.getUserId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(conn, pstmt);
		}
	}
	
	// 특정 자료 검색
	public Person getPerson(String userId) {
		Person person = new Person();
		try {
			conn = JDBCUtil.getConnection();
			String sql = "SELECT * FROM person WHERE userId = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			rs = pstmt.executeQuery();
			if(rs.next()) {		// 자료가 있다면
				person.setUserId(rs.getString("userId"));
				person.setUserPw(rs.getString("userPw"));
				person.setName(rs.getString("name"));
				person.setAge(rs.getInt("age"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		return person;
	}
}
