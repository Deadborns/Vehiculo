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
    private Eje[] eje;
    private Llanta[] llanta;
    private Motor motor;
    

    public Carro(String placa, String marca, Eje[] eje, Llanta[] llanta, Motor motor) {
        this.placa =  placa;
        this.marca =  marca;
        this.eje = new Eje[2];
        this.llanta = new Llanta[4];
        this.motor =  new Motor();
    }
}