package org.example.modelosdatos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class ModeloUsuarioPagoPorEvento extends ModeloUsuario{

    @Column(name = "valor_evento")
    private Double valorEvento;

    public ModeloUsuarioPagoPorEvento(Long id, String nombres, String documento, Integer ubicacion, String correoElectronico, Double valorEvento) {
        super(id, nombres, documento, ubicacion, correoElectronico);
        this.valorEvento = valorEvento;
    }
}
