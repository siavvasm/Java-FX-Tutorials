package miltos.diploma;

import com.aquafx_project.AquaFx;

import javafx.event.*;
import javafx.scene.*;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.Insets;

public class Main extends Application implements EventHandler<ActionEvent>{
	
	Stage window;
	Button button;
	Scene scene;
	TextField nameInput;
	
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
		button = new Button("Click me");
	    nameInput = new TextField();
		
		/* Set the button's handler */
		button.setOnAction(e -> {
			String name = nameInput.getText();
			System.out.println("You typed : " + name);
		});
		
		/* Set the button's handler */
		button.setOnAction(e -> isInt(nameInput, nameInput.getText()));
		
		/* Use the generic handler */
		// button.setOnAction(this);
		
		/* Create a layout and add it to a scene */
		VBox layout = new VBox();
		layout.getChildren().addAll(nameInput, button);
		layout.setPadding(new Insets(20,20,20,20));
		Scene scene = new Scene(layout, 300, 250);
		
		/* Add the scene to the Stage (Window) */
		window.setScene(scene);
		
		/* Make the window visible */
		window.show();
	}
	
	private boolean isInt(TextField input, String message){
		try{
			int age = Integer.parseInt(input.getText());
			System.out.println("Your Age is : " + age);
			return true;
		}catch(NumberFormatException e){
			System.out.println(e.getMessage());
			System.out.println("Error!!!!!!");
			return false;
		}
	}
	
	@Override
	public void handle(ActionEvent e){
		if(e.getSource()==button){
			String name = nameInput.getText();
			System.out.println("You just typed : " + name);
			nameInput.setText("");
		}
	}
}
