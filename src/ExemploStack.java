import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class ExemploStack extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {

        //criamos um stackpane, que irá permitir empilharmos
        //componentes
        StackPane root = new StackPane();

        //criamos três Rectangles, de tamanhos diferentes
        //e inserimos no container. Note que os componentes
        //irão aparecer um em cima do outro.

        Rectangle maior = new Rectangle(300,300);
        maior.setFill(Color.BLUE);
        root.getChildren().add(maior);

        Rectangle medio = new Rectangle(150,150);
        medio.setFill(Color.GREEN);
        root.getChildren().add(medio);

        Rectangle menor = new Rectangle(50,50);
        menor.setFill(Color.YELLOW);
        root.getChildren().add(menor);


        Scene scene = new Scene(root,800,600);

        stage.setScene(scene);
        stage.show();

    }
}
