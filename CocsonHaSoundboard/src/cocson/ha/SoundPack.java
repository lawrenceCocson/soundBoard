package cocson.ha;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.util.Scanner;
import java.io.File;

public class SoundPack {
	private String soundPack;
	private MediaPlayer[] sounds;
	private File inFile;
	
	SoundPack(String sP){
		soundPack = sP;
		
		inFile = new File(sP);
		
		
	}
	
	
	
}
