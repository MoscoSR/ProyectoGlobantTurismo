package org.example.entidades;

import org.example.entidades.interfaces.IReporte;

public class UsuarioPremium extends Usuario implements IReporte {

    @Override
    public <T> void generarReporte(T t, String datos) {

    }

    @Override
    public <T> void buscarReporte(T t) {

    }

    @Override
    public <T> void editarReporte(Integer id, String datos) {

    }
}
