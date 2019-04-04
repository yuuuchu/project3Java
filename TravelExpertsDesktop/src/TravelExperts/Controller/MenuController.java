package TravelExperts.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private BorderPane bpMain;

    @FXML
    private Label lblMenu;

    @FXML
    private Label lblCustomer;

    @FXML
    private Label lblBooking;

    @FXML
    private Label lblPackage;

    @FXML
    private Label lblProduct;

    @FXML
    private Label lblSupplier;

    @FXML
    private Label lblSignout;

    @FXML
    void OnCustomerClicked(MouseEvent event) throws IOException {
        Parent root1 = FXMLLoader.load(getClass().getResource("GUI/Customers.fxml"));
        Scene custPage = new Scene(root1);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(custPage);
        window.show();
    }

    @FXML
    void initialize() {
        assert bpMain != null : "fx:id=\"bpMain\" was not injected: check your FXML file 'Main.fxml'.";
        assert lblMenu != null : "fx:id=\"lblMenu\" was not injected: check your FXML file 'Main.fxml'.";
        assert lblCustomer != null : "fx:id=\"lblCustomer\" was not injected: check your FXML file 'Main.fxml'.";
        assert lblBooking != null : "fx:id=\"lblBooking\" was not injected: check your FXML file 'Main.fxml'.";
        assert lblPackage != null : "fx:id=\"lblPackage\" was not injected: check your FXML file 'Main.fxml'.";
        assert lblProduct != null : "fx:id=\"lblProduct\" was not injected: check your FXML file 'Main.fxml'.";
        assert lblSupplier != null : "fx:id=\"lblSupplier\" was not injected: check your FXML file 'Main.fxml'.";
        assert lblSignout != null : "fx:id=\"lblSignout\" was not injected: check your FXML file 'Main.fxml'.";

    }
}
