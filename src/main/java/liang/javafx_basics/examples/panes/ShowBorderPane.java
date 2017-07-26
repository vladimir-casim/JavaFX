package liang.javafx_basics.examples.panes;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ShowBorderPane extends Application {

	public static void main(String[] arg0){
		Application.launch(arg0);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// Create a border pane
		BorderPane pane = new BorderPane();
		
		pane.setTop(new CustomPane("Top"));
		pane.setRight(new CustomPane("Right"));
		pane.setLeft(new CustomPane("Left"));
		pane.setBottom(new CustomPane("Bottom"));
		pane.setCenter(new CustomPane("Center"));
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("ShowBorderPane");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}

// Define a custom pane to hold a label in the center of the pane
class CustomPane extends StackPane {
	public CustomPane(String title) {
		getChildren().add(new Label(title));
		setStyle("-fx-border-color: red");
		setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
	}
	
}
