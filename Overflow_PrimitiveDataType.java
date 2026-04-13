package PrimitiveEx;
import java.lang.System;
public class Overflow_PrimitiveDataType {
    public static void main(String [] args){
        // Demonstrate overflow using different data types
        // i have to try myself  you must check that code, and learn about data type limits of range.
        // i just right some limits of code

        byte one = 127;
        System.out.println("Before overflow using byte data type value: "+one);
        one++;  // Overflow happens here
        System.out.println("After overflow using byte data type value: "+one);
        System.out.println( "");
        short two = 32767;
        System.out.println("Before overflow using short data type value: "+two);
        two++;  // Overflow happens here
        System.out.println("After overflow using short data type value: "+two);
        System.out.println(" ");
        int three = 2147483647;
        System.out.println("Before overflow using integer data type value: "+three);
        three++;  // Overflow happens here
        System.out.println("After overflow using integer data type value: "+three);
        System.out.println(" ");
        long four = 9223372036854775807L;
        System.out.println("Before overflow using long data type value: "+four);
        four++;  // Overflow happens here
        System.out.println("After overflow using long data type value: "+four);
        System.out.println(" ");
        float five = Float.MAX_VALUE;
        System.out.println("Before overflow using float data type value: "+five);
        five = five *2;  // Overflow happens here
        System.out.println("After overflow using float data type value: "+five);
        System.out.println(" ");
        double six = Double.MAX_VALUE;
        System.out.println("Before overflow using double data type value: "+six);
        six = six * 2;  // Overflow happens here
        System.out.println("After overflow using double data type value: "+six);
        System.out.println(" ");
        char seven = 65535;
        System.out.println("Before overflow using character data type value: "+(int)seven);
        seven++;  // Overflow happens here
        System.out.println("After overflow using character data type value: "+(int)seven);
        System.out.println(" ");
        boolean eight = true; // Overflow happens not there because it's only hava two value true or false
        System.out.println("Boolean data type is depents on JVM: "+eight);

    }
}
