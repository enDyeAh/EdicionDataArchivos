/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pablo
 */
public class ManejoArchivo {

    public StringBuilder[] Abrir(Path path, String funcion) {
        StringBuilder original   = new StringBuilder();
        StringBuilder convertido = new StringBuilder();

        String line = null;
        Charset charset = Charset.forName("UTF-8");//Charset.forName("US-ASCII");
        int contador = 0;
        try (BufferedReader reader = Files.newBufferedReader(path, charset)) {
            while ((line = reader.readLine()) != null) {
                if(++contador == 15) {
                    original.append(line).append("\n");
                    contador = 0;
                }
                else
                    original.append(line);
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }

        if (funcion.equalsIgnoreCase("hex")) {
            convertido = this.toHex(original);
        }
        if (funcion.equalsIgnoreCase("bin")) {
            convertido = new StringBuilder(this.toBin(original));
        } else {
            convertido.append("");
        }

        StringBuilder[] resultado = {original, convertido};

        return resultado;
    }

    private StringBuilder toHex(/*File archivo*/ StringBuilder original) {
        try {
            HexConverter hc = new HexConverter(System.out, original);
            
            return hc.getResult();
        } catch (IOException ex) {
            Logger.getLogger(ManejoArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return null;
    }

    private String toBin(/*Path path*/ StringBuilder original) {
        StringBuilder hex = new StringBuilder();
        
        try {
            //hex = this.toHex(path.toFile());
            hex = this.toHex(original);
            
            String[] hex_chars = hex.toString().replace("\n", "").split(" ");
            String binary      = "";
            
            for(int i = 0; i < hex_chars.length; i++) {
                
                //System.out.println(hex_chars[i]);
                
                if(!hex_chars[i].isEmpty())
                    binary += new BigInteger(hex_chars[i], 16).toString(2) + " ";
                if(i % 5 == 0 && i != 0)
                    binary += "\n";
            }
            
            return binary;
        } catch (Exception ex) {
            Logger.getLogger(ManejoArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }

        return "";
    }
}
