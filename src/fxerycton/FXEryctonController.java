/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fxerycton;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author kiichi
 */
public class FXEryctonController implements Initializable {
    
    /**
     * Control-ID.
     */
    
    // Label.
    @FXML Label lbl_Own;    
    @FXML Label lbl_Rival;
    @FXML Label lbl_Rival_Name;
    @FXML Label lbl_Elect_Own;
    @FXML Label lbl_Elect_Rival;
    @FXML Label lbl_RateRecord;
    @FXML Label lbl_MessageArea;
    
    // TextField.
    @FXML TextField txb_Own_1;
    @FXML TextField txb_Own_2;
    @FXML TextField txb_Own_3;
    @FXML TextField txb_Own_4;
    @FXML TextField txb_Own_5;
    @FXML TextField txb_Own_6;
    @FXML TextField txb_Rival_1;
    @FXML TextField txb_Rival_2;
    @FXML TextField txb_Rival_3;
    @FXML TextField txb_Rival_4;
    @FXML TextField txb_Rival_5;
    @FXML TextField txb_Rival_6;
    @FXML TextField txb_Elect_Own_1;
    @FXML TextField txb_Elect_Own_2;
    @FXML TextField txb_Elect_Own_3;
    @FXML TextField txb_Elect_Own_4;
    @FXML TextField txb_Elect_Rival_1;
    @FXML TextField txb_Elect_Rival_2;
    @FXML TextField txb_Elect_Rival_3;
    @FXML TextField txb_Elect_Rival_4;
    @FXML TextField txb_Rival_Name;
    @FXML TextField txb_Rival_RateRecord;
    
    // ImageView.
    @FXML ImageView img_Own_1;
    @FXML ImageView img_Own_2;
    @FXML ImageView img_Own_3;
    @FXML ImageView img_Own_4;
    @FXML ImageView img_Own_5;
    @FXML ImageView img_Own_6;
    @FXML ImageView img_Rival_1;
    @FXML ImageView img_Rival_2;
    @FXML ImageView img_Rival_3;
    @FXML ImageView img_Rival_4;
    @FXML ImageView img_Rival_5;
    @FXML ImageView img_Rival_6;
    @FXML ImageView img_Elect_Own_1;
    @FXML ImageView img_Elect_Own_2;
    @FXML ImageView img_Elect_Own_3;
    @FXML ImageView img_Elect_Own_4;
    @FXML ImageView img_Elect_Rival_1;
    @FXML ImageView img_Elect_Rival_2;
    @FXML ImageView img_Elect_Rival_3;
    @FXML ImageView img_Elect_Rival_4;
   
    // RadioButton.
    @FXML RadioButton rdb_Result_Win;
    @FXML RadioButton rdb_Result_Lose;
    @FXML RadioButton rdb_Result_Cut;
    
    
    /* test. */
    @FXML
    private void OnAction(ActionEvent event) {
            Image img = new Image("C:\\Users\\kiichi\\Documents\\NetBeansProjects\\FXErycton\\src\\fxerycton\\img\\133.png");
            img_Own_1.setImage(img);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
