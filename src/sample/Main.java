package sample;

import design.Login;
import javafx.application.Application;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Main extends Application {
    public static Stage stage;
    public static double screenHeight;
    public static double screenWidth;

    @Override
    public void start(Stage primaryStage) throws Exception{
        stage = primaryStage;
        stage.setFullScreen(true);
        stage.setResizable(false);
        Login.showLoginPage();
        //Play.play();
    }

    public static void main(String[] args) {
        screenHeight = Screen.getPrimary().getBounds().getHeight();
        screenWidth = Screen.getPrimary().getBounds().getWidth();
        launch(args);
    }
}
