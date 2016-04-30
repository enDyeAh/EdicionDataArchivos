/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edicion_data_archivos;

import utils.StringEncrypt;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author J
 */
public class VolcadoUnidad {
    
    //String pathFile = "C:\\Users\\J\\Desktop\\fichero1.txt";
    
    public VolcadoUnidad(){}
    
    public void Volcar(String pathFile, String key){
        try{
            Path path = Paths.get(pathFile);
            byte[] data = Files.readAllBytes(path);
            System.out.println("ok");            
            StringEncrypt objEncrypt = new StringEncrypt();            
            //String key = "92AE31A79FEEB2A3"; //llave
            String iv = "0123456789ABCDEF"; // vector de inicialización
            //String cleartext = "hola";        
            try{
                String dataEncrypt = objEncrypt.encrypt(key, iv, data);
                String dataDecrypt = objEncrypt.decrypt(key, iv,objEncrypt.encrypt(key, iv, data));                
                System.out.println("Texto encriptado: " + dataEncrypt);
                System.out.println("Texto desencriptado: " + dataDecrypt);
                
                Date fecha = new Date ();
                DateFormat hourdateFormat = new SimpleDateFormat("HHmmss_ddMMyyyy");
                CreaArchivo("C:\\DocumentosEncriptados\\Doc_Encrypt" + hourdateFormat.format(fecha)  + ".txt", dataEncrypt);
                
            }catch(Exception e){
                System.out.println("Error encrypt/decrypt: " + e.getMessage());
            }  
        }catch(Exception e){
            System.out.println("Error path: " + e.getMessage());
        }
    }
    
    public void CreaArchivo(String path, String data){
         try{
            //Abro stream, crea el fichero si no existe
            FileWriter fw = new FileWriter(path);
            //Escribimos en el fichero un String y un caracter 97 (a)
            fw.write(data);
            //fw.write(97);//escribe ascii
            //Cierro el stream
            fw.close(); 
                //Abro el stream, el fichero debe existir
            FileReader fr=new FileReader(path);
            //Leemos el fichero y lo mostramos por pantalla
            int valor=fr.read();
            while(valor!=-1){
                System.out.print((char)valor);
                valor=fr.read();
            }
            //Cerramos el stream
            fr.close();
        }catch(IOException e){
            System.out.println("Error E/S: "+e);
        }
    }
}
