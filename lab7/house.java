import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;

public class house extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){
        // Constants for the scene size
        final double SCENE_WIDTH = 320.0;
        final double SCENE_HEIGHT = 240.0;
		final int offset = 50;

		Rectangle rectangle = new Rectangle(100,100,50,50);
		Rectangle window1 = new Rectangle(135,125,10,10);
		Rectangle door = new Rectangle(120,125,10,25);

		Line roof1 = new Line(100, 100, 125, 75);
		Line roof2 = new Line(125, 75, 150, 100);
		rectangle.setFill(Color.GREEN);





		Pane pane = new Pane(rectangle, window1, door, roof1, roof2);

		Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
	    primaryStage.setScene(scene);
	    primaryStage.show();

    }
}