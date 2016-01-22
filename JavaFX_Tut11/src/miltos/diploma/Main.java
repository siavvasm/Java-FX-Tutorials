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
	Button button;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		/* Rename the primaryStage into window. It is easier to understant */
		window = primaryStage;
		window.setTitle("My Application");
		
		/* Set the template of the JavaFX API */
	    AquaFx.style();
		
		/* Create GUI components and add their handler */
		button = new Button("Order Now");
		
		// Checkboxes 
		CheckBox box1 = new CheckBox("Bacon");
		CheckBox box2 = new CheckBox("Tuna");
		box2.setSelected(true);
		
		/* Set the event handler */
		button.setOnAction(e -> handleOptions(box1, box2));
		
		/* Create a layout and add it to a scene */
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20, 20, 20, 20));
		layout.getChildren().addAll(box1,box2,button);
		Scene scene = new Scene(layout, 300, 250);
		
		/* Add the scene to the Stage (Window) */
		window.setScene(scene);
		
		/* Make the window visible */
		window.show();
	}
	
	public void handleOptions(CheckBox box1, CheckBox box2){
		String message = "User's order : ";
		if(box1.isSelected()){
			message += "bacon";
		}
		
		if(box2.isSelected()){
			message += "tuna";
		}
		
		System.out.println(message);
	}
}
