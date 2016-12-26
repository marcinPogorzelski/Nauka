package com.mp.soundsystem;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		CompactDisc cd = (CompactDisc)ctx.getBean("compactDisc");
		cd.play();
		ctx.close();
	}

}
