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
    
    public void mostrarUsuario(){
        String cedula = vistaUsuario.buscarUsuario();
        usuario = usuarioDAO.read(cedula);
        vistaUsuario.verUsuario(usuario);
    }
    
    public void modificarUsuario(){
        usuario = vistaUsuario.modificarUsuario();
        usuarioDAO.update(usuario);
    }
    
    public void eliminarUsuario(){
        usuario = vistaUsuario.eliminarUsuario();
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
        usuario = vistaUsuario.iniciarSecion();
        Collection<Usuario> usuarios = usuarioDAO.findAll();
        for (Usuario usuario1 : usuarios) {
            if(usuario.equals(usuario1)){
                return usuario1;
            }
        }
        return null;
    }
    
}
