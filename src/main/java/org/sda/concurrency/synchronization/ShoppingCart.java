package org.sda.concurrency.synchronization;


import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Synchronization base class
 *
 * @author Sander
 */
@AllArgsConstructor
@Getter
public class ShoppingCart  {
    private int numberOfProducts;

    public  void addProduct(int quantity) {
        System.out.println("Adding product..");

        //Synchronizes only this code block
        synchronized(this) {
            numberOfProducts += quantity;
        }

    }

    public synchronized void removeProduct(int quantity) {
        System.out.println("Removing product..");
        numberOfProducts -= quantity;
    }
}
