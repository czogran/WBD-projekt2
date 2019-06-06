package login;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("logowanie.fxml"));
       Parent root = FXMLLoader.load(getClass().getResource("/pracownik/pracownik_menu.fxml"));
       // Parent root = FXMLLoader.load(getClass().getResource("/admin/admin_menu.fxml"));

        primaryStage.setTitle("Baza Danych Antykwariatów");
        primaryStage.setScene(new Scene(root, 860, 600));
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
