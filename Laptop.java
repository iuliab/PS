/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class Laptop extends Product {
    
    private String screenSize;
    private String processor;

    public Laptop(String name, int price, String screenSize, String processor) {
    
        super(name, price);
        this.screenSize = screenSize;
        this.processor = processor;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }
    
    public String getProcessor() {
    
        return this.processor;
    }
    
    public void setProcessor(String processor) {
    
        this.processor = processor;
    }

    @Override
    public int getPrice(int quantity) {

        int total;
        total = this.getPrice() * quantity;
        
        return total;
    }

    @Override
    public String toString() {

        return "\tLaptop\nName: " + this.getName() + "\nPrice: " + this.getPrice() +
                "\nScreen size: " + this.getScreenSize() + "\nProcessor: " + this.getProcessor() + "\n";
    }
}
