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



public class Main extends Application{
	
	/* Declare the GUI Objects that you may need */
	Button button;
	
	/*
	 * Just the main function of the Application.
	 * It just calls the launch() function in order to launch the main
	 * window (frame) of the application.
	 */
	public static void main(String[] args) {
		
		System.out.println("Hi!! I am going to start the main stage of the Application!!");
		launch(args);
		System.out.println("I am going to close the main stage of the Application!!");

	}
	
	/* This is the main function that is executed imediatelly after launch() is called 
	 * inside main function.
	 */
	@Override
	public void start(Stage primaryStage) throws Exception{
		
		/* Set the title of the Stage i.e. the title of the main Window */
		primaryStage.setTitle("Title of the window");
		
		/* Change the template of your GUI - Use AquaFX !! */
		// AquaFx.style();
		
	
		/* Create a simple Button */
		button = new Button();
		button.setText("Click me");
		
		/* Create a simple layout */
		StackPane layout = new StackPane();
		
		/* Add the button to the layout */
		layout.getChildren().add(button);
		
		/* Create a scene so that the objects will be visible
		 * and attach it to your main window..!
		 */
		Scene scene = new Scene(layout, 300, 250);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		/* Just a pop up window */
		Stage popUp = new Stage();
		popUp.setTitle("Pop Up Window!!");
		popUp.show();
	}
}
