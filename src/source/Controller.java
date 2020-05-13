package source;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    private  TableColumn<?, ?> TableName;

    @FXML
    private TableColumn<?, ?> TableGroup;

    @FXML
    private Button Button_AddPerson;

    @FXML
    private VBox CheckBoxVBox;

    @FXML
    private VBox ContactGroupVBox;

    @FXML
    private Button Group_AddButton;

    @FXML
    private TableColumn<?, ?> TableEmail;

    @FXML
    private TableColumn<?, ?> TablePhone;






    @FXML
    void OnGroupAddButtonClicked(ActionEvent event) throws IOException {
        // idk use what Node :(

        Button btn = new Button();

        // another scene



        // getText

        ContactGroupVBox.getChildren().add(btn);

    }

    @FXML
    void OnButtonAddPerson(ActionEvent event) throws IOException {

        // new Scene
        /**/

        Main.showAddNewPersonScene();
        UpdateGroup();


    }

    void UpdateGroup()
    {
        Test();
    }



    void Test()
    {
        Person p =  Person.getPerson();
        int i = AddNewPersonScene.CheckIfAddPersonSceneClose(0);
    }




}


