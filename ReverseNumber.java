package org.example;

public class ReverseNumber {
    public static void main( String[] args )
    {
        int num = 4321, reversed = 0;
        while(num != 0) {
            int digit = num %10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println( "Reversed Number: " + reversed );
    }
}



