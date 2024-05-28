package model;

import controller.Observer;

import java.util.ArrayList;

public class Model implements Observable {


    public static Coche crearCoche(String matricula,String modelo,Integer velocidad){
        Coche cocheNuevo = new Coche(matricula,modelo,velocidad);
        parking.add(cocheNuevo);
        return cocheNuevo;
    }
    public static Coche getCoche(String matricula) {
        for (Coche coche : parking) {
            if (coche.matricula.equals(matricula)) {
                return coche;
            }
        }
        return null;
    }

    public static Integer cambiarVelocidad(String matricula,Integer velocidad){
        Coche coche = getCoche(matricula);
        coche.velocidad = velocidad;
        return coche.velocidad;
    }

    public static Integer getVelocidad(String matricula){
        Coche coche = getCoche(matricula);
        return coche.velocidad;
    }

    /**
     * Añade un objecto de tipo observer al arraylist [observers]
     * @param observer objecto a añadir al list
     */
    @Override
    public void addObserver(Observer observer) {

        observers.add(observer);
    }

    /**
     * Elimina un objecto de tipo observer del arraylist [observers]
     * @param observer objecto a eliminar del list
     */
    @Override
    public void removeObserver(Observer observer) {

        observers.remove(observer);
    }

    /**
     * Recorre los observers del arraylist y los notifica de un cambio
     * @param coche el objecto en el que se ha producido un cambio
     */
    @Override
    public void notifyObservers(Coche coche) {

        for(Observer observer : observers){
            observer.update(coche);
        }
    }
}
