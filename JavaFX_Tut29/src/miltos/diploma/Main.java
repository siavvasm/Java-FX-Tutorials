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
		
		IntegerProperty x = new SimpleIntegerProperty(3);
		IntegerProperty y = new SimpleIntegerProperty();		
		
		y.bind(x.multiply(10));
		
		System.out.println("x : " + x.getValue() + " y : " + y.getValue());
		
		/* Create GUI components and add their handler */
		Button button = new Button("Set to Miltos");
		button.setOnAction(e -> {
			i++;
			x.setValue(i);
			System.out.println("x : " + x.getValue() + " y : " + y.getValue());
		});
		
		
		/* Create a layout and add it to a scene */
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout, 300, 250);
		
		/* Add the scene to the Stage (Window) */
		window.setScene(scene);
		
		/* Make the window visible */
		window.show();
	}
}