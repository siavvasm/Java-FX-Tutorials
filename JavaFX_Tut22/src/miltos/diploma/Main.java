package miltos.diploma;

import com.aquafx_project.AquaFx;

import javafx.event.*;
import javafx.scene.*;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.Insets;

public class Main extends Application{
	
	Stage window;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		/* Rename the primaryStage into window. It is easier to understant */
		window = primaryStage;
		window.setTitle("My Application");
		
		/* Set the template of the JavaFX API */
		// AquaFx.style();
		
		/* Create GUI components and add their handler */
		
		//File Menu 
		Menu fileMenu = new Menu("_File");
		
		
		//Menu Items
		
		MenuItem newFile = new MenuItem("New...");
		newFile.setOnAction(e -> System.out.println("New File Created!!"));
		fileMenu.getItems().add(newFile);
		
		fileMenu.getItems().add(new MenuItem("Open..."));
		fileMenu.getItems().add(new MenuItem("Save..."));
		fileMenu.getItems().add(new SeparatorMenuItem());
		fileMenu.getItems().add(new MenuItem("Settings..."));
		fileMenu.getItems().add(new SeparatorMenuItem());
		fileMenu.getItems().add(new MenuItem("Exit..."));
		
		//Edit Menu
		Menu editMenu = new Menu("_Edit");
		
		//Menu Items
		editMenu.getItems().add(new MenuItem("Cut"));
		editMenu.getItems().add(new MenuItem("Copy"));

		MenuItem pasteItem = new MenuItem("Paste");
		pasteItem.setOnAction(e -> System.out.println("Pasting!!"));
		pasteItem.setDisable(true);
		editMenu.getItems().add(pasteItem);
		
		//MenuBar
		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().addAll(fileMenu,editMenu);
		
		/* Create a layout and add it to a scene */
		BorderPane layout = new BorderPane();
		layout.setTop(menuBar);
		
		
		Scene scene = new Scene(layout, 300, 250);
		
		/* Add the scene to the Stage (Window) */
		window.setScene(scene);
		
		/* Make the window visible */
		window.show();
	}
}
