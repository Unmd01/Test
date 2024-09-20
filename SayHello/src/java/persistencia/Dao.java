
package persistencia;

import negocio.Usuario;

public interface Dao {
    public String grabar(Usuario usua);
    public Usuario buscar(String cod);
    
}
