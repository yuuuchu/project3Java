package TravelExperts.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class ProductController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private BorderPane bpMain;

    @FXML
    private Label lblCreateProduct;

    @FXML
    private Label lblEditProduct;

    @FXML
    private Label lblDeleteProduct;

    @FXML
    private Label lblExit;

    @FXML
    void initialize() {
        assert bpMain != null : "fx:id=\"bpMain\" was not injected: check your FXML file 'Products.fxml'.";
        assert lblCreateProduct != null : "fx:id=\"lblCreateProduct\" was not injected: check your FXML file 'Products.fxml'.";
        assert lblEditProduct != null : "fx:id=\"lblEditProduct\" was not injected: check your FXML file 'Products.fxml'.";
        assert lblDeleteProduct != null : "fx:id=\"lblDeleteProduct\" was not injected: check your FXML file 'Products.fxml'.";
        assert lblExit != null : "fx:id=\"lblExit\" was not injected: check your FXML file 'Products.fxml'.";

    }
}
