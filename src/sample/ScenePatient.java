package sample;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class ScenePatient {

    private Rectangle scene;

    public ScenePatient() {
    scene = new Rectangle(500,500);
    scene.setFill(Color.BLACK);
    }
    public Rectangle getScene(){return this.scene;}




}
