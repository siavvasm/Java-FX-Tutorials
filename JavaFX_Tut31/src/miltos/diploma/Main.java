package miltos.diploma;

//import com.aquafx_project.AquaFx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
    	FXMLLoader loader = new FXMLLoader().load(getClass().getResource("main.fxml"));
    	//loader.setController(new Controller(path));
    	StaticPane mainPane = loader.load();
    	
    	Parent root = FXMLLoader.load(getClass().getResource("file:///C:/Users/Miltos/Desktop/sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


}