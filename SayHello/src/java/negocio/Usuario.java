
package negocio;


public class Usuario {
    private String dni, nom, ape;

    public Usuario() {
    }

    public Usuario(String dni, String nom, String ape) {
        this.dni = dni;
        this.nom = nom;
        this.ape = ape;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }
    
}
