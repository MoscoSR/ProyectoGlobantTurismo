package org.example.modelosdatos;

import jakarta.persistence.*;

@Entity
public class ModeloEmpresaCultural {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "entidad")
    private String entidad;

    @Column(name = "mision")
    private String mision;

    @Column(name = "email_contacto")
    private String emailContacto;

    @Column(name = "numero_contacto")
    private String numeroContacto;

    @OneToOne
    @MapsId
    private ModeloEmpresa modeloEmpresaFk;

    public ModeloEmpresaCultural() {
    }

    public ModeloEmpresaCultural(Integer id, String entidad, String mision, String emailContacto, String numeroContacto, ModeloEmpresa modeloEmpresaFk) {
        this.id = id;
        this.entidad = entidad;
        this.mision = mision;
        this.emailContacto = emailContacto;
        this.numeroContacto = numeroContacto;
        this.modeloEmpresaFk = modeloEmpresaFk;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    public String getEmailContacto() {
        return emailContacto;
    }

    public void setEmailContacto(String emailContacto) {
        this.emailContacto = emailContacto;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public ModeloEmpresa getModeloEmpresaFk() {
        return modeloEmpresaFk;
    }

    public void setModeloEmpresaFk(ModeloEmpresa modeloEmpresaFk) {
        this.modeloEmpresaFk = modeloEmpresaFk;
    }
}
