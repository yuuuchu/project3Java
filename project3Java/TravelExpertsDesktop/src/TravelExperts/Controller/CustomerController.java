package TravelExperts.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import static TravelExperts.Controller.MenuController.clickLabel;

public class CustomerController {

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
    private Label lblPackage;

    @FXML
    private Label lblProduct;

    @FXML
    private Label lblSignout;

    @FXML
    private TableView<?> tvCustomers;

    @FXML
    private TableColumn<?, ?> tcName;

    @FXML
    private TableColumn<?, ?> tcAddress;

    @FXML
    private TableColumn<?, ?> tcHomePhone;

    @FXML
    private TableColumn<?, ?> tcBusPhone;

    @FXML
    private TableColumn<?, ?> tcEmail;

    @FXML
    private TableColumn<?, ?> tcAgentId;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnAdd;

    @FXML
    void OnClickedExit(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../GUI/Main.fxml"));
        clickLabel(event, root);
    }

    @FXML
    void OnCustomerClicked(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert bpMain != null : "fx:id=\"bpMain\" was not injected: check your FXML file 'Customers.fxml'.";
        assert lblMenu != null : "fx:id=\"lblMenu\" was not injected: check your FXML file 'Customers.fxml'.";
        assert lblCustomer != null : "fx:id=\"lblCustomer\" was not injected: check your FXML file 'Customers.fxml'.";
        assert lblPackage != null : "fx:id=\"lblPackage\" was not injected: check your FXML file 'Customers.fxml'.";
        assert lblProduct != null : "fx:id=\"lblProduct\" was not injected: check your FXML file 'Customers.fxml'.";
        assert lblSignout != null : "fx:id=\"lblSignout\" was not injected: check your FXML file 'Customers.fxml'.";
        assert tvCustomers != null : "fx:id=\"tvCustomers\" was not injected: check your FXML file 'Customers.fxml'.";
        assert tcName != null : "fx:id=\"tcName\" was not injected: check your FXML file 'Customers.fxml'.";
        assert tcAddress != null : "fx:id=\"tcAddress\" was not injected: check your FXML file 'Customers.fxml'.";
        assert tcHomePhone != null : "fx:id=\"tcHomePhone\" was not injected: check your FXML file 'Customers.fxml'.";
        assert tcBusPhone != null : "fx:id=\"tcBusPhone\" was not injected: check your FXML file 'Customers.fxml'.";
        assert tcEmail != null : "fx:id=\"tcEmail\" was not injected: check your FXML file 'Customers.fxml'.";
        assert tcAgentId != null : "fx:id=\"tcAgentId\" was not injected: check your FXML file 'Customers.fxml'.";
        assert btnDelete != null : "fx:id=\"btnDelete\" was not injected: check your FXML file 'Customers.fxml'.";
        assert btnAdd != null : "fx:id=\"btnAdd\" was not injected: check your FXML file 'Customers.fxml'.";

    }
}
