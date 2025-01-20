package cocson.ha;

import java.time.Duration;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Pad {
	private int number;
	private String sound;
	private Media soundFile;
	private MediaPlayer soundPlayer;
	
	Pad(int n, String s){
		number = n;
		sound = s;
		soundFile = new Media (s);
		soundPlayer = new MediaPlayer(soundFile);
	}
	
	public int getPad(){
		return number;
	}
	
	public void setSound(String s) {
		sound = s;
		soundFile = new Media(s);
		soundPlayer = new MediaPlayer(soundFile);
	}
	
	public void playSound() {
		soundPlayer.play();
	}
	
	public void getSound() {
		System.out.println(sound);
	}
	
	public void resetSound() {
		soundPlayer.seek(javafx.util.Duration.ZERO);
	}
	
	@Override
	public String toString() {
		return ("Pad " + number + "Plays " + sound);
	}

}
