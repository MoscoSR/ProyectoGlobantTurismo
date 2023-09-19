package org.example.validaciones;

import org.example.utilidades.Util;

import java.time.LocalDate;

public class OfertaValidacion {

     private Util util = new Util();
    public  Boolean validarTitulo(String titulo) throws Exception {

            if (!util.buscarCoincidencia(titulo, "^[a-zA-Z]+$")) {
                throw new Exception("Revise el formato del titulo");
            }

            if (titulo.length() > 20 ) {
                throw  new Exception("El titulo no puede pasar los 20 caracteres");
            }

            return  true;
    }
    /*public  Boolean compararFechas(String fechaInicio,  String fechaFin) throws Exception {
        String expRegular = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$\n";
        if (fechaInicio == null || fechaFin == null) {
            throw  new Exception("Las fechas estan vacias");
        }

        if(!util.buscarCoincidencia(fechaInicio, expRegular) || util.buscarCoincidencia(fechaFin, expRegular)) {
            throw  new Exception("No es el formato correspondiente");
        }
        return true;
    }*/


    public boolean validarDiferenciaFechas(LocalDate fechaInicio, LocalDate fechaFin) throws Exception {
        if(fechaFin.isBefore(fechaInicio)) {
            throw  new Exception("La fecha inicial no puede ser mayor a la fecha final");
        }
        return true;
    }

    public  Boolean validarFecha(String fecha) throws Exception {
        String expRegular = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$\n";
        if(!util.buscarCoincidencia(fecha, expRegular)) {
            throw  new Exception("No es el formato correspondiente");
        }
        return true;
    }

    public Boolean validarCosto(Double costo) throws Exception  {
        if (costo < 0) {
            throw  new Exception("El costo por persona no puede ser negativo");
        }
        return true;
    }
}
