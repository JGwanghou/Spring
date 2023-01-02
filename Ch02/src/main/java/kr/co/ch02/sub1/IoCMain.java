package kr.co.ch02.sub1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 *  날짜 : 2023/01/02
 *  이름 : 조광호
 *  내용 : 스프링 IoC 실습하기
 * */
public class IoCMain {

	public static void main(String[] args) {
		// IoC를 활용하지 않은 객체 생성
		LgTV tv1 = new LgTV();
		SamsungTV tv2 = new SamsungTV();
		
		//tv1.powerOn();
		//tv1.powerOff();
		
		//tv2.powerOn();
		//tv2.powerOff();
		
		// 스프링 컨테이너로부터 객체를 주입받는다
		ApplicationContext ctx = new GenericXmlApplicationContext("application.xml");
		
		LgTV		 ltv = ctx.getBean("ltv", LgTV.class);
		SamsungTV	 stv = ctx.getBean("stv", SamsungTV.class);
		
		ltv.powerOn();
		ltv.soundUp();

		stv.powerOff();
		stv.soundDown();
		
	}
}
