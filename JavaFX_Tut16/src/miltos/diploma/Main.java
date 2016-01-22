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
	TreeView<String> tree;
	
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
		TreeItem<String> root, bucky, megan;
		
		//Root
		root = new TreeItem<>();
		root.setExpanded(true);
		
		// Bucky 
		bucky = makeBranch("Bucky", root);
		makeBranch("A", bucky);
		makeBranch("V", bucky);
		makeBranch("C", bucky);
		
		// Megan
		megan = makeBranch("Megan", root);
		makeBranch("A", megan);
		makeBranch("V", megan);
		makeBranch("C", megan);
		
		//TreeView
		tree = new TreeView<>(root);
		tree.setShowRoot(false);
		tree.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> {
			if(newValue != null){
				System.out.println(newValue);
			}
		});
		
		/* Create a layout and add it to a scene */
		StackPane layout = new StackPane();
		layout.getChildren().add(tree);
		Scene scene = new Scene(layout, 300, 250);
		
		/* Add the scene to the Stage (Window) */
		window.setScene(scene);
		
		/* Make the window visible */
		window.show();
	}
	
	private TreeItem<String> makeBranch(String title, TreeItem<String> parent ){
		TreeItem<String> item = new TreeItem<>(title);
		item.setExpanded(true);
		parent.getChildren().add(item);
		return item;
	}
}
