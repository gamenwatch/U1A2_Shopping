/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package u1a2_shoppingfordevices;
import java.util.Scanner;
import java.text.*;
/**
 *Jacob Lacey
 *Oct 2 2018
 *Calculate and output a pretax cost for their order, taxes, and final cost
 */
public class U1A2_ShoppingForDevices {

    /**
     * @param args
     */
    public static void main(String[] args) {
        //declare Scanner
        Scanner keyedInput = new Scanner(System.in);
        
        //Declare Decimal (Money) Format
        DecimalFormat moneyCanadian = new DecimalFormat ("$###.##CAN");
        
        //state variables
        final double USB_PRICE = 19.99;//$
        final double KEYBOARD_PRICE = 49.99;//$
        final double MOUSE_PRICE = 25.99;//$
        double numberOfUsb;//quantity
        double numberOfKeyboard;//quantity
        double numberOfMouse;//quantity
        double subTotalCost;//$
        final double SALES_TAX= 0.13;//13% HST
        double taxAppliedCost;
        double totalCost;//$
        
        //Instructions
        System.out.println("Please answer the following questions to fill out your order.");
        
        //Input Order
        System.out.println("How many USBs do you wish to purchase?");
        numberOfUsb = keyedInput.nextDouble();
        System.out.println("How many keyboards do you wish to purchase?");
        numberOfKeyboard = keyedInput.nextDouble();
        System.out.println("How many mouses do you wish to purchase?");
        numberOfMouse = keyedInput.nextDouble();
        
        //Calc Subtotal, Tax, and Final Cost
        subTotalCost = USB_PRICE*numberOfUsb+KEYBOARD_PRICE*numberOfKeyboard+MOUSE_PRICE*numberOfMouse;
        taxAppliedCost = subTotalCost*SALES_TAX;
        totalCost = subTotalCost+taxAppliedCost;
        
        //Print Out Reciept
        System.out.println("Best Buy Online Rciept");
        System.out.println("***************************\n");
        System.out.println("USB\t\t"+"#"+numberOfUsb);
        System.out.println("Keyboard\t"+"#"+numberOfKeyboard);
        System.out.println("Mouse\t\t"+"#"+numberOfMouse+"\n");
        System.out.println("Sub Total:  "+moneyCanadian.format(subTotalCost));
        System.out.println("\tTAX: "+moneyCanadian.format(taxAppliedCost));
        System.out.println("\n---------------------------");
        System.out.println("TOTAL:\t\t"+moneyCanadian.format(totalCost));
    }
    
}
