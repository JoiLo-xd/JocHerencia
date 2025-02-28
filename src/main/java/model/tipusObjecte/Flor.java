package model.tipusObjecte;

public class Flor extends Objecte{
    private String color;

    public Flor(String nom, String estudi, int preu,String color){
        super(nom,estudi,preu);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
