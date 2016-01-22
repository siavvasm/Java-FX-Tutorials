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
	Button button;
	
	public static void main(String[] args) {
		/* Launch the main stage (window) of your application ..!! */
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		/* Rename the primaryStage into window. It is easier to understant */
		window = primaryStage;
		window.setTitle("My Application");
		
		/* Set the template of the JavaFX API */
		AquaFx.style();
		
		/* Create the basic components */
		button = new Button("Close Program");
		button.setOnAction(e -> closeProgram());
		
		/* Closing the program from the X button properly */
		window.setOnCloseRequest(e -> {
			e.consume(); // Do not close the window !!! I will do it!!
			closeProgram();
		});
		
		//button.setOnAction(this);
		
		/* Create a layout and add it to a scene */
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout, 300, 250);
		
		/* Add the scene to the Stage (Window) */
		window.setScene(scene);
		
		/* Make the window visible */
		window.show();
	}
	
	public void closeProgram(){
		Boolean answer = ConfirmBox.display("Confirm","Are you sure?");
		if(answer){
			System.out.println("File is saved!!");
			window.close();
		}else{
			System.out.println("Going back to main application!!");
		}
		
	}
	
	/* 
	 * Alternative way to implement a handler!!
	 */
	@Override
	public void handle(ActionEvent event){
		if(event.getSource()==button){
			AlertBox.display("Warning", "Fatal Error");
		}
	}
}
