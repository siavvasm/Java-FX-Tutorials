package miltos.diploma;

import com.aquafx_project.AquaFx;

import javafx.event.*;
import javafx.scene.*;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.Insets;

public class Main extends Application{
	
	Stage window;
	
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
		
		/* Create a layout and add it to a scene */
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setVgap(8);
		grid.setHgap(10);
		
		/* Create GUI components and add their handler */
		Label name = new Label("Username");
		GridPane.setConstraints(name, 0, 0);
		
		TextField nameInput = new TextField("Bucky");
		GridPane.setConstraints(nameInput, 1, 0);
		
		//Password
		Label password = new Label("Password");
		GridPane.setConstraints(name, 0, 1);
		
		TextField passwordInput = new TextField();
		passwordInput.setPromptText("password");
		GridPane.setConstraints(passwordInput, 1, 1);
		
		//Login Button
		Button loginButton = new Button("Login");
		GridPane.setConstraints(loginButton, 1, 2);
		
		/* Add the components to the grid */
		grid.getChildren().addAll(name,nameInput,password,passwordInput,loginButton);
		
		/* Create the scene and add the layout to it */
		Scene scene = new Scene(grid, 300, 200);
		
		/* Add the scene to the Stage (Window) */
		window.setScene(scene);
		
		/* Make the window visible */
		window.show();
	}
}
