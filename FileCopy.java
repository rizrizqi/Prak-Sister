/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DataStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author Rizqi
 */
public class FileCopy {
     public static void main(String[] args) throws FileNotFoundException, IOException {

        File file = new File("d:/oke.txt");
            if(!file.exists()){
                file.createNewFile();
            }
        OutputStream out = new FileOutputStream(file);
        InputStream in = new FileInputStream("d:/document.txt");
        int data = in.read();
        while(data!=-1){
            out.write(data);
            data = in.read();
        }
        out.flush();
        out.close();
        in.close();
    }

}
