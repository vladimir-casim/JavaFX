package liang.javafx_basics.examples;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class NodeStyleRotateDemo extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) throws Exception {
		// Create scene and place button in the scene
		StackPane pane = new StackPane();
		Button btOk = new Button("OK");
		btOk.setStyle("-fx-border-color: blue;");
		pane.getChildren().add(btOk);
		
		pane.setRotate(45);
		pane.setStyle("-fx-border-color: red; -fx-background-color: lightgray");
		
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene); // Place the scene into the scene
		primaryStage.setTitle("NodeStyleRotateDemo"); // Set the stage title
		primaryStage.show(); // Display the stage
	}

}
