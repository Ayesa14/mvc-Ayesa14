package view;

import javax.swing.JOptionPane;

public class View {
    /**
     * Muestra la velocidad actual del coche cuya matricula se le haya proporcionado
     * @param matricula identificador unico del coche
     * @param velocidad variable que se quiere mostrar
     */
    public static void muestraVelocidad(String matricula,int velocidad){
        System.out.println("La velocidad del coche con matricula "+matricula+", es "+ velocidad + "Km/h");
    }
    /**
     * Metodo que muestra matricula, modelo y velocidad de un coche
     * @param matricula
     * @param modelo
     * @param velocidad
     * @return true
     */
    public static boolean muestraCoche(String matricula, String modelo, Integer velocidad) {
        JOptionPane.showMessageDialog(null,"Matricula: " + matricula + " Modelo: " + modelo
                + " Velocidad: " + velocidad);
        return true;
    }

    /**
     * Metodo que recoge la matricula del coche con un JOptionPane
     * @return String
     */
    public static String getMatricula() {
        return JOptionPane.showInputDialog("Introduce la matricula del coche");
    }

}
