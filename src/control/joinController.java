/*
 * Sample Skeleton for 'join.fxml' cubeController Class
 */

package control;

import java.net.URL;
import java.util.ResourceBundle;

import client.Client;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class joinController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="serverIP"
    private TextField serverIP; // Value injected by FXMLLoader

    @FXML // fx:id="clientJoin"
    private Button clientJoin; // Value injected by FXMLLoader

    @FXML
    void clientJoinPressed(ActionEvent event) {
        Client.serverAddress = serverIP.getText();
        System.out.println(Client.serverAddress);
        //System.out.println(Client.serverAddress);
        Client.create();
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert serverIP != null : "fx:id=\"serverIP\" was not injected: check your FXML file 'join.fxml'.";
        assert clientJoin != null : "fx:id=\"clientJoin\" was not injected: check your FXML file 'join.fxml'.";

    }
}
