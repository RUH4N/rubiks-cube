/*
 * Sample Skeleton for 'multiplayer.fxml' cubeController Class
 */

package control;

import java.net.URL;
import java.util.ResourceBundle;

import design.Create;
import design.Join;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import server.Server;

public class multiplayerController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="createButton"
    private Button createButton; // Value injected by FXMLLoader

    @FXML // fx:id="joinButton"
    private Button joinButton; // Value injected by FXMLLoader

    @FXML
    void createButtonPressed(ActionEvent event) {
        try {
            Server.create();
            Create.showCreatepage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void joinButtonPressed(ActionEvent event) {
        try {
            Join.showJoinpage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert createButton != null : "fx:id=\"createButton\" was not injected: check your FXML file 'multiplayer.fxml'.";

        assert joinButton != null : "fx:id=\"joinButton\" was not injected: check your FXML file 'multiplayer.fxml'.";

    }
}
