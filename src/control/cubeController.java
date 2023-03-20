package control;

import environment.Keyboard;
import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.paint.Material;
import javafx.scene.paint.PhongMaterial;
import javafx.util.Duration;
import sample.Cube;

import static javafx.scene.transform.Rotate.X_AXIS;
import static javafx.scene.transform.Rotate.Y_AXIS;

public class cubeController extends Cube {
    private static Material[] temp = new PhongMaterial[3];

    //cubeXform.setRy(+50);
    //cubeXform.setRy(-40);

    public static void animR() {
        RotateTransition rotateTransition = new RotateTransition();
        rotateTransition.setDuration(Duration.millis(1000));
        Group tempL = new Group();
        for(int i = 2; i < 27; i+=3) tempL.getChildren().addAll(Xpart[i]);
        rotateTransition.setNode(tempL);
        rotateTransition.setAxis(X_AXIS);
        rotateTransition.setByAngle(90);
        //rotateTransition.setAutoReverse(false);
        rotateTransition.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            synchronized public void handle(ActionEvent event) {
                move_R();
                cubeXform.getChildren().removeAll(Xpart);
                cubeXform.getChildren().removeAll(tempL);
                cubeXform.getChildren().addAll(Xpart);
                Keyboard.animationRunning = false;
            }
        });
        rotateTransition.play();
        cubeXform.getChildren().addAll(tempL);
    }

    private static void move_R() {
        // t(0,1)=r(0,1)<-r(6,3)<-r(8,7)<-r(2,5)<-t(0,1)

        // t(0,1)=r(0,1)
        temp[0] = rightSticker[0].getMaterial();
        temp[1] = rightSticker[1].getMaterial();
        
        // r(0,1)<-r(6,3)
        rightSticker[0].setMaterial(rightSticker[6].getMaterial());
        rightSticker[1].setMaterial(rightSticker[3].getMaterial());

        // r(6,3)<-r(8,7)
        rightSticker[6].setMaterial(rightSticker[8].getMaterial());
        rightSticker[3].setMaterial(rightSticker[7].getMaterial());

        // r(8,7)<-r(2,5)
        rightSticker[8].setMaterial(rightSticker[2].getMaterial());
        rightSticker[7].setMaterial(rightSticker[5].getMaterial());

        rightSticker[2].setMaterial(temp[0]);
        rightSticker[5].setMaterial(temp[1]);
        
        
        // t(0,1,2)=b(6,3,0)<-u(2,5,8)<-f(2,5,8)<-d(2,5,8)<-t(0,1,2)

        // t(0,1,2)=b(6,3,0)
        temp[0] = backSticker[6].getMaterial();
        temp[1] = backSticker[3].getMaterial();
        temp[2] = backSticker[0].getMaterial();

        // b(6,3,0)<-u(2,5,8)
        backSticker[6].setMaterial(upSticker[2].getMaterial());
        backSticker[3].setMaterial(upSticker[5].getMaterial());
        backSticker[0].setMaterial(upSticker[8].getMaterial());

        // u(2,5,8)<-f(2,5,8)
        upSticker[2].setMaterial(frontSticker[2].getMaterial());
        upSticker[5].setMaterial(frontSticker[5].getMaterial());
        upSticker[8].setMaterial(frontSticker[8].getMaterial());

        // f(2,5,8)<-d(2,5,8)
        frontSticker[2].setMaterial(downSticker[2].getMaterial());
        frontSticker[5].setMaterial(downSticker[5].getMaterial());
        frontSticker[8].setMaterial(downSticker[8].getMaterial());

        // d(2,5,8)<-t(0,1,2)
        downSticker[2].setMaterial(temp[0]);
        downSticker[5].setMaterial(temp[1]);
        downSticker[8].setMaterial(temp[2]);
    }

    public static void animU() {
        RotateTransition rotateTransition = new RotateTransition();
        rotateTransition.setDuration(Duration.millis(1000));
        Group tempL = new Group();
        for(int i = 0; i < 27; i+=9) tempL.getChildren().addAll(Xpart[i], Xpart[i+1], Xpart[i+2]);
        rotateTransition.setNode(tempL);
        rotateTransition.setAxis(Y_AXIS);
        rotateTransition.setByAngle(-90);
        //rotateTransition.setAutoReverse(false);
        rotateTransition.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            synchronized public void handle(ActionEvent event) {
                move_U();
                cubeXform.getChildren().removeAll(Xpart);
                cubeXform.getChildren().removeAll(tempL);
                cubeXform.getChildren().addAll(Xpart);
                Keyboard.animationRunning = false;
            }
        });
        rotateTransition.play();
        cubeXform.getChildren().addAll(tempL);
    }

    private static void move_U() {
        // t(0,1)=u(0,1)<-u(6,3)<-u(8,7)<-u(2,5)<-t(0,1)

        // t(0,1)=u(0,1)
        temp[0] = upSticker[0].getMaterial();
        temp[1] = upSticker[1].getMaterial();

        // u(0,1)<-u(6,3)
        upSticker[0].setMaterial(upSticker[6].getMaterial());
        upSticker[1].setMaterial(upSticker[3].getMaterial());

        // u(6,3)<-u(8,7)
        upSticker[6].setMaterial(upSticker[8].getMaterial());
        upSticker[3].setMaterial(upSticker[7].getMaterial());

        // u(8,7)<-u(2,5)
        upSticker[8].setMaterial(upSticker[2].getMaterial());
        upSticker[7].setMaterial(upSticker[5].getMaterial());

        // u(2,5)<-t(0,1)
        upSticker[2].setMaterial(temp[0]);
        upSticker[5].setMaterial(temp[1]);


        // t(0,1,2)=b(0,1,2)<-l(0,1,2)<-f(0,1,2)<-r(0,1,2)<-t(0,1,2)

        // t(0,1,2)=b(0,1,2)
        temp[0] = backSticker[0].getMaterial();
        temp[1] = backSticker[1].getMaterial();
        temp[2] = backSticker[2].getMaterial();

        // b(0,1,2)<-l(0,1,2)
        backSticker[0].setMaterial(leftSticker[0].getMaterial());
        backSticker[1].setMaterial(leftSticker[1].getMaterial());
        backSticker[2].setMaterial(leftSticker[2].getMaterial());

        // l(0,1,2)<-f(0,1,2)
        leftSticker[0].setMaterial(frontSticker[0].getMaterial());
        leftSticker[1].setMaterial(frontSticker[1].getMaterial());
        leftSticker[2].setMaterial(frontSticker[2].getMaterial());

        // f(0,1,2)<-r(0,1,2)
        frontSticker[0].setMaterial(rightSticker[0].getMaterial());
        frontSticker[1].setMaterial(rightSticker[1].getMaterial());
        frontSticker[2].setMaterial(rightSticker[2].getMaterial());
        
        // r(0,1,2)<-t(0,1,2)
        rightSticker[0].setMaterial(temp[0]);
        rightSticker[1].setMaterial(temp[1]);
        rightSticker[2].setMaterial(temp[2]);
    }
}
