import cod.mvc.Coche;
import cod.mvc.Model;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ModelTest {
    @Test
    public void comprobacionCrearCoche() {
        Coche coche = Model.crearCoche("43656C35FD","Seat",0);
        Assertions.assertEquals("43656C35FD",coche.matricula);
        Assertions.assertEquals("Seat",coche.modelo);
        Assertions.assertEquals(0,coche.velocidad);
    }

    @Test
    public void comprobacionGetCoche(){
        Coche coche = Model.crearCoche("43656C35FC","Seat",0);
        Assertions.assertSame(coche,Model.getCoche("43656C35FC"));
    }

    @Test
    public void comprobacionCambiarVelocidad(){
        Coche coche = Model.crearCoche("43656C35FE","Seat",0);
        Assertions.assertEquals(24,Model.cambiarVelocidad("43656C35FE",24));
    }

    @Test
    public void getVelocidad(){
        Coche coche = Model.crearCoche("43656C35FR","Seat",45);
        Assertions.assertEquals(45,Model.getVelocidad("43656C35FR"));
    }
}
