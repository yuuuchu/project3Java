/**
 * Sample Skeleton for 'Customers.fxml' Controller Class
 */

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import TravelExperts.Models.customerModel;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
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

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
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

    @FXML // fx:id="tfFirstName"
    private TextField tfFirstName; // Value injected by FXMLLoader

    @FXML // fx:id="tfLastName"
    private TextField tfLastName; // Value injected by FXMLLoader

    @FXML // fx:id="tfAddress"
    private TextField tfAddress; // Value injected by FXMLLoader

    @FXML // fx:id="tfCity"
    private TextField tfCity; // Value injected by FXMLLoader

    @FXML // fx:id="tfProvince"
    private TextField tfProvince; // Value injected by FXMLLoader

    @FXML // fx:id="tfCustomerAgent"
    private TextField tfCustomerAgent; // Value injected by FXMLLoader

    @FXML // fx:id="tfEmailAddress"
    private TextField tfEmailAddress; // Value injected by FXMLLoader

    @FXML // fx:id="tfBusinessPhone"
    private TextField tfBusinessPhone; // Value injected by FXMLLoader

    @FXML // fx:id="tHomePhone"
    private TextField tfHomePhone; // Value injected by FXMLLoader

    @FXML // fx:id="tfCountry"
    private TextField tfCountry; // Value injected by FXMLLoader

    @FXML // fx:id="tfPostalCode"
    private TextField tfPostalCode; // Value injected by FXMLLoader

    @FXML // fx:id="btnCustomerEdit"
    private Button btnCustomerEdit; // Value injected by FXMLLoader

    @FXML // fx:id="btnCustomerSave"
    private Button btnCustomerSave; // Value injected by FXMLLoader

    @FXML // fx:id="btnGoToMain"
    private Button btnGoToMain; // Value injected by FXMLLoader

    public void clickLabel(MouseEvent event, Parent root) {
        Scene page = new Scene(root);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(page);
        window.show();
    }

    @FXML
    void btnGoToMain(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../GUI/Main.fxml"));
        clickLabel(event, root);
    }

    @FXML
    void btnCustomerEdit(ActionEvent event) {
        String customerId = ddCustomerID.getValue().toString();
        customerModel customer = new customerModel();
        customer.getCustomerData(customerId);
        tfProvince.setText(customer.getCustProv());
        tfHomePhone.setText(customer.getCustHomePhone());
        tfPostalCode.setText(customer.getCustPostal());
        tfLastName.setText(customer.getCustLastName());
        tfFirstName.setText(customer.getCustFirstName());
        tfEmailAddress.setText(customer.getCustEmail());
        tfCustomerAgent.setText(String.valueOf(customer.getCustAgent()));
        tfCountry.setText(customer.getCustCountry());
        tfCity.setText(customer.getCustCity());
        tfBusinessPhone.setText(customer.getCustBussPhone());
        tfAddress.setText(customer.getCustAddress());

        enableFields();
    }

    private void enableFields() {
        tfAddress.setDisable(false);
        tfBusinessPhone.setDisable(false);
        tfCity.setDisable(false);
        tfCountry.setDisable(false);
        tfCustomerAgent.setDisable(false);
        tfEmailAddress.setDisable(false);
        tfFirstName.setDisable(false);
        tfLastName.setDisable(false);
        tfPostalCode.setDisable(false);
        tfProvince.setDisable(false);
        btnCustomerSave.setDisable(false);
        tfHomePhone.setDisable(false);
        btnCustomerEdit.setDisable(true);
        ddCustomerID.setDisable(true);
    }

    @FXML
    void btnCustomerSave(ActionEvent event) {
        try{
            customerModel customer = new customerModel();
            customer.setCustFirstName(tfFirstName.getText());
            customer.setCustLastName(tfLastName.getText());
            customer.setCustAddress(tfAddress.getText());
            customer.setCustCity(tfCity.getText());
            customer.setCustProv(tfProvince.getText());
            customer.setCustPostal(tfPostalCode.getText());
            customer.setCustCountry(tfCountry.getText());
            customer.setCustHomePhone(tfHomePhone.getText());
            customer.setCustBussPhone(tfBusinessPhone.getText());
            customer.setCustEmail(tfEmailAddress.getText());
            customer.setCustAgent(Integer.parseInt(tfCustomerAgent.getText()));
            String customerId = ddCustomerID.getValue().toString();
            Boolean result = customer.updateCustData(customerId);
            if (result==true){
                btnCustomerEdit.setDisable(false);
                disableFields();
                clearFields();
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }


    }

    private void clearFields() {
        tfAddress.setText("");
        tfBusinessPhone.setText("");
        tfCity.setText("");
        tfCountry.setText("");
        tfCustomerAgent.setText("");
        tfEmailAddress.setText("");
        tfFirstName.setText("");
        tfLastName.setText("");
        tfPostalCode.setText("");
        tfProvince.setText("");
        tfHomePhone.setText("");
    }

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

    private void loadCustomerID() {
        customerModel customer = new customerModel();
        ObservableList<customerModel> customerIdsList = customer.loadCombo();
        ddCustomerID.setItems(customerIdsList);
    }

    private void disableFields()
    {
        tfAddress.setDisable(true);
        tfBusinessPhone.setDisable(true);
        tfCity.setDisable(true);
        tfCountry.setDisable(true);
        tfCustomerAgent.setDisable(true);
        tfEmailAddress.setDisable(true);
        tfFirstName.setDisable(true);
        tfLastName.setDisable(true);
        tfPostalCode.setDisable(true);
        tfProvince.setDisable(true);
        btnCustomerSave.setDisable(true);
        tfHomePhone.setDisable(true);
        ddCustomerID.setDisable(false);
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert ddCustomerID != null : "fx:id=\"ddCustomerID\" was not injected: check your FXML file 'Customers.fxml'.";
        assert tfFirstName != null : "fx:id=\"tfFirstName\" was not injected: check your FXML file 'Customers.fxml'.";
        assert tfLastName != null : "fx:id=\"tfLastName\" was not injected: check your FXML file 'Customers.fxml'.";
        assert tfAddress != null : "fx:id=\"tfAddress\" was not injected: check your FXML file 'Customers.fxml'.";
        assert tfCity != null : "fx:id=\"tfCity\" was not injected: check your FXML file 'Customers.fxml'.";
        assert tfProvince != null : "fx:id=\"tfProvince\" was not injected: check your FXML file 'Customers.fxml'.";
        assert tfCustomerAgent != null : "fx:id=\"tfCustomerAgent\" was not injected: check your FXML file 'Customers.fxml'.";
        assert tfEmailAddress != null : "fx:id=\"tfEmailAddress\" was not injected: check your FXML file 'Customers.fxml'.";
        assert tfBusinessPhone != null : "fx:id=\"tfBusinessPhone\" was not injected: check your FXML file 'Customers.fxml'.";
        assert tfHomePhone != null : "fx:id=\"tHomePhone\" was not injected: check your FXML file 'Customers.fxml'.";
        assert tfCountry != null : "fx:id=\"tfCountry\" was not injected: check your FXML file 'Customers.fxml'.";
        assert tfPostalCode != null : "fx:id=\"tfPostalCode\" was not injected: check your FXML file 'Customers.fxml'.";
        assert btnCustomerEdit != null : "fx:id=\"btnCustomerEdit\" was not injected: check your FXML file 'Customers.fxml'.";
        assert btnCustomerSave != null : "fx:id=\"btnCustomerSave\" was not injected: check your FXML file 'Customers.fxml'.";
        assert btnGoToMain != null : "fx:id=\"btnGoToMain\" was not injected: check your FXML file 'Customers.fxml'.";
        loadCustomerID();
        disableFields();
    }
}
