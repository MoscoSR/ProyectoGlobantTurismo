package org.example.entidades;

import org.example.entidades.interfaces.IAnalitica;
import org.example.entidades.interfaces.IReporte;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class UsuarioMembresia extends Usuario implements IReporte, IAnalitica<UsuarioMembresia> {


    private  Double costoMensual;


    public UsuarioMembresia() {
    }

    public UsuarioMembresia(Long id, String nombres, String documento, Integer ubicacion, String correoElectronico, Double valorMensual) {
        super(id, nombres, documento, ubicacion, correoElectronico);
        this.costoMensual = valorMensual;
    }

    public Double getCostoMensual() {
        return costoMensual;
    }

    public void setValorMensual(Double valorMensual) {
        this.costoMensual = valorMensual;
    }


    @Override
    public void limpiarDatos(UsuarioMembresia datos) {

    }

    @Override
    public void calcularDispersion(UsuarioMembresia datos) {

    }

    @Override
    public void generarReporte(String datos) {

    }

    @Override
    public void buscarReporte(Integer id) {

    }

    @Override
    public void editarReporte(Integer id, String datos) {

    }
}

