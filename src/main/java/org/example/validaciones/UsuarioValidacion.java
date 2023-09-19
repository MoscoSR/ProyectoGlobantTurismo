package org.example.validaciones;

import org.example.utilidades.Util;

public class UsuarioValidacion {

    Util util = new Util();

    // Metodos ordinarios.

    public Boolean  validarNombre(String nombre) throws  Exception {
        if(!util.buscarCoincidencia(nombre, "/^\\w+([.-_+]?\\w+)*@\\w+([.-]?\\w+)*(\\.\\w{2,10})+$")) {
            throw  new Exception("Ingresa un nombre valido");
        }
        if (nombre.length()<10) {
            throw new Exception("La longitud debe ser correcta");
        }
        return  true;
    }

    public Boolean validarUbicacion (Integer ubicacion)  throws  Exception{
        if (ubicacion == 1 || ubicacion == 2 || ubicacion == 3 || ubicacion==4) {
            return true;
        } else {
            throw new Exception("La ubicacion no es valida");
        }
    }

    public Boolean valCorreo(String  correo) throws Exception {
        if (!util.buscarCoincidencia(correo, "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,}$")) {
            throw new Exception("Digita un correo valido");
        }
        return true;
    }
}
