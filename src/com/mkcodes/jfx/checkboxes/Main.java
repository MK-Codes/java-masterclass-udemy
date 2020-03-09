package com.mkcodes.jfx.checkboxes;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {
	private Label title;
	private Label response;
	private Label selected;

	private CheckBox bananaCB;
	private CheckBox mangoCB;
	private CheckBox papayaCB;
	private CheckBox grapefruitCB;
	private CheckBox appleCB;
	private String fruits;

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Favourite Fruit");

		title = new Label("What fruits do you like?");
		response = new Label("");
		selected = new Label("");

		bananaCB = new CheckBox("Banana");
		mangoCB = new CheckBox("Mango");
		papayaCB = new CheckBox("Papaya");
		grapefruitCB = new CheckBox("Grapefruit");
		appleCB = new CheckBox("Apple");

		// set up stage and scene
		FlowPane flowPaneRoot = new FlowPane(Orientation.VERTICAL, 5, 5);
		flowPaneRoot.setAlignment(Pos.CENTER);
		flowPaneRoot.getChildren().add(title);
		flowPaneRoot.getChildren().addAll(bananaCB, mangoCB, papayaCB, grapefruitCB, appleCB, response, selected);
		Scene scene = new Scene(flowPaneRoot, 400, 250);
		primaryStage.setScene(scene);
		primaryStage.show();
		showAll();
	}

	void showAll() {
		fruits = "";

	}

	public static void main(String[] args) {
		launch(args);
	}

}
