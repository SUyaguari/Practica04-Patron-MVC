package ec.edu.ups.idao;

import ec.edu.ups.modelo.Usuario;
import java.util.Collection;

/**
 *
 * @author Estudiantes
 */
public interface IUsuarioDAO {
    public Collection<Usuario> findAll();
    public void create(Usuario usuario);
    public Usuario read(String cedula);
    public void update(Usuario usuario);
    public void delite(Usuario usuario);
}
