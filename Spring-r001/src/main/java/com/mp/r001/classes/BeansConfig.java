package com.mp.r001.classes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mp.r001.interfaces.IKnight;
import com.mp.r001.interfaces.IQuest;

@Configuration
public class BeansConfig {

	@Bean
	public IKnight sampleKnight(){
		return new SampleKnight(sampleQuest());
	}
	
	@Bean
	public IQuest sampleQuest(){
		return new SampleQuest();
	}
}
