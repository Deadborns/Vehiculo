
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edromerom
 */
public class Carro {
    private String placa;
    private String marca;
    private Eje[] ejes;
    private Motor motor;
    private Llanta[] llantas;

    public Carro(double potencia, String placa, String MarcaC, String MarcaM) {
        this.placa = placa;
        this.marca = MarcaC;
        this.motor = new Motor(potencia, MarcaM);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(double peso) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Eje[] getEjes() {
        return ejes;
    }

    public void setEjes(Eje[] ejes) {
        this.ejes = ejes;
    }

    public Llanta[] getLlantas() {
        return llantas;
    }

    public void setLlantas(Llanta[] llantas) {
        this.llantas = llantas;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

}

