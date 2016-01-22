package sample;

import javafx.scene.control.Button;

public class Controller {

    public Button button;

    public void handleButtonClick(){
        System.out.println("The button is clicked!!!");
        button.setText("NAOUM!");
        boolean answer = AlertBox.display("Are you sure");

        if(answer){
            System.out.println("He is sure!!");
        }else{
            System.out.println("He is not sure!!");
        }
    }


}
