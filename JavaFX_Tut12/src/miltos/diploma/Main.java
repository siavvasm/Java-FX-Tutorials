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
	ChoiceBox<String> choiceBox;
	
	
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
		button = new Button("Click Me");
		
		/* Create a DropDown List (ChoiceBox) */
		choiceBox = new ChoiceBox<>();
		choiceBox.getItems().add("apples");
		choiceBox.getItems().add("bannanas");
		choiceBox.getItems().add("cucumber");
		choiceBox.getItems().add("tuter");
		choiceBox.getItems().add("smooke");
		
		/* Create a layout and add it to a scene */
		VBox layout = new VBox(10);
		layout.getChildren().addAll(choiceBox,button);
		layout.setPadding(new Insets(20,20,20,20));
		Scene scene = new Scene(layout, 300, 250);
		
		/* Add a button listener */
		button.setOnAction(e -> System.out.println("The text is : " + choiceBox.getValue()));
		choiceBox.setOnAction(e -> System.out.println("The text is : " + choiceBox.getValue()));
		
		/* Add the generic event handler */
		button.setOnAction(this);
		choiceBox.setOnAction(this);
		
		/* Add the scene to the Stage (Window) */
		window.setScene(scene);
		
		/* Make the window visible */
		window.show();
	}
	
	@Override
	public void handle(ActionEvent e){
		if(e.getSource() == button){
			System.out.println("**** Button Pressed ****");
			System.out.println("Your choice is : " + choiceBox.getValue());
		}else if(e.getSource() == choiceBox){
			System.out.println("**** ChoiceBox Changed ****");
			System.out.println("The current choice is : " + choiceBox.getValue());
	
		}else{
			
		}
	}
	
}
