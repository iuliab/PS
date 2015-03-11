/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class L1 {
    
    public static void main(String[] args) {
    
        Product p1 = new Laptop("HP", 20, "15.5", "Intel i7");
        Product p2 = new Mobile("HTC mini 2", 100, 8, "HTC");
        Product p3 = new Laptop("Dell XPS", 50, "17", "Intel i7"); 
        
        Cart c = new Cart();
        c.addProduct(p1, 5);
        c.addProduct(p2, 1);
        c.addProduct(p3, 1);
        
        System.out.println(c.toString());
    }
}
