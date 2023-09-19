package org.example.utilidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {
    public Boolean buscarCoincidencia (String nombre, String expresionRegular) {
        /*Esto se hace por si coinciden dos codigos*/
        Pattern pattern = Pattern.compile(expresionRegular);
        Matcher matcher = pattern.matcher(nombre);
        if(matcher.matches()) {
            return  true;
        } else {
            return  false;
        }
    }
    public LocalDate convertirStringEnLocalDate(String fecha){
        DateTimeFormatter formatear = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate nuevaFecha = LocalDate.parse(fecha,formatear);
        return nuevaFecha;
    }

}
