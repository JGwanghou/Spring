package kr.co.ch03.sub1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * ��¥ : 2023/01/03
 * �̸� : ����ȣ
 * ���� : ������ AOP �ǽ��ϱ�
 *  
 * ������ AOP(Aspect Oriented Programming)
 *  - AOP�� �������� ���α׷���, OOP�� ���������� �и��ϱ� ����� �ΰ������� ���ȭ�ϴ� ���
 *  - �ٽɰ��ɰ� ��ü�� ����Ǵ� ��������� �и��ؼ� ���α׷����ϴ� ���
 *  
 * �ֿ���
 *  1) ��������Ʈ(joinPoint)
 *   - �����ϴ� ��� �ٽɰ��� �޼���
 *  
 *  2) ����Ʈ��(PointCut)
 *   - ��������Ʈ ��� ����(AOP�� ����)�Ǵ� �ٽɰ��� �޼���
 *  
 *  3) �����̽�(Advice)
 *   - Ⱦ�ܰ��ɿ� �ش��ϴ� ������ �ΰ���� �޼���
 *   
 *  4) ������Ʈ(Aspect)
 *   - ����Ʈ�ư� �����̽��� ���յ� �������
 *   
 *  5) ����(Weaving)
 *   - ����Ʈ��(�ٽɰ���)�� ����� �� �����̽��� ����Ʈ�ƿ� ���յǴ� ����
 */
public class AOPMain {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("application.xml");
		
		Service service = (Service) ctx.getBean("service");
		
		System.out.println("---------------------------");
		service.insert();
		
		System.out.println("---------------------------");
		service.select();
		
		System.out.println("---------------------------");
		service.update();
		
		System.out.println("---------------------------");
		service.delete();
	}
}
