package sample;

import javafx.scene.control.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Controller {

    public TextArea textArea2;
    public void logInButtonClicked(){
        System.out.println("User Log in!!");
        FileReader fr = null;
        try {
            fr = new FileReader("C:/Users/Miltos/Desktop/lan4.java");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(fr);

        String line ="";
        while(line !=null){
            try {
                System.out.println(br.readLine());
                line = br.readLine();
                if(line != null)
                    textArea2.appendText(line);
                    textArea2.appendText("\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
