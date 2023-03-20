package environment;

import control.cubeController;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;

import static environment.Camera.*;
import static sample.Play.axisGroup;

public enum Keyboard {
    ;
    public static boolean animationRunning;

    public static void handleKeyboard(Scene scene, final Node root) {
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (!animationRunning) {
                    switch (event.getCode()) {
                        case Z:
                            cameraXform2.t.setX(0.0);
                            cameraXform2.t.setY(0.0);
                            Camera.camera.setTranslateZ(CAMERA_INITIAL_DISTANCE);
                            cameraXform.ry.setAngle(CAMERA_INITIAL_Y_ANGLE);
                            cameraXform.rx.setAngle(CAMERA_INITIAL_X_ANGLE);
                            break;
                        case X:
                            axisGroup.setVisible(!axisGroup.isVisible());
                            break;
//                        case V:
//                            moleculeGroup.setVisible(!moleculeGroup.isVisible());
//                            break;
                        case R: {
                            animationRunning = true;
                            cubeController.animR();
                            break;
                        }
                        case U:
                            animationRunning = true;
                            cubeController.animU();
                            break;
                    }
                }
            }
        });
    }
}
