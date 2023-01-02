package kr.co.ch02.sub1;

import org.springframework.beans.factory.annotation.Autowired;

public class LgTV {

	@Autowired
	private Speaker spk;
	
	public void powerOn() {
		System.out.println("LGTV powerOn...");
	}
	
	public void powerOff() {
		System.out.println("LGTV powerOff...");
	}
	
	public void soundUp() {
		//System.out.println("LGTV soundUp...");
		spk.soundUp();
	}
	
	public void soundDown() {
		//System.out.println("LGTV soundDown...");
		spk.soundDown();
	}
}
