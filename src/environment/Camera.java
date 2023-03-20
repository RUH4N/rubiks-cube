package environment;

import sample.Play;
import util.Xform;
import javafx.scene.PerspectiveCamera;

public enum Camera {
    ;

    private static Xform root = Play.root;

    static final PerspectiveCamera camera = new PerspectiveCamera(true);
    static final Xform cameraXform = new Xform();
    static final Xform cameraXform2 = new Xform();
    static final Xform cameraXform3 = new Xform();

    static final double CAMERA_INITIAL_DISTANCE = -1152;
    static final double CAMERA_INITIAL_X_ANGLE = 25.0;
    static final double CAMERA_INITIAL_Y_ANGLE = 25.0;

    private static final double CAMERA_NEAR_CLIP = 0.1;
    private static final double CAMERA_FAR_CLIP = 10000.0;


    public static void buildCamera() {
        System.out.println("buildCamera()");
        root.getChildren().add(cameraXform);
        cameraXform.getChildren().add(cameraXform2);
        cameraXform2.getChildren().add(cameraXform3);
        cameraXform3.getChildren().add(camera);
        cameraXform3.setRotateZ(180.0);

        camera.setNearClip(CAMERA_NEAR_CLIP);
        camera.setFarClip(CAMERA_FAR_CLIP);
        camera.setTranslateZ(CAMERA_INITIAL_DISTANCE);
        cameraXform.ry.setAngle(CAMERA_INITIAL_Y_ANGLE);
        cameraXform.rx.setAngle(CAMERA_INITIAL_X_ANGLE);
    }

    public static PerspectiveCamera getCamera() {
        return camera;
    }
}