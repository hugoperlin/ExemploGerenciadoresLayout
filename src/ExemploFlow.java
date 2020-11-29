import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class ExemploFlow extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {

        //cria um container de fluxo que irá organizar os componentes
        //da esquerda para a direita de cima para baixo. Insere os componentes
        //em uma linha até atingir o tamanho máximo da tela, então inicia uma nova linha.
        //Reorganiza os componentes de acordo com o tamanho da janela
        FlowPane root = new FlowPane();

        //ajusta a cor do container para cinza
        root.setStyle("-fx-background-color: gray;");

        //adiciona um espaço na horizontal entre os componentes
        root.setHgap(10);
        //adiciona um espaço na vertical entre os componentes
        root.setVgap(10);


        //cria 13 componentes e insere no container
        for(int i=0;i<13;i++){

            //criamos um retângulo de 50x50 pixels
            Rectangle rectangle = new Rectangle(50,50);

            //ajustamos a cor do retângulo para preta
            rectangle.setFill(Color.BLACK);

            //inserimos o componente no container
            root.getChildren().add(rectangle);
        }



        Scene scene = new Scene(root,800,600);

        stage.setScene(scene);
        stage.show();



    }
}
