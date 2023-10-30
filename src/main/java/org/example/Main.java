package org.example;
import org.example.controladores.ControladorMembresia;

public class Main {
    public static void main(String[] args) throws Exception {
//        /* Instancias Objetos  */
//        Scanner input = new Scanner(System.in);
//        Usuario usuario = new Usuario();
//        Reserva reserva = new Reserva();
//        Oferta oferta = new Oferta();
//        Local local = new Local();

        ControladorMembresia controladorMembresia = new ControladorMembresia();
        controladorMembresia.registrarAfiliado("santiagoMosquera","1007346874", "correo@correo.com", 4,80000.0);

        /** Usuario**/


       /*System.out.print("Diigta tu nombre");
        usuario.setNombres(input.nextLine());

        System.out.print("Digita tu ubicacion");
        usuario.setUbicacion(input.nextInt());

        System.out.print("Digita tu correo");
        usuario.setCorreoElectronico(input.next());*/


       /*
        System.out.print("Digita el nit del local");
        local.setNit(input.nextLine());

        input.nextLine();

        System.out.print("Digita el nombre de la empresa");
        local.setNombre(input.nextLine());

        System.out.print("Ingresa el titulo de la oferta");
        oferta.setTitle(input.next());

        System.out.print("Ingresa la fecha de inicio");
        oferta.setFechaInicio(input.next());

        System.out.print("Ingresa la fecha final");
        oferta.setFechaFin(input.next());

        System.out.print("Ingrese el costo");
        oferta.setCostoPersona(input.nextDouble());*/

    }
}