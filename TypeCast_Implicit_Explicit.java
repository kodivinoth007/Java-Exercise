package PrimitiveEx;
import java.lang.System;

public class TypeCast_Implicit_Explicit {
    public static void main(String [] args){
        //Explicit Casting
        int convertInt = (int)(258.58692558);
        double convertDouble = (double)(2587);
        System.out.println("It's convert double value integer : "+convertInt);
        System.out.println("It;s convert integer value double : "+convertDouble);
        System.out.println(" ");
        // Implicit Casting
        int dateOfBirth = 2003;
        double dateConvertDoubleValue = dateOfBirth;
        System.out.println("Integer Value : "+dateOfBirth);
        System.out.println("Integer Value Convert to the Double Value : "+dateConvertDoubleValue);
        System.out.println(" ");
        // Add Different data Types
        int valueint = 45;
        float valueFloat = 50.5f;
        float addBothValue = valueFloat + valueint;
        System.out.println("integer value : "+valueint);
        System.out.println("float value : "+valueFloat);
        System.out.println("Add both different Value result : "+addBothValue);
    }
}
