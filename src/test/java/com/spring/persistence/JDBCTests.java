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
	 ���� �߻� ���ο� �������
	 try(���ҽ��ڷ���1 �������� = new ���ҽ� �ڷ���();
				....)
	 ���� ���� ���� �ڵ����� �������Եȴ�.*/
	@Test
	public void testConnection() {
		try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "javauser", "java1234")){
				log.info(con);
				log.info("--------------------------");
				log.info("�����ͺ��̽��� ���������� ����Ǿ����ϴ�.");
			}catch(Exception e) {
				e.printStackTrace();
	
			}
	}
}
