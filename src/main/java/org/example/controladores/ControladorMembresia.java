package org.example.controladores;

import org.example.entidades.UsuarioMembresia;
import org.example.modelosdatos.ModeloUsuarioMembresia;
import org.example.servicios.ServicioAfiliado;

import java.util.List;

public class ControladorMembresia {
    UsuarioMembresia usuarioMembresia = new UsuarioMembresia();

    ServicioAfiliado servicioAfiliado = new ServicioAfiliado();

    public void registrarAfiliado(String nombre, String documento, String correo, Integer ubicacion, Double costoMembresia) {
        this.usuarioMembresia.setNombres(nombre);
        this.usuarioMembresia.setDocumento(documento);
        this.usuarioMembresia.setCorreoElectronico(correo);
        this.usuarioMembresia.setUbicacion(ubicacion);
        this.usuarioMembresia.setValorMensual(costoMembresia);
        System.out.println(this.usuarioMembresia.getCostoMensual());
        this.servicioAfiliado.registrarAfiliado(usuarioMembresia);

    }

    public void consultarAfiliado() {
        List<ModeloUsuarioMembresia>afiliado = servicioAfiliado.buscarAfiliado();
        for (ModeloUsuarioMembresia modeloUsuarioMembresia : afiliado) {
            System.out.println("Nombre: " + modeloUsuarioMembresia.getNombres());
            System.out.println("Documento: " + modeloUsuarioMembresia.getDocumento());
            System.out.println("Correo: " + modeloUsuarioMembresia.getCorreoElectronico());
            System.out.println("Ubicacion: " + modeloUsuarioMembresia.getUbicacion());
        }
    }
}
