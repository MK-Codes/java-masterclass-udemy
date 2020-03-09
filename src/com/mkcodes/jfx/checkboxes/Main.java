package com.mkcodes.jfx.checkboxes;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler {
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
		response = new Label("jj");
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

		// Register checkboxes
		bananaCB.setOnAction(this);
		mangoCB.setOnAction(this);
		papayaCB.setOnAction(this);
		grapefruitCB.setOnAction(this);
		appleCB.setOnAction(this);

		Scene scene = new Scene(flowPaneRoot, 400, 250);
		primaryStage.setScene(scene);
		primaryStage.show();
		showAll();
	}

	void showAll() {
		fruits = "";
		if (bananaCB.isSelected()) {
			fruits = "Banana";
		}
		if (mangoCB.isSelected()) {
			fruits += " Mango";
		}
		if (papayaCB.isSelected()) {
			fruits += " Papaya";
		}
		if (grapefruitCB.isSelected()) {
			fruits += " Grapefruit";
		}
		if (appleCB.isSelected()) {
			fruits += " Apple";
		}

		selected.setText("Fruit selected: " + fruits);

	}

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void handle(Event event) {
		Object fruitChecked = event.getSource();
		if (bananaCB.equals(fruitChecked)) {
			if (bananaCB.isSelected()) {
				response.setText("Banana selected.");
			} else {
				response.setText("Banana cleared.");
			}
			showAll();
		}
		if (mangoCB.equals(fruitChecked)) {
			if (mangoCB.isSelected()) {
				response.setText("Mango selected.");
			} else {
				response.setText("Mango cleared.");
			}
			showAll();
		}
		if (papayaCB.equals(fruitChecked)) {
			if (papayaCB.isSelected()) {
				response.setText("Papaya selected.");
			} else {
				response.setText("Papaya cleared.");
			}
			showAll();
		}
		if (grapefruitCB.equals(fruitChecked)) {
			if (grapefruitCB.isSelected()) {
				response.setText("Grapefruit selected.");
			} else {
				response.setText("Grapefruit cleared.");
			}
			showAll();
		}
		if (appleCB.equals(fruitChecked)) {
			if (appleCB.isSelected()) {
				response.setText("Apple selected.");
			} else {
				response.setText("Apple cleared.");
			}
			showAll();
		}
	}

}
