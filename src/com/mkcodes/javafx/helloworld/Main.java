package com.mkcodes.javafx.helloworld;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		primaryStage.setTitle("Hello JavaFX!");
		Button button = new Button();
		button.setText("Click me");
		button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Hello, Cleveland!");
			}
		});
	}

	public static void main(String[] args) {
		launch(args);
	}
}
