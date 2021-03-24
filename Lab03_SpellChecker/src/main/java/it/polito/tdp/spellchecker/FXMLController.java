package it.polito.tdp.spellchecker;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<?> txtScegliLingua;

    @FXML
    private TextField txtTestoDaControllare;

    @FXML
    private TextArea txtParoleSbagliate;

    @FXML
    private Label txtTempoImpiegato;

    @FXML
    private Label txtNumeroParoleSbagliate;

    @FXML
    private Button cancellaTesto;

    @FXML
    void doCancellaTesto(ActionEvent event) {

    }

    @FXML
    void doControllo(ActionEvent event) {

    }

    @FXML
    void doLinguaScelta(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert txtScegliLingua != null : "fx:id=\"txtScegliLingua\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtTestoDaControllare != null : "fx:id=\"txtTestoDaControllare\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtParoleSbagliate != null : "fx:id=\"txtParoleSbagliate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtTempoImpiegato != null : "fx:id=\"txtTempoImpiegato\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtNumeroParoleSbagliate != null : "fx:id=\"txtNumeroParoleSbagliate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert cancellaTesto != null : "fx:id=\"cancellaTesto\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
