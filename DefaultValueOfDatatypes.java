package PrimitiveEx;
import java.util.Scanner;
import java.lang.System;

public class DefaultValueOfDatatypes {
    byte defaultByte;
    short defaultShort;
    int defaultInt ;
    long defaultLong ;
    float defaultFloat ;
    double defaultDouble;
    char defaultCharacter;
    boolean defaultBoolean ;
    public static void main(String [] args){
        DefaultValueOfDatatypes obj = new DefaultValueOfDatatypes();

        System.out.println("Byte Default Value : "+obj.defaultByte);
        System.out.println("Short Default Value : "+obj.defaultShort);
        System.out.println("Int Default Value : "+obj.defaultInt);
        System.out.println("Long Default Value : "+obj.defaultLong);
        System.out.println("Float Default Value : "+obj.defaultFloat);
        System.out.println("Double Default Value : "+obj.defaultDouble);
        System.out.println("Character Default Value : "+obj.defaultCharacter);
        System.out.println("Boolean Default Value : "+obj.defaultBoolean);
    }
}

