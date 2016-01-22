package miltos.diploma;

import java.util.Iterator;

import com.aquafx_project.AquaFx;

import javafx.collections.ObservableList;
import javafx.event.*;
import javafx.scene.*;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.Insets;

public class Main extends Application{
	
	Stage window;
	Scene scene;
	Button button;
	ListView<String> listView;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		/* Rename the primaryStage into window. It is easier to understant */
		window = primaryStage;
		window.setTitle("My Application");
		
		/* Set the template of the JavaFX API */
		// AquaFx.style();
		
		/* Create GUI components and add their handler */
		button = new Button("Submit");
		listView = new ListView<>();
		listView.getItems().addAll("Iron Man", "Harryy Potter", "Buyer's Club");
		listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		/* Set the handler */
		button.setOnAction(e -> buttonClicked());
		
		/* Create a layout and add it to a scene */
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20, 20, 20, 20));
		layout.getChildren().addAll(listView, button);
		Scene scene = new Scene(layout, 300, 250);
		
		/* Add the scene to the Stage (Window) */
		window.setScene(scene);
		
		/* Make the window visible */
		window.show();
	}
	
	private void buttonClicked(){
		System.out.println("*** Button Is Clicked ***");
		String message = "";
		ObservableList<String> movies = listView.getSelectionModel().getSelectedItems();
		
		Iterator<String> iterator = movies.iterator();
		while(iterator.hasNext()){
			message += iterator.next() + "\n";
		}
		
		System.out.println(message);
		
		listView.getItems().add("Megali Apofraksh");
		
	}
}
