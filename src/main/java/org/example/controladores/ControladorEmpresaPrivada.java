package org.example.controladores;

import org.example.entidades.EmpresaPrivada;
import org.example.servicios.ServicioEmpresaPrivada;

public class ControladorEmpresaPrivada {
    EmpresaPrivada empresaPrivada = new EmpresaPrivada();
    ServicioEmpresaPrivada servicioEmpresaPrivada = new ServicioEmpresaPrivada();

    public void agregarEmpresa(String nit, String nombre, String ubicacion, String descripcion, String representanteLegal, String cedula) {
        this.empresaPrivada.setNit(nit);
        this.empresaPrivada.setNombre(nombre);
        this.empresaPrivada.setUbicacion(Integer.valueOf(ubicacion));
        this.empresaPrivada.setDescripcion(descripcion);
        this.empresaPrivada.setRepresentanteLegal(representanteLegal);
        this.empresaPrivada.setCedula(cedula);
        this.servicioEmpresaPrivada.registrarEmpresaPrivada(empresaPrivada);
    }
}
