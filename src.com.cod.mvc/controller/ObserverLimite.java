package controller;

import model.Coche;

public class ObserverLimite implements Observer{

    /**
     * Velocidad maxima
     */
    public final static int VELOCIDAD_LIMITE = 120;

    /**
     * Comprueba si el coche cuya velocidad se a actualizado supera el limite de velocidad
     * @param coche el objeto tipo coche que se a actualizado
     */
    @Override
    public void update(Coche coche) {
        if(coche.velocidad>VELOCIDAD_LIMITE){
            System.out.println("Limite de velocidad sobrepasado");
        }
    }
}
