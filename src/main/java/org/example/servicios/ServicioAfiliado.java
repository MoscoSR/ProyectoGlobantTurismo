package org.example.servicios;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.entidades.UsuarioMembresia;
import org.example.modelosdatos.ModeloUsuarioMembresia;

import javax.swing.text.html.parser.Entity;
import java.util.List;

public class ServicioAfiliado {

    public void registrarAfiliado(UsuarioMembresia usuarioMembresia) {
        // Nombre de la unidad de persistencia definida en persistence.xml
        String unidadPersistencia = "conexionbd";

        // Creamos variables para la conexión
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;

        try {
            entityManagerFactory = Persistence.createEntityManagerFactory(unidadPersistencia);
            entityManager = entityManagerFactory.createEntityManager();

            ModeloUsuarioMembresia modeloUsuarioMembresia = new ModeloUsuarioMembresia();
            modeloUsuarioMembresia.setNombres(usuarioMembresia.getNombres());
            modeloUsuarioMembresia.setCorreoElectronico(usuarioMembresia.getCorreoElectronico());
            modeloUsuarioMembresia.setDocumento(usuarioMembresia.getDocumento());
            modeloUsuarioMembresia.setCostoMensual(usuarioMembresia.getCostoMensual());
            System.out.println(modeloUsuarioMembresia.getCostoMensual());

            // Iniciar la transacción
            entityManager.getTransaction().begin();

            // Activar la persistencia
            entityManager.persist(modeloUsuarioMembresia);

            // Confirmar la transacción
            entityManager.getTransaction().commit();

            System.out.println("Éxito en la transacción, usuario con membresía registrado con éxito");
        } catch (Exception error) {
            System.out.println("Fallamos: " + error.getMessage());
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
            if (entityManagerFactory != null) {
                entityManagerFactory.close();
            }
        }
    }

    public List<ModeloUsuarioMembresia> buscarAfiliado() {
        String configurarPersistencia = "conexiondb";
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;

        try {
            String jpaConsulta = "SELECT af FROM ModeloUsuarioMembresia af";

            List<ModeloUsuarioMembresia> afiliados = entityManager.createQuery(jpaConsulta, ModeloUsuarioMembresia.class).getResultList();

            return afiliados;
        } catch (Exception e) {
            System.out.println("fallamos" + e.getMessage());
            return null;
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
            if (entityManagerFactory != null) {
                entityManagerFactory.close();
            }
        }
    }
}