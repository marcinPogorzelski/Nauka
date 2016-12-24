package com.mp.r001.classes;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mp.r001.interfaces.IKnight;

public class MainApp {

	private static ClassPathXmlApplicationContext applicationContext;
	private static Logger logger = Logger.getLogger(MainApp.class);

	public static void main(String[] args) {
		applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		IKnight knight = (IKnight) applicationContext.getBean("sampleKnight");
		
		logger.info("Before madeSomeQuests() method ");
		knight.madeSomeQuests();

	}

}
