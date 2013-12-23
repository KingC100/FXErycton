/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fxerycton.AppUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author kiichi
 */
public class Utility {
    
    public void MakeUp(String str[]){
	
	for (String s:str){
	    if (isNull(s)){
		// 存在する場合はtrue.
		s = "未入力";
		}
	}			
    }
    
    
    /***
    * nullチェック
    * @param str - 判定する文字列.
     * @return bl - nullの場合false.
     */
    public boolean isNull(String str) {
	boolean bl = false;
	if (str.equals("null") || str.equals("") || str.equals(" ")){
		bl = false;
	} else {
		bl = true;
	}
	
	return bl;
}
    
    /***
    * 日付の項目を取得
    * @param str[] - 取得する項目名
    * @return  res - 日時等
    */
    public String[] getDate(){
             
    // 現在時刻でDateオブジェクト作成.
    Date now = new Date(System.currentTimeMillis());
    // 年/月/日/時/分/秒/曜日のフォーマット作成.
    SimpleDateFormat sdf_now = new SimpleDateFormat("yyyy/MM/dd/HH/mm/ss");
    // Date → フォーマットに嵌める → toString() → "/"でsplitして格納. 
    String[] str_now = ((sdf_now.format(now)).toString().split("/"));
    
    return str_now;
    }
}
