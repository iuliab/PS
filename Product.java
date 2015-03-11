/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public abstract class Product {
    
    private String name;
    private int price;
    
    public Product(String name, int price) {

        this.name = name;
        this.price = price;
    }
    
    public String getName() {
    
        return this.name;
    }
    
    public int getPrice() {
    
        return this.price;
    }
    
    public abstract int getPrice(int quantity);

    @Override
    public abstract String toString();
    
    
}
