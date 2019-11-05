import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;

public class cube extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){
        // Constants for the scene size
        final double SCENE_WIDTH = 320.0;
        final double SCENE_HEIGHT = 240.0;
		Line line1 = new Line(100,100,150,100);
		Line line2 = new Line(100,100,100,150);
		Line line3 = new Line(100,150,150,150);
		Line line4 = new Line(150,150,150,100);

		final int offset = -25;

		Line line5 = new Line(100-offset,100-offset,150-offset,100-offset);
		Line line6 = new Line(100-offset,100-offset,100-offset,150-offset);
		Line line7 = new Line(100-offset,150-offset,150-offset,150-offset);
		Line line8 = new Line(150-offset,150-offset,150-offset,100-offset);

		Line line9 = new Line(100,100,100-offset,100-offset);
		Line line10 = new Line(100,150,100-offset,150-offset);
		Line line11 = new Line(150,100,150-offset,100-offset);
		Line line12 = new Line(150,150,150-offset,150-offset);

		Pane pane = new Pane(line1, line2, line3, line4, line5, line6, line7, line8, line9, line10, line11, line12);
		Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
	    primaryStage.setScene(scene);
	    primaryStage.show();

    }
}