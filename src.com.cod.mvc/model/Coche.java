package model;

public class Coche {
    public String matricula;
    public String modelo;
    public Integer velocidad;

    public Coche(String matricula, String modelo){
        this.matricula = matricula;
        this.modelo = modelo;
        this.velocidad= 0;
    }
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }
}
