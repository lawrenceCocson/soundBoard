package cocson.ha;

public class Pad {
	private int number;
	private String sound;
	
	Pad(int n, String s){
		number = n;
		sound = s;
	}
	
	public int getPad(){
		return number;
	}
	
	@Override
	public String toString() {
		return ("Pad " + number);
	}

}
