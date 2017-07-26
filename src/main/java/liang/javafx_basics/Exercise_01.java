package liang.javafx_basics;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Chapter 14 Exercise 1:
 * @author Vladimir
 *
 */
public class Exercise_01 extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		GridPane gridPane = new GridPane();
		
		Image caImage = new Image("exercise_14/displayimages/image/ca.gif");
		Image chinaImage = new Image("exercise_14/displayimages/image/china.gif");
		Image ukImage = new Image("exercise_14/displayimages/image/uk.gif");
		Image usImage = new Image("exercise_14/displayimages/image/us.gif");
		
		gridPane.setPadding(new Insets(5, 5, 5, 5));
		gridPane.setHgap(10);
		gridPane.setVgap(10);
		gridPane.setAlignment(Pos.CENTER);
		
		gridPane.add(new ImageView(caImage), 0, 0);
		gridPane.add(new ImageView(chinaImage), 0, 1);
		gridPane.add(new ImageView(ukImage), 1, 0);
		gridPane.add(new ImageView(usImage), 1, 1);
		
		Scene scene = new Scene(gridPane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Show flags");
		primaryStage.show();
	}

}
