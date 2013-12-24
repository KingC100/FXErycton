/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fxerycton.Export;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import fxerycton.AppUtil.Utility;
import fxercton.AppUtil.Const;
import fxerycton.Bean.RoofBean;

/**
 *
 * @author kiichi
 */
public class ExportResult {
    
    /***
     * result.txt出力処理
     * @param rb
     * @return 
     */
    public boolean ResultExport(RoofBean rb) {
        
        try{
            Utility utl = new Utility();
            /*
            export
                └─yyyymmdd
                    ├─double
                    └─single
            */
            
            String export_Path = "." + Const.fs + "export" + Const.fs;
            String[] ymd = utl.getDate();
            String fileName = "result.txt";
            String battle_Type = RoofBean.getBattleType();
            File dir = new File(export_Path + ymd[0] + ymd[1] + ymd[2] + Const.fs + battle_Type + Const.fs);
            File file = new File(dir + Const.fs + fileName);
            
            if (!(dir.exists())){
                dir.mkdirs();   
            }
            
            file.createNewFile();
            
            FileOutputStream fos = new FileOutputStream(file,true);
            try (OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8")) {
                file.createNewFile();
                osw.write(Create_Sentence());
            }
            return true;
        }catch(IOException e){
            return false;
        }
    }
    	/***
	 * 出力内容の作成.
	 * @param orFirst - ファイルが既存か
	 * @param roofBean - 入力内容
	 * @param type - 対戦種別
	 * @return
	 */
	public String Create_Sentence(){
                Utility utl = new Utility();
		String str = new String();
		StringBuilder sb = new StringBuilder();
                String sps = " ";
		String kaigyo = "\n";
		String dt[] = utl.getDate();

		// 入力データの書き込み.
		
		// 日時
		sb.append("時刻：").append(dt[0]).append("/").append(dt[1]).append("/").append(dt[2]).append("_").append(dt[3]).append(":").append(dt[4]).append(":").append(dt[5]);
		sb.append(kaigyo);
		sb.append("相手名：").append(RoofBean.getRivalName());
		sb.append( kaigyo );
		sb.append("対戦種別：").append(RoofBean.getBattleType());
		sb.append( kaigyo );
		sb.append("レート(対戦数)：").append(RoofBean.getRateRecord());
		sb.append( kaigyo );
		sb.append("対戦結果：").append(RoofBean.getResult());
		sb.append( kaigyo );
		sb.append( kaigyo );
		sb.append("【見せ合い】");
		sb.append( kaigyo );
		sb.append("自分１：").append(RoofBean.getOwn_1());
		sb.append( kaigyo );
		sb.append("自分２：").append(RoofBean.getOwn_2());
		sb.append( kaigyo );
		sb.append("自分３：").append(RoofBean.getOwn_3());
		sb.append( kaigyo );
		sb.append("自分４：").append(RoofBean.getOwn_4());
		sb.append( kaigyo );
		sb.append("自分５：").append(RoofBean.getOwn_5());
		sb.append( kaigyo );
		sb.append("自分６：").append(RoofBean.getOwn_6());
		sb.append( kaigyo );
		sb.append("相手１：").append(RoofBean.getRival_1());
		sb.append( kaigyo );
		sb.append("相手２：").append(RoofBean.getRival_2());
		sb.append( kaigyo );
		sb.append("相手３：").append(RoofBean.getRival_3());
		sb.append( kaigyo );
		sb.append("相手４：").append(RoofBean.getRival_4());
		sb.append( kaigyo );
		sb.append("相手５：").append(RoofBean.getRival_5());
		sb.append( kaigyo );
		sb.append("相手６：").append(RoofBean.getRival_6());
		sb.append( kaigyo );
		sb.append( kaigyo );
		sb.append("【選出】");
		sb.append( kaigyo );
		sb.append("自分１：").append(RoofBean.getElect_own_1());
		sb.append( kaigyo );
		sb.append("自分２：").append(RoofBean.getElect_own_2());
		sb.append( kaigyo );
		sb.append("自分３：").append(RoofBean.getElect_own_3());
		sb.append( kaigyo );
		sb.append("自分４：").append(RoofBean.getElect_own_4());
		sb.append( kaigyo );
		sb.append( kaigyo );
		sb.append("相手１：").append(RoofBean.getElect_rival_1());
		sb.append( kaigyo );
		sb.append("相手２：").append(RoofBean.getElect_rival_2());
		sb.append( kaigyo );
		sb.append("相手３：").append(RoofBean.getElect_rival_3());
		sb.append( kaigyo );
		sb.append("相手４：").append(RoofBean.getElect_rival_4());
		sb.append( kaigyo );
				
		sb.append("------------------------------------------");
		sb.append( kaigyo );

		str = sb.toString();

		return str;
	}
}
