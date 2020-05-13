package source;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private static Stage primaryStage;
    private static BorderPane mainLayout;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
        Scene scene = new Scene(root);

        primaryStage.getIcons().add(new Image("./Resource/rocket.png"));
        primaryStage.setScene(scene);
        primaryStage.show();

        //primaryStage.setTitle("Hello World");
        // primaryStage.setScene(new Scene(root, 300, 275));
    }

    public static void showAddNewPersonScene() throws IOException{

        Stage stage = new Stage();
        Parent root = FXMLLoader.load(Main.class.getResource("AddNewPersonScene.fxml"));
        Scene scene = new Scene(root);


        stage.getIcons().add(new Image("./Resource/contact_all.png"));
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
