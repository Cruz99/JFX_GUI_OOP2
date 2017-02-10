package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.Window;

public class Execute extends Application {
    private Stage primaryStage = new Stage();
    private Stage window;
    private Button button;
    private TextField tfName;

    public Execute(){

    }



    @Override
    public void start(Stage primaryStage) throws Exception {
        // Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        window = primaryStage;
        window.setTitle("DentistFX");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(50, 10, 10, 50));
        grid.setVgap(8);
        grid.setHgap(8);

//button
        button = new Button("First Button");
        button.setStyle("-fx-font-family: fantasy");

        button.getStyleClass().add("myButton");
        GridPane.setConstraints(button, 0, 0);


//text filed
        tfName = new TextField("Name");
        GridPane.setConstraints(tfName, 0, 1);

        grid.getChildren().addAll(button, tfName);

        Scene scene1 = new Scene(grid, 800, 600);

        scene1.getStylesheets().add(Main.class.getResource("Viper.css").toExternalForm());
        window.setScene(scene1);

        window.show();
    }
}






