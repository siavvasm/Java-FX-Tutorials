package miltos.diploma;

//import com.aquafx_project.AquaFx;

import javafx.event.*;
import javafx.scene.*;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.Insets;

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
		
		/* Create a Person */
		Person bucky = new Person();
		
		//Add a listener that listens to firstName changes
		bucky.firstNameProperty().addListener((v, oldValue, newValue) -> {
			System.out.println("Name changed to : " + newValue);
			System.out.println("firstNameProperty() : " + bucky.firstNameProperty());
			System.out.println("getFirstName() : " + bucky.getFirstName());
		});
		
		bucky.setFirstName("Bucky");
		
		/* Create GUI components and add their handler */
		Button button = new Button("Set to Miltos");
		
	
		button.setOnAction(e -> {
			i++;
			bucky.setFirstName("Miltos" + String.valueOf(i));
		});
		
		
	/* Alternative solution - More verbose - For Revision purposes!!
		button.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent e){
				i++;
				bucky.setFirstName("Miltos" + String.valueOf(i));
			}
		});
	*/	
	
		/* Create a layout and add it to a scene */
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout, 300, 250);
		scene.getStylesheets().add("file:///C:/Users/Miltos/Desktop/a.css");
		
		/* Add the scene to the Stage (Window) */
		window.setScene(scene);
		
		/* Make the window visible */
		window.show();
	}
}
