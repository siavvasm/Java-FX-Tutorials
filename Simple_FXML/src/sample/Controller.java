package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class Controller {


    public Button button1;
    public Button button2;
    public Button button3;

    public void handleButton1(){
        System.out.println("I am button 1!");
    }

    public void handleButton2_3(ActionEvent e){

        if(e.getSource() == button2){
            System.out.println("I am button 2!");
        }else{
            System.out.println("I am button 3!");
        }

    }
}
