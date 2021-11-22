package org.example;
import java.util.*;

public class VowelOrConsonant {

        public static void main(String[] args) {

            char ch;
            System.out.println("Enter an alpabhet: ");
            Scanner sc = new Scanner(System.in);
            ch = sc.next().charAt(0);

            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(ch + " is vowel");
                    break;
                default:
                    System.out.println(ch + " is consonant");
            }
        }
    }

