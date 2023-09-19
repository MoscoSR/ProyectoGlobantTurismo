package org.example.entidades;

import org.example.validaciones.UsuarioValidacion;

public class Usuario {

    private UsuarioValidacion validacion = new UsuarioValidacion();


    //ATRIBUTOS=VARIABLES=DATOS
    private Integer id;
    private String nombres;
    private String documento;
    private Integer ubicacion;
    private String correoElectronico;

    //METODOS=FUNCIONES=ACCIONES
    //METODOS ESPECIALES

    public Usuario() { //constructor vacio
    }

    public Usuario(Integer id, String nombres, String documento, Integer ubicacion, String correoElectronico) {
        this.id = id;
        this.nombres = nombres;
        this.documento = documento;
        this.ubicacion = ubicacion;
        this.correoElectronico = correoElectronico;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        try {
            this.validacion.validarNombre(nombres);
            this.nombres = nombres;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Integer getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Integer ubicacion) {
        try {
            this.validacion.validarUbicacion(ubicacion);
            this.ubicacion = ubicacion;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        try {
            this.validacion.valCorreo(correoElectronico);
            this.correoElectronico = correoElectronico;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
