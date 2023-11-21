package application;   
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;  
public class Main extends Application {  
  
    @Override  
    public void start(Stage stage) throws Exception {  
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        Scene scene = new Scene(root, 345, 400);
        
        
        stage.setTitle("Steam Price Converter");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
          
    }
}