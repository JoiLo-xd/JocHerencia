package jocherencia;

import model.tipusPersona.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static public  String menu = "1: <Registrar Jugador> \n2: <Alta d'un Personatge>\n3: <Crear objecte>\n4: <Informació del Jugador>\n5: <Comprar objecte>\n6: <Moure>\n7: <Fer amics>\n8: <veure persones d'un lloc>\n9: Veure dades registrades>\n10: <Ranquing>\n11: <Sortir>";
    static public ArrayList<String> llocs = new ArrayList<>(List.of("SECRETARIA", "BIBLIOTECA","BAR","AULA100","AULA200","AULA300","AULA400","PATI"));
    static public ArrayList<String> obj_acceptat = new ArrayList<>(List.of("FLOR","EINA","MOBLE"));
    static public ArrayList<String> estudis = new ArrayList<>(List.of("BATXILLERAT","ESO","DAM","ASIC","SMX","COMERÇ","FINANCES","JARDINERIA","MATENIMENT"));
    static public ArrayList<Jugador> jugadors = new ArrayList<Jugador>();
    static public ArrayList<Personatge> personatges = new ArrayList<Personatge>();
    public static void main(String[] args) {
        int entrada;
        do{
            entrada = AskData.askInt(menu, "Aquesta opcio no es valida",1,11);
            switch (entrada){
                case 1 ->{
                    registrarJugador();
                }
                case 2 -> {
                    registrarPersonatge();
                }
            }
        }while (entrada != 11);


    }

    public static void registrarJugador(){
        Jugador newjugador;
        if (!jugadors.contains(newjugador = new Jugador(AskData.askString("< Indica el nom del jugador que vols registrar >: ")))){
            jugadors.add(newjugador);
            System.out.println("< OK: Jugador registrat >");
        }else{
            System.out.println("< ERROR: Ja existeix un jugador amb aquest nom >");
        }

    }



    public static void registrarPersonatge() {
        String nomper;
        String estudi;
        String lloc;
        String preferencia;
        if (!personatges.contains((Personatge) new Persona(nomper = AskData.askString("< Indica el nom del Personatge >: ")))) { //Preguntar Maria
            if (estudis.contains(estudi = AskData.askString("< Indica el estudi del Personatge >: "))){
                //Fin 1
                }
        }
    }
}
