package source;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import jdk.internal.util.xml.impl.Input;

import javax.swing.*;

public class AddNewPersonScene<Static> {


    @FXML
    private TextField InputPhone;

    @FXML
    private TextField InputEmail;

    @FXML
    private TextField InputName;

    @FXML
    private Button Button_Confirm;

    @FXML
    private Button Button_Cancel;

    @FXML
    void OnNameText(ActionEvent event) {

    }

    @FXML
    void OnEmailText(ActionEvent event) {

    }

    @FXML
    void OnPhoneText(ActionEvent event) {

    }


    @FXML
    void OnButtonConfirm(ActionEvent event) {
        Init();
        // why so ugly this window
        JOptionPane.showMessageDialog(null, "Successful Update!", "Confirm", JOptionPane.PLAIN_MESSAGE);
        final Node source = (Node) event.getSource();
        final Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    @FXML
    void OnButtonCancel(ActionEvent event) {

        // https://stackoverflow.com/questions/13567019/close-fxml-window-by-code-javafx
        final Node source = (Node) event.getSource();
        final Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
        CheckIfAddPersonSceneClose(1);
    }

    static int CheckIfAddPersonSceneClose(int i)
    {
        int j = 0;
        if(j == 1)
        {
            return 0;
        }
        return -1;
    }


    void Init()
    {

        Person person = new Person(InputName.getText(), InputPhone.getText(), InputEmail.getText());
        Person.setPerson(person);

    }


}