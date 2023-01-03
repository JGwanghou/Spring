package kr.co.ch03.sub2;

import org.springframework.stereotype.Component;

@Component
public class AOPService {
// joinpoint	
	public void insert() {
		System.out.println("ÇÙ½É°ü½É - insert...");
	}
	
	public void select() {
		System.out.println("ÇÙ½É°ü½É - select...");
	}
	
	public void update() {
		System.out.println("ÇÙ½É°ü½É - update...");
	}
	
	public void delete() {
		System.out.println("ÇÙ½É°ü½É - delete...");
	}
}
