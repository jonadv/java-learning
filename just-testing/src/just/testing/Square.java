/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package just.testing;

/**
 *
 * @author Jonathan
 */
public class Square {
    double length;
    public Square(double length) {
        this.length = length;
    }
    
    public double findSurfaceArea() {
        return length * 6;
    }
}