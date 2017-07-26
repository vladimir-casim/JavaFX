package liang.javafx_basics.examples;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircleCentered extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		
		Circle circle = new Circle();
		circle.centerXProperty().bind(pane.widthProperty().divide(2));
		circle.centerYProperty().bind(pane.heightProperty().divide(2));
		circle.setRadius(50);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
		
		pane.getChildren().add(circle); 
		
		// Create scene and place it in the stage	
		Scene scene = new Scene(pane, 200, 200); // 
		primaryStage.setScene(scene);
		primaryStage.setTitle("ShowCircleCentered");
		primaryStage.show();
		
	}

}
