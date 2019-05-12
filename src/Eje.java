/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edromerom
 */
public class Eje {
    private String marca;
    private Llanta[] eje;
    private Motor motor;

    public Eje(String marca, Motor motor) {
        this.marca = marca;
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Llanta[] getEje() {
        return eje;
    }

    public void setEje(Llanta[] eje) {
        this.eje = eje;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    

    
    
}
