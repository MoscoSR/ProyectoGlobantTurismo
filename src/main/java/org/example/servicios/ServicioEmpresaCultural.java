package org.example.servicios;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.entidades.EmpresaCultural;
import org.example.entidades.UsuarioMembresia;
import org.example.modelosdatos.ModeloEmpresaCultural;
import org.example.modelosdatos.ModeloUsuarioMembresia;

import java.util.List;

public class ServicioEmpresaCultural {

    public void registrarEmpresa(EmpresaCultural empresaCultural) {
            // Nombre de la unidad de persistencia definida en persistence.xml
            String unidadPersistencia = "conexionbd";

            // Creamos variables para la conexión
            EntityManagerFactory entityManagerFactory = null;
            EntityManager entityManager = null;

            try {
                entityManagerFactory = Persistence.createEntityManagerFactory(unidadPersistencia);
                entityManager = entityManagerFactory.createEntityManager();

                ModeloEmpresaCultural modeloEmpresaCultural = new ModeloEmpresaCultural();
                modeloEmpresaCultural.setNumeroContacto(modeloEmpresaCultural.getNumeroContacto());
                modeloEmpresaCultural.setEmailContacto(modeloEmpresaCultural.getNumeroContacto());
                modeloEmpresaCultural.setEntidad(modeloEmpresaCultural.getEntidad());
                modeloEmpresaCultural.setMision(modeloEmpresaCultural.getMision());

                // Iniciar la transacción
                entityManager.getTransaction().begin();

                // Activar la persistencia
                entityManager.persist(modeloEmpresaCultural);

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

        public List<ModeloEmpresaCultural> buscarEmpresaCultural() {
            String configurarPersistencia = "conexiondb";
            EntityManagerFactory entityManagerFactory = null;
            EntityManager entityManager = null;

            try {
                String jpaConsulta = "SELECT af FROM ModeloEmpresaCultural af";

                List<ModeloEmpresaCultural> modeloEmpresaCulturals = entityManager.createQuery(jpaConsulta, ModeloEmpresaCultural.class).getResultList();
                return modeloEmpresaCulturals;

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
