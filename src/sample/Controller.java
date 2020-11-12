package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField enterCityField;

    @FXML
    private Button searchButton;

    @FXML
    private TextField tempField;

    @FXML
    private TextField feelField;

    @FXML
    private TextField maxField;

    @FXML
    private TextField minField;

    @FXML
    private TextField pressField;

    @FXML
    void initialize() {
        assert enterCityField != null : "fx:id=\"enterCityField\" was not injected: check your FXML file 'sample.fxml'.";
        assert searchButton != null : "fx:id=\"searchButton\" was not injected: check your FXML file 'sample.fxml'.";
        assert tempField != null : "fx:id=\"tempField\" was not injected: check your FXML file 'sample.fxml'.";
        assert feelField != null : "fx:id=\"feelField\" was not injected: check your FXML file 'sample.fxml'.";
        assert maxField != null : "fx:id=\"maxField\" was not injected: check your FXML file 'sample.fxml'.";
        assert minField != null : "fx:id=\"minField\" was not injected: check your FXML file 'sample.fxml'.";
        assert pressField != null : "fx:id=\"pressField\" was not injected: check your FXML file 'sample.fxml'.";

    }
}

