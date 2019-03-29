package TravelExperts;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.FadeTransition;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.util.Duration;

public class DBLoginController {


    @FXML
    private GridPane gpLogin;

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
    protected Button btnSignIn;

    @FXML
    protected boolean OnClicked(MouseEvent event) throws IOException {

        DBLoginConnection loginObj=new DBLoginConnection();
        String loginUser = txtUserField.getText();
        String pass = txtPassword.getText();

        if(loginObj.loginUser("a","a") == loginObj.loginUser(loginUser, pass)){
            lblUser.setText("Valid");
            loginFade();
            return true;
        }
        else{
            lblUser.setText("Invalid");
            return false;
        }
    }

    private void loginFade(){
        FadeTransition fade = new FadeTransition(Duration.millis(3000), gpLogin);
        fade.setFromValue(1.0);
        fade.setToValue(0);
        fade.play();
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
