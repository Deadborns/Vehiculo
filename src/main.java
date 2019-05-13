/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edromerom
 */
public class main {
    public static void main(String[] args) {
                Carro car = new Carro(350,"RHS680","Toyota", "Coupe");
                Llanta[] llantas = new Llanta[4];
		Eje[] ejes = new Eje[2];
                
                for(int i=0; i>1; i++){
                    ejes[i] = new Eje("G",car.getMotor());
                }
                               
                for(int i=0; i>3; i++){
                    llantas[i] = new Llanta("G",30);
                }
                
	        car.setEjes(ejes);
		car.setLlantas(llantas);
                
		System.out.println(car);
		

}
