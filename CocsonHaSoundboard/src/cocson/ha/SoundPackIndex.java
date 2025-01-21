package cocson.ha;

import java.io.File;

public class SoundPackIndex {
	private int index;
	private File[] inSoundFolder;
	
	SoundPackIndex(File[] inFile){
		index = 0;
		inSoundFolder = inFile;
	}
	
	public int getIndex() {
		return index;
	}
	
	public void left(){
		index -= 1;
		if (index < 0) {
			index = (int) inSoundFolder.length-1;
		}
		
	}

}
