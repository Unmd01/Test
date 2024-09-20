
package persistencia;

import negocio.Usuario;


public class DaoImp implements Dao{

    @Override
    public String grabar(Usuario usua) {
        String sql="insert into usuario values('"+usua.getDni()+"','"+usua.getNom()+"','"+usua.getApe()+"')";
        String msg=Acceso.ejecutar(sql);
        if (msg==null){
            msg="Usuario Grabado";
        }
        return msg;
    }
    
    @Override
    public Usuario buscar(String dni) {
        String sql="select * from usuario where dni='"+dni+"'";
        Object[]fil=Acceso.buscar(sql);
        if(fil!=null){
            Usuario usua=new Usuario(fil[0].toString(),fil[1].toString(),fil[2].toString());
            return usua;
        }
       
        return null;
    }
    
}
