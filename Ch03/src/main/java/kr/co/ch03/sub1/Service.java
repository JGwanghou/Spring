package kr.co.ch03.sub1;

import org.springframework.stereotype.Component;

@Component
public class Service {
// joinpoint	
	public void insert() {
		System.out.println("�ٽɰ��� - insert...");
	}
	
	public void select() {
		System.out.println("�ٱ���� - select...");
	}
	
	public void update() {
		System.out.println("�ٽɰ��� - update...");
	}
	
	public void delete() {
		System.out.println("�ٽɰ��� - delete...");
	}
}
