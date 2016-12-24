package com.mp.r001.classes;

import com.mp.r001.interfaces.IMinstrell;

public class Minstrell implements IMinstrell {

	@Override
	public void singBeforeQuest() {
		System.out.println("Piosenka przed wypraw¹");
	}

	@Override
	public void singAfterQuest() {
		System.out.println("Piosenka po wyprawie");
	}

}
