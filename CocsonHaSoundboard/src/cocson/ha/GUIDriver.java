package cocson.ha;

import java.util.ArrayList;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.media.Media;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class GUIDriver extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		ArrayList<SoundPack> soundPacks = new ArrayList<>();
		
		VBox vbox = new VBox(10);
		
		Label soundboardname = new Label("SoundBoard");
		Label sound = new Label("Sound");
		sound.setAlignment(Pos.CENTER);
		soundboardname.setAlignment(Pos.CENTER);
		
		

		GridPane grid = new GridPane();
		grid.setHgap(10);
		grid.setVgap(10);
		vbox.setAlignment(Pos.BOTTOM_LEFT);
		// Button names for each number

		String[] buttonNames = { "1", "2", "3", "4", "Q", "W", "E", "R", "A", "S", "D", "F", "Z", "X", "C", "V"};

		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 4; col++) {
				Button button = new Button(buttonNames[row * 4 + col]);

				button.setOnAction(e -> {

					System.out.println(button.getText());

					

				});
				grid.add(button,col, row);
			}

		}
		
		
		vbox.getChildren().addAll(soundboardname, sound, grid);

		Scene scene = new Scene(vbox,  400, 400);

		
		stage.setScene(scene);

		stage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}
