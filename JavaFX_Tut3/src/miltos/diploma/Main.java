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
	static Button button;
	static int i;
	
	public static void main(String[] args) {
		/* Launch the main stage (window) of your application ..!! */
		launch(args);
	}
	
	/*
	 * The basic method of the Application.
	 * This method is called only when the primary Stage's launch() method is invoked iside main().
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		/* Set the template of the JavaFX API */
		AquaFx.style();
		
		/* Set the title of the primary Stage (Window) */
		primaryStage.setTitle("Title of the window");
		
		/* Create the components of the primary Stage (Window) */
		button = new Button();
		button.setText("Click Me");
		
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
		
		/* Add the action listener to the button */
		button.setOnAction(e -> System.out.println("Lambda Expression!!")); 
		
		button.setOnAction(e -> {
			System.out.println("Lambda Expression!!"); 
			System.out.println("Lambda Expression is Awesome");
		});
	}
	
	
	/*
	 * This function belongs to the interface EventHandler.
	 * 
	 * It is called every time the user creates (throws) an
	 * event on the primaryStage.
	 * 
	 */
	@Override
	public void handle(ActionEvent event){
		if(event.getSource()==button){
			System.out.println("I love it!!");
			/* New pop up window with it's own handler */
		}
	}
}
