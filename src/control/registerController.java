package control;

/*
 * Sample Skeleton for 'register.fxml' cubeController Class
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class registerController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="FirstNameField"
    private TextField FirstNameField; // Value injected by FXMLLoader

    @FXML // fx:id="LastNameField"
    private TextField LastNameField; // Value injected by FXMLLoader

    @FXML // fx:id="FirstNameMessage"
    private Text FirstNameMessage; // Value injected by FXMLLoader

    @FXML // fx:id="LastNameMessage"
    private Text LastNameMessage; // Value injected by FXMLLoader

    @FXML // fx:id="UsernameField"
    private TextField UsernameField; // Value injected by FXMLLoader

    @FXML // fx:id="EmailField"
    private TextField EmailField; // Value injected by FXMLLoader

    @FXML // fx:id="UsernameMessage"
    private Text UsernameMessage; // Value injected by FXMLLoader

    @FXML // fx:id="EmailMessage"
    private Text EmailMessage; // Value injected by FXMLLoader

    @FXML // fx:id="PasswordField"
    private PasswordField PasswordField; // Value injected by FXMLLoader

    @FXML // fx:id="Password2Field"
    private PasswordField Password2Field; // Value injected by FXMLLoader

    @FXML // fx:id="submitButton"
    private Button submitButton; // Value injected by FXMLLoader

    @FXML // fx:id="PasswordMessage"
    private Text PasswordMessage; // Value injected by FXMLLoader

    @FXML // fx:id="Password2Message"
    private Text Password2Message; // Value injected by FXMLLoader

    @FXML
    void submitButtonPressed(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert FirstNameField != null : "fx:id=\"RirstNameField\" was not injected: check your FXML file 'register.fxml'.";
        assert LastNameField != null : "fx:id=\"LastNameField\" was not injected: check your FXML file 'register.fxml'.";
        assert FirstNameMessage != null : "fx:id=\"FirstNameMessage\" was not injected: check your FXML file 'register.fxml'.";
        assert LastNameMessage != null : "fx:id=\"LastNameMessage\" was not injected: check your FXML file 'register.fxml'.";
        assert UsernameField != null : "fx:id=\"UsernameField\" was not injected: check your FXML file 'register.fxml'.";
        assert EmailField != null : "fx:id=\"EmailField\" was not injected: check your FXML file 'register.fxml'.";
        assert UsernameMessage != null : "fx:id=\"UsernameMessage\" was not injected: check your FXML file 'register.fxml'.";
        assert EmailMessage != null : "fx:id=\"EmailMessage\" was not injected: check your FXML file 'register.fxml'.";
        assert PasswordField != null : "fx:id=\"PasswordField\" was not injected: check your FXML file 'register.fxml'.";
        assert Password2Field != null : "fx:id=\"Password2Field\" was not injected: check your FXML file 'register.fxml'.";
        assert submitButton != null : "fx:id=\"submitButton\" was not injected: check your FXML file 'register.fxml'.";
        assert PasswordMessage != null : "fx:id=\"PasswordMessage\" was not injected: check your FXML file 'register.fxml'.";
        assert Password2Message != null : "fx:id=\"Password2Message\" was not injected: check your FXML file 'register.fxml'.";

    }
}

