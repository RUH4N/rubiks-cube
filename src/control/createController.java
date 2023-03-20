/*
 * Sample Skeleton for 'create.fxml' cubeController Class
 */

package control;

import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import server.Server;

public class createController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="playButton"
    private Button playButton; // Value injected by FXMLLoader

    @FXML // fx:id="ipAddress"
    private Text ipAddress; // Value injected by FXMLLoader

    @FXML
    void playPressed(ActionEvent event) {
        Server.serverNeedNotAcceptAnymore = true;
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert playButton != null : "fx:id=\"playButton\" was not injected: check your FXML file 'create.fxml'.";
        assert ipAddress != null : "fx:id=\"ipAddress\" was not injected: check your FXML file 'create.fxml'.";

        try {
            ipAddress.setText(InetAddress.getLocalHost().toString().split("/")[1]);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
