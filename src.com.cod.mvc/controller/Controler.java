package controller;

import model.Model;
import view.View;

public class Controler {
    static Model miModel = new Model();

    public Controler(Model miModel) {

        ObserverVelocidad ObVelocida = new ObserverVelocidad();
        miModel.addObserver(ObVelocida);

        ObserverLimite ObLimite = new ObserverLimite();
        miModel.addObserver(ObLimite);

    }

    /**
     * Crea un coche
     * @param modelo del coche
     * @param matricula por la que buscar el coche
     */
    public void crearCoche(String modelo, String matricula){
        miModel.crearCoche(matricula,modelo);
    }

    /**
     * Cambiar la velocidad de un coche
     * @param matricula por la que buscar el coche
     * @param velocidad nueva
     */
    public void cambiarVelocidad(String matricula, Integer velocidad){
        miModel.cambiarVelocidad(matricula, velocidad);
    }


    /**
     * Metodo para reducir al velocidad dle coche
     * @param matricula del coceh al cual vamos a bajar al velocidad
     */
    public static void bajarVelocidad(String matricula){
        int aux = miModel.bajarVelocidad(matricula);
        View.muestraVelocidad(matricula, aux);
    }

    /**
     * Metodo aumentar la velocidad
     * @param matricula del coche al cual vamos a aumentar la velocidad
     */
    public static void aumentarVelocidad(String matricula){
        int aux = miModel.subirVelocidad(matricula);
        View.muestraVelocidad(matricula,aux);
    }
}