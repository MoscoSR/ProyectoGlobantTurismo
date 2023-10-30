package org.example.entidades;

public class UsuarioPagoPorEvento extends  Usuario{

    private Double valorPagado;

    public UsuarioPagoPorEvento(Long id, String nombres, String documento, Integer ubicacion, String correoElectronico, Double valorPagado) {
        super(id, nombres, documento, ubicacion, correoElectronico);
        this.valorPagado = valorPagado;
        if (valorPagado > 200000) {
            System.out.println("El valor pagado no debe superar los $200000");
        }
    }
}
