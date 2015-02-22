package fxerycton.AppUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author kiichi
 */
public class Utility {
    /***
     * nullチェック
     * @param str - 判定する文字列.
     * @return bl - nullの場合false.
     */
    public boolean isNull(String str) {
	boolean bl = false;
        bl = !(str.equals("null") || str.equals("") || str.equals(" "));
	return bl;
}
    
    /***
    * 日付の項目を取得
    * @return  res - 日時等
    */
    public String[] getDate(){
             
    // 現在時刻でDateオブジェクト作成.
    Date now = new Date(System.currentTimeMillis());
    // 年/月/日/時/分/秒/曜日のフォーマット作成.
    SimpleDateFormat sdf_now = new SimpleDateFormat("yyyy/MM/dd/HH/mm/ss");
    // Date → フォーマットに嵌める → toString() → "/"でsplitして格納. 
    String[] str_now = ((sdf_now.format(now)).split("/"));
    
    return str_now;
    }
}
