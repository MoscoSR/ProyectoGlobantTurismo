package org.example.servicios;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.entidades.EmpresaPrivada;
import org.example.entidades.UsuarioMembresia;
import org.example.modelosdatos.ModeloEmpresa;
import org.example.modelosdatos.ModeloEmpresaPrivada;
import org.example.modelosdatos.ModeloUsuarioMembresia;

import java.util.List;

public class ServicioEmpresaPrivada {

        public void registrarEmpresaPrivada(EmpresaPrivada empresaPrivada) {
            // Nombre de la unidad de persistencia definida en persistence.xml
            String unidadPersistencia = "conexionbd";

            // Creamos variables para la conexión
            EntityManagerFactory entityManagerFactory = null;
            EntityManager entityManager = null;

            try {
                entityManagerFactory = Persistence.createEntityManagerFactory(unidadPersistencia);
                entityManager = entityManagerFactory.createEntityManager();

                ModeloEmpresaPrivada modeloEmpresaPrivada = getModeloEmpresaCultural(empresaPrivada);

                // Iniciar la transacción
                entityManager.getTransaction().begin();

                // Activar la persistencia
                entityManager.persist(modeloEmpresaPrivada);

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


    private static ModeloEmpresaPrivada getModeloEmpresaCultural(EmpresaPrivada empresaPrivada) {
        ModeloEmpresaPrivada modeloEmpresaPrivada = new ModeloEmpresaPrivada();
        modeloEmpresaPrivada.setModeloEmpresaFk(new ModeloEmpresa(
                empresaPrivada.getNit(),
                empresaPrivada.getNombre(),
                empresaPrivada.getUbicacion(),
                empresaPrivada.getDescripcion()
        ));

        modeloEmpresaPrivada.setRepresentanteLegal(empresaPrivada.getRepresentanteLegal());
        modeloEmpresaPrivada.setCedula(empresaPrivada.getCedula());

        return modeloEmpresaPrivada;
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
