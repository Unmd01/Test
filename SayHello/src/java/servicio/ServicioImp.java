
package servicio;

import negocio.Usuario;
import persistencia.Dao;
import persistencia.DaoImp;


public class ServicioImp implements Servicio{
        private Dao dao= new DaoImp();


    @Override
    public String grabar(String dni, String nom, String ape) {
        Usuario usua=new Usuario(dni,nom,ape);
        return dao.grabar(usua);    }


    @Override
    public Usuario buscar(String dni) {
        return dao.buscar(dni);
    }
    
}
