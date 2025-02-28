package model.tipusPersona;

public class Personatge extends Persona{
    private String estudis;
    private String preferencia;
    public Personatge(String nom, String lloc, String estudis, String preferencia){
        super(nom, lloc);
        this.estudis = estudis;
        this.preferencia = preferencia;
    }

}
