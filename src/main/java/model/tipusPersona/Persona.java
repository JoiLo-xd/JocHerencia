package model.tipusPersona;

public class Persona {
    private String nom;
    private String estancia;
    public Persona(String nom, String estancia){
        this.nom = nom;
        this.estancia = estancia;
    }

    public Persona(String nom){
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public String getEstancia() {
        return estancia;
    }

    public void moure(String lloc){
        estancia = lloc;
    }

    @Override
    public boolean equals(Object obj){
        Persona obj2 = (Persona) obj;
        return nom.equals(obj2.getNom());
    }


}
