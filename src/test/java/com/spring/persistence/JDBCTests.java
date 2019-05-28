package com.spring.persistence;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	/*    try-with-resources
	 예외 발생 여부와 상관없음
	 try(리소스자료형1 참조변수 = new 리소스 자료형();
				....)
	 가로 안의 값은 자동으로 닫혀지게된다.*/
	@Test
	public void testConnection() {
		try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "javauser", "java1234")){
				log.info(con);
				log.info("--------------------------");
				log.info("테이터베이스에 정상적으로 연결되었습니다.");
			}catch(Exception e) {
				e.printStackTrace();
	
			}
	}
}
