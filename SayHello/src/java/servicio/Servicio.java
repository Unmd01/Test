
package servicio;

import negocio.Usuario;


public interface Servicio {
    public String grabar (String dni, String nom, String ape);
    public Usuario buscar (String dni);
    
}
