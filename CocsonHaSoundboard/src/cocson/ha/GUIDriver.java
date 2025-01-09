package cocson.ha;

import java.util.ArrayList;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.media.Media;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;


public class GUIDriver extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		ArrayList<SoundPack> soundPacks = new ArrayList<>();
		
		GridPane grid = new GridPane();
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setAlignment(Pos.CENTER);
		
		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 4; col++) {
				Button button = new Button("Button " + (row * 4 + col + 1));
				
				grid.add(button, col, row);
			}
		}
		
		Scene scene = new Scene(grid, 400, 400);
		
		stage.setTitle("4x4 Grid of buttons");
		stage.setScene(scene);
		
		
		
		stage.show();

	}

	public static void main(String[] args) {
		launch(args);


	}

}
