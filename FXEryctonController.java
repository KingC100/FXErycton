package fxerycton;

import fxerycton.AppUtil.GoInfo;
import fxerycton.AppUtil.LovelyMyAngelAyase;
import fxerycton.Bean.RoofBean;
import fxerycton.Export.ExportResult;
import fxerycton.Import.ReadContents;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;

/**
 * @author kiichi
 */
public class FXEryctonController implements Initializable {

    /**
     * Containers-ID.
     */
    // Menu.
    @FXML
    MenuBar menuBar;
    @FXML
    Menu men_Menu;
    @FXML
    MenuItem mei_Ayase;
    @FXML
    MenuItem mei_AllClear;
    @FXML
    MenuItem mei_Exit;
    @FXML
    Menu men_BattleType;
    @FXML
    RadioMenuItem rmi_Single;
    @FXML
    RadioMenuItem rmi_Double;
    @FXML
    Menu men_Help;
    @FXML
    MenuItem mei_VersionInfo;
    @FXML
    MenuItem mei_Input;

    // Label.
    @FXML
    Label lbl_Own;
    @FXML
    Label lbl_Rival;
    @FXML
    Label lbl_Rival_Name;
    @FXML
    Label lbl_Elect_Own;
    @FXML
    Label lbl_Elect_Rival;
    @FXML
    Label lbl_RateRecord;
    @FXML
    Label lbl_MessageArea;

    // TextField.
    @FXML
    TextField txb_Own_1;
    @FXML
    TextField txb_Own_2;
    @FXML
    TextField txb_Own_3;
    @FXML
    TextField txb_Own_4;
    @FXML
    TextField txb_Own_5;
    @FXML
    TextField txb_Own_6;
    @FXML
    TextField txb_Rival_1;
    @FXML
    TextField txb_Rival_2;
    @FXML
    TextField txb_Rival_3;
    @FXML
    TextField txb_Rival_4;
    @FXML
    TextField txb_Rival_5;
    @FXML
    TextField txb_Rival_6;
    @FXML
    TextField txb_Elect_Own_1;
    @FXML
    TextField txb_Elect_Own_2;
    @FXML
    TextField txb_Elect_Own_3;
    @FXML
    TextField txb_Elect_Own_4;
    @FXML
    TextField txb_Elect_Rival_1;
    @FXML
    TextField txb_Elect_Rival_2;
    @FXML
    TextField txb_Elect_Rival_3;
    @FXML
    TextField txb_Elect_Rival_4;
    @FXML
    TextField txb_Rival_Name;
    @FXML
    TextField txb_Rival_RateRecord;

    // ImageView.
    @FXML
    ImageView img_Own_1;
    @FXML
    ImageView img_Own_2;
    @FXML
    ImageView img_Own_3;
    @FXML
    ImageView img_Own_4;
    @FXML
    ImageView img_Own_5;
    @FXML
    ImageView img_Own_6;
    @FXML
    ImageView img_Rival_1;
    @FXML
    ImageView img_Rival_2;
    @FXML
    ImageView img_Rival_3;
    @FXML
    ImageView img_Rival_4;
    @FXML
    ImageView img_Rival_5;
    @FXML
    ImageView img_Rival_6;
    @FXML
    ImageView img_Elect_Own_1;
    @FXML
    ImageView img_Elect_Own_2;
    @FXML
    ImageView img_Elect_Own_3;
    @FXML
    ImageView img_Elect_Own_4;
    @FXML
    ImageView img_Elect_Rival_1;
    @FXML
    ImageView img_Elect_Rival_2;
    @FXML
    ImageView img_Elect_Rival_3;
    @FXML
    ImageView img_Elect_Rival_4;

    // RadioButton.
    @FXML
    RadioButton rdb_Result_Win;
    @FXML
    RadioButton rdb_Result_Lose;
    @FXML
    RadioButton rdb_Result_Cut;

    // Button.
    @FXML
    Button btn_Enter;

    RoofBean rb = new RoofBean();
    ReadContents rc = new ReadContents();
    ExportResult er = new ExportResult();

