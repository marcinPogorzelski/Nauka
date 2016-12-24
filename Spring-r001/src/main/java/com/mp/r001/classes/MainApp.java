package com.mp.r001.classes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	private static ApplicationContext applicationContext;

	public static void main(String[] args) {
		applicationContext = new AnnotationConfigApplicationContext(BeansConfig.class);
		SampleKnight knight = (SampleKnight) applicationContext.getBean("sampleKnight");

		knight.madeSomeQuests();

	}

}
