package com.mp.soundsystem;

public class BlankDisc implements CompactDisc {
	private String title;
	private String artist;

	public BlankDisc(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}

	public void play() {
		System.out.println("Odtwarzam utw�r: " + title + " wykonawcy " + artist);
	}

}
