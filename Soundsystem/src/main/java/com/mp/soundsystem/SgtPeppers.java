package com.mp.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {
	private String title = "Sgt Peppers";
	private String artist = "The Beatles";

	public void play() {
		System.out.println("Odtwarzam utw�r: " + title + " artysty: " + artist);
	}

}
