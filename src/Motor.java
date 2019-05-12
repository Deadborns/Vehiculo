/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edromerom
 */
public class Motor {
    private double pot;
    private String marca;
    private Eje[] ejes;

    public Motor(double pot, String marca) {
        this.pot = pot;
        this.marca = marca;
    }
    
    public double getPot() {
        return pot;
    }

    public String getMarca() {
        return marca;
    }

    public Eje[] getEjes() {
        return ejes;
    }

    public void setPot(double pot) {
        this.pot = pot;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setEjes(Eje[] ejes) {
        this.ejes = ejes;
    }


}
