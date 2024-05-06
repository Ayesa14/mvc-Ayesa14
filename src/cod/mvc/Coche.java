package cod.mvc;

public class Coche {
    private String matricula;
    private String modelo;
    private Integer velocidad;

    public Coche(String matricula, String modelo, Integer velocidad){
        this.matricula = matricula;
        this.modelo = modelo;
        this.velocidad= velocidad;
    }
}
