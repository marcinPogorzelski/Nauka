package com.mp.r001.classes;

import java.io.PrintStream;

import com.mp.r001.interfaces.IMinstrell;

public class Minstrell implements IMinstrell {
	PrintStream printStream;
/*
	public Minstrell(PrintStream printStream) {
		this.printStream = printStream;
	}*/

	public void singBeforeQuest() {
		System.out.println("Piosenka przed wypraw¹");
	}

	public void singAfterQuest() {
		System.out.println("Piosenka po wyprawie");
	}

}
