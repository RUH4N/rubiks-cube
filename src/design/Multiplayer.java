package design;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.Main;

public class Multiplayer {
    private static Stage stage = Main.stage;
    private static double screenWidth = Main.screenWidth;
    private static double screenHeight = Main.screenHeight;

    public static void showMultiplayerPage() throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Login.class.getResource("multiplayer.fxml"));
        Parent root = loader.load();

        stage.setScene(new Scene(root, screenWidth, screenHeight));
        stage.setFullScreen(true);
        stage.show();
    }
}
