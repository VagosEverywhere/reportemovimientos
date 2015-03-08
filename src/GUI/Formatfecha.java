

package GUI;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Formatfecha {
    
    public static String convertir_a_string (Date fecha){
        DateFormat fs;
        String fechastring = "";
        
        fs = new SimpleDateFormat("dd/MM/yyyy");
        
        fechastring = fs.format(fecha);
        
        return fechastring;
    }
    public static Date convertir_a_date (String fecha){
        DateFormat fd;
        Date fechadate = null;
        
        fd = new SimpleDateFormat ("dd/MM/yyyy");
            
        try {
            
            fechadate = fd.parse(fecha);
            
        } catch (ParseException ex) {
            Logger.getLogger(Formatfecha.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return fechadate;
    }
}
