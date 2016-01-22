package miltos.diploma;

import com.aquafx_project.AquaFx;

import javafx.event.*;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class AlertBox {
	
	public static void display(String title, String message){
		
		/* Create a new Stage object (i.e. Window) */
		Stage window = new Stage();
		window.setTitle(title);
		window.setMinWidth(250);
		
		/* Do not allow to go back to your previous window */
		window.initModality(Modality.APPLICATION_MODAL);
		
		/* Create the window's GUI components */
		Label label = new Label();
		label.setText(message);
		Button closeButton = new Button("Close Window");
		
		/* Add an event handler. Use Lambda Expression */
		closeButton.setOnAction(e -> window.close());
		
		/* Create a layout and add it to the scene */
		VBox layout = new VBox(10);
		layout.getChildren().addAll(label, closeButton);
		layout.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(layout);
		window.setScene(scene);
		
		/* Make the window visible */
		window.showAndWait();
		
	}

}
