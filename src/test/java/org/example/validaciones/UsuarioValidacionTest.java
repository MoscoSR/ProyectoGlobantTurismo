package org.example.validaciones;
import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class UsuarioValidacionTest {

    /*Preparo la prueba*/
    UsuarioValidacion usuarioValidacion;

    @BeforeEach
    public void configurarPrueba(){
    this.usuarioValidacion = new UsuarioValidacion();
    }
    @Test
    public void validarNombreCorto() throws Exception {
        String nomPrueba ="Juan";
        Exception exception = Assertions.assertThrows(Exception.class, ()->this.usuarioValidacion.validarNombre(nomPrueba));
        Assertions.assertEquals(Mensaje.LONGITUD_NOMBRE.getMensaje(), exception.getMessage());
    }

    @Test
    public void validarFalla(){
        String nombrePrueba = " 22";
        Exception respuesta2 = Assertions.assertThrows(Exception.class, () -> this.usuarioValidacion.validarNombre(nombrePrueba));
        Assertions.assertEquals(Mensaje.FORMATO_NOMBRE.getMensaje(), respuesta2.getMessage());
    }

    @Test
    public void validarNombreCorrecto() {
        String nombrePrueba = "SantiMosquera";
        Boolean respuesta = Assertions.assertDoesNotThrow(() -> this.usuarioValidacion.validarNombre(nombrePrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarCorreoCorrecto() {
        String correoPrueba = "santi85@dominio.com";
        Boolean respuesta = Assertions.assertDoesNotThrow(() -> this.usuarioValidacion.valCorreo(correoPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarCorreoIncorrecto() {
        String correoPrueba = "santi.com";
        Exception respuesta = Assertions.assertThrows(Exception.class, () -> this.usuarioValidacion.valCorreo(correoPrueba));
        Assertions.assertEquals(Mensaje.FORMATO_CORREO.getMensaje(), respuesta.getMessage());
    }

    @Test
    public void validarUbicacionCorrecta() {
        Integer ubicacionPrueba = 2;
        Boolean respuesta = Assertions.assertDoesNotThrow(() -> this.usuarioValidacion.validarUbicacion(ubicacionPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarUbicacionIncorrecta() {
        Integer ubicacionPrueba = 5;
        Exception respuesta = Assertions.assertThrows(Exception.class, () -> this.usuarioValidacion.validarUbicacion(ubicacionPrueba));
        Assertions.assertEquals(Mensaje.FORMATO_UBICACION.getMensaje(), respuesta.getMessage());
    }
}