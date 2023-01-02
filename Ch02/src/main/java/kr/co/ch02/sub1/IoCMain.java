package kr.co.ch02.sub1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 *  ��¥ : 2023/01/02
 *  �̸� : ����ȣ
 *  ���� : ������ IoC �ǽ��ϱ�
 * */
public class IoCMain {

	public static void main(String[] args) {
		// IoC�� Ȱ������ ���� ��ü ����
		LgTV tv1 = new LgTV();
		SamsungTV tv2 = new SamsungTV();
		
		//tv1.powerOn();
		//tv1.powerOff();
		
		//tv2.powerOn();
		//tv2.powerOff();
		
		// ������ �����̳ʷκ��� ��ü�� ���Թ޴´�
		ApplicationContext ctx = new GenericXmlApplicationContext("application.xml");
		
		LgTV		 ltv = ctx.getBean("ltv", LgTV.class);
		SamsungTV	 stv = ctx.getBean("stv", SamsungTV.class);
		
		ltv.powerOn();
		ltv.soundUp();

		stv.powerOff();
		stv.soundDown();
		
	}
}
