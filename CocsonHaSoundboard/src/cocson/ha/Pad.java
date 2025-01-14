package cocson.ha;

public class Pad {
	private int number;
	private String sound;
	
	Pad(int n, String s){
		number = n;
		sound = s;
	} //aa
	
	public int getPad(){
		return number;
	}
	
	public void setSound(String s) {
		sound = s;
	}
	
	@Override
	public String toString() {
		return ("Pad " + number + "Plays " + sound);
	}

}
