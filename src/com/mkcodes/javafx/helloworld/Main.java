package com.mkcodes.javafx.helloworld;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {
	private Label myLabel;
	private Label myLabel2;

	@Override
	public void start(Stage primaryStage) throws Exception {

		primaryStage.setTitle("Hello JavaFX!");
		Button button = new Button();
		button.setText("Click me");
		myLabel = new Label();
		myLabel2 = new Label();
		myLabel.setText("I dare you. Click me!");
		myLabel2.setText("Label 2!");

		button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				myLabel2.setText("Hello, Cleveland!");
			}
		});

		// StackPane adds all on top of each other
		// StackPane root = new StackPane();
		// FlowPane is more flexible, adds items on new lines
		FlowPane flowPaneRoot = new FlowPane(10, 10);
		flowPaneRoot.setAlignment(Pos.CENTER);
		flowPaneRoot.getChildren().add(button);
		flowPaneRoot.getChildren().add(myLabel);
		flowPaneRoot.getChildren().add(myLabel2);
		Scene scene = new Scene(flowPaneRoot, 250, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
