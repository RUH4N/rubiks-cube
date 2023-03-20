package design;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.Main;

public class Login {
    private static Stage stage = Main.stage;
    private static double screenWidth = Main.screenWidth;
    private static double screenHeight = Main.screenHeight;

    public static void showLoginPage() throws Exception {
//        FXMLLoader loader = new FXMLLoader();
//        loader.setLocation(Login.class.getResource("login.fxml"));
//        Parent root = loader.load();
        Parent root = FXMLLoader.load(Login.class.getResource("login.fxml"));

        stage.setScene(new Scene(root, screenWidth, screenHeight));
        stage.setFullScreen(true);
        stage.show();
    }
}
