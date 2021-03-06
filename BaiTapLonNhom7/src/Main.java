import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
       try {
           Parent root = FXMLLoader.load(getClass().getResource("/Views/NewScene.fxml"));
           Scene scene = new Scene(root);
           primaryStage.setScene(scene);
           primaryStage.setTitle("Quản lý gian hàng cao cấp.");
           primaryStage.show();
       }
       catch (IOException e) {
           e.printStackTrace();
       }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
