package ec.edu.ups.controlador;

import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.idao.ITelefonoDAO;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.vista.VistaTelefono;
import java.util.Collection;

/**
 *
 * @author Estudiantes
 */
public class ControladorTelefono {
    private VistaTelefono vistaTelefono;
    private Telefono telefono;
    private ITelefonoDAO telefonoDAO;

    public ControladorTelefono() {
    }

    public ControladorTelefono(VistaTelefono vistaTelefono, TelefonoDAO telefonoDAO) {
        this.vistaTelefono = vistaTelefono;
        this.telefonoDAO = telefonoDAO;
    }
    
    public Telefono telefonoCrear(){
        telefono = vistaTelefono.registrar();
        telefonoDAO.create(telefono);
        return telefono;
    }
    
    public void mostrarTelefono(){
        String codigo = vistaTelefono.buscarTelefono();
        telefono = telefonoDAO.read(codigo);
        vistaTelefono.mostrarTelefono(telefono);
    }
    
    public void modificarTelefono(){
        telefono = vistaTelefono.modificar();
        telefonoDAO.update(telefono);
    }
    
    public void eliminarTelefono(){
        telefono = vistaTelefono.eliminarTelefono();
        telefonoDAO.delite(telefono);
    }
    
    public void verTelefonos(){
        Collection<Telefono> telefonos;
        telefonos = telefonoDAO.findAll();
        if(!telefonos.isEmpty()){
            vistaTelefono.mostrarTelefonos(telefonos);
        }else{
            System.out.println("Agenda Vacia");
        }
    }
    
}
