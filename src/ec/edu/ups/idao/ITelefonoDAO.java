package ec.edu.ups.idao;

import ec.edu.ups.modelo.Telefono;
import java.util.Collection;

/**
 *
 * @author Estudiantes
 */
public interface ITelefonoDAO {
    public Collection<Telefono> findAll();
    public void create(Telefono telefono);
    public Telefono read(String codigo);
    public void update(Telefono telefono);
    public void delite(Telefono telefono);
}
