package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

/*
 * Mybatis에서는 직접 Connection을 얻어서 JDBC 코딩이 가능하지만,
 * 좀 더 편하게  SQL을 어떻게 처리할 것인지 별도의 설정을 분리해 주고, 자동으로 처리되는 방식을 이용할 수 있다.
 * 이를 위해 Mapper라는 존재를 작성해 주어야 한다.
 * 
 * XML을 이용해서 Mapper를 작성할 수도 있지만, 여기서는 Mapper 인터페이스를 사용해본다.
 */
public interface TimeMapper {

	@Select("SELECT sysdate FROM dual")
	public String getTime();
	
	public String getTime2();
}
