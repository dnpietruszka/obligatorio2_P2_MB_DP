/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FechaUtils {

    public static String getFechaActual(String formato){
        SimpleDateFormat format = new SimpleDateFormat(formato);
        Date fecha_actual = Calendar.getInstance().getTime();
        return format.format(fecha_actual);
        
    }
}
