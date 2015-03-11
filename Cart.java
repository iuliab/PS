
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iuliab
 */
public class Cart {
    
    private HashMap<Product, Integer> products;
    
    public Cart() {
        
        products = new HashMap<Product, Integer>();
    }
    
    public int getTotalPrice() {
    
        int total = 0;
        
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            
            total += entry.getKey().getPrice( entry.getValue() );
        } 
        return total;
    }
    
    public void addProduct(Product p, Integer q) {
    
        products.put(p, q);
    }
    
    public String toString() {
        
        String res = "";
        
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            
            res += entry.getKey().toString();
        } 
        return res;
    }
}
