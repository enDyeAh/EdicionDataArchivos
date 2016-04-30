/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author J
 */
public class Archivo {
    
    public Archivo(){}
    
    public String LeeAchivo(String path)
    {
        String codigo = new String(); 

        FileReader fr = null;
        BufferedReader entrada = null;
        try {
                fr = new FileReader(path);
                entrada = new BufferedReader(fr);

                while(entrada.ready()){
                        codigo += entrada.readLine();
                }

        }
        catch(IOException e) 
        {
                e.printStackTrace();
        }
        finally
        {
            try
            {                    
                if(null != fr){   
                        fr.close();     
                }                  
            }catch (Exception e2){ 
                    e2.printStackTrace();
            }
        }
        return codigo;
    }
    
    public Boolean CreaArchivo(String path, String data)
    {
        Boolean flujo = false;
        FileWriter fw = null;
        FileReader fr = null;
         try
         {
            //Abro stream, crea el fichero si no existe
            fw = new FileWriter(path);
            //Escribimos en el fichero un String y un caracter 97 (a)
            fw.write(data);
            //fw.write(97);//escribe ascii
            //Cierro el stream
            fw.close(); 
            //Abro el stream, el fichero debe existir
            fr = new FileReader(path);
            //Leemos el fichero y lo mostramos por pantalla
            int valor=fr.read();
            while(valor!=-1)
            {
                System.out.print((char)valor);
                valor=fr.read();
            }
            //Cerramos el stream
            fr.close(); 
            flujo = true;
        }
        catch(IOException e)
        {
            System.out.println("Error E/S: " + e);
        }
         return flujo;
    }
}
