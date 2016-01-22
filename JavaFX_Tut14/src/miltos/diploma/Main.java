package miltos.diploma;

import com.aquafx_project.AquaFx;

import javafx.event.*;
import javafx.scene.*;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.Insets;

public class Main extends Application {
	
	Stage window;
	Button button;
	Scene scene;
	ComboBox<String> comboBox;

	
	
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
		button = new Button("Submit");
		comboBox = new ComboBox<>();
		comboBox.getItems().addAll("Harry Potter", "Star Wars", "Iron Man");
		comboBox.setPromptText("Movie??");
		button.setOnAction(e -> printMovie());
		comboBox.setOnAction(e -> printMovie());
		comboBox.setEditable(true);

		
		/* Create a layout and add it to a scene */
		VBox layout = new VBox(10);
		layout.getChildren().addAll(comboBox, button);
		layout.setPadding(new Insets(20,20,20,20));
		Scene scene = new Scene(layout, 300, 250);
		
		/* Add a button listener */
		//button.setOnAction(e -> System.out.println("The text is : " ));
		
		
		/* Add the generic event handler */
		// button.setOnAction(this);
	
		
		/* Add the scene to the Stage (Window) */
		window.setScene(scene);
		
		/* Make the window visible */
		window.show();
	}
	
	private void printMovie(){
		System.out.println(comboBox.getValue());
	}
	
//	@Override
//	public void handle(ActionEvent e){
//		if(e.getSource() == button){
//			System.out.println("**** Button Pressed ****");
//			System.out.println("Your choice is : " + choiceBox.getValue());
//		}else if(e.getSource() == choiceBox){
//			System.out.println("**** ChoiceBox Changed ****");
//			System.out.println("The current choice is : " + choiceBox.getValue());
//	
//		}else{
//			
//		}
//	}
	
}