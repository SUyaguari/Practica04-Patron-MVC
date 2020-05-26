package ec.edu.ups.vista;

import ec.edu.ups.modelo.Telefono;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class VistaTelefono {
        private Scanner leer;

    public VistaTelefono() {
        leer = new Scanner(System.in);
    }
    
    public Telefono registrar(){
        leer = new Scanner(System.in);
        String codigo;
        String numero;
        String tipo;
        String operadora;
        System.out.print("Ingrese el codigo del telefono: ");
        codigo = leer.next();
        System.out.print("Ingrese el numero del telefono: ");
        numero = leer.next();
        System.out.print("Ingrese el tipo del telefono: ");
        tipo = leer.next();
        System.out.print("Ingrese la operadora del telefono: ");
        operadora = leer.next();
        return new Telefono(codigo, numero, tipo, operadora);
    }
    
    public Telefono modificar(){
        leer = new Scanner(System.in);
        String codigo;
        String numero;
        String tipo;
        String operadora;
        System.out.print("Ingrese el codigo del telefono: ");
        codigo = leer.next();
        System.out.print("Ingrese el numero del telefono: ");
        numero = leer.next();
        System.out.print("Ingrese el tipo del telefono: ");
        tipo = leer.next();
        System.out.print("Ingrese la operadora del telefono: ");
        operadora = leer.next();
        return new Telefono(codigo, numero, tipo, operadora);
    }
    
    public Telefono eliminarTelefono(){
        leer = new Scanner(System.in);
        String codigo;
        System.out.print("Ingrese el codigo del telefono: ");
        codigo = leer.next();
        return new Telefono(codigo, null, null, null);
    }
    
    public String buscarTelefono(){
        Scanner leer = new Scanner(System.in);
        String codigo;
        System.out.print("Ingrese el codigo del telefono: ");
        codigo = leer.next();
        return codigo;
    }
    
    public void mostrarTelefonos(Collection<Telefono> listaTelefono){
        for (Telefono telefono : listaTelefono) {
            System.out.println("Datos: \n"+telefono);
        }
    }
    
    public void mostrarTelefono(Telefono telefono){
        System.out.println("Datos del telefono: "+telefono);
    }

}
