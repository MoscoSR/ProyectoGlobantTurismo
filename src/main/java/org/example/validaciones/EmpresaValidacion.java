package org.example.validaciones;

import org.example.utilidades.Util;

public class EmpresaValidacion {
    Util util = new Util();
    public Boolean validarLocal(String nit) throws Exception {
        if (!util.buscarCoincidencia(nit, "[a-zA-Z]+$")) {
            throw  new Exception("Ingresa un nombre valido");
        }

        if (nit.length() < 10 )  {
            throw  new Exception("El nit debe tener solo 10 digitos");
        }
        return  true;
    }

    public  Boolean  validarNomEmpresa(String nomEmpresa) throws  Exception {
            if (!util.buscarCoincidencia(nomEmpresa, "[a-zA-Z]+$")) {
                throw new Exception("Ingresa un nombre valido");
            }

            if(nomEmpresa.length() > 30) {
                throw  new Exception("El nombre de la empresa no puede pasar los 30 caracteres");
            }
        return  true;
    }
}
