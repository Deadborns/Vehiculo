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
    private double peso;
    private String marca;
    private Eje[] eje1;
    private Eje[] eje2;
    private Motor motor;

    public Carro(double potencia, double peso, String MarcaC, String MarcaM) {
        this.peso = peso;
        this.marca = MarcaC;
        this.motor = new Motor(potencia, MarcaM);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Eje[] getEje1() {
        return eje1;
    }

    public void setEje1(Eje[] eje1) {
        this.eje1 = eje1;
	   for (int i = 0; i < eje1.length; i++) {
		   this.eje1[i].setMotor(this.motor);
    }

    public Eje[] getEje2() {
        return eje2;
    }

    public void setEje2(Eje[] eje2) {
        this.eje1 = eje1;
	   for (int i = 0; i < eje2.length; i++) {
		   this.eje2[i].setMotor(this.motor);
    }

    public Motor getMotor() {
        return motor;
    }


    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    
    
}
