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
		Menu fileMenu = new Menu("File");
		
		//Menu Items
		fileMenu.getItems().add(new MenuItem("New Project..."));
		fileMenu.getItems().add(new MenuItem("New Module..."));
		fileMenu.getItems().add(new MenuItem("Import Project..."));
		fileMenu.getItems().add(new MenuItem("Import Module..."));
		
		//MenuBar
		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().add(fileMenu);
		
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
