package kr.co.ch02.sub2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "com")
public class Computer {

	private CPU cpu;
	
	// DI - ������ ������ ���
	@Autowired
	public Computer(CPU cpu) {
		this.cpu = cpu;
	}
	
	private RAM ram;
	
	// DI - ���� ������ ���
	@Autowired
	public void setRam(RAM ram) {
		this.ram = ram;
	}
	
	// DI - �ʵ� ������
	@Autowired
	private HDD hdd;
	
	
	
	public void show() {
		
		cpu.show();
		ram.show();
		hdd.show();
		
	}
}
