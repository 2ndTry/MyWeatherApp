package sample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import jdk.nashorn.internal.parser.JSONParser;
import netscape.javascript.JSException;
import netscape.javascript.JSObject;
import org.json.JSONObject;

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
    private TextField temp;

    @FXML
    private TextField feels_like;

    @FXML
    private TextField temp_max;

    @FXML
    private TextField temp_min;

    @FXML
    private TextField pressure;

    @FXML
    void initialize() {
        searchButton.setOnAction(event -> {

            String getUserCity = enterCityField.getText().trim();
            if(!getUserCity.equals("")) {
                String output = getUrlContent("https://api.openweathermap.org/data/2.5/weather?q=" + getUserCity + "&units=metric&appid=4962504a1566e0315d15a711c70cd3b6&lang=ru");
                System.out.println(output);

                if (!output.isEmpty()) {
                    JSONObject obj = new JSONObject(output);
                    temp.setText("" + obj.getJSONObject("main").getInt("temp"));
                    feels_like.setText("" + obj.getJSONObject("main").getInt("feels_like"));
                    temp_max.setText("" + obj.getJSONObject("main").getInt("temp_max"));
                    temp_min.setText("" + obj.getJSONObject("main").getInt("temp_min"));
                    pressure.setText("" + obj.getJSONObject("main").getInt("pressure"));
                }
            }
        });
    }

    public static String getUrlContent(String urlAdress) {
        StringBuffer content = new StringBuffer();

        try {
            URL url = new URL(urlAdress);
            URLConnection urlConnection = url.openConnection();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line;

            while ((line = bufferedReader.readLine()) != null){
                content.append(line + "\n");
            }
            bufferedReader.close();

        } catch (Exception e){
            System.out.println("Buffer is down!");
        }
        return content.toString();
    }
}


