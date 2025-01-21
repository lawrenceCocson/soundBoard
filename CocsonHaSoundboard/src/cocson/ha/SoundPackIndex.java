package cocson.ha;

import java.io.File;

public class SoundPackIndex {
	private int index;
	private SoundPack[] soundPacks;
	
	SoundPackIndex(SoundPack[] sp){
		index = 0;
		soundPacks = sp;
	}
	
	public int getIndex() {
		return index;
	}
	
	public SoundPack soundPack() {		
		return soundPacks[index];
	}
	
	public void left(){
		index -= 1;
		if (index < 0) {
			index = (int) soundPacks.length-1;
		}
	}
	
	public void right(){
		index += 1;
		if (index > soundPacks.length-1) {
			index = 0;
		}
	}

}
