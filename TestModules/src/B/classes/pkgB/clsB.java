/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgB;

/**
 *
 * @author Jonathan
 */
public class clsB implements interfB{

    public clsB() {
    }

    public clsB(int i) {
    }

    public void printB(String s){
        System.out.println("printB: ");
    }
    
    @Override
    public void methodInterfB(){
        
    }
    public static void main(String[] args) {
        System.out.println("print from B");
        
    }
}
