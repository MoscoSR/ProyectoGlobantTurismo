package org.example.entidades;

import org.example.utilidades.Util;
import org.example.validaciones.OfertaValidacion;

import java.time.LocalDate;

public class Oferta {
    OfertaValidacion ofertaValidacion = new OfertaValidacion();
    Util util = new Util();
    public Oferta () {

    }

    public Oferta(Integer id, String title, String description, LocalDate fechaInicio, LocalDate fechaFin, Double costoPersona, Integer idLocal) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costoPersona = costoPersona;
        this.idLocal = idLocal;
    }

    //toString

    @Override
    public String toString() {
        return "Oferta{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", costoPersona=" + costoPersona +
                ", idLocal=" + idLocal +
                '}';
    }


    // Metodos getters.

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public Double getCostoPersona() {
        return costoPersona;
    }

    public Integer getIdLocal() {
        return idLocal;
    }

    // Metodos setters

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFechaInicio(String fechaInicio) {
       try {
           this.ofertaValidacion.validarFecha(fechaInicio);
           this.fechaInicio = this.util.convertirStringEnLocalDate(fechaInicio);
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
    }

    public void setFechaFin(String fechaFin) {
        try {
            this.ofertaValidacion.validarFecha(fechaFin);
            this.ofertaValidacion.validarDiferenciaFechas(this.fechaInicio, this.util.convertirStringEnLocalDate(fechaFin));
            this.util.convertirStringEnLocalDate(fechaFin);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void setCostoPersona(Double costoPersona) {
        try {
            this.ofertaValidacion.validarCosto(costoPersona);
            this.costoPersona = costoPersona;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void setIdLocal(Integer idLocal) {
        this.idLocal = idLocal;
    }

    // Atributos
    private Integer id;
    private String title;
    private String description;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Double costoPersona;
    private Integer idLocal;

}
