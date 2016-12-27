package com.mp.soundsystem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("sgtPeppers")
public class SgtPeppers implements CompactDisc {
	private String title = "Sgt Peppers";
	private String artist = "The Beatles";

	public void play() {
		System.out.println("Odtwarzam utwór: " + title + " artysty: " + artist);
	}

}
