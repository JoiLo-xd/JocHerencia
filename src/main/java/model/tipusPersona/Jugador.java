package model.tipusPersona;

import model.tipusObjecte.Objecte;
import java.util.ArrayList;

public class Jugador extends Persona{
    private int nivell;
    private int punts;
    private int calacoins;
    ArrayList<Objecte> objectes;
    public Jugador(String nom){
        super(nom, "SECRETARIA");
        nivell = 1;
        punts = 0;
        calacoins = 0;
        objectes = new ArrayList<>();
    }

    public void pujarPunts(int punts){
        this.punts += punts;
        if (punts >= 15){
            nivell += 1;
            this.punts = 0;
        }
    }

    public void setCalacoins(int diners){
        if (diners > 0){
        this.calacoins = diners;
    }else {
            calacoins = 0;
        }
    }

    public void afeixirObjecte(Objecte obj){
        objectes.add(obj);
    }

    public ArrayList<Objecte> getObjectes(){   //No entregar direccion de memoria
        ArrayList<Objecte> returned = new ArrayList<>(objectes);
        return returned;
    }



}
