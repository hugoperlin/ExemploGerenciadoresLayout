import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;




public class ExemploGrid extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {

        //Cria um GridPane que permite organizar os componentes
        //em linhas e colunas
        GridPane root = new GridPane();

        //ajusta a cor de fundo do container para cinza
        root.setStyle("-fx-background-color: gray;");

        //insere uma borda de 10 pixels ao redo do container
        root.setPadding(new Insets(10));
        //insere um espaço de 10 pixels na horizontal entre as células
        root.setHgap(10);
        //insere um espaço de 10 pixels na vertical entre as células
        root.setVgap(10);

        //alinha o container ao centro da janela. Os componentes dentro do
        //container seguirão o mesmo alinhamento
        root.setAlignment(Pos.CENTER);


        //iremos criar 10 componentes e organizá-los em duas colunas e cinco linhas
        for(int linha=0;linha<5;linha++){
            for(int coluna=0;coluna<2;coluna++){

                //criamos um retângulo de 50x50 pixels
                Rectangle rectangle = new Rectangle(50,50);

                //ajustamos a cor do retângulo para preta
                rectangle.setFill(Color.BLACK);

                //inserimos o componente no container. Note que é preciso
                //indicar a coluna e linha que o componente irá ocupar.
                root.add(rectangle,coluna,linha);
            }

        }


        //criamos uma cena para mostrar o container
        Scene scene = new Scene(root,800,600);

        //colocamos a cena no palco
        stage.setScene(scene);

        //abrimos as cortinas
        stage.show();



    }
}
