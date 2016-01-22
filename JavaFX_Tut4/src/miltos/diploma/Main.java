package miltos.diploma;

import com.aquafx_project.AquaFx;

import javafx.event.*;
import javafx.scene.*;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

/* AquaFX Template necessary imports */
//import com.aquafx_project.AquaFx;
//import com.aquafx_project.controls.*;



public class Main extends Application implements EventHandler<ActionEvent>{
	
	/* Declare the GUI Objects that you may need */
	Stage window;
	Scene scene1;
	Scene scene2;
	
	public static void main(String[] args) {
		/* Launch the main stage (window) of your application ..!! */
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		/* Rename the primaryStage into window. It is easier to understant */
		window = primaryStage;
		/* Set the template of the JavaFX API */
		AquaFx.style();
		
		/* Create the basic components */
		Label label1 = new Label("Welcome to the first scene!");
		Button button1 = new Button("Go to scene 2");
		button1.setOnAction(e -> window.setScene(scene2));
		
		//Layout 1 - children are laid out in a vertical column 
		VBox layout1 = new VBox(20);
		layout1.getChildren().addAll(label1, button1);
		scene1 = new Scene(layout1, 200, 200);
		
		// Button 2
		Button button2 = new Button("This scene sucks! Go back to scene1!!");
		button2.setOnAction(e -> window.setScene(scene1));
		
		//Layout 2 - 
		StackPane layout2 = new StackPane();
		layout2.getChildren().add(button2);
		scene2 = new Scene(layout2,600, 300);
		
		//Set the default scene!
		window.setTitle("Title");
		window.setScene(scene1);
		window.show();
	}
	
	
	@Override
	public void handle(ActionEvent event){

	}
}
