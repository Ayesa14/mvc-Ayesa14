import controller.Controler;
import model.Model;

public class App {
    public static void main(String[] args) {
        Model miModel = new Model();

        Controler miController = new Controler(miModel);

        miController.crearCoche("LaFerrari", "SBC 1234");
        miController.crearCoche("Alpine", "HYU 4567");

        miController.cambiarVelocidad("SBC 1234", 30);
        miController.cambiarVelocidad("HYU 4567", 150);
    }

}
