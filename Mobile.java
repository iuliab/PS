/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class Mobile extends Product{

    private int memory;
    private String os;
    
    public Mobile(String name, int price, int memory, String os) {
        super(name, price);
        this.memory = memory;
        this.os = os;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public int getPrice(int quantity) {
        int total;
        total = this.getPrice() * quantity;
        
        return total;
    }

    @Override
    public String toString() {

        return "\tMobile\nName: " + this.getName() + "\nPrice: " + this.getPrice() +
                "\nMemory: " + this.getMemory() + "\nOS: " + this.getOs() + "\n";
    }
}
