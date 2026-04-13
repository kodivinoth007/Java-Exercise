package PrimitiveEx;
import java.lang.System;

public class Swap_IntegerNumber {
    public static void main(String [] args){
        // Using Arithmetic Operations
        System.out.println("Using Arithmetic Operations");
        int a = 5;
        int b = 20;
        System.out.println("Before Swapping : a = "+a+" b = "+b);
        a  = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping : a = "+a+" b = "+b);
        System.out.println(" ");

        //Using XOR Operator(Bitwise)
        System.out.println("Using XOR Operator(Bitwise)");
        int c = 23;
        int d = 27;
        System.out.println("Before Swapping : c = "+c+" d = "+d);
        c = c ^ d;
        d = c ^ d;
        c = c ^ d;
        System.out.println("After Swapping : c = "+c+" d = "+d);


    }
}
