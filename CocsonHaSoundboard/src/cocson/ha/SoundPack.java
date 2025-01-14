package cocson.ha;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
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
	
	public File[] getSounds() {
		return soundFolder;
	}
	
	public String getSoundPack() {
		return name;
	}
	
	
	
}
