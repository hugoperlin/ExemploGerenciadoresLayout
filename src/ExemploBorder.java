import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class ExemploBorder extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {

        //cria um container de regiões
        BorderPane root = new BorderPane();

        //ajusta a cor de fundo para o container
        root.setStyle("-fx-background-color: gray;");

        //cria um componente pane, que é um tipo de container básico que conterá um Label
        Pane pane1 = new Pane(new Label("Top"));
        //ajusta a cor de componente para vermelha
        pane1.setStyle("-fx-background-color: red");
        //coloca o tamanho do componente para o máximo possível
        pane1.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        //insere o componente na regição do topo
        root.setTop(pane1);


        //note que o código se repete para as 5 regiões,
        //mudando o texto do Label, a cor do pane e a região a ser inserida

        Pane pane2 = new Pane(new Label("Bottom"));
        pane2.setStyle("-fx-background-color: green");

        pane2.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);

        root.setBottom(pane2);


        Pane pane3 = new Pane(new Label("Rigth"));
        pane3.setStyle("-fx-background-color: yellow");

        pane3.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);

        root.setRight(pane3);


        Pane pane4 = new Pane(new Label("Left"));
        pane4.setStyle("-fx-background-color: blue");

        pane4.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);

        root.setLeft(pane4);


        Pane pane5 = new Pane(new Label("Center"));
        pane5.setStyle("-fx-background-color: white");

        pane5.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);

        root.setCenter(pane5);


        Scene scene = new Scene(root,800,600);

        stage.setScene(scene);
        stage.show();



    }
}
