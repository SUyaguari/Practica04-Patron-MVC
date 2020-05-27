package ec.edu.ups.prueba;

import ec.edu.ups.controlador.ControladorTelefono;
import ec.edu.ups.controlador.ControladorUsuario;
import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.modelo.Usuario;
import ec.edu.ups.vista.VistaTelefono;
import ec.edu.ups.vista.VistaUsuario;
import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Prueba {
    
    static Scanner leer = new Scanner(System.in);
    static private TelefonoDAO telefonoDAO = new TelefonoDAO();
    static private UsuarioDAO usuarioDAO = new UsuarioDAO();
    
    static private VistaUsuario vistaUsuario = new VistaUsuario();
    static private VistaTelefono vistaTelefono = new VistaTelefono();
    
    static private ControladorTelefono controladorTelefono = new ControladorTelefono(vistaTelefono, telefonoDAO);
    static private ControladorUsuario controladorUsuario = new ControladorUsuario(vistaUsuario, usuarioDAO, vistaTelefono, telefonoDAO);

    public static void main(String[] args) {
        int opcion1;
        do{
            System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨MENU¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
            System.out.println("[1] Registrarse");
            System.out.println("[2] Iniciar Sesion");
            System.out.println("[3] Mostrar usuarios");
            System.out.println("[4] Salir");
            System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
            System.out.print("Ingrese una opcion: ");
            opcion1 = leer.nextInt();
            
            switch(opcion1){
                case 1:
                    controladorUsuario.crearUsuario();
                    System.out.println("Se ha registrado el usuario");
                    break;
                case 2:
                    String cedula = iniciarSesion();
                    if(cedula!=null){
                        int opcion2;
                        do {
                            System.out.println("***********MENU***********");
                            System.out.println("[1] Registrar Telefono");
                            System.out.println("[2] Modificar Telefono");
                            System.out.println("[3] Eliminar Telefono");
                            System.out.println("[4] Buscar Telefono");
                            System.out.println("[5] Listar Telefonos");
                            System.out.println("[6] Editar usuario");
                            System.out.println("[7] Eliminar usuario");
                            System.out.println("[8] Cerrar sesion");
                            System.out.println("**************************");
                            System.out.print("Ingrese una opcion: ");
                            opcion2=leer.nextInt();
                            
                            switch(opcion2){
                                case 1: 
                                    controladorUsuario.agregarTelefonos(cedula, controladorTelefono.telefonoCrear());
                                    System.out.println("\nSe ha registrado con exito");
                                    break;
                                case 2:
                                    controladorUsuario.editarTelefono(cedula);
                                    System.out.println("\nTelefono editado correctamente");
                                    break;
                                case 3: 
                                    controladorUsuario.eliminarTelefono(cedula);
                                    System.out.println("\nTelefono eliminado correctamente");
                                    break;
                                case 4:
                                    controladorUsuario.buscarTelefono(cedula);
                                    break;
                                case 5:
                                    controladorUsuario.listarTelefonos(cedula);
                                    break;
                                case 6:
                                    controladorUsuario.modificarUsuario(cedula);
                                    System.out.println("\nDatos acualizados");
                                    break;
                                case 7:
                                    controladorUsuario.eliminarUsuario(cedula);
                                    System.out.println("\nUsuario eliminado :(");
                                    opcion2=8;
                                    break;
                                case 8:
                                    System.out.println("\nCerrando sesion...");
                                    break;
                            }
                        } while (opcion2!=8);
                    }
                    break;
                case 3:
                    controladorUsuario.mostrarUsuarios();
                    break;
                case 4: 
                    System.out.println("\nApagando sistema");
                    break;
            }
        }while(opcion1!=4);
    }
    
    static public String iniciarSesion(){
        Usuario u = controladorUsuario.iniciarSesion();
        if(u == null){
            System.out.println("Datos incorrectos");
            return null;
        }else{
            System.out.println("¨¨A ingresado correctamente¨¨");
            return u.getCedula();
            
        }
    }
}
