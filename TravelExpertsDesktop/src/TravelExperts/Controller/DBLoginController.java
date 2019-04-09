package TravelExperts.Controller;

import TravelExperts.DBLoginConnection;
import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class DBLoginController {
    @FXML
    private GridPane gpLogin;
    @FXML
    private TextField txtUserField;
    @FXML
    private PasswordField txtPassword;
    @FXML
    protected Button btnSignIn;
    @FXML
    private Label lblError;

    @FXML
    protected void OnBtnClicked(MouseEvent event){

        try{
            DBLoginConnection loginObj=new DBLoginConnection();
            String loginUser = txtUserField.getText();
            String pass = txtPassword.getText();

            if(loginObj.loginUser("a","a") == loginObj.loginUser(loginUser, pass)){
                Parent root1 = FXMLLoader.load(getClass().getResource("../GUI/Main.fxml"));
                Scene mainPage = new Scene(root1);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(mainPage);
                loginFade();
                window.show();

            }
            else{
                lblError.setVisible(true);

            }}
        catch(Exception e){
            e.printStackTrace();
        }

    }

    @FXML
    public void textFieldsNotEmpty(){
        String userName = txtUserField.getText();
        String pass = txtPassword.getText();

        //set disableSignIn to true
        boolean disableSignIn = userName.isEmpty() || userName.trim().isEmpty();
        boolean disablePass = pass.isEmpty() || pass.trim().isEmpty();

        if(disableSignIn == false && disablePass == false){
            btnSignIn.setDisable(false);
        }
        else{
            btnSignIn.setDisable(true);
        }
    }

    @FXML
    private void loginFade(){
        FadeTransition fade = new FadeTransition(Duration.millis(3000), gpLogin);
        fade.setFromValue(1.0);
        fade.setToValue(0);
        fade.play();
    }

    @FXML
    public void initialize() {


    }
}