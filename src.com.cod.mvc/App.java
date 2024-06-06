import controller.Controler;
import model.Model;

/**
 * Clase App que inicia el programa y pasa el control al controller
 */
public class App {
    public static void main(String[] args) {
        Model miModel = Model.getInstance();
        Controler miController = new Controler(miModel);

       /* miController.crearCoche("LaFerrari", "SBC 1234");
        miController.crearCoche("Alpine", "HYU 4567");

        miController.cambiarVelocidad("SBC 1234", 30);
        miController.cambiarVelocidad("HYU 4567", 150);*/
    }

}
