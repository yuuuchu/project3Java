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

public class BookingController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private BorderPane bpMain;

    @FXML
    private Label lblCreateBooking;

    @FXML
    private Label lblEditBooking;

    @FXML
    private Label lblDeleteBooking;

    @FXML
    private Label lblExit;

    @FXML
    void onClickedExit(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../GUI/Main.fxml"));
        clickLabel(event, root);
    }

    @FXML
    void initialize() {
        assert bpMain != null : "fx:id=\"bpMain\" was not injected: check your FXML file 'Bookings.fxml'.";
        assert lblCreateBooking != null : "fx:id=\"lblCreateBooking\" was not injected: check your FXML file 'Bookings.fxml'.";
        assert lblEditBooking != null : "fx:id=\"lblEditBooking\" was not injected: check your FXML file 'Bookings.fxml'.";
        assert lblDeleteBooking != null : "fx:id=\"lblDeleteBooking\" was not injected: check your FXML file 'Bookings.fxml'.";
        assert lblExit != null : "fx:id=\"lblExit\" was not injected: check your FXML file 'Bookings.fxml'.";

    }
}
