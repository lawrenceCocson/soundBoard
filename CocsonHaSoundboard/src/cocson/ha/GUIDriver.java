package cocson.ha;

import java.util.ArrayList;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import java.util.Scanner;
import java.io.File;
import java.nio.file.Paths;

public class GUIDriver extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		SoundPack verysickbeats = new SoundPack("verysickbeats");
		verysickbeats.sortSounds();
		
		File soundPackFolder = new File("soundPacks");
		File[] soundPacks = soundPackFolder.listFiles();
		SoundPackIndex packIndex = new SoundPackIndex(soundPacks);
		
		System.out.println(soundPacks[packIndex.getIndex()]);
		
		
		
		
		VBox vbox = new VBox(10);
		
		Label soundboardname = new Label("SoundBoard");
		Label sound = new Label("Sound");
		HBox arrows = new HBox(2);
		
		
		Button left = new Button("<-----");
		
		left.setOnAction(e -> {
			packIndex.left();
			System.out.println(soundPacks[packIndex.getIndex()]);
		});		
		
		Button right = new Button("----->");
		
		arrows.getChildren().addAll(left, right);
		arrows.setAlignment(Pos.CENTER);
		
		

		GridPane grid = new GridPane();
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setAlignment(Pos.CENTER);
		vbox.setAlignment(Pos.CENTER);
		
		// Button names for each number

		String[] buttonNames = { "1", "2", "3", "4", "Q", "W", "E", "R", "A", "S", "D", "F", "Z", "X", "C", "V"};
		Button[] buttons = new Button[16];
		Pad[] pads = new Pad[16];		
		
		
		
	//	String mediaUri = Paths.get("soundPacks", "verysickbeats", "02_snare.wav").toUri().toString();
	//	String musicFile =  ".\\soundPacks\\verysickbeats\\02_snare.wav";
	//	String test = new File(musicFile).toURI().toString();
	//		
		

		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 4; col++) {
				Button button = new Button(buttonNames[row * 4 + col]);
				button.setStyle("-fx-font-size: 2em; ");
				buttons[row * 4 + col] = button;
					
				
				//System.out.println(verysickbeats.getSounds());
				
				Pad pad = new Pad((row * 4 + col), verysickbeats.getSounds()[(row * 4 + col)]);
				pads[row * 4 + col] = pad;
				
				button.setOnAction(e -> {
					for (Pad padBtn : pads) {
						pad.playSound();
						pad.resetSound();
						sound.setText(pad.getSound());
					}
					

				});
				grid.add(button,col, row);
			}

		}
		
		
		
		
		vbox.getChildren().addAll(soundboardname, sound, grid, arrows);
		

		Scene scene = new Scene(vbox,  400, 400);
		
		scene.setOnKeyPressed(event -> {
            String pressedKey = event.getText().toUpperCase();  
            for (int row = 0; row < 4; row++) {
                for (int col = 0; col < 4; col++) {
                    Button button = (Button) grid.getChildren().get(row * 4 + col);
                    if (button.getText().equals(pressedKey)) {
                        button.fire();  
                    }
                }
            }
        });

		
		stage.setScene(scene);

		stage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}
