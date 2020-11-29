import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;



public class ExemploVBox extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {

        //cria um VBox
        VBox root = new VBox();

        //ajusta o fundo para ser cinza
        root.setStyle("-fx-background-color: gray;");

        //ajusta o espaço entre os componentes para 10 pixesl
        root.setSpacing(10);

        //alinha o container para o centro da janela.
        //Importante: os componentes dentro do container seguirão este alinhamento
        root.setAlignment(Pos.CENTER);


        //como forma de demonstrar iremos criar 5 retângulos e adicionar ao container
        //os retêngulos são componentes visuais do JavaFX, mas poderiam ser quaisquer outros componentes (Label, Button, etc...)
        for(int i=0;i<5;i++){
            //cria um retângulo de 50x50 pixels
            Rectangle rectangle = new Rectangle(50,50);

            //ajusta a cor do retângulo para preta
            rectangle.setFill(Color.BLACK);

            //adiciona o retângulo ao container
            root.getChildren().add(rectangle);
        }


        //cria uma cena para exibir o container
        Scene scene = new Scene(root,200,200);

        //coloca a cena no palco
        stage.setScene(scene);

        //abre as cortinas
        stage.show();

    }
}
