import controller.Controler;
import model.Model;
import view.View;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
/**
 * Esta clase se usa para los test de los metodos del controller
 */
public class TestController {
    /**
     * Test que comprueba el metodo subirVelocidad
     */
    @Test
    public void testSubirVelocidadReturnTrue() {
        Model miModel = new Model();
        View view = new View();
        Controler controller = new Controler(miModel);
        Assertions.assertTrue(Controler.aumentarVelocidad("2456sdf"));
    }

    /**
     * Test que comprueba que el metodo subirVelocidad devuelve false si el coche no existe
     */
    @Test
    public void testSubirVelocidadNullCarReturnFalse() {
        Model miModel = new Model();
        View view = new View();
        Controler controller = new Controler(miModel);
        Assertions.assertFalse(Controler.aumentarVelocidad("asdfg"));
    }

    /**
     * Test que comprueba el metodo bajarVelocidad
     */
    @Test
    public void testBajarVelocidadReturnTrue() {
        Model miModel = new Model();
        View view = new View();
        Controler controller = new Controler(miModel);
        Assertions.assertTrue(Controler.bajarVelocidad("123456"));
    }

    /**
     * Test que comprueba que el metodo bajarVelocidad devuelve false si el coche no existe
     */
    @Test
    public void testBajarVelocidadNullCarReturnFalse() {
        Model miModel = new Model();
        View view = new View();
        Controler controller = new Controler(miModel);
        Assertions.assertFalse(Controler.bajarVelocidad("asdfg"));
    }