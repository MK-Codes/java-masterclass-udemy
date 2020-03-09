package com.mkcodes.jfx.effects_transformations;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler {
	private Button rotateButton;
	private Button blurButton;
	private Button scaleButton;
	private Rotate rotate;
	private double angle;

	@Override
	public void start(Stage primaryStage) throws Exception {

		primaryStage.setTitle("Life Cycle");

		rotateButton = new Button("Rotate");
		blurButton = new Button("Blur off");
		scaleButton = new Button("Scale");

		// Register buttons
		rotateButton.setOnAction(this);
		blurButton.setOnAction(this);
		scaleButton.setOnAction(this);

		Label reflect = new Label("Reflection adds visual sparkle");

		FlowPane root = new FlowPane(15, 15);
		root.setAlignment(Pos.CENTER);
		rotate = new Rotate();
		angle = 0.0;

		root.getChildren().addAll(rotateButton, blurButton, scaleButton, reflect);

		Scene scene = new Scene(root, 300, 120);
		primaryStage.setScene(scene);
		primaryStage.show();

		rotateButton.getTransforms().add(rotate);
	}

	@Override
	public void handle(Event event) {

		if (event.getSource().equals(rotateButton)) {
			angle += 15.0;
			rotate.setAngle(angle);
			rotate.setPivotX(rotateButton.getWidth() / 2);
			rotate.setPivotY(rotateButton.getHeight() / 2);
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

}
