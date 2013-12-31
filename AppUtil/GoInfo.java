/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fxerycton.AppUtil;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kiichi
 */
public class GoInfo {
    
    public void MottoZuttoDottoGit(){
            try {
	    // gitへ
            URL url_Ayase = new URL("https://github.com/KingC100/FXErycton");
            Desktop.getDesktop().browse(url_Ayase.toURI());
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(LovelyMyAngelAyase.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
}
