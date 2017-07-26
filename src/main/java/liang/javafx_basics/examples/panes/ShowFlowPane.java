package liang.javafx_basics.examples.panes;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ShowFlowPane extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FlowPane flowPane = new FlowPane();
		flowPane.setPadding(new Insets(11, 12, 13, 14));
		flowPane.setHgap(5);
		flowPane.setVgap(5);
		
		flowPane.getChildren().addAll(new Label("First name:"), new TextField(), 
				new Label("MI:"));
		
		TextField tfMi = new TextField();
		tfMi.setPrefColumnCount(1);
		flowPane.getChildren().addAll(tfMi, new Label("Last Name:"), new TextField());
		
		Scene scene = new Scene(flowPane, 200, 250);
		primaryStage.setTitle("ShowFlowPane");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
