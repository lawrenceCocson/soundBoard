package cocson.ha;

import java.util.ArrayList;
import javafx.scene.media.Media;

import javafx.application.Application;
import javafx.stage.Stage;

public class GUIDriver extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		ArrayList<SoundPack> soundPacks = new ArrayList<>();
		Media media = new Media("a");
		
		
		stage.show();

	}

	public static void main(String[] args) {
		launch(args);


	}

}
