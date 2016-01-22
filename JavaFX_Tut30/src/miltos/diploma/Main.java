package miltos.diploma;

//import com.aquafx_project.AquaFx;

import javafx.event.*;
import javafx.scene.*;
import javafx.application.*;
import javafx.beans.property.IntegerProperty;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;



public class Main extends Application{
	
	Stage window;
	static int i;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		/* Rename the primaryStage into window. It is easier to understant */
		window = primaryStage;
		window.setTitle("My Application");
		
		/* Create two binding properties */
		
		//Input labels
		TextField userInput = new TextField();
		userInput.setMaxWidth(100);
		
		Label firstLabel = new Label("Welcome to the site!");
		Label secondLabel = new Label();
		
		HBox bottomText = new HBox(firstLabel, secondLabel);
		bottomText.setAlignment(Pos.CENTER);
		
		/* Create GUI components and add their handler */
		Button button = new Button("Set to Miltos");
		
		/* Create a layout and add it to a scene */
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20, 20, 20, 20));
		layout.getChildren().addAll(userInput, bottomText);
		layout.setAlignment(Pos.CENTER);
		
		secondLabel.textProperty().bind(userInput.textProperty());
		Scene scene = new Scene(layout, 300, 250);
		
		/* Add the scene to the Stage (Window) */
		window.setScene(scene);
		
		/* Make the window visible */
		window.show();
	}
}