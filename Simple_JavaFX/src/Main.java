import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Created by Miltos on 21/1/2016.
 */
public class Main extends Application{

    Stage window;
    Button button1;
    Button button2;
    Button button3;

    public static void main(String[] args){
         launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("My Window");

        //Buttons
        button1 = new Button("button1");
        button2 = new Button("button2");
        button3 = new Button("button3");

        //Handlers
        button1.setOnAction(e -> handleButton1());
        button2.setOnAction(e -> handleButton2_3(e));
        button3.setOnAction(e -> handleButton2_3(e));

        //Layout
        HBox layout = new HBox();
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(10,10,10,10));
        layout.getChildren().addAll(button1, button2, button3);

        //Scene
        Scene scene = new Scene(layout, 200, 200);

        //Window
        window.setScene(scene);
        window.show();
    }

    public void handleButton1(){
        System.out.println("Button 1 pressed");
    }

    public void handleButton2_3(ActionEvent e){
        if(e.getSource() == button2){
            System.out.println("Button 2 pressed");
        }else{
             System.out.println("Button 3 pressed");
        }
    }
}
