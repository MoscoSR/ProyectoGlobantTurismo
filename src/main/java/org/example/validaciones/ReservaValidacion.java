
package org.example.validaciones;
import org.example.utilidades.Util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class ReservaValidacion {

        Util util = new Util();
    public  Boolean validarFecha(String fecha) throws Exception {
        String expRegular = "^(0[1-9]|[12][0-9]|3[01])-?(0[1-9]|1[0-2])-?\\\\d{4}$";
        if (fecha == null) {
            throw  new Exception("La fecha esta nula");
        }
        if(!util.buscarCoincidencia(fecha, expRegular)) {
            throw  new Exception("No es el formato correspondiente");
        }
        return true;
    }

    public boolean validarNumPersonas(Integer numPersonas) throws  Exception {
        if(numPersonas !=4) {
            throw  new Exception("El numero de personas por reserva no puede ser mayor a 4");
        }
        return   true;
    }

}
