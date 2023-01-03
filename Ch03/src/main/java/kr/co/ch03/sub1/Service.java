package kr.co.ch03.sub1;

import org.springframework.stereotype.Component;

@Component
public class Service {
// joinpoint	
	public void insert() {
		System.out.println("ÇÙ½É°ü½É - insert...");
	}
	
	public void select() {
		System.out.println("ÇÙ±è°ü½É - select...");
	}
	
	public void update() {
		System.out.println("ÇÙ½É°ü½É - update...");
	}
	
	public void delete() {
		System.out.println("ÇÙ½É°ü½É - delete...");
	}
}
