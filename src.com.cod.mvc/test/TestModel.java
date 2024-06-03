import model.Coche;
import model.Model;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestModel {
    @Test
    public void crearCocheReturnTrue() {
        Model miModel = new Model();
        Assertions.assertNotNull(miModel.crearCoche("matricula", "modelo"));
    }

    @Test
    public void cambiarVelocidadComprobarCambioReturnTrue() {
        Model miModel = new Model();
        Coche coche = miModel.crearCoche("matricula", "modelo");
        Integer velocidad = 40;
        model.parking.add(coche);
        miModel.cambiarVelocidad("matricula", velocidad);
        Assertions.assertEquals(velocidad, coche.getVelocidad());
    }

}
