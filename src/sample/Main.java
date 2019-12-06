package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        CirclePane circlePane = new CirclePane();

        Button btLeft = new Button("Left");
        btLeft.setMinHeight(30);

        Button btRight = new Button("Right");
        btRight.setMinHeight(30);

        Button btUp = new Button("Up");
        btUp.setMinHeight(30);

        Button btDown = new Button("Down");
        btDown.setMinHeight(30);

        btLeft.setOnAction((ActionEvent) -> {
            circlePane.move(-10, 0);
        });

        btRight.setOnAction((ActionEvent) -> {
            circlePane.move(10, 0);
        });

        btUp.setOnAction((ActionEvent) -> {
            circlePane.move(0, -10);
        });

        btDown.setOnAction((ActionEvent) -> {
            circlePane.move(0, 10);
        });
        HBox hBox = new HBox();
        hBox.getChildren().addAll(btLeft, btRight, btUp, btDown);
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);

//        VBox vBox = new VBox();
//        vBox.setMinHeight(300);
//        vBox.getChildren().addAll(circlePane, hBox);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(circlePane);
        borderPane.setBottom(hBox);

        Scene scene = new Scene(borderPane, 200, 230);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
