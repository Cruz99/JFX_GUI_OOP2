package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.stage.Window;

import javax.swing.text.Position;
import java.util.logging.Handler;

public class BuildScene extends Application {
    Stage window;
    Button btn_patient_1, btn_procedure_1, btn_payment_1;
    Button btn_patient_2, btn_procedure_2, btn_payment_2;
    Button btn_patient_3, btn_procedure_3, btn_payment_3;
    Button btn_patient_add;

    TextField txt_patient_add;
    Label lbl_patient_add_name;


    Scene patientScene, procedureScene, paymentScene;
    Scene patient_add;

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        window = primaryStage;
        window.setTitle("DentistFX");

        //Setting main PANES///////////////////////////////////////////
        GridPane pane_patient = new GridPane();
        BorderPane pane_procedure = new BorderPane();
        BorderPane pane_payment = new BorderPane();

        setButtons();

        //Setting main vertical menus//////////////////////////////////
        HBox vertialMenu = new HBox();
        HBox vertialMenu1 = new HBox();
        HBox vertialMenu2 = new HBox();


        vertialMenu.setAlignment(Pos.BASELINE_CENTER);
        vertialMenu.setPadding(new Insets(50, 10, 10, 0));
        vertialMenu.setSpacing(10);
        vertialMenu.getChildren().addAll(btn_patient_1, btn_procedure_1, btn_payment_1);

        vertialMenu1.setAlignment(Pos.BASELINE_CENTER);
        vertialMenu1.setPadding(new Insets(50, 10, 10, 0));
        vertialMenu1.setSpacing(10);
        vertialMenu1.getChildren().addAll(btn_patient_2, btn_procedure_2, btn_payment_2);

        vertialMenu2.setAlignment(Pos.BASELINE_CENTER);
        vertialMenu2.setPadding(new Insets(50, 10, 10, 0));
        vertialMenu2.setSpacing(10);
        vertialMenu2.getChildren().addAll(btn_patient_3, btn_procedure_3, btn_payment_3);

        pane_patient.add(vertialMenu,0,0);
        pane_patient.setHalignment(vertialMenu, HPos.CENTER);

        pane_procedure.setTop(vertialMenu1);
        pane_payment.setTop(vertialMenu2);


        //// PATIENT LAYOUT //////////////////////////////////////////////////////////////
        GridPane gridPane_patient = new GridPane();

        gridPane_patient.setPadding(new Insets(10,10,10,50));
        gridPane_patient.setHgap(20);
        gridPane_patient.setVgap(5);

        Button btn_add_patient = new Button("Add");
        gridPane_patient.add(btn_add_patient, 0, 0);
        Label lbl_add_patient = new Label("Adding new patient");
        gridPane_patient.add(lbl_add_patient, 1,0);

        Button btn_remove_patient = new Button("Remove");
        gridPane_patient.add(btn_remove_patient, 0 ,2);
        Label lbl_remove_patient = new Label("Deleting existing patient");
        gridPane_patient.add(lbl_remove_patient, 1,2);

        Button btn_display_patient = new Button("Display");
        gridPane_patient.add(btn_display_patient, 0,3);
        Label lbl_display_patient = new Label("Display patient information");
        gridPane_patient.add(lbl_display_patient, 1,3);

        Button btn_save_patient = new Button("Save");
        gridPane_patient.add(btn_save_patient, 0,4);
        Label lbl_save_patient = new Label("Save all the information into the file");
        gridPane_patient.add(lbl_save_patient, 1,4);

        Button btn_quit_patient = new Button("Quit");
        gridPane_patient.add(btn_quit_patient, 0,5);
        Label lbl_quit_patient = new Label("Exit the application");
        gridPane_patient.add(lbl_quit_patient, 1,5);


        pane_patient.add(gridPane_patient, 0,2);


        Line line = new Line(10,10,100,100);

        pane_patient.getChildren().add(line);

        patientScene = new Scene(pane_patient, 800, 600);
        procedureScene = new Scene(pane_procedure, 800, 600);
        paymentScene = new Scene(pane_payment, 800, 600);


        patientScene.getStylesheets().add(getClass().getResource("Viper.css").toExternalForm());
        window.setResizable(false);
        window.setScene(patientScene);
        window.setTitle("Patient");
        window.show();

    }


    public void setButtons() {
        /////////////////// Buttons Stage Patient///////////////////////////////////////////////////////
        btn_patient_1 = new Button("New Patient");
        btn_patient_1.setOnAction(e -> window.setScene(patientScene));

        btn_procedure_1 = new Button("Procedures");
        btn_procedure_1.setOnAction(e -> window.setScene(procedureScene));

        btn_payment_1 = new Button("Payments");
        btn_payment_1.setOnAction(e -> window.setScene(paymentScene));

        /////////////////// Buttons Stage Patient///////////////////////////////////////////////////////
        btn_patient_2 = new Button("New Patient");
        btn_patient_2.setOnAction(e -> window.setScene(patientScene));

        btn_procedure_2 = new Button("Procedures");
        btn_procedure_2.setOnAction(e -> window.setScene(procedureScene));

        btn_payment_2 = new Button("Payments");
        btn_payment_2.setOnAction(e -> window.setScene(paymentScene));

        /////////////////// Buttons Stage Patient///////////////////////////////////////////////////////
        btn_patient_3 = new Button("New Patient");
        btn_patient_3.setOnAction(e -> window.setScene(patientScene));

        btn_procedure_3 = new Button("Procedures");
        btn_procedure_3.setOnAction(e -> window.setScene(procedureScene));

        btn_payment_3 = new Button("Payments");
        btn_payment_3.setOnAction(e -> window.setScene(paymentScene));
    }

    public static void main(String[] args) {
        launch(args);


    }

    class MenuButtonHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {

        }
    }

}


