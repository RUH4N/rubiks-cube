package control;

/*
 * Sample Skeleton for 'login.fxml' cubeController Class
 */

import java.net.URL;
import java.util.ResourceBundle;

import design.Homepage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import design.Register;

public class loginController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="username_text"
    private TextField username_text; // Value injected by FXMLLoader

    @FXML // fx:id="password_text"
    private PasswordField password_text; // Value injected by FXMLLoader

    @FXML // fx:id="login_button"
    private Button login_button; // Value injected by FXMLLoader

    @FXML // fx:id="register_button"
    private Button register_button; // Value injected by FXMLLoader

    @FXML
    void loginPressed(ActionEvent event) {
        try {
            Homepage.showHomepage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void registerPressed(ActionEvent event) {
        try {
            Register.showRegisterPage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert username_text != null : "fx:id=\"username_text\" was not injected: check your FXML file 'login.fxml'.";
        assert password_text != null : "fx:id=\"password_text\" was not injected: check your FXML file 'login.fxml'.";
        assert login_button != null : "fx:id=\"login_button\" was not injected: check your FXML file 'login.fxml'.";
        assert register_button != null : "fx:id=\"register_button\" was not injected: check your FXML file 'login.fxml'.";

    }
}
