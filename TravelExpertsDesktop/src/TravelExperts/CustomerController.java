package TravelExperts;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class CustomerController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

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
    void initialize() {
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
