package kr.co.ch03.sub2;

import org.springframework.stereotype.Component;

@Component
public class AOPService {
// joinpoint	
	public void insert() {
		System.out.println("�ٽɰ��� - insert...");
	}
	
	public void select() {
		System.out.println("�ٽɰ��� - select...");
	}
	
	public void update() {
		System.out.println("�ٽɰ��� - update...");
	}
	
	public void delete() {
		System.out.println("�ٽɰ��� - delete...");
	}
}
