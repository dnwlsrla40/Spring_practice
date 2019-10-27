package org.zerock.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.sample.Restaurant;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

/*
 * Main 메서드를 이용하여 테스트하는 방식 대신 테스트 코드를 작성하는 방법
 * SampleTests 클래스는 spring-test 모듈을 이용해서 간단하게 스프링을 가동시켜 테스트를 할 수 있다.
 * spring-test는 pom.xml에 dependency 설정을 해주었다.
 */

@RunWith(SpringJUnit4ClassRunner.class)	// Junit 4.10 이상의 버전을 사용해야함
//지정된 클래스나 문자열을 이용해서 필요한 객체들을 스프링 내에 빈으로 등록해주는 테스트 관련 어노테이션
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class SampleTests {
	@Setter(onMethod_ = @Autowired)
	private Restaurant restaurant;
	
	@Test
	public void testExist() {
		assertNotNull(restaurant);
		log.info(restaurant);
		log.info("-------------------------");
		log.info(restaurant.getChef());
	}
}
