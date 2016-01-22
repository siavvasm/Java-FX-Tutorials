package sample;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

/**
 * Created by Miltos on 21/1/2016.
 */
public class AlertBox {

    private static Button yes;
    private static Button no;
    private static Label mes;
    static boolean answer = false;

    public static boolean display(String message){

        //Create a new Stage
        Stage window = new Stage();
        window.setTitle("Alet Box!");

        //Label
        mes = new Label(message);
        //Create the Buttons
        yes = new Button("Yes");
        no = new Button("No");

        //Add the handlers
        yes.setOnAction(e -> {
            answer = true;
            window.close();
        });
        no.setOnAction(e -> {
            answer = false;
            window.close();
        });

        //Create a Horizontal Layout
        HBox butLayout = new HBox();
        butLayout.setPadding(new Insets(20,20, 20, 20));
        butLayout.getChildren().addAll(yes, no);

        //Create the general layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(mes,butLayout);

        //Create the scene and assign the layout to it
        Scene scene = new Scene(layout, 300, 200);

        //Add the scene to the pop up window
        window.setScene(scene);

        //Show the window...
        window.showAndWait();

        return answer;
    }
}
