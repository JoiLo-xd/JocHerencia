package model.tipusObjecte;

public class Objecte {
    private String nom;
    private String estudi;
    private int preu_calacoins;

    public Objecte(String nom, String estudi, int preu_calacoins){
        this.nom = nom;
        this.estudi = estudi;
        this.preu_calacoins = preu_calacoins;
    }

    public Objecte(String nom){
        this.nom = nom;
    }

    public String getEstudi() {
        return estudi;
    }

    public String getNom() {
        return nom;
    }

    public int getPreu_calacoins() {
        return preu_calacoins;
    }

    public boolean equals(Objecte obj){
        Objecte opa2 = (Objecte) obj;
        return obj.getNom().equals(nom);

    }

    protected void setPreu_calacoins(int preu){
        preu_calacoins = preu;
    }

}
