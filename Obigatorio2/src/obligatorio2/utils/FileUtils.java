/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2.utils;

import java.io.File;

/**
 *
 * @author diego
 */
public class FileUtils {
    public static boolean deleteFile(String pathFile){
        return (new File(pathFile)).delete();
    }
}
