/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edromerom
 */
public class Llanta {
    private String marca;
    private double diametro;
    
    

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public String getMarca() {
        return marca;
    }

    public double getDiametro() {
        return diametro;
    }

    public Llanta(String marca, double diametro) {
        this.marca = marca;
        this.diametro = diametro;
    }
     
    
}
