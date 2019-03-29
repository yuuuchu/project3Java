package TravelExperts;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Menu implements Initializable {

    Stage prevStage;
    public void setPrevStage(Stage stage){
        this.prevStage = stage;
    }

/*    public Menu() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Travel Experts");
        stage.setScene(new Scene(root,800,440));
        stage.show();
    }*/

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void gotoMain(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Travel Experts");
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("Main.fxml"));
        Scene scene = new Scene(myPane);
        stage.setScene(scene);

        prevStage.close();

        stage.show();
    }
}
