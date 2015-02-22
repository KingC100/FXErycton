package fxerycton;

import fxerycton.Bean.RoofBean;
import fxerycton.Import.ReadContents;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author kiichi
 */
public class FXErycton extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXErycton.fxml"));
        // 背景色設定
        root.setStyle("-fx-background-color: #E9967A;");

        Scene scene = new Scene(root);

        // アイコンセット
        ReadContents rc = new ReadContents();
        stage.getIcons().add(new Image((getClass().getResource("FXErycton.ico").toString())));
        // タイトルセット
        stage.setTitle("FXErcycton v0.0.1");
        // ウィンドウサイズ固定
        stage.setResizable(false);

        stage.setScene(scene);
        stage.show();
        // 標準でシングルバトル仕様
        RoofBean.setBattleType("single");
    }

    public static void main(String[] args) {
        launch(args);
    }

}
