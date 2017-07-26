package liang.javafx_basics.examples;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFX extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button btOK = new Button("OK");
		Scene scene = new Scene(btOK, 200, 250);
		primaryStage.setTitle("MyJavaFX"); // Set the stage title
		primaryStage.setScene(scene);
		primaryStage.show(); // Display the stage
		
		Stage stage = new Stage();
		stage.setTitle("Second Stage");
		stage.setScene(new Scene(new Button("New Stage"), 100, 100));
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
}
