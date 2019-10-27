package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Data	// setter, getter, 생성자, toString 등을 자동으로 생성하도록 하는 Lombok의 어노테이션
@Component	// 스프링에게 해당 클래스가 스프링에서 관리해야 하는 대상임을 표시 즉, ApplicationContext가 관리하는 객체(빈)이라는 것을 알림
public class Restaurant {
	/*
	 * @Setter는 컴파일 시 setChef()를 자동으로 생성한다.
	 * onMethod_ 속성은 생성되는 setChef()에 @Autowired 어노테이션을 추가한다.
	 */
	@Setter(onMethod_ = @Autowired)
	private Chef chef;
}
