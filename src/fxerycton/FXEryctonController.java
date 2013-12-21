/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fxerycton;


import fxerycton.AppUtil.LovelyMyAngelAyase;
import fxerycton.AppUtil.Utility;
import fxerycton.Bean.RoofBean;
import fxerycton.Export.ExportResult;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;

/**
 *
 * @author kiichi
 */
public class FXEryctonController implements Initializable {
    
    /**
     * Containers-ID.
     */
    
    // Menu.
    @FXML MenuBar menuBar;
    @FXML Menu men_Menu;
    @FXML MenuItem mei_Ayase;
    @FXML MenuItem mei_AllClear;
    @FXML MenuItem mei_Exit;
    @FXML Menu men_BattleType;
    @FXML RadioMenuItem rmi_Single;
    @FXML RadioMenuItem rmi_Double;
    @FXML Menu men_Help;
    @FXML MenuItem mei_VersionInfo;
        
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
    
    // Button.
    @FXML Button btn_Enter;
    
    RoofBean rb = new RoofBean();
    
    @FXML
    public void OnEntered(ActionEvent event){
        
        /***
         * EnterProcess実行
         */
        
        Utility utl = new Utility();
        
        ExportResult er = new ExportResult();
        
        RoofBean.setOwn_1(txb_Own_1.getText());
        RoofBean.setOwn_2(txb_Own_2.getText());
        RoofBean.setOwn_3(txb_Own_3.getText());
        RoofBean.setOwn_4(txb_Own_4.getText());
        RoofBean.setOwn_5(txb_Own_5.getText());
        RoofBean.setOwn_6(txb_Own_6.getText());
        RoofBean.setRival_1(txb_Rival_1.getText());
        RoofBean.setRival_2(txb_Rival_2.getText());
        RoofBean.setRival_3(txb_Rival_3.getText());
        RoofBean.setRival_4(txb_Rival_4.getText());
        RoofBean.setRival_5(txb_Rival_5.getText());
        RoofBean.setRival_6(txb_Rival_6 .getText());
        RoofBean.setElect_own_1(txb_Elect_Own_1.getText());
        RoofBean.setElect_own_2(txb_Elect_Own_2.getText());
        RoofBean.setElect_own_3(txb_Elect_Own_3.getText());
        RoofBean.setElect_own_4(txb_Elect_Own_4.getText());
        RoofBean.setElect_rival_1(txb_Elect_Rival_1.getText());
        RoofBean.setElect_rival_2(txb_Elect_Rival_2.getText());
        RoofBean.setElect_rival_3(txb_Elect_Rival_3.getText());
        RoofBean.setElect_rival_4(txb_Elect_Rival_4.getText());
        RoofBean.setRateRecord(txb_Rival_RateRecord.getText());
        RoofBean.setRivalName(txb_Rival_Name.getText());


        er.ResultExport(rb);
        
    }
    
    // 対戦種別判別.
    protected boolean default_BattleType(String bt){
        if (bt == null){
            return true;
        }
        return false;
    }
    
    
    
    @FXML
    public void Ayase(ActionEvent event){
        
           /**
            * ayase
            */
           LovelyMyAngelAyase ayase = new LovelyMyAngelAyase();
           ayase.HayamiSaori();
        
    }
    
    @FXML
    public void SelectedToSingleBattle(ActionEvent event){

            txb_Elect_Own_4.setDisable(true);
            txb_Elect_Rival_4.setDisable(true);
            
            rb.setBattleType("single");
        
    }
    
    @FXML
    public void SelectedToDoubleBattle(ActionEvent event){

            txb_Elect_Own_4.setDisable(false);
            txb_Elect_Rival_4.setDisable(false);
            
            rb.setBattleType("double");

    }
    
    @FXML
    public void FormClear(ActionEvent event){
        
        /**
         *  初期化処理書きたい。
         */
        
    }
    
    @FXML
    public void ounoun (ActionEvent event){
        txb_Own_1.setText("Own_1");
	txb_Own_2.setText("Own_2");
	txb_Own_3.setText("Own_3");
	txb_Own_4.setText("Own_4");
	txb_Own_5.setText("Own_5");
	txb_Own_6.setText("Own_6");
	txb_Rival_1.setText("Rival_1");
	txb_Rival_2.setText("Rival_2");
	txb_Rival_3.setText("Rival_3");
	txb_Rival_4.setText("Rival_4");
	txb_Rival_5.setText("Rival_5");
	txb_Rival_6.setText("Rival_6");
	txb_Elect_Own_1.setText("E_Own_1");
	txb_Elect_Own_2.setText("E_Own_2");
	txb_Elect_Own_3.setText("E_Own_3");
	txb_Elect_Own_4.setText("E_Own_4");
	txb_Elect_Rival_1.setText("E_Rival_1");
	txb_Elect_Rival_2.setText("E_Rival_2");
	txb_Elect_Rival_3.setText("E_Rival_3");
	txb_Elect_Rival_4.setText("E_Rival_4");
	txb_Rival_Name.setText("RivalName");
	txb_Rival_RateRecord.setText("rate.");
    }
    
    @FXML
    public void FormExit(ActionEvent event){
        
        Platform.exit();
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
