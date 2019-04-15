package TravelExperts.Controller;

/**
 * Sample Skeleton for 'TravelPackages.fxml' Controller Class
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import TravelExperts.Models.customerModel;
import TravelExperts.Models.packagesModel;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class PackageController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="ddPackageID"
    private ComboBox<packagesModel> ddPackageID; // Value injected by FXMLLoader

    @FXML // fx:id="lblSelectPackageID"
    private Label lblSelectPackageID; // Value injected by FXMLLoader

    @FXML // fx:id="lblPackageStartDate"
    private Label lblPackageStartDate; // Value injected by FXMLLoader

    @FXML // fx:id="lblPackageAgencyComm"
    private Label lblPackageAgencyComm; // Value injected by FXMLLoader

    @FXML // fx:id="tfPackageAgencyComm"
    private TextField tfPackageAgencyComm; // Value injected by FXMLLoader

    @FXML // fx:id="lblPackageEndDate"
    private Label lblPackageEndDate; // Value injected by FXMLLoader

    @FXML // fx:id="lblPackageDescription"
    private Label lblPackageDescription; // Value injected by FXMLLoader

    @FXML // fx:id="tfPackageDescription"
    private TextField tfPackageDescription; // Value injected by FXMLLoader

    @FXML // fx:id="lblPackageBasePrice"
    private Label lblPackageBasePrice; // Value injected by FXMLLoader

    @FXML // fx:id="lblPackageName"
    private Label lblPackageName; // Value injected by FXMLLoader

    @FXML // fx:id="tfPackageBasePrice"
    private TextField tfPackageBasePrice; // Value injected by FXMLLoader

    @FXML // fx:id="tfPackageName"
    private TextField tfPackageName; // Value injected by FXMLLoader

    @FXML // fx:id="dpStartDate"
    private DatePicker dpStartDate; // Value injected by FXMLLoader

    @FXML // fx:id="dpEndDate"
    private DatePicker dpEndDate; // Value injected by FXMLLoader

    @FXML // fx:id="btnAddNewPackage"
    private Button btnAddNewPackage; // Value injected by FXMLLoader

    @FXML // fx:id="btnEditPackage"
    private Button btnEditPackage; // Value injected by FXMLLoader

    @FXML // fx:id="btnSavePackage"
    private Button btnSavePackage; // Value injected by FXMLLoader

    @FXML // fx:id="btnDeletePackage"
    private Button btnDeletePackage; // Value injected by FXMLLoader

    @FXML // fx:id="btnMainMenu"
    private Button btnMainMenu; // Value injected by FXMLLoader

    @FXML // fx:id="tfPackageEndDate"
    private TextField tfPackageEndDate; // Value injected by FXMLLoader

    @FXML // fx:id="tfPackageStartDate"
    private TextField tfPackageStartDate; // Value injected by FXMLLoader

    public void clickLabel(MouseEvent event, Parent root) {
        Scene page = new Scene(root);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(page);
        window.show();
    }

    @FXML
    void btnAddNewPackage(ActionEvent event) {

    }

    @FXML
    void btnDeletePackage(ActionEvent event) {

    }

    @FXML
    void btnEditPackage(ActionEvent event) {
        String customerId = ddPackageID.getValue().toString();
        packagesModel pkg = new packagesModel();
        pkg.getPackageData(customerId);
        tfPackageName.setText(pkg.getPkgName());
        tfPackageStartDate.setText(pkg.getPkgStartDate());
        tfPackageEndDate.setText(pkg.getPkgEndDate());
        tfPackageDescription.setText(pkg.getPkgDesc());
        tfPackageBasePrice.setText(String.valueOf(pkg.getPkgBasePrice()));
        tfPackageAgencyComm.setText(String.valueOf(pkg.getPkgBasePrice()));
        enableFields();
    }

    private void enableFields() {
    }

    @FXML
    void btnMainMenu(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../GUI/Main.fxml"));
        clickLabel(event, root);
    }

    @FXML
    void btnSavePackage(ActionEvent event) {

    }

    public void loadPackageID(){
        packagesModel pkg = new packagesModel();
        ObservableList<packagesModel> packageIdsList = pkg.loadPackageID();
        ddPackageID.setItems(packageIdsList);
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert ddPackageID != null : "fx:id=\"ddPackageID\" was not injected: check your FXML file 'TravelPackages.fxml'.";
        assert lblSelectPackageID != null : "fx:id=\"lblSelectPackageID\" was not injected: check your FXML file 'TravelPackages.fxml'.";
        assert lblPackageStartDate != null : "fx:id=\"lblPackageStartDate\" was not injected: check your FXML file 'TravelPackages.fxml'.";
        assert lblPackageAgencyComm != null : "fx:id=\"lblPackageAgencyComm\" was not injected: check your FXML file 'TravelPackages.fxml'.";
        assert tfPackageAgencyComm != null : "fx:id=\"tfPackageAgencyComm\" was not injected: check your FXML file 'TravelPackages.fxml'.";
        assert lblPackageEndDate != null : "fx:id=\"lblPackageEndDate\" was not injected: check your FXML file 'TravelPackages.fxml'.";
        assert lblPackageDescription != null : "fx:id=\"lblPackageDescription\" was not injected: check your FXML file 'TravelPackages.fxml'.";
        assert tfPackageDescription != null : "fx:id=\"tfPackageDescription\" was not injected: check your FXML file 'TravelPackages.fxml'.";
        assert lblPackageBasePrice != null : "fx:id=\"lblPackageBasePrice\" was not injected: check your FXML file 'TravelPackages.fxml'.";
        assert lblPackageName != null : "fx:id=\"lblPackageName\" was not injected: check your FXML file 'TravelPackages.fxml'.";
        assert tfPackageBasePrice != null : "fx:id=\"tfPackageBasePrice\" was not injected: check your FXML file 'TravelPackages.fxml'.";
        assert tfPackageName != null : "fx:id=\"tfPackageName\" was not injected: check your FXML file 'TravelPackages.fxml'.";
        assert dpStartDate != null : "fx:id=\"dpStartDate\" was not injected: check your FXML file 'TravelPackages.fxml'.";
        assert dpEndDate != null : "fx:id=\"dpEndDate\" was not injected: check your FXML file 'TravelPackages.fxml'.";
        assert btnAddNewPackage != null : "fx:id=\"btnAddNewPackage\" was not injected: check your FXML file 'TravelPackages.fxml'.";
        assert btnEditPackage != null : "fx:id=\"btnEditPackage\" was not injected: check your FXML file 'TravelPackages.fxml'.";
        assert btnSavePackage != null : "fx:id=\"btnSavePackage\" was not injected: check your FXML file 'TravelPackages.fxml'.";
        assert btnDeletePackage != null : "fx:id=\"btnDeletePackage\" was not injected: check your FXML file 'TravelPackages.fxml'.";
        assert btnMainMenu != null : "fx:id=\"btnMainMenu\" was not injected: check your FXML file 'TravelPackages.fxml'.";
        assert tfPackageEndDate != null : "fx:id=\"tfPackageEndDate\" was not injected: check your FXML file 'TravelPackages.fxml'.";
        assert tfPackageStartDate != null : "fx:id=\"tfPackageStartDate\" was not injected: check your FXML file 'TravelPackages.fxml'.";
        loadPackageID();
    }
}
