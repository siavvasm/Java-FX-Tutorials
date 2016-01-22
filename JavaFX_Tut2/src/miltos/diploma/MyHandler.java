package miltos.diploma;

import javafx.event.*;


public class MyHandler implements EventHandler<ActionEvent> {

	public void handle(ActionEvent e){
		if(e.getSource()==Main.button){
			System.out.println("You pressed the button");
		}
	}
}
