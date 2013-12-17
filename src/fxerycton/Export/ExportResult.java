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

/**
 *
 * @author kiichi
 */
public class ExportResult {
    
    public boolean ResultExport() {
        String file_Name;
        String dir_Path = ".\\"; 
        
        try{
            File file = new File(".\\export\\erycton.txt");
            
            FileOutputStream fos = new FileOutputStream(file,true);
            OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8"); // UTF-8.
            
            file.createNewFile();
            
            osw.write("ドーモ、トレーナー=サン。");
            
            osw.close();
            

        
            return true;
        }catch(IOException e){
            e.printStackTrace();
            return false;
        }
    }
}
