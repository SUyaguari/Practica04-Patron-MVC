package ec.edu.ups.controlador;

import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.idao.ITelefonoDAO;
import ec.edu.ups.idao.IUsuarioDAO;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.modelo.Usuario;
import ec.edu.ups.vista.VistaTelefono;
import ec.edu.ups.vista.VistaUsuario;
import java.util.Collection;

/**
 *
 * @author Estudiantes
 */
public class ControladorUsuario {
    private VistaUsuario vistaUsuario;
    private Usuario usuario;
    private IUsuarioDAO usuarioDAO;

    private VistaTelefono vistaTelefono;
    private Telefono telefono;
    private ITelefonoDAO telefonoDAO;
    
    public ControladorUsuario() {
    }

    public ControladorUsuario(VistaUsuario vistaUsuario, UsuarioDAO usuarioDAO, VistaTelefono vistaTelefono, TelefonoDAO telefonoDAO) {
        this.vistaUsuario = vistaUsuario;
        this.usuarioDAO = usuarioDAO;
        this.vistaTelefono = vistaTelefono;
        this.telefonoDAO = telefonoDAO;
    }
    
    public void crearUsuario(){
        usuario = vistaUsuario.crearUsuario();
        usuarioDAO.create(usuario);
    }
    
    public void mostrarUsuario(String cedula){
        usuario = usuarioDAO.read(cedula);
        vistaUsuario.verUsuario(usuario);
    }
    
    public void modificarUsuario(String cedula){
        usuario = vistaUsuario.modificarUsuario(cedula);
        usuarioDAO.update(usuario);
    }
    
    public void eliminarUsuario(String cedula){
        usuario = vistaUsuario.eliminarUsuario(cedula);
        usuarioDAO.delite(usuario);
    }
    
    public void mostrarUsuarios(){
        Collection<Usuario> usuarios;
        usuarios = usuarioDAO.findAll();
        if(!usuarios.isEmpty()){
            vistaUsuario.verUsuarios(usuarios);
        }else{
            System.out.println("Usuarios Vacios");
        }
    }
    
    public Usuario iniciarSesion(){
        usuario = vistaUsuario.iniciarSesion();
        Collection<Usuario> usuarios = usuarioDAO.findAll();
        for (Usuario u : usuarios) {
            if (usuario.equals(u)) {
                return u;
            }
        }
        return null;
    }
    
    public void agregarTelefonos(String cedula, Telefono telefono){
        usuario = usuarioDAO.read(cedula);
        usuario.agregarTelefono(telefono);
        usuarioDAO.update(usuario);
        
    }
    
    public void eliminarTelefono(String cedula){
        usuario = usuarioDAO.read(cedula);
        vistaTelefono.mostrarTelefonos(usuario.listarTelefonos());
        telefono = vistaTelefono.eliminarTelefono();
        if(usuario.listarTelefonos().contains(telefono)){
            usuario.eliminarTelefono(telefono);
            telefonoDAO.delite(telefono);
            System.out.println("Telefono eliminado");
        }else{
            System.out.println("Telefono no encontrado");
        }
    }
    
     public void editarTelefono(String cedula) {
        usuario = usuarioDAO.read(cedula);
        vistaTelefono.mostrarTelefonos(usuario.listarTelefonos());
        telefono = vistaTelefono.modificar();
        if (usuario.listarTelefonos().contains(telefono)) {
            usuario.editarTelefono(telefono);
            telefonoDAO.update(telefono);
            System.out.println("Telefono acrualizado");
        } else {
            System.out.println("Telefono no encontrado");
        }
    }
     
    public void buscarTelefono(String cedula) {
        usuario = usuarioDAO.read(cedula);
        String codigo = vistaTelefono.buscarTelefono();
        telefono = telefonoDAO.read(codigo);
        if (usuario.listarTelefonos().contains(telefono)) {
            System.out.println("Telefono encontrado: ");
            System.out.println(telefono);
        } else {
            System.out.println("Telefono no encontrado");
        }
    }
    
   public void listarTelefonos(String cedula) {
        usuario = usuarioDAO.read(cedula);
        if (!usuario.listarTelefonos().isEmpty()) {
            System.out.println(usuario.listarTelefonos());
        } else {
            System.out.println("Agenda vacia");
        }
    }
}
