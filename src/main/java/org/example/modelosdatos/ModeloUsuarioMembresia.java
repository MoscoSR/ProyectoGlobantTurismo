package org.example.modelosdatos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class ModeloUsuarioMembresia extends ModeloUsuario{

    @Column(name = "valor_mensual", nullable = true)
    private Double costoMensual;

    @Column(name = "cedula_invitado")
    private String cedulaInvitado;

    @Column(name = "id_invitado")
    private Long invitadoId;

    public ModeloUsuarioMembresia() {
    }

    public ModeloUsuarioMembresia(Long id, String nombres, String documento, Integer ubicacion, String correoElectronico, Double costoMensual, String cedulaInvitado, Long invitadoId) {
        super(id, nombres, documento, ubicacion, correoElectronico);
        this.costoMensual = costoMensual;
        this.cedulaInvitado = cedulaInvitado;
        this.invitadoId = invitadoId;
    }

    public Double getCostoMensual() {
        return costoMensual;
    }

    public void setCostoMensual(Double costoMensual) {
        this.costoMensual = costoMensual;
    }

    public String getCedulaInvitado() {
        return cedulaInvitado;
    }

    public void setCedulaInvitado(String cedulaInvitado) {
        this.cedulaInvitado = cedulaInvitado;
    }

    public Long getInvitadoId() {
        return invitadoId;
    }

    public void setInvitadoId(Long invitadoId) {
        this.invitadoId = invitadoId;
    }
}
