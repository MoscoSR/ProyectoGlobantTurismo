package org.example.entidades;

import org.example.utilidades.Util;
import org.example.validaciones.ReservaValidacion;

import java.time.LocalDate;

public class Reserva {

    ReservaValidacion reservaValidacion = new ReservaValidacion();
    Util util = new Util();

    public  Reserva () {

    }

    public Reserva(Integer id, Integer idUsuario, Integer idOferta, Double costoTotal, LocalDate fechaReserva) {
            this.id = id;
            this.idUsuario = idUsuario;
            this.idOferta = idOferta;
            this.costoTotal = costoTotal;
            this.fechaReserva = fechaReserva;
    }
    //toString
    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", idUsuario=" + idUsuario +
                ", idOferta=" + idOferta +
                ", costoTotal=" + costoTotal +
                ", fechaReserva=" + fechaReserva +
                '}';
    }


    // Metodos getter.

    public Integer getId() {
        return id;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public Integer getIdOferta() {
        return idOferta;
    }

    public Double getCostoTotal() {
        return costoTotal;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }


    // Metodos setters.

    public void setId(Integer id) {

    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setIdOferta(Integer idOferta) {
        this.idOferta = idOferta;
    }

    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public void setFechaReserva(String fechaReserva) {
        try{
            this.reservaValidacion.validarFecha(fechaReserva);
            this.fechaReserva = this.util.convertirStringEnLocalDate(fechaReserva);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void setNumPersonas(Integer numPersonas) {
        try {
            this.reservaValidacion.validarNumPersonas(numPersonas);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    // Atributos:

    private  Integer id;
    private Integer idUsuario;
    private Integer idOferta;
    private Double  costoTotal;
    private LocalDate fechaReserva;
}
