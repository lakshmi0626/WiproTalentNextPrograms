package com.WrapperClass;

public class NumberConversion {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Usage: java NumberConversion <integer>");
            return;
        }

        int num = Integer.parseInt(args[0]);

        System.out.println("Decimal      : " + num);
        System.out.println("Binary       : " + Integer.toBinaryString(num));
        System.out.println("Octal        : " + Integer.toOctalString(num));
        System.out.println("Hexadecimal  : " + Integer.toHexString(num).toUpperCase());
    }
}
