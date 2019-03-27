package TravelExperts;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class LoginController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblTravelExperts;

    @FXML
    private Label lblUser;

    @FXML
    private TextField txtUserField;

    @FXML
    private Label lblPassword;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private Button btnSignIn;

    @FXML
    void OnClicked(MouseEvent event) {

        DBLoginConnection loginObj=new DBLoginConnection();


        if(loginObj.loginUser("Muhammad","Khan")){
            lblUser.setText("Valid");
        }
        else{
            lblUser.setText("Invalid");
        }
    }





    @FXML
    void initialize() {
        assert lblTravelExperts != null : "fx:id=\"lblTravelExperts\" was not injected: check your FXML file 'LoginPage.fxml'.";
        assert lblUser != null : "fx:id=\"lblUser\" was not injected: check your FXML file 'LoginPage.fxml'.";
        assert txtUserField != null : "fx:id=\"txtUserField\" was not injected: check your FXML file 'LoginPage.fxml'.";
        assert lblPassword != null : "fx:id=\"lblPassword\" was not injected: check your FXML file 'LoginPage.fxml'.";
        assert txtPassword != null : "fx:id=\"txtPassword\" was not injected: check your FXML file 'LoginPage.fxml'.";
        assert btnSignIn != null : "fx:id=\"btnSignIn\" was not injected: check your FXML file 'LoginPage.fxml'.";

    }
}
