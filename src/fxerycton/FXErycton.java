/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fxerycton;

import fxerycton.Bean.RoofBean;
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
        root.setStyle("-fx-background-color: #E9967A;");
        
        Scene scene = new Scene(root);
        
        stage.setTitle("FXErcycton v0.0.1");
	stage.setResizable(false);
//	stage.getIcons().add(new Image("201-f.png"));
        
        stage.setScene(scene);
        stage.show();
        RoofBean.setBattleType("single");
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
