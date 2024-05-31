package controller;

import model.Model;
import model.Coche;
import view.View;


public class Controller {
    private final Model miModel = new Model();

    public Controller(Model miModel) {

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
     * Metodo que recibe una matricula, y utiliza el metodo de model para devolver el coche con esa matricula
     * y luego lo muestra con el metodo de la vista muestra velocidad
     * @param matricula
     * @return boolean
     */
    public boolean buscarCoche(String matricula) {
        Coche coche = miModel.getCoche(matricula);
        if (coche != null) {
            View.muestraCoche(coche.getMatricula(),coche.getModelo(), coche.getVelocidad());
            return true;
        }
        return false;
    }

    /**
     * Metoodo que recoge la matricula con un JOptionPane y la devuleve
     * @return String
     */
    public String getMatricula() {
        return View.getMatricula();
    }

}