package com.mp.r001.classes;

import com.mp.r001.interfaces.IKnight;
import com.mp.r001.interfaces.IQuest;

public class SampleKnight implements IKnight {
	IQuest quest;
	
	public SampleKnight(IQuest quest) {
		this.quest = quest;
	}

	public void madeSomeQuests() {
		quest.embarkQuest();
	}

}
