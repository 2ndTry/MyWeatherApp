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
    private TextField fellField;

    @FXML
    private TextField maxField;

    @FXML
    private TextField minField;

    @FXML
    private TextField pressField;

    @FXML
    void initialize() {
        searchButton.setOnAction(event -> {
            System.out.println("Работает!");
        });
    }
}


