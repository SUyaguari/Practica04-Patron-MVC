package ec.edu.ups.vista;

import ec.edu.ups.modelo.Usuario;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class VistaUsuario {
        private Scanner leer;

    public VistaUsuario() {
        leer = new Scanner(System.in);
    }
    
    public Usuario crearUsuario(){
        leer = new Scanner(System.in);
        String cedula;
        String nombre;
        String apellido;
        String correo;
        String contraseña;
        System.out.print("Ingrese el numero de cedula de la persona: ");
        cedula = leer.next();
        System.out.print("Ingrese el nombre de la persona: ");
        nombre = leer.next();
        System.out.print("Ingrese el apellido de la persona: ");
        apellido = leer.next();
        System.out.print("Ingrese el correo de la persona: ");
        correo = leer.next();
        System.out.print("Ingrese la contraseña de la persona: ");
        contraseña = leer.next();
        return new Usuario(cedula, nombre, apellido, correo, contraseña);
    }
    
    public Usuario modificarUsuario(String cedula){
        leer = new Scanner(System.in);
        String nombre;
        String apellido;
        String correo;
        String contraseña;
        System.out.print("Ingrese el nombre de la persona: ");
        nombre = leer.next();
        System.out.print("Ingrese el apellido de la persona: ");
        apellido = leer.next();
        System.out.print("Ingrese el correo de la persona: ");
        correo = leer.next();
        System.out.print("Ingrese la contraseña de la persona: ");
        contraseña = leer.next();
        return new Usuario(cedula, nombre, apellido, correo, contraseña);
    }
    
    public Usuario eliminarUsuario(){
        leer = new Scanner(System.in);
        String cedula;
        System.out.print("Ingrese la cedula del cliente que desea eliminar");
        cedula = leer.next();
        return new Usuario(cedula, null, null, null, null);
    }
    
    public void verUsuario(Usuario usuario){
        System.out.println("Datos del usuario: "+usuario);
    }
    
    public void verUsuarios(List<Usuario> listaUsuario){
        for (Usuario usuario : listaUsuario) {
            System.out.println("Datos del usuario: "+ usuario);
        }
    }

    public Usuario iniciarSecion() {
        System.out.println("Porfavor ingrese sus datos para verificar su identidad\n");
        System.out.print("Correo Electronico:  ->");
        String correo = leer.nextLine();
        System.out.print("Contraseña:  ->");
        String contraseña = leer.nextLine();
        return new Usuario(null, null, null, correo, contraseña);
    }
}
