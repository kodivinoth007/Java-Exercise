package PrimitiveEx;
import java.lang.System;

public class PrimitivesByteFound {
    public static void main(String [] args){
        int bankCode =805677454;
        float civilScore = 88.6f;
        double richPersonAccount = 434.698679;
        char initialName ='V';
        boolean accountActive =true;
        byte bankBookPage =127;
        short bookOpeningYear = 327;
        long bankOfSBICount = 56_78594_032L;

        //Using for rapper class identified Bytes code size in Primitive data types
        System.out.println("The bank book Cod : "+Integer.BYTES+" bytes");
        System.out.println("The Account civil Score : "+Float.BYTES+" bytes");
        System.out.println("The rich person account money Count : "+Double.BYTES+" bytes");
        System.out.println("Account holder initial of first Letter : "+Character.BYTES+" bytes");
        System.out.println("That person Account is Active : (Boolean Value JVM Dependent)"+" bytes");
        System.out.println("Account Book Pages Count : "+Byte.BYTES+" bytes");
        System.out.println("Account book openint year : "+Short.BYTES+" bytes");
        System.out.println("SBI all over bank Accounts counts : "+Long.BYTES+" bytes");

    }
}