    /**
     * *
     * 空白(?)アイコンを表示
     *
     * @return emp
     */
    public Image GetEmptyImage() {
        Image emp = new Image((getClass().getResource(rc.GetPath("Empty"))).toString());
        return emp;
    }

    /**
     * *
     * 登録処理
     *
     * @param event
     */
    @FXML
    public void OnEntered(ActionEvent event) {
        // 画面項目をRoofBeanへセット
        ThrowResult();
        //画面各項目をリセット
        ResetForm();
        // ファイルへ出力
        er.ResultExport(rb);
    }

    /**
     * *
     * 画面項目をRoofBeanへセット
     */
    @FXML
    protected void ThrowResult() {
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
        RoofBean.setRival_6(txb_Rival_6.getText());
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
        RoofBean.setResult(getSelected());
    }

    /**
     * *
     * 画面項目リセット
     */
    @FXML
    protected void ResetForm() {
        // 自分見せ合い除いて画面項目をリセットする
        txb_Rival_1.setText("");
        txb_Rival_2.setText("");
        txb_Rival_3.setText("");
        txb_Rival_4.setText("");
        txb_Rival_5.setText("");
        txb_Rival_6.setText("");
        txb_Elect_Own_1.setText("");
        txb_Elect_Own_2.setText("");
        txb_Elect_Own_3.setText("");
        txb_Elect_Own_4.setText("");
        txb_Elect_Rival_1.setText("");
        txb_Elect_Rival_2.setText("");
        txb_Elect_Rival_3.setText("");
        txb_Elect_Rival_4.setText("");
        txb_Rival_Name.setText("");
        txb_Rival_RateRecord.setText("");

        img_Rival_1.setImage(GetEmptyImage());
        img_Rival_2.setImage(GetEmptyImage());
        img_Rival_3.setImage(GetEmptyImage());
        img_Rival_4.setImage(GetEmptyImage());
        img_Rival_5.setImage(GetEmptyImage());
        img_Rival_6.setImage(GetEmptyImage());
        img_Elect_Own_1.setImage(GetEmptyImage());
        img_Elect_Own_2.setImage(GetEmptyImage());
        img_Elect_Own_3.setImage(GetEmptyImage());
        img_Elect_Own_4.setImage(GetEmptyImage());
        img_Elect_Rival_1.setImage(GetEmptyImage());
        img_Elect_Rival_2.setImage(GetEmptyImage());
        img_Elect_Rival_3.setImage(GetEmptyImage());
        img_Elect_Rival_4.setImage(GetEmptyImage());
    }

    /**
     * *
     * 対戦結果をラジオボタンから取得する
     *
     * @return
     */
    @FXML
    protected String getSelected() {
        String battle_res = null;
        if (rdb_Result_Win.isSelected()) {
            battle_res = "win";
        } else if (rdb_Result_Lose.isSelected()) {
            battle_res = "lose";
        } else {
            battle_res = "cut";
        }
        return battle_res;
    }

    /**
     * *
     * ラブリーマイエンジェルあやせたん
     *
     * @param event
     */
    @FXML
    protected void Ayase(ActionEvent event) {
        LovelyMyAngelAyase ayase = new LovelyMyAngelAyase();
        ayase.HayamiSaori();
    }

    /**
     * *
     * 対戦種別変更(シングルへ)
     *
     * @param event
     */
    @FXML
    protected void SelectedToSingleBattle(ActionEvent event) {
        txb_Elect_Own_4.setDisable(true);
        txb_Elect_Rival_4.setDisable(true);
        RoofBean.setBattleType("single");
        txb_Elect_Own_4.setText("");
        txb_Elect_Rival_4.setText("");
        img_Elect_Own_4.setImage(GetEmptyImage());
        img_Elect_Rival_4.setImage(GetEmptyImage());
    }

    /**
     * *
     * バージョン情報
     *
     * @param event
     */
    @FXML
    protected void VersionInfo(ActionEvent event) {
        GoInfo gi = new GoInfo();
        gi.MottoZuttoDottoGit();
    }

    /**
     * *
     * 対戦種別変更(ダブルへ)
     *
     * @param event
     */
    @FXML
    protected void SelectedToDoubleBattle(ActionEvent event) {
        txb_Elect_Own_4.setDisable(false);
        txb_Elect_Rival_4.setDisable(false);
        RoofBean.setBattleType("double");
    }

