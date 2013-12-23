/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fxerycton.Import;

import fxerycton.Bean.RoofBean;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author kiichi
 */

public class ReadContents {

    /***
     * アイコンのパスを取得します
     * @param pName
     * @return 
     */
    public String GetPath(String pName){
	
	String xName = ReadXml(pName);
	
    	String icon_Path = "/Icons/" + xName +  ".png";
	
	return icon_Path; 
    }
    

    /***
     * xmlからポケモンの番号を取得します
     * @param pName
     * @return 
     */
    public static String ReadXml(String pName){
        
        String pNumber = null;
        DocumentBuilder builder;
        try {
                DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();

                builder = dbfactory.newDocumentBuilder();

                Document doc = builder.parse(
                            new FileInputStream("C:\\Users\\kiichi\\Documents\\NetBeansProjects\\FXErycton\\src\\fxerycton\\fxpk.xml"));
                Element root = doc.getDocumentElement();
                
                /**
                 * Nameで検索を掛け、
                 * 一致したノードのName取得
                 */
		
		Element item; 
                Element name;
		Element number;
		
		
		NodeList nodeList = root.getElementsByTagName("Pokemon");
		
		for (int i = 0; i < nodeList.getLength(); i++) {
                    item = (Element) root.getElementsByTagName("Pokemon").item(i);
            
                    name = (Element) item.getElementsByTagName("Name").item(0);
//                    System.out.println("Name:\"" + name.getTextContent() + "\"");
                            
                    number = (Element) item.getElementsByTagName("Number").item(0);
//                    System.out.println("Number:\"" + number.getTextContent() + "\"");
		    
		    if (pName.equals(name.getTextContent())){
			pNumber = number.getTextContent();
//			System.out.println("Match To :\"" + pName + "\"");
//			System.out.println("Match To :\"" + pName + "\"");
			break;
		    }
		    
                }

            } catch (ParserConfigurationException | SAXException | IOException ex) {
                Logger.getLogger(ReadContents.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pNumber;
    }
    
}
