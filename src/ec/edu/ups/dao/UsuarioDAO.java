package ec.edu.ups.dao;

import ec.edu.ups.idao.IUsuarioDAO;
import ec.edu.ups.modelo.Usuario;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Estudiantes
 */
public class UsuarioDAO implements IUsuarioDAO{
    private Map<String, Usuario> usuarios;

    public UsuarioDAO() {
        usuarios = new HashMap<String, Usuario>();
    }

    @Override
    public Collection<Usuario> findAll() {
        Collection<Usuario> usuario = this.usuarios.values();
        return usuario;
    }

    @Override
    public void create(Usuario usuario) {
        usuarios.put(usuario.getCedula(), usuario);
    }

    @Override
    public Usuario read(String cedula) {
        return usuarios.get(cedula);
    }

    @Override
    public void update(Usuario usuario) {
        usuarios.put(usuario.getCedula(), usuario);
    }

    @Override
    public void delite(Usuario usuario) {
        usuarios.remove(usuario.getCedula());
    }
    
}