    /**
     * *
     * デバッグ用文字入力イベント
     *
     * @param event
     */
    @FXML
    protected void ounoun(ActionEvent event) {
        txb_Own_1.setText("ヒトカゲ");
        txb_Own_2.setText("リザード");
        txb_Own_3.setText("リザードン");
        txb_Own_4.setText("フシギダネ");
        txb_Own_5.setText("フシギソウ");
        txb_Own_6.setText("フシギバナ");
        txb_Rival_1.setText("ゼニガメ");
        txb_Rival_2.setText("カメール");
        txb_Rival_3.setText("カメックス");
        txb_Rival_4.setText("チコリータ");
        txb_Rival_5.setText("ベイリーフ");
        txb_Rival_6.setText("メガニウム");
        txb_Elect_Own_1.setText("ヒノアラシ");
        txb_Elect_Own_2.setText("マグマラシ");
        txb_Elect_Own_3.setText("バクフーン");
        txb_Elect_Own_4.setText("グラードン");
        txb_Elect_Rival_1.setText("ワニノコ");
        txb_Elect_Rival_2.setText("アリゲイツ");
        txb_Elect_Rival_3.setText("オーダイル");
        txb_Elect_Rival_4.setText("カイオーガ");
        txb_Rival_Name.setText("我那覇響");
        txb_Rival_RateRecord.setText("1000");
    }

    /**
     * アプリケーション終了
     *
     * @param event
     */
    @FXML
    public void FormExit(ActionEvent event) {
        Platform.exit();
    }

