package org.example.validaciones;
import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class LocalValidacionTest {
    EmpresaValidacion empresaValidacion;

    @BeforeEach
    public void configurarPrueba2s() {
        System.out.println("Estoy ejecutando la prueba");
        this.empresaValidacion = new EmpresaValidacion();
    }


    @Test
    public void validarNitFormatoIncorrecto() {
        String nit = "12345";
        Exception respuesta = Assertions.assertThrows(Exception.class, () -> empresaValidacion.validarLocal(nit));
        Assertions.assertEquals(Mensaje.FORMATO_LOCAL.getMensaje(), respuesta.getMessage());
    }

    @Test
    public void validarNitLongitudIncorrecta() {
        String nit = "12345678901";
        Exception respuesta = Assertions.assertThrows(Exception.class, () -> empresaValidacion.validarLocal(nit));
        Assertions.assertEquals(Mensaje.FORMATO_LOCAL.getMensaje(), respuesta.getMessage());
    }

    @Test
    public void validarNitCorrecto() {
        String nit = "123456789";
        Boolean respuesta = Assertions.assertDoesNotThrow(() -> empresaValidacion.validarLocal(nit));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarNombreFormatoIncorrecto() {
        String nombre = "Nombre Inválido 123$";
        Exception respuesta = Assertions.assertThrows(Exception.class, () -> empresaValidacion.validarNomEmpresa(nombre));
        Assertions.assertEquals(Mensaje.FORMATO_NOMBRE.getMensaje(), respuesta.getMessage());
    }

    @Test
    public void validarNombreLongitudExcedida() {
        String nombre = "Nombre Muy Largo y Excedido de 30 Caracteres";
        Exception respuesta = Assertions.assertThrows(Exception.class, () -> empresaValidacion.validarNomEmpresa(nombre));
        Assertions.assertEquals(Mensaje.LONGITUD_NOMBRE_NIT.getMensaje(), respuesta.getMessage());
    }

    @Test
    public void validarNombreCorrecto() {
        String nombre = "NombreCorrecto";
        Boolean respuesta = Assertions.assertDoesNotThrow(() -> empresaValidacion.validarNomEmpresa(nombre));
        Assertions.assertTrue(respuesta);
    }
}
