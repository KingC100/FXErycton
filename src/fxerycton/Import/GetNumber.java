/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fxerycton.Import;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;

/**
 *
 * @author kiichi
 */
public class GetNumber {
    
    /**
     * 画面から名前もらう
     * -> RoofBeanに投げられる
     * -> GetNumberクラスで名前を受け取り、xmlを参照、
     * 引っかかった項目のNumberを取得、返す。
     */
    
    public static String ReadXml(String Name){
        String number = null;
        
        try {
               DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
               DocumentBuilder builder = factory.newDocumentBuilder();
     
               File f = new File("C:\\Users\\kiichi\\Documents\\NetBeansProjects\\FXErycton\\src\\fxerycton\\fxpk.xml");
               Document doc = builder.parse( f );
               Element root = doc.getDocumentElement();
               NodeList children = root.getChildNodes();
               
               for( int i=0; i<children.getLength(); i++ ) {
               
                    Node child = children.item(i);
                    
                    if( child instanceof Element ) {
                    
                         Element childElement = (Element) child;
                         
                           System.out.println( childElement.getTagName() );
                    
                    }
               }
               } catch (ParserConfigurationException | IOException | SAXException ex) {
                    Logger.getLogger(GetNumber.class.getName()).log(Level.SEVERE, null, ex);
            }
        return number;
    }
    
}
