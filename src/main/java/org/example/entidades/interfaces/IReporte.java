package org.example.entidades.interfaces;

public interface IReporte {
    <T>void generarReporte( T t, String datos);
    <T> void buscarReporte(T t);
    <T> void editarReporte(Integer id, String datos);
}
