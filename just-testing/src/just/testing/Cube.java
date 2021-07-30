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
public class Cube extends Square {

    public Cube(double length) {
        super(length);
    }

    @Override
    public double findSurfaceArea() {
        return super.findSurfaceArea() * 2;
    }
}
