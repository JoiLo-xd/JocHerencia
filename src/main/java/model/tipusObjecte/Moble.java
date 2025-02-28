package model.tipusObjecte;

public class Moble extends Objecte{
    int nivell_decoracio;

    public Moble(String nom, String estudi, int preu_calacoins) {
        super(nom, estudi, preu_calacoins);
        nivell_decoracio =  (int) (((double) super.getPreu_calacoins()) * 0.10);
    }
}
