package org.example.modelosdatos;

import jakarta.persistence.*;

@Entity
public class ModeloEmpresaPrivada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "representante_legal")
    private String representanteLegal;

    @Column(name = "cedula")
    private String cedula;

    @OneToOne
    @MapsId
    private ModeloEmpresa modeloEmpresaFk;

    public ModeloEmpresaPrivada() {
    }

    public ModeloEmpresaPrivada(Integer id, String representanteLegal, String cedula, ModeloEmpresa modeloEmpresaFk) {
        this.id = id;
        this.representanteLegal = representanteLegal;
        this.cedula = cedula;
        this.modeloEmpresaFk = modeloEmpresaFk;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public ModeloEmpresa getModeloEmpresaFk() {
        return modeloEmpresaFk;
    }

    public void setModeloEmpresaFk(ModeloEmpresa modeloEmpresaFk) {
        this.modeloEmpresaFk = modeloEmpresaFk;
    }
}
