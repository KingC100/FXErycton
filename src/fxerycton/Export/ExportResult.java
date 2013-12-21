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
import fxerycton.Bean.RoofBean;

/**
 *
 * @author kiichi
 */
public class ExportResult {
    
    public boolean ResultExport(RoofBean rb) {
        String file_Name;
        String dir_Path = ".\\"; 
        
        try{
            Utility utl = new Utility();
            /*
            export
                └─yyyymmdd
                    ├─double
                    └─single
            */
            
            
            String export_Path = ".\\export\\";
            String[] ymd = utl.getDate();
            String fileName = "result.txt";
            String battle_Type = "single";
            File dir = new File(export_Path + ymd[0] + ymd[1] + ymd[2] + "\\" + battle_Type + "\\");
            File file = new File(dir + "\\" + fileName);
            
            if (!(dir.exists())){
                dir.mkdirs();   
            }
            
            file.createNewFile();
            
            FileOutputStream fos = new FileOutputStream(file,true);
            OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8"); // UTF-8.
            
            file.createNewFile();
            osw.write(Create_Sentence());
            
            osw.close();
        
            return true;
        }catch(IOException e){
            e.printStackTrace();
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
		String str = null;
		StringBuilder sb = new StringBuilder();
                String sps = " ";
		// 入力データの書き込み.
		sb.append(RoofBean.getBattleType());
		sb.append( sps );
		sb.append(RoofBean.getRateRecord());
		sb.append( sps );

		sb.append(RoofBean.getRival_1());
		sb.append( sps );
		sb.append(RoofBean.getRival_2());
		sb.append( sps );
		sb.append(RoofBean.getRival_3());
		sb.append( sps );
		sb.append(RoofBean.getRival_4());
		sb.append( sps );
		sb.append(RoofBean.getRival_5());
		sb.append( sps );
		sb.append(RoofBean.getRival_6());
		sb.append( sps );

		sb.append(RoofBean.getElect_own_1());
		sb.append( sps );
		sb.append(RoofBean.getElect_own_2());
		sb.append( sps );
		sb.append(RoofBean.getElect_own_3());
		sb.append( sps );
		
		sb.append(RoofBean.getElect_own_4());
		sb.append( sps );
		
		sb.append(RoofBean.getElect_rival_1());
		sb.append( sps );
		sb.append(RoofBean.getElect_rival_2());
		sb.append( sps );
		sb.append(RoofBean.getElect_rival_3());
		sb.append( sps );

		sb.append(RoofBean.getElect_rival_4());
		sb.append( sps );

                String dt[] = utl.getDate();
		sb.append(dt[0]).append(dt[1]).append(dt[2]);

		// 区切り線(-----)

		str = sb.toString();

		return str;
	}
}
