package com.spring.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	
	@Select("select sysdate from dual")
	public String getTime();
	
	public String getTime2();
	
	@Select("select sd_name from student where sd_id=#{sd_id}")
	public String getName(String sd_id);
	
	public String getSubjectName(String s_num);
}
