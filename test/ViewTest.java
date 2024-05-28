import model.Coche;
import model.Model;
import view.View;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

    public class ViewTest {

        @Test
        public void comprobacionMostrarVelocidad() { // ToDo: Pendiente de revision
            Coche coche = Model.crearCoche("374456-BCD","Seat",35);

            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));

            View.muestraVelocidad("374456-BCD", 35);
            String salidaEsperada = "La velocidad del coche con matricula "+coche.matricula+", es "+coche.velocidad;
            Assertions.assertEquals(salidaEsperada, outContent.toString());
        }
}
