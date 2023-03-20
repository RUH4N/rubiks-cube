package sample;

import environment.Axis;
import environment.Camera;
import environment.Keyboard;
import environment.Mouse;

import javafx.scene.DepthTest;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.SubScene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import util.Xform;

public class Play {
    private static Stage stage = Main.stage;
    private static double screenWidth = Main.screenWidth;
    private static double screenHeight = Main.screenHeight;

    public static Xform root = new Xform();
    public static final Xform axisGroup = new Xform();
    public static Xform world = new Xform();


    public static void play() {
        // setUserAgentStylesheet(STYLESHEET_MODENA);
        //System.out.println("start()");

        root.getChildren().add(world);
        root.setDepthTest(DepthTest.ENABLE);

        world.getChildren().add(Cube.cubeXform);

        // buildScene();
        Camera.buildCamera();
        Axis.buildAxes();
        Cube.buildCube();

        SubScene subScene = new SubScene(root, screenWidth*0.5, screenHeight*0.8, true, SceneAntialiasing.BALANCED);
        subScene.setFill(Color.AQUAMARINE);
        subScene.setCamera(Camera.getCamera());

        // 2D
        BorderPane pane = new BorderPane();
        pane.setCenter(subScene);

        Scene scene = new Scene(pane, screenWidth, screenHeight, true);
        scene.setFill(Color.AQUAMARINE);
        Keyboard.handleKeyboard(scene, world);
        Mouse.handleMouse(scene, world);

        stage.setTitle("Rubik's Cube");
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();

        //scene.setCamera(Camera.getCamera());
    }
}
