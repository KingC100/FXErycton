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
public class LovelyMyAngelAyase {
    
    public void HayamiSaori(){
        try {
            URL url_Ayase = new URL("https://www.google.co.jp/search?q=%E6%96%B0%E5%9E%A3%E3%81%82%E3%82%84%E3%81%9B&lr=lang_ja&safe=off&hl=ja&tbs=lr:lang_1ja&source=lnms&tbm=isch&sa=X&ei=uaSxUs21MoSlkQXNmICABA&sqi=2&ved=0CAcQ_AUoAQ&biw=1422&bih=760&dpr=0.9");
            Desktop.getDesktop().browse(url_Ayase.toURI());
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(LovelyMyAngelAyase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
