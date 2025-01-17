package cocson.ha;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;

public class SoundPack {
	private String name;
	private File inFile;
	private File[] soundFolder;
	private String location;
	
	SoundPack(String n){
		name = n;
		location = ("soundPacks\\" + name);
		inFile = new File(location);
		soundFolder = inFile.listFiles();
	}
	
	public void showSounds() {
		for (File file : soundFolder) {
			System.out.println(file);
		}
	}
	
	public String[] getSounds() {
		String[] soundUris = new String[16];
		for (File file : soundFolder) {
			for (int i = 0; i < 15; i++) {
				soundUris[i] = file.toURI().toString();
			}
		}
		return soundUris;
	}
		
	public String getSoundPack() {
		return name;
	}
	
	public void sortSounds() {
		File[] tempSorted = new File[16];
		
		for (int i = 0; i < soundFolder.length; i++) {
			String a = soundFolder[i].toString();
			int start = a.lastIndexOf("\\");
			int end = a.lastIndexOf("_");
			String sNum = a.substring(start+1, end);
			
			tempSorted[Integer.parseInt(sNum)-1] = soundFolder[i];
			
			soundFolder[i] = tempSorted[i];	
		}
		
		
	}
	
	
	
}
