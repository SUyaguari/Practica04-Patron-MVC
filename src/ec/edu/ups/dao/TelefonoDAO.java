package ec.edu.ups.dao;

import ec.edu.ups.idao.ITelefonoDAO;
import ec.edu.ups.modelo.Telefono;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Estudiantes
 */
public class TelefonoDAO implements ITelefonoDAO{
    private Map<String, Telefono> telefonos;

    public TelefonoDAO() {
        telefonos = new HashMap<String, Telefono>();
    }

    @Override
    public Collection<Telefono> findAll() {
        Collection<Telefono> telefono = this.telefonos.values();
        return  telefono;
    }


    @Override
    public void create(Telefono telefono) {
        telefonos.put(telefono.getCodigo(), telefono);
    }

    @Override
    public Telefono read(String codigo) {
        return telefonos.get(codigo);
    }

    @Override
    public void update(Telefono telefono) {
        telefonos.put(telefono.getCodigo(), telefono);
    }

    @Override
    public void delite(Telefono telefono) {
        telefonos.remove(telefono.getCodigo());
    }
    
    
    
}