    /**
     * *
     *          * アイコンの自動更新
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        txb_Own_1.textProperty().addListener((ObservableValue<? extends String> observableValue, String s, String s2) -> {
            Image img = new Image((getClass().getResource(rc.GetPath(txb_Own_1.getText()))).toString());
            img_Own_1.setImage(img);
        });
        txb_Own_2.textProperty().addListener((ObservableValue<? extends String> observableValue, String s, String s2) -> {
            Image img = new Image((getClass().getResource(rc.GetPath(txb_Own_2.getText()))).toString());
            img_Own_2.setImage(img);
        });
        txb_Own_3.textProperty().addListener((ObservableValue<? extends String> observableValue, String s, String s2) -> {
            Image img = new Image((getClass().getResource(rc.GetPath(txb_Own_3.getText()))).toString());
            img_Own_3.setImage(img);
        });
        txb_Own_4.textProperty().addListener((ObservableValue<? extends String> observableValue, String s, String s2) -> {
            Image img = new Image((getClass().getResource(rc.GetPath(txb_Own_4.getText()))).toString());
            img_Own_4.setImage(img);
        });
        txb_Own_5.textProperty().addListener((ObservableValue<? extends String> observableValue, String s, String s2) -> {
            Image img = new Image((getClass().getResource(rc.GetPath(txb_Own_5.getText()))).toString());
            img_Own_5.setImage(img);
        });
        txb_Own_6.textProperty().addListener((ObservableValue<? extends String> observableValue, String s, String s2) -> {
            Image img = new Image((getClass().getResource(rc.GetPath(txb_Own_6.getText()))).toString());
            img_Own_6.setImage(img);
        });
        txb_Rival_1.textProperty().addListener((ObservableValue<? extends String> observableValue, String s, String s2) -> {
            Image img = new Image((getClass().getResource(rc.GetPath(txb_Rival_1.getText()))).toString());
            img_Rival_1.setImage(img);
        });
        txb_Rival_2.textProperty().addListener((ObservableValue<? extends String> observableValue, String s, String s2) -> {
            Image img = new Image((getClass().getResource(rc.GetPath(txb_Rival_2.getText()))).toString());
            img_Rival_2.setImage(img);
        });
        txb_Rival_3.textProperty().addListener((ObservableValue<? extends String> observableValue, String s, String s2) -> {
            Image img = new Image((getClass().getResource(rc.GetPath(txb_Rival_3.getText()))).toString());
            img_Rival_3.setImage(img);
        });
        txb_Rival_4.textProperty().addListener((ObservableValue<? extends String> observableValue, String s, String s2) -> {
            Image img = new Image((getClass().getResource(rc.GetPath(txb_Rival_4.getText()))).toString());
            img_Rival_4.setImage(img);
        });
        txb_Rival_5.textProperty().addListener((ObservableValue<? extends String> observableValue, String s, String s2) -> {
            Image img = new Image((getClass().getResource(rc.GetPath(txb_Rival_5.getText()))).toString());
            img_Rival_5.setImage(img);
        });
        txb_Rival_6.textProperty().addListener((ObservableValue<? extends String> observableValue, String s, String s2) -> {
            Image img = new Image((getClass().getResource(rc.GetPath(txb_Rival_6.getText()))).toString());
            img_Rival_6.setImage(img);
        });
        txb_Elect_Rival_1.textProperty().addListener((ObservableValue<? extends String> observableValue, String s, String s2) -> {
            Image img = new Image((getClass().getResource(rc.GetPath(txb_Elect_Rival_1.getText()))).toString());
            img_Elect_Rival_1.setImage(img);
        });
        txb_Elect_Rival_2.textProperty().addListener((ObservableValue<? extends String> observableValue, String s, String s2) -> {
            Image img = new Image((getClass().getResource(rc.GetPath(txb_Elect_Rival_2.getText()))).toString());
            img_Elect_Rival_2.setImage(img);
        });
        txb_Elect_Rival_3.textProperty().addListener((ObservableValue<? extends String> observableValue, String s, String s2) -> {
            Image img = new Image((getClass().getResource(rc.GetPath(txb_Elect_Rival_3.getText()))).toString());
            img_Elect_Rival_3.setImage(img);
        });
        txb_Elect_Rival_4.textProperty().addListener((ObservableValue<? extends String> observableValue, String s, String s2) -> {
            Image img = new Image((getClass().getResource(rc.GetPath(txb_Elect_Rival_4.getText()))).toString());
            img_Elect_Rival_4.setImage(img);
        });
        txb_Elect_Own_1.textProperty().addListener((ObservableValue<? extends String> observableValue, String s, String s2) -> {
            Image img = new Image((getClass().getResource(rc.GetPath(txb_Elect_Own_1.getText()))).toString());
            img_Elect_Own_1.setImage(img);
        });
        txb_Elect_Own_2.textProperty().addListener((ObservableValue<? extends String> observableValue, String s, String s2) -> {
            Image img = new Image((getClass().getResource(rc.GetPath(txb_Elect_Own_2.getText()))).toString());
            img_Elect_Own_2.setImage(img);
        });
        txb_Elect_Own_3.textProperty().addListener((ObservableValue<? extends String> observableValue, String s, String s2) -> {
            Image img = new Image((getClass().getResource(rc.GetPath(txb_Elect_Own_3.getText()))).toString());
            img_Elect_Own_3.setImage(img);
        });
        txb_Elect_Own_4.textProperty().addListener((ObservableValue<? extends String> observableValue, String s, String s2) -> {
            Image img = new Image((getClass().getResource(rc.GetPath(txb_Elect_Own_4.getText()))).toString());
            img_Elect_Own_4.setImage(img);
        });

        /**
         * *
         * キーボードショートカット
         */
        // 対戦種別変更, シングル(Alt + S)
        this.rmi_Single.setAccelerator(new KeyCodeCombination(KeyCode.S, KeyCombination.ALT_DOWN, KeyCombination.SHORTCUT_ANY));
        // 対戦種別変更, ダブル(Alt + D)
        this.rmi_Double.setAccelerator(new KeyCodeCombination(KeyCode.D, KeyCombination.ALT_DOWN, KeyCombination.SHORTCUT_ANY));
        // 新垣あやせ(Alt + A)
        this.mei_Ayase.setAccelerator(new KeyCodeCombination(KeyCode.A, KeyCombination.ALT_DOWN, KeyCombination.SHORTCUT_ANY));
        // デバッグ用文字入力(Alt + I)
        this.mei_Input.setAccelerator(new KeyCodeCombination(KeyCode.I, KeyCombination.ALT_DOWN, KeyCombination.SHORTCUT_ANY));
    }
}
