/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package just.testing;

import java.math.BigDecimal;

/**
 *
 * @author Jonathan
 */
public class Planet {
	private BigDecimal milesFromSun;
	public Planet(String milesFromSun){
		this.milesFromSun = new BigDecimal(milesFromSun);
	}
	public BigDecimal getMilesFromSun(){
		return milesFromSun;
	}
	public static BigDecimal milesToKilometers(BigDecimal miles){
		BigDecimal scale = new BigDecimal("1.60934");
		return miles.multiply(scale);
	}
}