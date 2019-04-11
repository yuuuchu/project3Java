package TravelExperts.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

import static TravelExperts.Controller.MenuController.clickLabel;

public class PackageController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private BorderPane bpMain;

    @FXML
    private Label lblNewPackage;

    @FXML
    private Label lblEditPackage;

    @FXML
    private Label lblDeletePackage;

    @FXML
    private Label lblExit;

    @FXML
    void onClickedExit(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../GUI/Main.fxml"));
        clickLabel(event, root);
    }

    @FXML
    void initialize() {
        assert bpMain != null : "fx:id=\"bpMain\" was not injected: check your FXML file 'TravelPackages.fxml'.";
        assert lblNewPackage != null : "fx:id=\"lblNewPackage\" was not injected: check your FXML file 'TravelPackages.fxml'.";
        assert lblEditPackage != null : "fx:id=\"lblEditPackage\" was not injected: check your FXML file 'TravelPackages.fxml'.";
        assert lblDeletePackage != null : "fx:id=\"lblDeletePackage\" was not injected: check your FXML file 'TravelPackages.fxml'.";
        assert lblExit != null : "fx:id=\"lblExit\" was not injected: check your FXML file 'TravelPackages.fxml'.";

    }
}
