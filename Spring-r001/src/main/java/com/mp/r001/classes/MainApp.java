package com.mp.r001.classes;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	private static ApplicationContext applicationContext;
	private static Logger logger = Logger.getLogger(MainApp.class);

	public static void main(String[] args) {
		applicationContext = new AnnotationConfigApplicationContext(BeansConfig.class);
		SampleKnight knight = (SampleKnight) applicationContext.getBean("sampleKnight");
		
		logger.info("Before madeSomeQuests() method ");
		knight.madeSomeQuests();

	}

}
