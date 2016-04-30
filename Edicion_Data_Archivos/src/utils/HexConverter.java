/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

/**
 *
 * @author Pablo
 */
public class HexConverter {
    
    private StringBuilder sbResult = new StringBuilder();
    
    HexConverter(PrintStream out, /*File file*/ StringBuilder original) throws IOException {
        //InputStream is = new FileInputStream(file);

        int bytesCounter = 0;
        int value = 0;
        StringBuilder sbHex = new StringBuilder();
        StringBuilder sbText = new StringBuilder();

        //while ((value = is.read()) != -1) {
        for(int i = 0; i < original.toString().length(); i++) {
            //convert to hex value with "X" formatter
            sbHex.append(String.format("%02X ", (int)(original.toString().charAt(i))));

            //If the chracater is not convertable, just print a dot symbol "." 
            if (!Character.isISOControl(value)) {
                sbText.append((char) value);
            } 
            //else {
            //    sbText.append(".");
            //}

            //if 16 bytes are read, reset the counter, 
            //clear the StringBuilder for formatting purpose only.
            if (bytesCounter == 15) {
                sbResult.append(sbHex).append("\n");//.append("      ").append(sbText).append("\n");
                sbHex.setLength(0);
                sbText.setLength(0);
                bytesCounter = 0;
            } else {
                bytesCounter++;
            }
        }

        //if still got content
        if (bytesCounter != 0) {
            //add spaces more formatting purpose only
            for (; bytesCounter < 16; bytesCounter++) {
                //1 character 3 spaces
                sbHex.append("   ");
            }
            sbResult.append(sbHex).append("      ").append(sbText).append("\n");
        }

        //out.print(sbResult);
        //is.close();
    }
    
    public StringBuilder getResult() {
        return this.sbResult;
    }
}
