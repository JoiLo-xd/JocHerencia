package model.tipusPersona;

public class Jugador extends Persona{
    private int nivell;
    private int punts;
    private int calacoins;
    public Jugador(String nom){
        super(nom, "SECRETARIA");
        nivell = 1;
        punts = 0;
        calacoins = 0;
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

}
