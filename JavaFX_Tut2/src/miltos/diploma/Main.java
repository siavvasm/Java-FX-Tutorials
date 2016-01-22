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
		button.setOnAction(this); // This is equivalent to : button.addActionListener(this) that we use in Swing API
		
		/* Create your own Handler */
		// MyHandler myHandler = new MyHandler();
		// button.setOnAction(myHandler);
		
		
		
		/* An quick way to create and start a thread!!! 
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				System.out.println("I am a thread naoum!!");
			}
		});
		t1.start();
		*/
	}
	
	public static void newPopUpWindow(){
		
		/* Create a new Stage object i.e. a new Window */
		Stage popUp = new Stage();
		popUp.setTitle("My POP UP!!");
		
		/* Create the components of this window. In this case, create a single button */
		Button b = new Button();
		b.setText("Add");
		
		/* Another way of adding an EventHandler. 
		 * In this case, the event handler is added in place.
		 * (The if statement is not needed)
		 */
		b.setOnAction( new EventHandler<ActionEvent>(){
							public void handle(ActionEvent e){
								if(e.getSource()==b){
									System.out.println("I am button b! This is another way for implementing a handler!!");
	//								new Thread(new Runnable(){
	//									public void run(){
	//										System.out.println("I am a thread naoum!! " + i);
	//										i++;
	//									}
	//								}).start();
								}
							}
						});
		
		/* Create the layout of the scene and add the button*/
		StackPane pane = new StackPane();
		pane.getChildren().add(b);
		
		/* Create the scene of the Stage (Window) and set it to the window */
		Scene s = new Scene(pane, 200, 200);
		popUp.setScene(s);
		
		/* Make the window visible */
		popUp.show();
		
		/* Debugging Messages */
		System.out.println("The pop up window is closed!!");
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
			newPopUpWindow();
		}
	}
}
