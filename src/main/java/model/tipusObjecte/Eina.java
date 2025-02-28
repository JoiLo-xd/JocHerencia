package model.tipusObjecte;

public class Eina extends Objecte {
    String descripcio;
    int num_usos;

    public Eina(String nom, String estudi, int preu, String descripcio, int num_usos) {
        super(nom, estudi, preu);
        this.descripcio = descripcio;
        this.num_usos = num_usos;
    }

    public int utilitzar(){
        num_usos -= 1;
        super.setPreu_calacoins(super.getPreu_calacoins() -10);
        return 10;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public int getNum_usos() {
        return num_usos;
    }
}
